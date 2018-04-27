package com.greenfoxacademy.searchbook.actions.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;

import com.greenfoxacademy.searchbook.R;
import com.greenfoxacademy.searchbook.actions.modelForSubjectSearch.Work;

import java.util.List;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    private List<Work> works;

    public RecyclerAdapter() {
        works = new ArrayList<>();
    }

    public RecyclerAdapter(List<Work> works) {
        this.works = works;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if(works.get(position).getAuthors().size() != 0) {
            holder.authorName.setText(works.get(position).getAuthors().get(0).getName());
        } else {
            holder.authorName.setText("Author is not found");
        }
        holder.title.setText(works.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return works.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView authorName;
        TextView title;

        public MyViewHolder(View itemView) {
            super(itemView);

            authorName = itemView.findViewById(R.id.showAuthor);
            title = itemView.findViewById(R.id.showTitle);
        }
    }
}
