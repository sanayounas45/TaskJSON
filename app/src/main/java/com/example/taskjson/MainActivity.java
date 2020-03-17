package com.example.taskjson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lecture myLecture=new Lecture("Sana Younas","MAD");

        Gson myGson=new Gson();
        String responseJson=myGson.toJson(myGson);

        String myJson="{\"name\":\"Sana Younas\",\"lecture\":\"MAD\"}";
        MyJsonClass myJsonClass=myGson.fromJson(myJson,MyJsonClass.class);

        Toast.makeText(this, myJsonClass.getName(), Toast.LENGTH_SHORT).show();
    }
}
