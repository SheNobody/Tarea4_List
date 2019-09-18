package com.example.listview;

import java.util.ArrayList;

public class ListDataHelper {
        public static ArrayList<ListViewItem> provideItems(){
            ArrayList<ListViewItem> list = new ArrayList<>();
            list.add(new ListViewItem(R.drawable.copito_nieve, "Clima", android.R.color.holo_blue_bright));
            list.add(new ListViewItem(R.drawable.alarma, "Alarma", android.R.color.holo_orange_dark)) ;
            list.add(new ListViewItem(R.drawable.musica, "Música", android.R.color.holo_red_light));
            list.add(new ListViewItem(R.drawable.camara, "Cámara", android.R.color.holo_purple)) ;
            list.add(new ListViewItem(R.drawable.subir, "Cargar Archivos", android.R.color.holo_blue_dark)) ;
            list.add(new ListViewItem(R.drawable.pizza, "Pizza", android.R.color.holo_orange_dark)) ;
            list.add(new ListViewItem(R.drawable.seguridad, "Seguridad", android.R.color.holo_green_dark)) ;
            list.add(new ListViewItem(R.drawable.actualizar,"Actualizar", android.R.color.darker_gray)) ;
            list.add(new ListViewItem(R.drawable.guardar,"Guardar", android.R.color.widget_edittext_dark)) ;

            return list;
        }
    }

