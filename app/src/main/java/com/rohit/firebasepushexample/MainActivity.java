package com.rohit.firebasepushexample;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.messaging.FirebaseMessaging;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

	String Topic = "demo";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		findViewById(R.id.btnSend).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String img = "https://miro.medium.com/max/1400/1*QyVPcBbT_jENl8TGblk52w.png";
				//Here if you dont want to Pass image , then simply put blank "" ,instead of img
				MyFirebaseMessagingService.sendTopic(Topic,"Hey","My Name Is Rohit",img);
			}
		});

		findViewById(R.id.btnSubscribe).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				MyFirebaseMessagingService.subscribe(Topic);
			}
		});
	}

}