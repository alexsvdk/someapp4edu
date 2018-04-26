package ru.temoteam.a1exs.someapp4edu.ui

import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.MvpView

interface MainView: MvpView {
    fun showFragment(fragment: MvpAppCompatFragment)
}