package com.example.intent2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    private static final String TAG = "MainActivity";
    private Button button1;//声明一个按钮的对象
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//当前页面布局采用的是res/layout/activity_main.xml
        Button button1 = findViewById(R.id.button_1);//获取名叫button_1的按钮控件
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);
        Button button4 = findViewById(R.id.button_4);
        Button button5 = findViewById(R.id.button_5);
        Button button6 = findViewById(R.id.button_6);
        Button button7 = findViewById(R.id.button_7);
        Button button8 = findViewById(R.id.button_8);
        Button button9 = findViewById(R.id.button_9);
        Button button10 = findViewById(R.id.button_10);
        Button button11 = findViewById(R.id.button_11);
        Button button12 = findViewById(R.id.button_12);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.button_1)
                {
                    Log.i(TAG, "onClick:按钮点击");
                    Toast.makeText(MainActivity.this, "  ", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }
            }
        });

    }//
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_2:
                new AlertDialog.Builder(this)//创建提醒对话框的建造器
                        .setTitle("消息提示")
                        .setMessage("是否进入任务界面")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Log.e(TAG, "onClick: ");
                                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                                startActivity(intent);
                            }
                        })
                        .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //给建造器设置对话框按钮文本及点击监听器
                                //button2.setText("退出");
                                Toast.makeText(MainActivity.this, "cancel", Toast.LENGTH_LONG).show();
                            }
                        })
                        .create().show();
                break;
            case R.id.button_3:
                new AlertDialog.Builder(this)
                        .setTitle("消息提示")
                        .setMessage("请添加数据")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }
                        }).create().show();
                break;
            case R.id.button_4:
                new AlertDialog.Builder(this)
                        .setTitle("消息提示")
                        .setMessage("请添加数据")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }
                        }).create().show();
                break;
            case R.id.button_5:
                new AlertDialog.Builder(this)
                        .setTitle("消息提示")
                        .setMessage("请添加数据")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }
                        }).create().show();
                break;
            case R.id.button_6:
                new AlertDialog.Builder(this)
                        .setTitle("消息提示")
                        .setMessage("请添加数据")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }

                        })
                        .setPositiveButton("中断数据", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).create().show();
                break;
            case R.id.button_7:
                new AlertDialog.Builder(this)
                        .setMessage("是否中断主车运行")
                        .setTitle("消息提示")
                        .setNegativeButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }
                        }).create().show();
                break;
            case R.id.button_8:
                new AlertDialog.Builder(this)
                        .setTitle("消息提示")
                        .setMessage("请选择删除数据")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }
                        }).create().show();
                break;
            case R.id.button_9:
                new AlertDialog.Builder(this)
                        .setTitle("消息提示")
                        .setMessage("是否清空数据")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }
                        }).create().show();
                break;
            case R.id.button_10:
                new AlertDialog.Builder(this)
                        .setTitle("消息提示")
                        .setMessage("是否保存数据")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //
                            }
                        })
                        .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).create().show();
                break;
            case R.id.button_11:
                new AlertDialog.Builder(this)
                        .setTitle("消息提示")
                        .setMessage("是否载入数据")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).create().show();
                break;
            case R.id.button_12:
                new AlertDialog.Builder(this)
                        .setTitle("消息提示")
                        .setMessage("请选择修改数据")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).create().show();//生成AlertDialog的对象，调用AlertDialog对象的show方法
        }
    }
  //
}
