package com.thecodingstache.noteapp.presentation.notes

import androidx.lifecycle.ViewModel
import com.thecodingstache.noteapp.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(private val noteUseCases: NoteUseCases) : ViewModel() {
    fun onEvent(event: NotesEvent) {
        when (event) {
            is NotesEvent.Order -> {

            }
            is NotesEvent.DeleteNote -> {

            }
            is NotesEvent.RestoreNote -> {

            }
            is NotesEvent.ToggleOrderSection -> {

            }
        }
    }
}