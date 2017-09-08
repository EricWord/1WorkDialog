package com.cuiguangsong.workdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btPrompt;
    private Button btShowLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化界面
        initView();
    }

    /**
     * 初始化界面
     */
    private void initView() {
        setContentView(R.layout.activity_main);
        //定位控件
        btPrompt = (Button) findViewById(R.id.bt_prompt);
        btShowLogin = (Button) findViewById(R.id.bt_show_login);

    }

    /**
     * 显示提示
     * @param view
     */
    public void showPrompt(View view) {
//        Toast.makeText(this,"显示提示按钮被点击", Toast.LENGTH_SHORT).show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("警告");
        builder.setMessage("若练此功，必先自宫，是否继续？");
        builder.setPositiveButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "啊...即便自宫，也不一定能成功", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("否", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "如果不自宫，一定不成功", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    /**
     * 显示登录界面
     * @param view
     */
    public void showLogin(View view) {
//        Intent intent =new Intent(MainActivity.this, Login.class);
//        startActivity(intent);
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setTitle("用户登录界面");
//
//        builder.show();
        EditText editText = new EditText(this);
        new AlertDialog.Builder(this).setTitle("请输入")
//                .setIcon(android.R.drawable.ic_dialog_info).setView(editText)
                .setPositiveButton("确定",null)
                .setNegativeButton("取消",null).show();



    }
}
