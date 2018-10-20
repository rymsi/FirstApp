package com.example.junaid.firstapp;

import android.widget.Button;

public class Question {
    private int mTextResID;
    private boolean mAnswerTrue;
    private int answerState = 0;


    public int getAnswerState() {
        return answerState;
    }

    public void setAnswerState(int answerState) {
        this.answerState = answerState;
    }


    public int getTextResID() {
        return mTextResID;
    }
    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int TextResID, boolean AnswerTrue) {
        mAnswerTrue = AnswerTrue;
        mTextResID = TextResID;


    }
}
