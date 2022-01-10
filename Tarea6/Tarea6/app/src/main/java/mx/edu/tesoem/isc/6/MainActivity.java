package mx.edu.tesoem.isc.6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void presiona(View v){
        Intent intent = new Intent(this, ScrollActivity.class);
        startActivity(intent);
    }
}