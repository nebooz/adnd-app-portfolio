package com.abnd.mdiaz.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button appButton1 = (Button) findViewById(R.id.btn_app_1);
        Button appButton2 = (Button) findViewById(R.id.btn_app_2);
        Button appButton3 = (Button) findViewById(R.id.btn_app_3);
        Button appButton4 = (Button) findViewById(R.id.btn_app_4);
        Button appButton5 = (Button) findViewById(R.id.btn_app_5);
        Button appButton6 = (Button) findViewById(R.id.btn_app_6);

        appButton1.setOnClickListener(this);
        appButton2.setOnClickListener(this);
        appButton3.setOnClickListener(this);
        appButton4.setOnClickListener(this);
        appButton5.setOnClickListener(this);
        appButton6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_app_1:
                toastyMessage(getString(R.string.btn_1_toast_message));
                break;
            case R.id.btn_app_2:
                toastyMessage(getString(R.string.btn_2_toast_message));
                break;
            case R.id.btn_app_3:
                toastyMessage(getString(R.string.btn_3_toast_message));
                break;
            case R.id.btn_app_4:
                toastyMessage(getString(R.string.btn_4_toast_message));
                break;
            case R.id.btn_app_5:
                toastyMessage(getString(R.string.btn_5_toast_message));
                break;
            case R.id.btn_app_6:
                toastyMessage(getString(R.string.btn_6_toast_message));
                break;
        }

    }

    private void toastyMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
