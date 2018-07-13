package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create an array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","apa", R.drawable.family_father));
        words.add(new Word("mother","ata", R.drawable.family_mother));
        words.add(new Word("son","angsi", R.drawable.family_son));
        words.add(new Word("daughter","tune", R.drawable.family_daughter));
        words.add(new Word("older brother","taachi", R.drawable.family_older_brother));
        words.add(new Word("younger brother","chalitti", R.drawable.family_younger_brother));
        words.add(new Word("older sister","tete", R.drawable.family_older_sister));
        words.add(new Word("younger sister","kolitti", R.drawable.family_younger_sister));
        words.add(new Word("grandmother","ama", R.drawable.family_grandmother));
        words.add(new Word("grandfather","papa", R.drawable.family_grandfather));


        // this controls the whe Array adapter for the list View

        WordAdapter adapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
