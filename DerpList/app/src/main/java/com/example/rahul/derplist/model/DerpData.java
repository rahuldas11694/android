package com.example.rahul.derplist.model;

import com.example.rahul.derplist.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rahul on 11/03/17.
 */

// this class we are going to use in out ListActivity class when we will create Recycler View

public class DerpData {

    // no need of constructor bcz all data is initialized and it is static
    private static final String[] titles = {"Nothingness can not be defined",
                            "times is the river mode, and it is;"+
                                    "my name is rahul ngd"+ " dfnsf ff djd  ddjd",
                            "this is the world of sfjksnfs dfndsfskfjsdf",
        "new story on js"+"shbf sfskdfn sfsdfbs iufjs nsdfis dfvsbd fsfsfhbsdf d"+"fjhbsf sfsfbsf sfb",
        "why js behaves on different platforms"+" sfsd sdhfs sus nfisu lzvhb sudfhsnf sbdifuskf"+" skfjns fbsjf sfsffnigukjdnfvxhb",
        "suifhs df gncixuhgd nfddugnf"+" j nsisjvx isnfjk sdnf sfdf","dfhdsfd fsduh"+" fhsd fshd fdsuf"};

    private static final String[] subTitles = {
            "rahul",
            "priya",
            "rekha",
            "deepa",
            "dad",
            "mom",
            "uncle"
    };
    private static  final int icon = R.drawable.ic_tonality_black_36dp;


//    private static int[] icons = {android.R.drawable.ic_popup_reminder,android.R.drawable.ic_menu_add,
//            android.R.drawable.ic_menu_delete};
    // this data class produces list of list item

    // this function we are going to use in adapter class go set the adapter
    public static List<ListItem> getListData(){
        List<ListItem> data = new ArrayList<>();

        // repeat the process 4 times so that we have enough data to demonstrate a scrollable RecyclerVIew

        for(int x = 0; x<4; x++){
            // create list view with dummy data, then add them to our list

            for(int i = 0; i < titles.length; i++ ){
                ListItem item = new ListItem();
//                item.setImageResId(icons[i]);
                item.setTitle(titles[i]);
                item.setSubTitle(subTitles[i]);
                data.add(item);
            }
        }
        return  data;

    }


}
