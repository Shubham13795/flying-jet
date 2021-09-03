package com.shubham.flyingjet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.WindowManager;

public class GameActivity extends AppCompatActivity {

    private GameVIew gameVIew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        gameVIew = new GameVIew(this, point.x, point.y);

        setContentView(gameVIew);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameVIew.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameVIew.resume();
    }
}