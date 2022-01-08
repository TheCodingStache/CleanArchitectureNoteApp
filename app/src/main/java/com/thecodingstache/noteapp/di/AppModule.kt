package com.thecodingstache.noteapp.di

import android.app.Application
import androidx.room.Room
import com.thecodingstache.noteapp.data.data_source.NoteDatabase
import com.thecodingstache.noteapp.data.data_source.repository.NoteRepositoryImpl
import com.thecodingstache.noteapp.domain.repository.NoteRepository
import com.thecodingstache.noteapp.domain.use_case.DeleteNote
import com.thecodingstache.noteapp.domain.use_case.GetNotes
import com.thecodingstache.noteapp.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(dao: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(dao.noteDao)
    }

    @Provides
    @Singleton
    fun providedNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNotes = DeleteNote(repository)
        )
    }
}