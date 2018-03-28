package in.anew.parth.list_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] cars={

                "BMW",
                "Ferrari",
                "Balleno",
                "Rolls roy"

        };

        final ArrayAdapter<String> my_adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                cars
        );

        lv =(ListView) findViewById(R.id.lv);
        lv.setAdapter(my_adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "car: "+cars[position], Toast.LENGTH_SHORT).show();

                Intent i=new Intent(MainActivity.this,Main2Activity.class);

                Bundle data=new Bundle();
                data.putString("car_name",cars[position]);
                i.putExtras(data);
                startActivity(i);

            }
        });

//        SearchView sv=(SearchView) findViewById(R.id.sv);
//        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//
//                Toast.makeText(MainActivity.this, "Search: "+query, Toast.LENGTH_SHORT).show();
//
//                lv.setAdapter(null);
//
//                String[] final_cars={"Bmw","Bugati"};
//
//                ArrayAdapter<String> my_adapter2=new ArrayAdapter<String>(
//                        MainActivity.this,
//                        android.R.layout.simple_list_item_1,
//                        final_cars
//
//                );
//                lv.setAdapter(my_adapter2);
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                return false;
//            }
//        });
//
    }
}
