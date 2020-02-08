package com.example.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
public class TitleLayout extends LinearLayout implements View.OnClickListener  {
    private  Button titleBack;
    private  Button titleEdit;


    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        titleBack = findViewById(R.id.btn_title_back);
        titleEdit = findViewById(R.id.btn_edit);
        titleBack.setOnClickListener(this);
        titleEdit.setOnClickListener(this);
//        titleBack.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                ((Activity) getContext()).finish();
//                ((Activity) getContext()).finish();
//            }
//        });
//        titleEdit.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getContext(), "你点击了编辑", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public TitleLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TitleLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void onClick(View v) {
        Log.d("TitleLayout","onClick");
        switch (v.getId()){
            case R.id.btn_title_back:
                ((Activity) getContext()).finish();
                break;
            case R.id.btn_edit:
                Toast.makeText(getContext(), "你点击了编辑", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
