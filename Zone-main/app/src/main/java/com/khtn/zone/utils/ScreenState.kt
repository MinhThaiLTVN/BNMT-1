package com.khtn.zone.utils

sealed class ScreenState {
    object IdleState: ScreenState() {
        override fun toString(): String {
            return "IdleState State"
        }
    }

    object SearchState: ScreenState() {
        override fun toString(): String {
            return "SearchState State"
        }
    }

}