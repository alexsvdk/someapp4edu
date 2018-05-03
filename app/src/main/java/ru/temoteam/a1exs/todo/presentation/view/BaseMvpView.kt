package ru.temoteam.a1exs.todo.presentation.view

import com.arellomobile.mvp.MvpFragment
import com.arellomobile.mvp.MvpView

interface BaseMvpView: MvpView{
    fun selectFragment(fragment: MvpFragment)
}