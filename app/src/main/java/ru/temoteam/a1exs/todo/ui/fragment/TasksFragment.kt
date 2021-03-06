package ru.temoteam.a1exs.todo.ui.fragment

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.temoteam.a1exs.todo.R
import ru.temoteam.a1exs.todo.presentation.view.TasksView
import ru.temoteam.a1exs.todo.presentation.presenter.TasksPresenter

import com.arellomobile.mvp.MvpFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import org.jetbrains.anko.sdk25.coroutines.onClick

class TasksFragment : BaseMvpFragment(), TasksView {
    companion object {
        const val TAG = "TasksFragment"

        fun newInstance(): TasksFragment {
            val fragment: TasksFragment = TasksFragment()
            val args: Bundle = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    @InjectPresenter
    lateinit var mTasksPresenter: TasksPresenter

    private lateinit var fab: FloatingActionButton
    private lateinit var recycler: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tasks, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fab = view!!.findViewById(R.id.floatingActionButton)
        recycler = view.findViewById(R.id.recycler)
        fab.onClick { mTasksPresenter.onAddBtnClick() }
    }
}
