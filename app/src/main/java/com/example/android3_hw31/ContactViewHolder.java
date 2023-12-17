package com.example.android3_hw31;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    private TextView tvContactName;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        tvContactName = itemView.findViewById(R.id.tv_contact_name);
    }

    public void onBind(String contactName) {
        tvContactName.setText(contactName);
    }
}
