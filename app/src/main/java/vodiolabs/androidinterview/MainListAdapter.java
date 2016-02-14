package vodiolabs.androidinterview;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by idan on 1/13/15.
 */
public class MainListAdapter extends BaseAdapter {

    private List<List<String>> mItems;
    private Context mContext;

    public MainListAdapter(Context ctx, List<List<String>> items) {
        mItems = items;
        mContext = ctx;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public List<String> getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*
        The method to implement
         */
      return null;
    }


}
