package br.com.diefferson.testefeatures.featureone

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import br.com.diefferson.testefeatures.common.BaseActivity
import kotlinx.android.synthetic.main.activity_feature_one.*

class FeatureOneActivity : BaseActivity() {

    override val layout = R.layout.activity_feature_one

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        nameFeatureOne.text = "FeatureOne"
    }
}