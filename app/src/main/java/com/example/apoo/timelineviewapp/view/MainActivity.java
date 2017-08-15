package com.example.apoo.timelineviewapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apoo.timelineviewapp.R;
import com.roughike.bottombar.BottomBar;

public class MainActivity extends AppCompatActivity {

    RequestQueue requestQueue;
    final String URL = "http://api.tvmaze.com/shows";
    BottomBar bottomBar ;
    RelativeLayout containerTab;
    FrameLayout containerFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomBar = (BottomBar) findViewById(R.id.bottomBar);


        Cache cache = new DiskBasedCache(getCacheDir(), 1024 * 1024);
        Network network = new BasicNetwork(new HurlStack());

        requestQueue = new RequestQueue(cache,network);
        requestQueue.start();

        final RequestQueue requestQueue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                } //string request here
                 , new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        )
        //parameters here
        {


        };

        requestQueue.add(stringRequest);
    }
}
