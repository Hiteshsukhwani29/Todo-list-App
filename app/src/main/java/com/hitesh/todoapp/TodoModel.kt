package com.hitesh.todoapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TodoModel(

        @PrimaryKey(autoGenerate = true)
        var id: Long = 0,
        var title: String,
        var description: String,
        var category: String,
        var date: Long,
        var time: Long,
        var isFinished: Int = -1
)
