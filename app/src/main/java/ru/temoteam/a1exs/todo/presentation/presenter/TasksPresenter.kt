package ru.temoteam.a1exs.todo.presentation.presenter

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import ru.temoteam.a1exs.todo.presentation.view.TasksView
import ru.temoteam.a1exs.todo.ui.fragment.TaskAddFragment

@InjectViewState
class TasksPresenter : MvpPresenter<TasksView>() {
    fun onAddBtnClick(){
        viewState.selectFragment(TaskAddFragment())
    }
}
