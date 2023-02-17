package com.rhinodesktop.foreorder_golf_consumer1.events;

import com.rhinodesktop.foreorder_golf_consumer1.fragments.ChoiceFragment;
import com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem;

import lombok.Getter;

/**
 * Created by Hunter Andrin on 2017-04-12.
 */

public class MultiOptionCheckedEvent extends OptionCheckedEvent {

    @Getter
    private boolean isChecked;

    public MultiOptionCheckedEvent(ChoiceFragment choiceFragment, OptionItem optionItem, boolean isChecked) {
        super(choiceFragment, optionItem);
        this.isChecked = isChecked;
    }
}
