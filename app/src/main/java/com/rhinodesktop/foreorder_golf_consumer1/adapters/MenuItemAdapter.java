package com.rhinodesktop.foreorder_golf_consumer1.adapters;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.afollestad.sectionedrecyclerview.SectionedRecyclerViewAdapter;
import com.bumptech.glide.Glide;
import com.rhinoactive.foreorder_library_android.utils.Constants;
import com.rhinoactive.imageutility.amazonfiledownloaders.AmazonImageDownloader;
import com.rhinoactive.imageutility.amazonfiledownloaders.AmazonRecyclerViewImageDownloader;
import com.rhinodesktop.activityanimatorutility.activityutils.ActivityAndAnimateManager;
import com.rhinodesktop.activityanimatorutility.models.AnimationType;
import com.rhinodesktop.foreorder_golf_consumer1.R;
import com.rhinodesktop.foreorder_golf_consumer1.activities.OrderItemActivity;
import com.rhinodesktop.foreorder_golf_consumer1.models.Menu;
import com.rhinodesktop.foreorder_golf_consumer1.models.MenuItem;

import java.util.List;
import java.util.Locale;

/**
 * Created by rhinodesktop on 2017-03-17.
 */

public class MenuItemAdapter extends SectionedRecyclerViewAdapter<MenuItemViewHolder> {

    private Menu menu;
    private Activity activity;

    public MenuItemAdapter(Activity activity, Menu menu) {
        this.menu = menu;
        this.activity = activity;
    }

    @Override
    public MenuItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(viewType == VIEW_TYPE_HEADER ? R.layout.menu_item_header : R.layout.menu_item_view, parent, false);
        return new MenuItemViewHolder(itemView);
    }

    @Override
    public void onBindHeaderViewHolder(MenuItemViewHolder holder, int section) {
        if (section == 0) {
            holder.getMenuInfoLayout().setVisibility(View.VISIBLE);
            holder.getMenuTitleTextView().setText(menu.getName().toUpperCase());
            holder.getMenuInfoTextView().setText(menu.getDesc());
        } else {
            holder.getMenuInfoLayout().setVisibility(View.GONE);
        }
        String sectionName = getSectionNameForIndex(section);
        holder.getSectionHeaderNameTextview().setText(sectionName);
    }

    @Override
    public void onBindViewHolder(MenuItemViewHolder holder, int section, int relativePosition, int absolutePosition) {
        holder.getMenuItemImageview().setImageDrawable(null);
        List<MenuItem> menuItemsForItemType = getMenuItemsForIndex(section);
        MenuItem menuItem = menuItemsForItemType.get(relativePosition);
        holder.getMenuItemNameTextview().setText(menuItem.getName());
        holder.getMenuItemPriceTextview().setText(String.format(Locale.ENGLISH, "$%.2f", menuItem.getPrice()));

        Glide.with(holder.getMenuItemImageview()).load(Constants.IMAGE_BASE_URL+menuItem.getPhotoUrl()).into(holder.getMenuItemImageview());

        setItemOnClickListener(menuItem, holder);
    }

    @Override
    public int getSectionCount() {
        return menu.getMenuItemsByItemType().size();
    }

    @Override
    public int getItemCount(int section) {
        return getMenuItemsForIndex(section).size();
    }

    private String getSectionNameForIndex(int index) {
        return menu.getMenuItemsByItemType().get(index).getItemType().getName();
    }

    private List<MenuItem> getMenuItemsForIndex(int index) {
        return menu.getMenuItemsByItemType().get(index).getMenuItems();
    }

    private void setItemOnClickListener(final MenuItem menuItem, MenuItemViewHolder holder) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityAndAnimateManager.Builder builder = new ActivityAndAnimateManager.Builder((AppCompatActivity) activity, OrderItemActivity.class, AnimationType.SLIDE_UP);
                builder.objectExtra(OrderItemActivity.ORDER_MENU_ITEM_KEY, menuItem);
                builder.buildActivityAndTransition();
            }
        });
    }
}
