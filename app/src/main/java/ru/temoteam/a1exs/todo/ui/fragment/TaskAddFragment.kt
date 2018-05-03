package ru.temoteam.a1exs.todo.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.temoteam.a1exs.todo.R
import ru.temoteam.a1exs.todo.presentation.view.TaskAddView
import ru.temoteam.a1exs.todo.presentation.presenter.TaskAddPresenter

import com.arellomobile.mvp.MvpFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import ru.temoteam.a1exs.todo.ui.activity.MainActivity

class TaskAddFragment : BaseMvpFragment(), TaskAddView {
    companion object {
        const val TAG = "TaskAddFragment"

        fun newInstance(): TaskAddFragment {
            val fragment: TaskAddFragment = TaskAddFragment()
            val args: Bundle = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    @InjectPresenter
    lateinit var mTaskAddPresenter: TaskAddPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_task_add, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
