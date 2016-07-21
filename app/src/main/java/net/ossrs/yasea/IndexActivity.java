package net.ossrs.yasea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IndexActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText ed_liveUrl;
    final String liveUrl = "rtmp://115.159.206.57/live/";
    private Button bt_live;
    private String livePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


        ed_liveUrl = (EditText) findViewById(R.id.VideoPathEdit);
        ed_liveUrl.setText(liveUrl);



        bt_live = (Button) findViewById(R.id.bt_live);
        bt_live.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        livePath = ed_liveUrl.getText().toString();

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("liveUrl", livePath);
        Log.e("livePath",livePath);

        startActivity(intent);
    }
}
