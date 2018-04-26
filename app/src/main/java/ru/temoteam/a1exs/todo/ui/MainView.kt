package ru.temoteam.a1exs.todo.ui

import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.MvpView

interface MainView: MvpView {
    fun showFragment(fragment: MvpAppCompatFragment)
}