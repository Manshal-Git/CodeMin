package com.manshal_khatri.codmin

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.view.View.OnClickListener
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.forEach
import androidx.core.view.forEachIndexed

class SettingsActivity : AppCompatActivity(),OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)
        findViewById<LinearLayout>(R.id.devTiles).forEachIndexed { index, view ->
            // todo : Handle the last element (Ad)
            view.setOnClickListener(this)
        }
       /* val mn =if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getSystemService(NfcManager::class.java)
        }else{
            getSystemService(NFC_SERVICE) as NfcManager
        }
        mn.defaultAdapter?.let {
            findViewById<View>(R.id.tetherin).apply {
                isVisible = true
                setOnClickListener {
                    startActivity(Intent(Settings.ACTION_NFC_SETTINGS))
                    finish()
                }
            }
        }*/
        //  FOR FINDING MORE KIND OF SETTINGS
        // search = findViewById<View>(R.id.search)
        // search.setOnClickListener { startActivity(Intent(Settings.ACTION_APP_SEARCH_SETTINGS))}

    }

    override fun onClick(p0: View?) {
        goto(when(p0?.id){
            R.id.developer -> Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS
            R.id.wireless -> Settings.ACTION_WIRELESS_SETTINGS
            R.id.deviceInfo -> Settings.ACTION_DEVICE_INFO_SETTINGS
            else -> null
        })
        finish()
    }
}
fun AppCompatActivity.goto(des: String?) {
    des?.let { startActivity(Intent(des)) }
}
/*class SettingsFragment : PreferenceFragmentCompat() {
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}*/
