package com.example.marvelverse.app.ui.home.adapter

import com.example.marvelverse.R
import com.example.marvelverse.app.ui.home.base.BaseInteractionListener
import com.example.marvelverse.domain.entities.main.Event
import com.example.nestedrecyclerview.ui.base.BaseAdapter

class EventDetailsAdapter(private val listener: BaseInteractionListener): BaseAdapter<Event>(listener) {
    override val layoutID: Int= R.layout.item_event_card
}