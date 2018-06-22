package br.com.diefferson.testefeatures

import android.os.Bundle
import br.com.diefferson.testefeatures.common.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(){

    override val layout: Int
        get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        featureOneBtn.setOnClickListener {
            NavigationHelper.launchFeatureOne(this)
        }

        featureTwoBtn.setOnClickListener {
            NavigationHelper.launchFeatureTwo(this)
        }
    }
}