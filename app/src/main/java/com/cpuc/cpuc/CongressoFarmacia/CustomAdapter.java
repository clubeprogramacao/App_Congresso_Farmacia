package com.cpuc.cpuc.CongressoFarmacia;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String countryList[];
    String horasList[];
    String descList[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] countryList, String[] horasList,  String descList[]) {
        this.context = context;
        this.countryList = countryList;
        this.horasList = horasList;
        this.descList = descList;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override

    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        TextView country = (TextView) view.findViewById(R.id.textView2);
        TextView horas = (TextView) view.findViewById(R.id.textView);
        TextView desc = (TextView) view.findViewById(R.id.textView3);

        country.setText(countryList[i]);
        horas.setText(horasList[i]);
        desc.setText(descList[i]);
        return view;
    }
}