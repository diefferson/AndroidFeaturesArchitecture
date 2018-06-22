package br.com.diefferson.testefeatures.common

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

abstract class BaseActivity : AppCompatActivity(){

    abstract val layout : Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                super.onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}