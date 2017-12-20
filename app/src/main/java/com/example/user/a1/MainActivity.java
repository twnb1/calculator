package com.example.user.a1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //NumberFormat nf = new NumberFormatException("###.###");
    double total = 0, now = 0, ago = 0,  cntp = 0;
    String s = "", s1 = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t = (TextView) findViewById(R.id.t);
        Button b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(this);

        Button b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);

        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);

        Button b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);

        Button b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);

        Button b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);

        Button b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);

        Button b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);

        Button b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);

        Button b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(this);

        Button bp = (Button) findViewById(R.id.bp);
        bp.setOnClickListener(this);

        Button bm = (Button) findViewById(R.id.bm);
        bm.setOnClickListener(this);

        Button bt = (Button) findViewById(R.id.bt);
        bt.setOnClickListener(this);

        Button bd = (Button) findViewById(R.id.bd);
        bd.setOnClickListener(this);

        Button bdot = (Button) findViewById(R.id.bmod);
        bdot.setOnClickListener(this);

        Button be = (Button) findViewById(R.id.be);
        be.setOnClickListener(this);

        Button bc = (Button) findViewById(R.id.bc);
        bc.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.b0) {
            TextView t = (TextView) findViewById(R.id.t);
            now = now * 10 + 0;
            if (s1.equals("") && s.equals("")) {
                if((now-(int)now) == 0){
                    t.setText(String.valueOf((int)now));
                }else {
                    t.setText(String.valueOf(now));
                }
            } else if (s.equals("+")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("-")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("*")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("/")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            }else if(s.equals(".")){
                if(ago==0){
                    t.setText(String.valueOf("0"+s+now));
                }else{
                    t.setText(String.valueOf(ago+s+now));
                }
                s="";
            }
        } else if (view.getId() == R.id.b1) {
            TextView t = (TextView) findViewById(R.id.t);
            now = now * 10 + 1;
            if (s1.equals("") && s.equals("")) {
                if((now-(int)now) == 0){
                    t.setText(String.valueOf((int)now));
                }else {
                    t.setText(String.valueOf(now));
                }
            } else if (s.equals("+")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("-")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("*")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("/")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            }else if(s.equals(".")){
                if(ago==0){
                    t.setText(String.valueOf("0"+s+now));
                }else{
                    t.setText(String.valueOf(ago+s+now));
                }
                s="";
            }
            Log.d("偵錯",String.valueOf(now));
        } else if (view.getId() == R.id.b2) {
            TextView t = (TextView) findViewById(R.id.t);
            now = now * 10 + 2;
            if (s1.equals("") && s.equals("")) {
                if((now-(int)now) == 0){
                    t.setText(String.valueOf((int)now));
                }else {
                    t.setText(String.valueOf(now));
                }
            } else if (s.equals("+")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("-")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("*")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("/")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            }else if(s.equals(".")){
                if(ago==0){
                    t.setText(String.valueOf("0"+s+now));
                }else{
                    t.setText(String.valueOf(ago+s+now));
                }
                s="";
            }
        } else if (view.getId() == R.id.b3) {
            TextView t = (TextView) findViewById(R.id.t);
            now = now * 10 + 3;
            if (s1.equals("") && s.equals("")) {
                if((now-(int)now) == 0){
                    t.setText(String.valueOf((int)now));
                }else {
                    t.setText(String.valueOf(now));
                }
            } else if (s.equals("+")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("-")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("*")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("/")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            }else if(s.equals(".")){
                if(ago==0){
                    t.setText(String.valueOf("0"+s+now));
                }else{
                    t.setText(String.valueOf(ago+s+now));
                }
                s="";
            }
        } else if (view.getId() == R.id.b4) {
            TextView t = (TextView) findViewById(R.id.t);
            now = now * 10 + 4;
            if (s1.equals("") && s.equals("")) {
                if((now-(int)now) == 0){
                    t.setText(String.valueOf((int)now));
                }else {
                    t.setText(String.valueOf(now));
                }
            } else if (s.equals("+")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("-")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("*")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("/")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            }else if(s.equals(".")){
                if(ago==0){
                    t.setText(String.valueOf("0"+s+now));
                }else{
                    t.setText(String.valueOf(ago+s+now));
                }
                s="";
            }
        } else if (view.getId() == R.id.b5) {
            TextView t = (TextView) findViewById(R.id.t);
            now = now * 10 + 5;
            if (s1.equals("") && s.equals("")) {
                if((now-(int)now) == 0){
                    t.setText(String.valueOf((int)now));
                }else {
                    t.setText(String.valueOf(now));
                }
            } else if (s.equals("+")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("-")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("*")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("/")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            }else if(s.equals(".")){
                if(ago==0){
                    t.setText(String.valueOf("0"+s+now));
                }else{
                    t.setText(String.valueOf(ago+s+now));
                }
                s="";
            }
        } else if (view.getId() == R.id.b6) {
            TextView t = (TextView) findViewById(R.id.t);
            now = now * 10 + 6;
            if (s1.equals("") && s.equals("")) {
                if((now-(int)now) == 0){
                    t.setText(String.valueOf((int)now));
                }else {
                    t.setText(String.valueOf(now));
                }
            } else if (s.equals("+")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("-")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("*")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("/")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            }else if(s.equals(".")){
                if(ago==0){
                    t.setText(String.valueOf("0"+s+now));
                }else{
                    t.setText(String.valueOf(ago+s+now));
                }
                s="";
            }
        } else if (view.getId() == R.id.b7) {
            TextView t = (TextView) findViewById(R.id.t);
            now = now * 10 + 7;
            if (s1.equals("") && s.equals("")) {
                if((now-(int)now) == 0){
                    t.setText(String.valueOf((int)now));
                }else {
                    t.setText(String.valueOf(now));
                }
            } else if (s.equals("+")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("-")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("*")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("/")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            }else if(s.equals(".")){
                if(ago==0){
                    t.setText(String.valueOf("0"+s+now));
                }else{
                    t.setText(String.valueOf(ago+s+now));
                }
                s="";
            }
        } else if (view.getId() == R.id.b8) {
            TextView t = (TextView) findViewById(R.id.t);
            now = now * 10 + 8;
            if (s1.equals("") && s.equals("")) {
                if((now-(int)now) == 0){
                    t.setText(String.valueOf((int)now));
                }else {
                    t.setText(String.valueOf(now));
                }
            } else if (s.equals("+")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("-")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("*")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("/")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            }else if(s.equals(".")){
                if(ago==0){
                    t.setText(String.valueOf("0"+s+now));
                }else{
                    t.setText(String.valueOf(ago+s+now));
                }
                s="";
            }
        } else if (view.getId() == R.id.b9) {
            TextView t = (TextView) findViewById(R.id.t);
            now = now * 10 + 9;
            if (s1.equals("") && s.equals("")) {
                if((now-(int)now) == 0){
                    t.setText(String.valueOf((int)now));
                }else {
                    t.setText(String.valueOf(now));
                }
            } else if (s.equals("+")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("-")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("*")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            } else if (s.equals("/")) {
                if (ago == 0) {
                    t.setText(String.valueOf(s+now));
                } else {
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago + s + (int)now));
                    }else{
                        t.setText(String.valueOf(ago + s + (int)now));
                    }
                }
            }else if(s.equals(".")){
                if(ago==0){
                    t.setText(String.valueOf("0"+s+now));
                }else{
                    t.setText(String.valueOf(ago+s+now));
                }
                s="";
            }
        } else if (view.getId() == R.id.bp) {
            cntp++;
            TextView t = (TextView) findViewById(R.id.t);
            if (cntp > 1) {
                s1 = "+";
                if (s.equals("+")) {
                    ago = ago + now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s="+";
                } else if (s.equals("-")) {
                    ago = ago - now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s="+";
                } else if (s.equals("*")) {
                    ago = ago * now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s="+";
                } else if (s.equals("/")) {
                    ago = ago / now;
                    ago=(int)(ago*1000);
                    ago=ago/1000;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s="+";
                }
            } else if (cntp <= 1) {
                ago = now;
                s = "+";
                now = 0;
                if((ago-(int)ago) == 0){
                    t.setText(String.valueOf((int)ago) + s);
                }else {
                    t.setText(String.valueOf(ago) + s);
                }
            }


        } else if (view.getId() == R.id.bm) {
            cntp++;
            TextView t = (TextView) findViewById(R.id.t);
            if (cntp > 1) {
                s1 = "-";
                if (s.equals("+")) {
                    ago = ago + now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "-";
                } else if (s.equals("-")) {
                    ago = ago - now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "-";
                } else if (s.equals("*")) {
                    ago = ago * now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "-";
                } else if (s.equals("/")) {
                    if(now==0){
                        s="-";
                        if((ago-(int)ago) == 0){
                            t.setText(String.valueOf((int)ago) + s1);
                        }else {
                            t.setText(String.valueOf(ago) + s1);
                        }
                    }else{
                        ago = ago / now;
                        ago=(int)(ago*1000);
                        ago=ago/1000;
                        now = 0;
                        cntp--;
                        if((ago-(int)ago) == 0){
                            t.setText(String.valueOf((int)ago) + s1);
                        }else {
                            t.setText(String.valueOf(ago) + s1);
                        }
                        s1 = "";
                        s = "-";
                    }

                }
            } else if (cntp <= 1) {
                ago = now;
                s = "-";
                now = 0;
                if((ago-(int)ago) == 0){
                    t.setText(String.valueOf((int)ago) + s);
                }else {
                    t.setText(String.valueOf(ago) + s);
                }
            }


        } else if (view.getId() == R.id.bt) {
            cntp++;
            TextView t = (TextView) findViewById(R.id.t);
            if (cntp > 1) {
                s1 = "*";
                if (s.equals("+")) {
                    ago = ago + now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "*";
                } else if (s.equals("-")) {
                    ago = ago - now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "*";
                } else if (s.equals("*")) {
                    ago = ago * now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "*";
                } else if (s.equals("/")) {
                    ago = ago / now;
                    ago=(int)(ago*1000);
                    ago=ago/1000;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "*";
                }
            } else if (cntp <= 1) {
                ago = now;
                s = "*";
                now = 0;
                if((ago-(int)ago) == 0){
                    t.setText(String.valueOf((int)ago) + s);
                }else {
                    t.setText(String.valueOf(ago) + s);
                }
            }

        } else if (view.getId() == R.id.bd) {
            cntp++;
            TextView t = (TextView) findViewById(R.id.t);
            if (cntp > 1) {
                s1 = "/";
                if (s.equals("+")) {
                    ago = ago + now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "/";
                } else if (s.equals("-")) {
                    ago = ago - now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "/";
                } else if (s.equals("*")) {
                    ago = ago * now;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "/";
                } else if (s.equals("/")) {
                    ago = ago / now;
                    ago=(int)(ago*1000);
                    ago=ago/1000;
                    now = 0;
                    cntp--;
                    if((ago-(int)ago) == 0){
                        t.setText(String.valueOf((int)ago) + s1);
                    }else {
                        t.setText(String.valueOf(ago) + s1);
                    }
                    s1 = "";
                    s = "/";
                }
            } else if (cntp <= 1) {
                ago = now;
                s = "/";
                now = 0;
                if((ago-(int)ago) == 0){
                    t.setText(String.valueOf((int)ago) + s);
                }else {
                    t.setText(String.valueOf(ago) + s);
                }
            }

        } else if (view.getId() == R.id.bmod) {
            TextView t = (TextView) findViewById(R.id.t);
            int a=0;
            int b=0;
            if(s.equals("+")){
                t.setText(String.valueOf("0"));
            }else if(s.equals("-")){
                t.setText(String.valueOf("0"));
            }else if(s.equals("*")){
                t.setText(String.valueOf("0"));
            }else if(s.equals("/")){
                a=(int)(ago/now);
                b=(int)(ago-(now*a));
                t.setText(String.valueOf(b));
            }else if(s.equals("") && s1.equals("")){
                t.setText(String.valueOf((int)ago));
            }
            now = 0;
            ago = 0;
            total = 0;
            cntp = 0;
            a=0;
            b=0;
            s = "";
            s1 = "";
        } else if (view.getId() == R.id.be) {
            TextView t = (TextView) findViewById(R.id.t);
            if (s.equals("+")) {
                total = ago + now;
                if((total-(int)total) == 0){
                    t.setText(String.valueOf((int)total));
                }else {
                    t.setText(String.valueOf(total));
                }
                ago = now = total ;
            } else if (s.equals("-")) {
                total = ago - now;
                if((total-(int)total) == 0){
                    t.setText(String.valueOf((int)total));
                }else {
                    t.setText(String.valueOf(total));
                }
                ago = now = total ;
            } else if (s.equals("*")) {
                total = ago * now;
                if((total-(int)total) == 0){
                    t.setText(String.valueOf((int)total));
                }else {
                    t.setText(String.valueOf(total));
                }
                ago = now = total ;
            } else if (s.equals("/")) {
                total = ago / now;
                total=(int)(total*1000);
                total=total/1000;
                if((total-(int)total) == 0){
                    t.setText(String.valueOf((int)total));
                }else {
                    t.setText(String.valueOf(total));
                }
                ago = now = total ;
            } else if (cntp == 0) {
                t.setText(String.valueOf((int)now));
            }
            cntp=0;

        } else if (view.getId() == R.id.bc) {
            TextView t = (TextView) findViewById(R.id.t);
            now = 0;
            ago = 0;
            total = 0;
            cntp = 0;
            s = "";
            s1 = "";
            t.setText("");
        }
    }
}