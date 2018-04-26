package ru.temoteam.a1exs.todo.presentation.view

import com.arellomobile.mvp.MvpFragment
import com.arellomobile.mvp.MvpView

interface MainView : MvpView {
    fun showFragment(fragment: MvpFragment)
}
