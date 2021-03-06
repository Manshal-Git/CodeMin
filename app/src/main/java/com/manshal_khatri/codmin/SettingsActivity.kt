package com.manshal_khatri.codmin

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat

import java.util.zip.Inflater

class SettingsActivity : AppCompatActivity() {
//    lateinit var binding: SettingsActivityBinding
    lateinit var developer : TextView
    lateinit var wireless : TextView
    lateinit var tetherin : TextView
    lateinit var deviceInfo : TextView
  //  lateinit var search : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)

        developer = findViewById(R.id.developer)
        wireless = findViewById(R.id.wireless)
        tetherin = findViewById(R.id.tetherin)
        deviceInfo = findViewById(R.id.deviceInfo)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        developer.setOnClickListener { startActivity( Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS))}
        wireless.setOnClickListener { startActivity(Intent(Settings.ACTION_WIRELESS_SETTINGS))}
        tetherin.setOnClickListener { startActivity(Intent(Settings.ACTION_NFC_SETTINGS))}
        deviceInfo.setOnClickListener { startActivity(Intent(Settings.ACTION_DEVICE_INFO_SETTINGS))}
        // search = findViewById(R.id.search)
       // search.setOnClickListener { startActivity(Intent(Settings.ACTION_APP_SEARCH_SETTINGS))}

    }
}
    /*class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
        }
    }*/
