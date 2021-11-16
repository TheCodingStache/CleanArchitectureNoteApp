package com.thecodingstache.noteapp.data.data_source.repository

import com.thecodingstache.noteapp.data.data_source.NoteDao
import com.thecodingstache.noteapp.domain.Note
import com.thecodingstache.noteapp.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return deleteNote(note)
    }
}