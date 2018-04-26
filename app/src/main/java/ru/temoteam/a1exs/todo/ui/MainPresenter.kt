package ru.temoteam.a1exs.todo.ui

import com.arellomobile.mvp.MvpPresenter
import ru.temoteam.a1exs.todo.ui.taskadd.TaskAddFragment
import ru.temoteam.a1exs.todo.ui.tasks.TasksFragment
import ru.temoteam.a1exs.todo.ui.taskview.TaskViewFragment

class MainPresenter: MvpPresenter<MainView>() {

    private val tasksFragment = TasksFragment()
    private val taskViewFragment by lazy { TaskViewFragment() }
    private val taskAddFragment by lazy { TaskAddFragment() }

    init {
        viewState.showFragment(tasksFragment)
    }

}