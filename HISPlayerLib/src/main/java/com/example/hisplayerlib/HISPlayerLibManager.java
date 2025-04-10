package com.example.hisplayerlib;

import android.content.Context;
import android.util.Log;

import com.google.android.exoplayer2.ExoPlayer;

public class HISPlayerLibManager {
    private final String TAG = "HISPlayerLib";

    public HISPlayerLibManager() {
        Log.e(TAG, "HISPlayerLib: contructor");
    }

    public void PrintSome(){
        Log.e(TAG, "HISPlayerLib: printSomething");
    }

    public void CreateExo(Context context){
        Log.e(TAG, "HISPlayerLib: CreateExo");

        ExoPlayer player = new ExoPlayer
                .Builder(context)
                .build();

        Log.e(TAG, "HISPlayerLib: CreateExo DONE");

    }
}
