package com.example.joshu.sharescripture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.joshu.sharescripture.SecondaryActivity";
    private String concat = "";
    private EditText book;
    private EditText chapter;
    private EditText verse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View v) {

        book = (EditText) findViewById(R.id.editText);
        chapter = (EditText) findViewById(R.id.editText2);
        verse = (EditText) findViewById(R.id.editText3);
        try {
            concat = book.getText().toString() + " " +
                    chapter.getText().toString() + ":" +
                    verse.getText().toString();

            // move on to the next page
            Intent intent = new Intent(this, SecondaryActivity.class);
            intent.putExtra(EXTRA_MESSAGE, concat);
            startActivity(intent);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
