package ru.temoteam.a1exs.todo.presentation.presenter

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.temoteam.a1exs.todo.presentation.view.MainView
import ru.temoteam.a1exs.todo.ui.fragment.TaskAddFragment
import ru.temoteam.a1exs.todo.ui.fragment.TaskViewFragment
import ru.temoteam.a1exs.todo.ui.fragment.TasksFragment

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    private val tasksFragment by lazy {  TasksFragment() }
    private val taskViewFragment by lazy {  TaskViewFragment() }
    private val taskAddFragment by lazy {  TaskAddFragment() }

    init {
        viewState.showFragment(tasksFragment)
    }
}
