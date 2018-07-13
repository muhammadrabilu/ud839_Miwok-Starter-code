package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are your going?","wmintu wuksus"));
        words.add(new Word("Whar is your name","tinna oyaasa'na"));
        words.add(new Word("My name is...","oyaaset..."));
        words.add(new Word("How are your feeling","michakases"));
        words.add(new Word("I'am feeling good","kuchi achit"));
        words.add(new Word("Are you coming","aanas a'a"));
        words.add(new Word("yes I am coming.","haa aanam"));
        words.add(new Word("I'm coming","aanam"));
        words.add(new Word("Let's go","yoowutis"));
        words.add(new Word("Come here.","aani'nem"));


        // this controls the whe Array adapter for the list View

        WordAdapter adapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
