package com.shyamu53r.mathoperations;

import android.content.Context;
import android.widget.TextView;

public class MathOps {
    public static void add(Context c, TextView textView, int a, int b){
        textView.setText((a+b)+" ");
    }
    public static void sub(Context c, TextView textView, int a, int b){
        textView.setText((a-b)+" ");
    }
    public static void multiply(Context c, TextView textView, int a, int b){
        textView.setText((a*b)+" ");
    }
    public static void divide(Context c, TextView textView, int a, int b){
        textView.setText((a/b)+" ");
    }
}
