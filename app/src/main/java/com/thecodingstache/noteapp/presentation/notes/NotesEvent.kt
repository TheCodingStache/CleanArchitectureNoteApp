package com.thecodingstache.noteapp.presentation.notes

import com.thecodingstache.noteapp.domain.Note
import com.thecodingstache.noteapp.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
