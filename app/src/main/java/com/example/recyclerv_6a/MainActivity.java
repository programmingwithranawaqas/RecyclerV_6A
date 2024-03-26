package com.example.recyclerv_6a;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvChats;
    ChatAdapter myAdapter;
    ArrayList<Chat> list;
    Button btnAddNewContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        rvChats.setHasFixedSize(true);
        myAdapter = new ChatAdapter(list);

        rvChats.setLayoutManager(new LinearLayoutManager(this));
        //rvChats.setLayoutManager(new GridLayoutManager(this,4));
        rvChats.setAdapter(myAdapter);

        btnAddNewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.add(new Chat("ABC", "XYZ", "12:00 AM", 25));
                Toast.makeText(MainActivity.this, ""+list.size(), Toast.LENGTH_SHORT).show();
                myAdapter.notifyDataSetChanged();
            }
        });

    }

    private void init()
    {
        list = new ArrayList<>();
        list.add(new Chat("Ayesha", "20 ka load kara do", "01:20 PM", 3));
        list.add(new Chat("Saba", "hi how are you", "01:20 PM", 56));
        list.add(new Chat("Muhammad Ibrahim", "Hello", "01:20 PM", 2));
        list.add(new Chat("Rana Waqas Ali", "deadline extension", "01:20 PM", 1));
        list.add(new Chat("Ayesha", "20 ka load kara do", "01:20 PM", 3));
        list.add(new Chat("Saba", "hi how are you", "01:20 PM", 56));
        list.add(new Chat("Muhammad Ibrahim", "Hello", "01:20 PM", 2));
        list.add(new Chat("Rana Waqas Ali", "deadline extension", "01:20 PM", 1));
        list.add(new Chat("Ayesha", "20 ka load kara do", "01:20 PM", 3));
        list.add(new Chat("Saba", "hi how are you", "01:20 PM", 56));
        list.add(new Chat("Muhammad Ibrahim", "Hello", "01:20 PM", 2));
        list.add(new Chat("Rana Waqas Ali", "deadline extension", "01:20 PM", 1));
        rvChats = findViewById(R.id.rvChats);
        btnAddNewContact = findViewById(R.id.btnAddNewContact);




    }
}