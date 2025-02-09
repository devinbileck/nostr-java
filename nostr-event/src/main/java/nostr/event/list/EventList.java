/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nostr.event.list;

import nostr.event.impl.GenericEvent;
import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.extern.java.Log;
import nostr.base.annotation.JsonList;

/**
 *
 * @author squirrel
 */
@Builder
@Log
@JsonList
public class EventList extends BaseList<GenericEvent> {

    public EventList() {
        this(new ArrayList<>());
    }

    private EventList(@NonNull List<GenericEvent> list) {
        super(list);
    }    
}
