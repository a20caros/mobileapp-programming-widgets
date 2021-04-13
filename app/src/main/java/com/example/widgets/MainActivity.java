package com.example.widgets;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private String[] fotbollslagsnamn = {"Våmbs IF","Skövde KIK","Skultorps IF"};
    private ArrayList<String> listData=new ArrayList<>(Arrays.asList(fotbollslagsnamn));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_textview,R.id.list_textview_xml,listData);
        ListView listView= findViewById(R.id.list_textview_xml);

        EditText editText = findViewById(R.id.edit_text);
        Button my_button = findViewById(R.id.button);

        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","Klickade på skicka!");
            }
        });
    }
}
