package ru.temoteam.a1exs.someapp4edu.ui.taskadd


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter

import ru.temoteam.a1exs.someapp4edu.R

class AddTaskFragment : MvpAppCompatFragment(), TaskAddView {

    @InjectPresenter
    lateinit var taskAddPresenter: TaskAddPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_task, container, false)
    }


}
