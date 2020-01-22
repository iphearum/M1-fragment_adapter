package edu.itc.gic.m1.assign_001;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;

//import androidx.annotation.Nullable;
//import androidx.appcompat.app.ActionBar;

public class ImplicitIntentAct extends BaseActivity {
    private TextView tUrl;
    private Button bUrl;

    private ActionBar actionbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);
        actionbar = getSupportActionBar();

        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayShowHomeEnabled(true);
        actionbar.setTitle("Implicit Intent");
    }
    public void WebView(View view){
        tUrl = findViewById(R.id.textUrl);
        Uri textUrl = Uri.parse(tUrl.getText().toString());
        Intent webview = new Intent(Intent.ACTION_VIEW, textUrl);
        startActivity(webview);
    }
    public void ViewLocation(View view){
        TextView lcat = findViewById(R.id.textView10);
        Uri geo = Uri.parse("geo:11,104?q="+lcat.getText().toString());
        Intent intGeo = new Intent(Intent.ACTION_VIEW,geo);
        intGeo.setPackage("com.android.go");
        startActivity(intGeo);
    }

    public void OpenCamera(View view) {
//        dispatchTakePictureIntent();
        Intent takePic = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        startActivity(takePic);
    }
}
