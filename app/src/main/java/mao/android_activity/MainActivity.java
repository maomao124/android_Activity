package mao.android_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity
{

    /**
     * 文本视图
     */
    private TextView textView;

    /**
     * SimpleDateFormat
     */
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 标签
     */
    public static final String TAG = "MainActivity";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.TextView);
        Log.d(TAG, "onCreate: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onCreate");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "onStart: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onStart");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onResume");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG, "onPause: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onPause");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG, "onStop: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onStop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onRestart");
    }


}