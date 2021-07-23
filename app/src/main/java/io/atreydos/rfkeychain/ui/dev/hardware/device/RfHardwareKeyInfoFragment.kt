package io.atreydos.rfkeychain.ui.dev.hardware.device

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.*
import android.widget.TextView
import androidx.core.content.ContextCompat.startForegroundService
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import io.atreydos.rfkeychain.BuildConfig
import io.atreydos.rfkeychain.R
import io.atreydos.rfkeychain.service.RfHardwareKeyGattService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

class RfHardwareKeyInfoFragment : Fragment(R.layout.fragment_rf_hardware_key_info) {

    companion object {
        fun newInstance() = RfHardwareKeyInfoFragment()
    }

    private lateinit var viewModel: RfHardwareKeyInfoViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RfHardwareKeyInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }



    private val defaultScope = CoroutineScope(Dispatchers.Default)

    private val mainHandler = Handler(Looper.getMainLooper())

//    private var gattServiceConn: GattServiceConn? = null

    private var gattServiceData: RfHardwareKeyGattService.DataPlane? = null

    private val myCharacteristicValueChangeNotifications = Channel<String>()


//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Set up the UI so that notifications we receive are rendered
//
//        val gattCharacteristicValue = findViewById<TextView>(R.id.textViewGattCharacteristicValue)
//
//        defaultScope.launch {
//            for (newValue in myCharacteristicValueChangeNotifications) {
//                mainHandler.run {
//                    gattCharacteristicValue.text = newValue
//                }
//            }
//        }
//
//        // Startup our Bluetooth GATT service explicitly so it continues to run even if
//        // this activity is not in focus
//        startForegroundService(Intent(this, RfHardwareKeyGattService::class.java))
//    }
//
//    override fun onStart() {
//        super.onStart()
//
//        val latestGattServiceConn = GattServiceConn()
//        if (bindService(Intent(RfHardwareKeyGattService.DATA_PLANE_ACTION, null, this, GattService::class.java), latestGattServiceConn, 0)) {
//            gattServiceConn = latestGattServiceConn
//        }
//    }
//
//    override fun onStop() {
//        super.onStop()
//
//        if (gattServiceConn != null) {
//            unbindService(gattServiceConn!!)
//            gattServiceConn = null
//        }
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//
//        // We only want the service around for as long as our app is being run on the device
//        stopService(Intent(this, RfHardwareKeyGattService::class.java))
//    }
//
//    private inner class GattServiceConn : ServiceConnection {
//        override fun onServiceDisconnected(name: ComponentName?) {
//            if (BuildConfig.DEBUG && RfHardwareKeyGattService::class.java.name != name?.className) {
//                error("Disconnected from unknown service")
//            } else {
//                gattServiceData = null
//            }
//        }
//
//        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
//            if (BuildConfig.DEBUG && RfHardwareKeyGattService::class.java.name != name?.className)
//                error("Connected to unknown service")
//            else {
//                gattServiceData = service as RfHardwareKeyGattService.DataPlane
//
//                gattServiceData?.setMyCharacteristicChangedChannel(myCharacteristicValueChangeNotifications)
//            }
//        }
//    }


}