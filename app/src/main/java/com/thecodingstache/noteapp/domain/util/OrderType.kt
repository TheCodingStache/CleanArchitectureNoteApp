package com.thecodingstache.noteapp.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}