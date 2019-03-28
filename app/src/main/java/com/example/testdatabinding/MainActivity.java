package com.example.testdatabinding;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.testdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User user;
    ActivityMainBinding activityMainBinding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        ((Button)findViewById(R.id.bind)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = new User();
                user.setUserName("yoyo");
                user.setUserAge("123");
                activityMainBinding.setUserInfo(user);
            }
        });
//        activityMainBinding.age;
//
//        activityMainBinding.changeAge.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                user.setUserAge("456");
//            }
//        });

        activityMainBinding.changeName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setUserName("yr");
            }
        });
    }

//    @BindingAdapter({"url"})
//    public static void onEditTextChange(TextView editText, String text){
//        Log.d("main","edit text change = "+text);
//    }


}
