package com.example.gand.testapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
    public static final String TEXT_KEY = "TEXT_KEY";

    private TextView mText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Bundle bundle = getIntent().getExtras();
        mText = findViewById(R.id.tv_info);
        mButton = findViewById(R.id.bt_info);
        mText.setText(bundle.getString(TEXT_KEY));

    }
}
