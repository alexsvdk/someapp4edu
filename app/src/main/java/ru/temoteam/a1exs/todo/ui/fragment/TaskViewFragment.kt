package ru.temoteam.a1exs.todo.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.temoteam.a1exs.todo.R
import ru.temoteam.a1exs.todo.presentation.view.TaskViewView
import ru.temoteam.a1exs.todo.presentation.presenter.TaskViewPresenter

import com.arellomobile.mvp.MvpFragment
import com.arellomobile.mvp.presenter.InjectPresenter

class TaskViewFragment : BaseMvpFragment(), TaskViewView {
    companion object {
        const val TAG = "TaskViewFragment"

        fun newInstance(): TaskViewFragment {
            val fragment: TaskViewFragment = TaskViewFragment()
            val args: Bundle = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    @InjectPresenter
    lateinit var mTaskViewPresenter: TaskViewPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_task_view, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
