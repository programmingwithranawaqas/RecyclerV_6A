package com.example.recyclerv_6a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    ArrayList<Chat> chats;
    public ChatAdapter(ArrayList<Chat> list)
    {
        chats = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.single_chat_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvName.setText(chats.get(position).getName());
        holder.tvMsg.setText(chats.get(position).getMsg());
        holder.tvCount.setText(chats.get(position).getCount()+"");
        holder.tvTime.setText(chats.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvMsg, tvName, tvCount, tvTime;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMsg = itemView.findViewById(R.id.tvLastMsg);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvName = itemView.findViewById(R.id.tvContactName);
            tvCount = itemView.findViewById(R.id.tvMsgCount);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(), tvTime.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
