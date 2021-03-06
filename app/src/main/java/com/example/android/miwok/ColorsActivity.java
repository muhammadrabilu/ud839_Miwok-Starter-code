package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red","watetti", R.drawable.color_red));
        words.add(new Word("mustard yellow","chiwiita", R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yello","topiisa", R.drawable.color_dusty_yellow));
        words.add(new Word("green","chokokki", R.drawable.color_green));
        words.add(new Word("brown","takaakki", R.drawable.color_brown));
        words.add(new Word("gray","topoppi", R.drawable.color_gray));
        words.add(new Word("black","kululli", R.drawable.color_black));
        words.add(new Word("white","kelelli", R.drawable.color_white));


        // this controls the whe Array adapter for the list View

        WordAdapter adapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
