package com.fatmenbrews.beerguru;

/**
 * Created by Juan on 3/23/2018.
 */

public class Beer_Ratings extends Beer {
    private double mAppearance;     //Beer Appearance Rating
    private double mAroma;          //Beer Aroma Rating
    private double mTaste;          //Beer Taste Rating
    private double mFeel;           //Beer Feel Rating
    private double mOverall;        //Beer Overall Rating
    private String mNotes;          //Beer Notes

    public double getmAppearance() {
        return mAppearance;
    }

    public void setmAppearance(double mAppearance) {
        this.mAppearance = mAppearance;
    }

    public double getmAroma() {
        return mAroma;
    }

    public void setmAroma(double mAroma) {
        this.mAroma = mAroma;
    }

    public double getmTaste() {
        return mTaste;
    }

    public void setmTaste(double mTaste) {
        this.mTaste = mTaste;
    }

    public double getmFeel() {
        return mFeel;
    }

    public void setmFeel(double mFeel) {
        this.mFeel = mFeel;
    }

    public double getmOverall() {
        return mOverall;
    }

    public void setmOverall(double mOverall) {
        this.mOverall = mOverall;
    }

    public String getmNotes() {
        return mNotes;
    }

    public void setmNotes(String mNotes) {
        this.mNotes = mNotes;
    }
}
