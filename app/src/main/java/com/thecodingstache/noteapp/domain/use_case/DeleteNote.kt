package com.thecodingstache.noteapp.domain.use_case

import com.thecodingstache.noteapp.domain.Note
import com.thecodingstache.noteapp.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}