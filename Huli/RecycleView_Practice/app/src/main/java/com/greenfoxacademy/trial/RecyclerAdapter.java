package com.greenfoxacademy.trial;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;
import java.util.List;
import java.util.ArrayList;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    private List<Result> resultList;

    public RecyclerAdapter() {
        resultList = new ArrayList<>();
    }

    public RecyclerAdapter(List<Result> resultList) {
        this.resultList = resultList;
    }

    public void updateData(List<Result> resultList) {
        this.resultList = resultList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.id.setText("" + resultList.get(position).getId());
        holder.email.setText(resultList.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView id;
        TextView email;

        public MyViewHolder(View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.showId);
            email = itemView.findViewById(R.id.showEmail);
        }
    }
}


