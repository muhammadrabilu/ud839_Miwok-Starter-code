package com.example.android.miwok;

/**
 * Created by Rabilu on 7/8/2018.
 */

public class Word {

    /** Default Translation for the word **/
  private  String mDefaultTranslation;


    /** Default Translation for the word **/
    private  String mMiwokTranslation;

    /**Image resource id for the word*/
    private int mImageResourcesId;


    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourcesId = imageResourceId;
    }

    /**
     * Get the default translation of the word
     */
    public String getdDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word
     */
    public String getdMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImageResourcesId() {
        return mImageResourcesId;
    }

}
