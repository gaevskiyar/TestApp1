package com.example.gand.testapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private Button mButton;

    private View.OnClickListener mOnClikListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (checkText(mEditText.getText().toString())){
                //showMessage(mEditText.getText());
                Intent startInfoIntent = new Intent(MainActivity.this, InfoActivity.class);
                startInfoIntent.putExtra(InfoActivity.TEXT_KEY, mEditText.getText().toString());
                startActivity(startInfoIntent);
            }
        }
    };

    private void showMessage(Editable text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    private boolean checkText(String text){
        return !TextUtils.isEmpty(text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = findViewById(R.id.editText);
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener(mOnClikListener);
    }
}
