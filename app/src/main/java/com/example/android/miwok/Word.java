package com.example.android.miwok;

/**
 * Contains English and Miwok translation fof each word
 */

public class Word {

    //default translation
    private String mDefaultTranslation;

    //Miwok translation
    private String mMiwokTranslation;

    //image ID
    private int mImageResourceId;

    //Constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //Second Constructor with 3rd input
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //*Get the DefaultTranslation of the word*/
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    //*Get the MiwokTranslation of the word*/
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    //* Get the Image ID*/
    public int getImageResourceId() {
        return mImageResourceId;
    }

}

