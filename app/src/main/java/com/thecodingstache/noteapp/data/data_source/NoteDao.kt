package com.thecodingstache.noteapp.data.data_source

import androidx.room.*
import com.thecodingstache.noteapp.domain.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {
    @Query("select * from note")
    fun getNotes(): Flow<List<Note>>

    @Query("select * from note where id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}