package ru.temoteam.a1exs.todo.ui.taskview


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter

import ru.temoteam.a1exs.todo.R
import ru.temoteam.a1exs.todo.ui.MainPresenter

class TaskViewFragment : MvpAppCompatFragment(),TaskViewView {

    @InjectPresenter
    lateinit var taskViewPresenter: TaskViewPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task_view, container, false)
    }


}
