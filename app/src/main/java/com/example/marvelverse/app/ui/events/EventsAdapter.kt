package com.example.marvelverse.app.ui.events

import com.example.marvelverse.R
import com.example.marvelverse.app.ui.home.interfaces.EventInteractionListener
import com.example.marvelverse.domain.entities.main.Event
import com.example.nestedrecyclerview.ui.base.BaseAdapter

class EventsAdapter(listener: EventInteractionListener) :
    BaseAdapter<Event>(listener) {
    override val layoutID: Int = R.layout.item_event
}
