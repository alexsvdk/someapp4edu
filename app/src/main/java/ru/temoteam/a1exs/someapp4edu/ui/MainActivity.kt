package ru.temoteam.a1exs.someapp4edu.ui

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import ru.temoteam.a1exs.someapp4edu.R


class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showFragment(fragment: MvpAppCompatFragment) {
        supportFragmentManager.beginTransaction().replace(R.id.container,fragment).commit()
    }
}
