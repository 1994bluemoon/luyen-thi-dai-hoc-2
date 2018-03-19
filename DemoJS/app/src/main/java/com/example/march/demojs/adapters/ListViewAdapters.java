package com.example.march.demojs.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.march.demojs.R;
import com.example.march.demojs.models.FruitNames;

import java.util.List;

/**
 * Created by MARCH on 12/11/2017.
 */

public class ListViewAdapters extends BaseAdapter {

    Context contextObj;
    List<FruitNames> TempList;

    public ListViewAdapters(Context contextObj, List<FruitNames> tempList) {
        this.contextObj = contextObj;
        this.TempList = tempList;
    }



    @Override
    public int getCount() {
        return this.TempList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.TempList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        ViewItem viewItem = null;

        if(view == null)
        {
            viewItem = new ViewItem();

            LayoutInflater layoutInfiater = (LayoutInflater)this.contextObj.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            view = layoutInfiater.inflate(R.layout.listview_items, null);

            viewItem.FruitNameTextView = (TextView)view.findViewById(R.id.textView1);

            view.setTag(viewItem);
        }

        viewItem.FruitNameTextView.setText(TempList.get(position).Fruit_Name);
        return view;
    }

}

class ViewItem{
    TextView FruitNameTextView;
}
