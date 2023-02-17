package com.rhinodesktop.foreorder_golf_consumer1.events;

import lombok.Getter;

/**
 * Created by Hunter Andrin on 2017-04-07.
 */

public class ClubInRangeChangeEvent {

    @Getter
    private boolean inRange;

    public ClubInRangeChangeEvent(boolean inRange) {
        this.inRange = inRange;
    }
}
