package edu.itc.gic.m1.assign_001;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import edu.itc.gic.m1.songbook.SongBookActivity;

public class MainActivity extends AppCompatActivity {

    private TextView lblD;
    private EditText txtMess;
    private Button implicitIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMess = findViewById(R.id.txtSend);
        lblD = findViewById(R.id.lblbackMessage);
        implicitIntent = findViewById(R.id.implicitIntent);
    }

    public void SendMessage(View view) {
        String mes = txtMess.getText().toString();
        if(mes.isEmpty()==true)
            return;
        Intent in = new Intent(MainActivity.this,messageActivity.class);
        in.putExtra("mess",mes);
        startActivityForResult(in,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        assert data!=null;

        if (resultCode == RESULT_OK) {
            if (requestCode == 1 && data!=null) {
                assert data!=null;
                lblD.setText(data.getStringExtra("A"));
            }
        }
    }


    public void SendObject(View view) {

        Intent in = new Intent(MainActivity.this,formSendMessage.class);
        try {
            //startActivityForResult(in,2);
            startActivity(in);
        }catch (Exception exo){
            Toast.makeText(this, exo.toString(), Toast.LENGTH_SHORT).show();
        }
        //madeMessage msg = new madeMessage();
    }

    public void ImInt(View view) {
        Intent ImInt = new Intent(MainActivity.this,ImplicitIntentAct.class);
        startActivityForResult(ImInt,3);
    }

    public void songBook(View view) {
        Intent songbook = new Intent(MainActivity.this, SongBookActivity.class);
        startActivity(songbook);
    }
}
