package com.example.diu.myrecyclerviwe;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Listitem> listitems;
    private Context context;

    public MyAdapter(List<Listitem> listitems, Context context) {
        this.listitems = listitems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Listitem listitem = listitems.get(i);

        viewHolder.textViewName.setText(listitem.getName());
        viewHolder.textViewEmail.setText(listitem.getEmail());
        viewHolder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailsActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("name",listitem.getName());
                intent.putExtra("email",listitem.getEmail());
                intent.putExtra("address",listitem.getAddress());
                intent.putExtra("gender",listitem.getGender());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName;
        TextView textViewEmail;
        LinearLayout linear;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.name);
            textViewEmail = (TextView) itemView.findViewById(R.id.email);
            linear = (LinearLayout) itemView.findViewById(R.id.linear);
        }
    }
}
