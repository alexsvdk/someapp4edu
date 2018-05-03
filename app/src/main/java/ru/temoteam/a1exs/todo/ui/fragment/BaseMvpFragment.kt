package ru.temoteam.a1exs.todo.ui.fragment

import com.arellomobile.mvp.MvpFragment
import ru.temoteam.a1exs.todo.presentation.view.BaseMvpView

open class BaseMvpFragment: MvpFragment(), BaseMvpView {

    override fun selectFragment(fragment: MvpFragment) {
        (activity as BaseMvpView).selectFragment(fragment)
    }

}