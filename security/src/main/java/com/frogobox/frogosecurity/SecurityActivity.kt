package com.frogobox.frogosecurity

import android.os.Bundle
import android.view.MenuItem
import com.frogobox.frogosecurity.databinding.ActivitySecurityBinding
import com.frogobox.research.base.BaseActivity

class SecurityActivity : BaseActivity<ActivitySecurityBinding>() {

    override fun setupViewBinding(): ActivitySecurityBinding {
        return ActivitySecurityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}