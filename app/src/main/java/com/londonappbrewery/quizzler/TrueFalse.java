package com.londonappbrewery.quizzler;


public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int guestionResourceID,boolean trueorFalse){
        mQuestionID = guestionResourceID;
        mAnswer = trueorFalse;
    }

    public int getmQuestionID() {
        return mQuestionID;
    }

    public void setmQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}

