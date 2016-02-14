package vodiolabs.androidinterview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainActivity extends Activity {

    ListView mListView; // main list view
    MainListAdapter mListAdapter; // our custom adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the listview from the layout
        mListView = (ListView) findViewById(R.id.listView);
        // create our custom list adapter and send it our context and list of items to display
        mListAdapter = new MainListAdapter(this, generateItems());
        // set the list adapter to the list widget
        mListView.setAdapter(mListAdapter);
    }


    /*
    Generate a list of rows where each row contains a list of images (columns)
    Outer list: Rows
    Inner list: Columns
    String value: Url of a random image
     */
    private List<List<String>> generateItems() {
        // base url for the generated images
        String base_url = "http://www.kidsmathgamesonline.com/images/pictures/numbers600/";

        List<List<String>> items = new ArrayList<>();

        int total_lines = new Random().nextInt(20);

        for (int i = 0; i < total_lines; i++) {
            List<String> line = new ArrayList<>();

            int cnt = new Random().nextInt(20);
            for (int j = 0; j < cnt; j++) {
                line.add(base_url + "/number" + new Random().nextInt(10) + ".jpg");
            }
            items.add(line);
        }
        return items;
    }

}
