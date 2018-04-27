package com.greenfoxacademy.searchbook.actions;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

import com.greenfoxacademy.searchbook.R;
import com.greenfoxacademy.searchbook.actions.modelForAuthorSearch.Doc;
import com.greenfoxacademy.searchbook.actions.modelForAuthorSearch.DocList;

public class RecyclerAdapterForAuthorSearch extends RecyclerView.Adapter<RecyclerAdapterForAuthorSearch.MyViewHolder> {

    private DocList docList;

    public RecyclerAdapterForAuthorSearch() {
        docList = new DocList();
    }

    public RecyclerAdapterForAuthorSearch(DocList docList) {
        this.docList = docList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_subject, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bookTitle.setText(docList.getDocs().get(position).getTitle_suggest());
    }

    @Override
    public int getItemCount() {
        return docList.getDocs().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView bookTitle;
        public MyViewHolder(View itemView) {
            super(itemView);
            bookTitle = itemView.findViewById(R.id.showBook);
        }
    }
}
