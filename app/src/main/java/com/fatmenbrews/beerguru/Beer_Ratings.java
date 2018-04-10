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
    private String mTasteNotes;          //Beer Notes

    public double getAppearance() {
        return mAppearance;
    }

    public void setAppearance(double mAppearance) {
        this.mAppearance = mAppearance;
    }

    public double getAroma() {
        return mAroma;
    }

    public void setAroma(double mAroma) {
        this.mAroma = mAroma;
    }

    public double getTaste() {
        return mTaste;
    }

    public void setTaste(double mTaste) {
        this.mTaste = mTaste;
    }

    public double getFeel() {
        return mFeel;
    }

    public void setFeel(double mFeel) {
        this.mFeel = mFeel;
    }

    public double getOverall() {
        return mOverall;
    }

    public void setOverall(double mOverall) {
        this.mOverall = mOverall;
    }

    public String setTasteNotes() {
        return mTasteNotes;
    }

    public void getTasteNotes(String mNotes) {
        this.mTasteNotes = mNotes;
    }
}
