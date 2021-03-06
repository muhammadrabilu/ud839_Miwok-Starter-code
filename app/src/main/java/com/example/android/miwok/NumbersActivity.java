package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","Lutti", R.drawable.number_one));
        words.add(new Word("two","otiiko", R.drawable.number_two));
        words.add(new Word("three","tolookosu", R.drawable.number_three));
        words.add(new Word("four","oyisa", R.drawable.number_four));
        words.add(new Word("five","messokka", R.drawable.number_five));
        words.add(new Word("six","temmokka", R.drawable.number_six));
        words.add(new Word("seven","kenekaku", R.drawable.number_seven));
        words.add(new Word("eight","kawinta", R.drawable.number_eight));
        words.add(new Word("nine","wo'e", R.drawable.number_nine));
        words.add(new Word("ten","na'aacha", R.drawable.number_ten));


        // this controls the whe Array adapter for the list View

        WordAdapter adapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
