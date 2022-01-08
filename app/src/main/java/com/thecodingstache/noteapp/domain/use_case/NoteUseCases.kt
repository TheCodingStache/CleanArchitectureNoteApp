package com.thecodingstache.noteapp.domain.use_case

data class NoteUseCases(
    val getNote: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote
)