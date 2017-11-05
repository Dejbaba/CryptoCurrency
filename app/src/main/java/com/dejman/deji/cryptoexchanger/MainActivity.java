package com.dejman.deji.cryptoexchanger;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity{


    String Crypto, Base;
    Context context;
    ImageButton create_card, check;


    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private ArrayList<String> mDataset;
    private int androidColors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataset = new ArrayList<>();

        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        create_card = (ImageButton) findViewById(R.id.create);
        check = (ImageButton) findViewById(R.id.check);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);





        context = getApplicationContext();





        ArrayAdapter<String> cryptocurrency = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cyptocurrency));
        cryptocurrency.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(cryptocurrency);

        ArrayAdapter<String> basecurrency = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.basecurrency));
        basecurrency.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(basecurrency);


        create_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Crypto = spinner1.getSelectedItem().toString().trim();
                Base = spinner2.getSelectedItem().toString().trim();
                    if(spinner1.getSelectedItemPosition() == 0 && spinner2.getSelectedItemPosition() == 0){
                        Toast.makeText(MainActivity.this,"Select a cryptocurrency and a basecurrency",Toast.LENGTH_SHORT).show();
                    }else if(spinner1.getSelectedItemPosition() == 0 && spinner2.getSelectedItemPosition() != 0 ){
                        Toast.makeText(MainActivity.this,"Select a cryptocurrency",Toast.LENGTH_SHORT).show();
                    }else if(spinner1.getSelectedItemPosition() != 0 && spinner2.getSelectedItemPosition() == 0 ){
                        Toast.makeText(MainActivity.this,"Select a basecurrency",Toast.LENGTH_SHORT).show();
                    }else{

                            if(mDataset.contains(Crypto + " Versus " + Base)){
                                Toast.makeText(MainActivity.this,Crypto + " and " + Base + " is already created",Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(MainActivity.this,Crypto + " and " + Base + " is selected",Toast.LENGTH_SHORT).show();
                                mDataset.add(Crypto + " Versus " + Base);
                                mAdapter =  new MainAdapter(mDataset);
                                mRecyclerView.setAdapter(mAdapter);
                            }

                    }
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crypt = new Intent(MainActivity.this, WebviewActivity.class);
                startActivity(crypt);
            }
        });




    }



















}
