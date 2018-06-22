package br.com.diefferson.testefeatures.featuretwo

import android.os.Bundle
import br.com.diefferson.testefeatures.common.BaseActivity
import kotlinx.android.synthetic.main.activity_feature_two.*

class FeatureTwoActivity : BaseActivity() {

    override val layout = R.layout.activity_feature_two

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        nameFeatureTwo.text = "FeatureTwo"
    }
}
