package com.RachelLoren.NameStormer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class favListAdapter {

    /*public class NameAdapter extends FirestoreRecyclerAdapter<Name,NameViewHolder>{

        Context context;
        public NameAdapter(@NonNull FirestoreRecyclerOptions<Name> options,Context context) {
            super(options);
            this.context=context;
        }

        @Override
        protected void onBindViewHolder(@NonNull NameViewHolder holder, int position, @NonNull Name name) {
            holder.nameTextView.setText(name.name);
        }

        @NonNull
        @Override
        public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_namelist_item,parent,false);
            return new NameViewHolder(view);
        }
    }


    class NameViewHolder extends RecyclerView.ViewHolder{

        TextView nameTextView;

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.name_list_text);
        }
    }*/
}
