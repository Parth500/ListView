package in.anew.parth.list_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i= getIntent();
        Bundle data=i.getExtras();
        String can_name = data.getString("car_name","no cars selected");

        TextView tv=new TextView(this);
        tv.setText(can_name);

        LinearLayout ll=(LinearLayout) findViewById(R.id.ll);
        ll.addView(tv);
    }
}
