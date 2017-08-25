package com.example.bilal.lab3;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton btn;
    private WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wifiManager = (WifiManager)this.getSystemService(Context.WIFI_SERVICE);

        btn = (ToggleButton) findViewById(R.id.togle);
        btn.setChecked(wifiManager.isWifiEnabled());

        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               wifiManager.setWifiEnabled(isChecked);

//                wifiManager.setWifiEnabled(true);
//                wifiManager.setWifiEnabled(false);
            }

        });
    }
}
