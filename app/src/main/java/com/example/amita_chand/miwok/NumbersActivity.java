package com.example.amita_chand.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
//        ArrayList<String> words = new ArrayList<String>();
//        words.add("One");
//        words.add("Two");
//        words.add("Three");
//        words.add("Four");
//        words.add("Five");
//        Log.v("NumbersActivity", "Wword1s===========================" + words.get(10));
//        Log.v("NumbersActivity", "Wword1===========================" + words.get(1));
//        Log.v("NumbersActivity", "Wword1s===========================" + words.get(2));
//        Log.v("NumbersActivity", "Wword1s===========================" + words.get(3));
////        Log.v("word1 = " + words.get(2));

        ArrayList<String> words = new ArrayList<>(Arrays.asList("one","two","three","four",
                "five","six","seven","eight","nine","ten","eleven","twelve","thirteen","14","15","16","17","18","19"));
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(0));
//        rootView.addView(wordView);
//        // Verify the contents of the array by printing out each array element to the logs
//        for (String word : words){
//            Log.v("NumberActivity", "Word at index[" + words.indexOf(word) + "] " + word);
//        }
    }
}
