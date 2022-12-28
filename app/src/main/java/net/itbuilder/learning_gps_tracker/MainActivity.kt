package net.itbuilder.learning_gps_tracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationRequest
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val DEFAULT_UPDATE_INTERVAL: Long = 30
        val FAST_UPDATE_INTERVAL: Long = 50

        val tv_lat: TextView = findViewById(R.id.tv_lat)
        val tv_lon: TextView = findViewById(R.id.tv_lon)
        val tv_altitude: TextView = findViewById(R.id.tv_altitude)
        val tv_accuracy: TextView = findViewById(R.id.tv_accuracy)
        val tv_speed: TextView = findViewById(R.id.tv_speed)
        val tv_sensor: TextView = findViewById(R.id.tv_sensor)
        val tv_updates: TextView = findViewById(R.id.tv_updates)
        val tv_address: TextView = findViewById(R.id.tv_address)
        val sw_gps: Switch = findViewById(R.id.sw_gps)
        val sw_locationupdates: Switch = findViewById(R.id.sw_locationsupdates)

        // Google's API for location services
        val fusedLocationProviderClient: FusedLocationProviderClient

        // LocationRequest
        val locationRequest = LocationRequest()
        // how often does default location check occur?
        locationRequest.interval = 1000 * DEFAULT_UPDATE_INTERVAL
        // how often does the location check occur when set to the most frequent update?
        locationRequest.fastestInterval = 1000 * FAST_UPDATE_INTERVAL
        locationRequest.priority = LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY

        sw_gps.setOnClickListener {

        }
    }
}