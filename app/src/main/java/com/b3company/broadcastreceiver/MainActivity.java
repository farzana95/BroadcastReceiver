package com.b3company.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSendBC;
    String TEST_ACTION = "test_action";

    public static final String TAG = "mytag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*MyReceiver myReceiver = new MyReceiver();
        IntentFilter filter = new IntentFilter(TEST_ACTION);
        registerReceiver(myReceiver, filter);*/

        btnSendBC = findViewById(R.id.btnSendBC);
        btnSendBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TEST_ACTION);
                sendBroadcast(intent);
            }
        });
    }
}
