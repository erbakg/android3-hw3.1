package com.example.android3_hw31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.CursorLoader;
import androidx.loader.content.Loader;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvContacts;
    private ArrayList<String> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        loadData();

        ContactAdapter contactAdapter = new ContactAdapter(contactList);
        rvContacts.setAdapter(contactAdapter);

    }

    private void loadData() {
        contactList.add("Aibek");
        contactList.add("Erzhan");
        contactList.add("Erlan");
        contactList.add("Erbol");
    }

    private void initView() {
        rvContacts = findViewById(R.id.rv_contacts);
    }
}