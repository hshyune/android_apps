package hong.diary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class daily extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        ListView listview = (ListView) findViewById(R.id.daily_list1);
        DailyListItem d1 = new DailyListItem("example1");
        DailyListItem d2 = new DailyListItem("example2");
        DailyListItem d3 = new DailyListItem("example3");
        DailyListItem d4 = new DailyListItem("example4");
        ArrayList<DailyListItem> data = new ArrayList<DailyListItem>();
        data.add(d1);
        data.add(d2);
        data.add(d3);
        data.add(d4);

        DailyListAdapter adapter = new DailyListAdapter(this, R.layout.daily_list_item, data);
        listview.setAdapter(adapter);

    }

    //set action bar icon
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.daily_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add:
                //Toast.makeText(this, "add", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Daily_new.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
