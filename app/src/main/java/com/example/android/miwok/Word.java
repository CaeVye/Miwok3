package com.example.android.miwok;

/**
 * Contains English and Miwok translation fof each word
 */

public class Word {

    //default translation
    private String mDefaultTranslation;

    //Miwok translation
    private String mMiwokTranslation;

    //Constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //*Get the DefaultTranslation of the word*/
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    //*Get the MiwokTranslation of the word*/
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}

