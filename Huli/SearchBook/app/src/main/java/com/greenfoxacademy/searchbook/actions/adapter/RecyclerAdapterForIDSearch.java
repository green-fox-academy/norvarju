package com.greenfoxacademy.searchbook.actions.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.greenfoxacademy.searchbook.R;
import com.greenfoxacademy.searchbook.actions.modelForAuthorSearch.DocList;

public class RecyclerAdapterForIDSearch extends RecyclerView.Adapter<RecyclerAdapterForIDSearch.MyViewHolder>{
    private DocList docList;

    public RecyclerAdapterForIDSearch() {
        docList = new DocList();
    }

    public RecyclerAdapterForIDSearch(DocList docList) {
        this.docList = docList;
    }

    @NonNull
    @Override
    public RecyclerAdapterForIDSearch.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_id, parent, false);
        return new RecyclerAdapterForIDSearch.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterForIDSearch.MyViewHolder holder, int position) {
        holder.title.setText(docList.getDocs().get(position).getTitle_suggest());
        holder.author.setText(docList.getDocs().get(position).getAuthor_name().get(0));
        holder.publisher.setText(docList.getDocs().get(position).getPublisher().get(0));
        holder.date.setText(docList.getDocs().get(position).getPublish_date().get(0));
    }

    @Override
    public int getItemCount() {
        return docList.getDocs().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView author;
        TextView publisher;
        TextView date;
        public MyViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.idTitle);
            author = itemView.findViewById(R.id.idAuthor);
            publisher = itemView.findViewById(R.id.idPublisher);
            date = itemView.findViewById(R.id.idDate);
        }
    }
}
