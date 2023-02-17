package com.rhinodesktop.foreorder_golf_consumer1.events;

import com.rhinodesktop.foreorder_golf_consumer1.fragments.ChoiceFragment;
import com.rhinodesktop.foreorder_golf_consumer1.models.OptionItem;

import lombok.Getter;

/**
 * Created by Hunter Andrin on 2017-04-13.
 */

public abstract class OptionCheckedEvent {

    @Getter
    private ChoiceFragment choiceFragment;
    @Getter
    private OptionItem optionItem;

    public OptionCheckedEvent(ChoiceFragment choiceFragment, OptionItem optionItem) {
        this.choiceFragment = choiceFragment;
        this.optionItem = optionItem;
    }

}
