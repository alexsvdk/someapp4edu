package ru.temoteam.a1exs.todo.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle

import com.arellomobile.mvp.presenter.InjectPresenter
import ru.temoteam.a1exs.todo.R
import ru.temoteam.a1exs.todo.presentation.view.MainView
import ru.temoteam.a1exs.todo.presentation.presenter.MainPresenter

import                  com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.MvpFragment


class MainActivity : MvpAppCompatActivity(), MainView {

    companion object {
        const val TAG = "MainActivity"
        fun getIntent(context: Context): Intent = Intent(context, MainActivity::class.java)
    }

    @InjectPresenter
    lateinit var mMainPresenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun selectFragment(fragment: MvpFragment) {
        fragmentManager.beginTransaction().replace(R.id.container,fragment).commit()
    }
}
