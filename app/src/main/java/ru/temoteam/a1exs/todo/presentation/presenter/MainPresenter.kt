package ru.temoteam.a1exs.todo.presentation.presenter

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.temoteam.a1exs.todo.R
import ru.temoteam.a1exs.todo.data.FirebaseProvider
import ru.temoteam.a1exs.todo.presentation.view.MainView
import ru.temoteam.a1exs.todo.ui.fragment.TaskAddFragment
import ru.temoteam.a1exs.todo.ui.fragment.TaskViewFragment
import ru.temoteam.a1exs.todo.ui.fragment.TasksFragment

@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    private val tasksFragment by lazy {  TasksFragment() }
    private val taskViewFragment by lazy {  TaskViewFragment() }
    private val taskAddFragment by lazy {  TaskAddFragment() }

    fun switchFragment(id:Int){
        viewState.selectFragment(when(id){
            1 -> taskViewFragment
            else -> tasksFragment
        })
    }

    init {
        switchFragment(0)
        
    }
}
