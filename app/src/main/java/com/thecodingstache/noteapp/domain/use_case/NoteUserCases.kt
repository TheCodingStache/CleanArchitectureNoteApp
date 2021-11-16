package com.thecodingstache.noteapp.domain.use_case

import androidx.room.Delete

data class NoteUserCases(
    val getNotes: GetNotes,
    val deleteNotes: DeleteNote
)  {
}