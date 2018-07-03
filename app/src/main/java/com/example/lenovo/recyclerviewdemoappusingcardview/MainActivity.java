package com.example.lenovo.recyclerviewdemoappusingcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList= new ArrayList<>();

        recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Product("1",
                        "Lenove Note 4",
                        "Android phone,13 mp,2.2gz",
                        "12000rs",R.drawable.ic_launcher_background));

        productList.add(
                new Product("2",
                        "VIVO V5",
                        "Android phone,16 mp,2.2gz",
                        "12000rs",R.drawable.ic_launcher_background));
        productList.add(
                new Product("3",
                        "Mac Book",
                        "IOS laptop,10gb Ram,HDD-1TB",
                        "120000rs",R.drawable.ic_launcher_background));

        productList.add(
                new Product("4",
                        "Lenovo Laptop",
                        "windows 10 laptop,10gb Ram,HDD-1TB,i7",
                        "55000rs",R.drawable.ic_launcher_background));

        productList.add(
                new Product("5",
                        "Mac Book",
                        "IOS laptop,10gb Ram,HDD-1TB",
                        "12000rs",R.drawable.ic_launcher_background));

        productList.add(
                new Product("6",
                        "Mac Book",
                        "IOS laptop,10gb Ram,HDD-1TB",
                        "12000rs",R.drawable.ic_launcher_background));

        productList.add(
                new Product("7",
                        "Mac Book",
                        "IOS laptop,10gb Ram,HDD-1TB",
                        "12000rs",R.drawable.ic_launcher_background));

        productList.add(
                new Product("8",
                        "Mac Book",
                        "IOS laptop,10gb Ram,HDD-1TB",
                        "12000rs",R.drawable.ic_launcher_background));


        ProductAdapter adapter=new ProductAdapter(this,productList);
            recyclerView.setAdapter(adapter);

    }
}
