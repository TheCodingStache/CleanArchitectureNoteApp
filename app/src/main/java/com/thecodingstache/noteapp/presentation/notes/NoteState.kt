package com.thecodingstache.noteapp.presentation.notes

import com.thecodingstache.noteapp.domain.Note
import com.thecodingstache.noteapp.domain.util.NoteOrder
import com.thecodingstache.noteapp.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)