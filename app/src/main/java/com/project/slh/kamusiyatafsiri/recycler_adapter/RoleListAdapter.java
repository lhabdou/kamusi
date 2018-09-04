package com.project.slh.kamusiyatafsiri.recycler_adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.project.slh.kamusiyatafsiri.controllers.R;
import com.project.slh.kamusiyatafsiri.entities.Role;

import java.util.List;


public class RoleListAdapter extends RecyclerView.Adapter<RoleListAdapter.RoleViewHolder> {

    class RoleViewHolder extends RecyclerView.ViewHolder {
        private final TextView wordItemView;

        private RoleViewHolder(View itemView) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.role_text1);
        }
    }

    private final LayoutInflater mInflater;
    private List<Role> roles; // Cached copy of words

    RoleListAdapter(Context context) { mInflater = LayoutInflater.from(context); }

    @Override
    public RoleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.activity_roles, parent, false);
        return new RoleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RoleViewHolder holder, int position) {
        if (roles != null) {
            Role current = roles.get(position);
            holder.wordItemView.setText(current.getNom_role());
        } else {
            // Covers the case of data not being ready yet.
            holder.wordItemView.setText("No Role");
        }
    }

    void setWords(List<Role> roles1){
        roles = roles1;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // mWords has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (roles != null)
            return roles.size();
        else return 0;
    }
}
