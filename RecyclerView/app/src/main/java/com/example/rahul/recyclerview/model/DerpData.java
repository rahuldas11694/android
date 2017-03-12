package com.example.rahul.recyclerview.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahul on 04/03/17.
 */

public class DerpData {

    private static final String[] titles = {"hey how are you", "whats app man", " be like water, my friend"};
    private static final int[] icons = {
            android.R.drawable.ic_popup_reminder,
            android.R.drawable.ic_menu_add,
            android.R.drawable.ic_menu_delete
    };

    // this class produces list of list items


    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        // repeat list item 4 times so that we have enough data to demonstrate a scrollView
        // RecyclerView

        for (int x = 0; x < 4; x++) {
            // create ListItem withdummy data, then add them to our list
            for (int i = 0; i < titles.length && i < icons.length; i++) {
                ListItem item = new ListItem();

                item.setImageResId(icons[i]);

                item.setTitle(titles[i]);

                data.add(item);


            }

        }

        return data;
    }


}
