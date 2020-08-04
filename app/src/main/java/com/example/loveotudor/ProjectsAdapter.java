package com.example.loveotudor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ViewHolder> {
    private List<Project> mProjects;

    public ProjectsAdapter(List<Project> mProjects) {
        this.mProjects = mProjects;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Project project = mProjects.get(position);

        holder.bind(project);

    }

    @Override
    public int getItemCount() {
        return mProjects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView image;
        TextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.project_title);
            image = itemView.findViewById(R.id.project_image);
            description = itemView.findViewById(R.id.project_description);
        }

        public void bind(Project project) {
            title.setText(project.getProjectName());
            description.setText(project.getProjectDetails());
            image.setImageResource(project.getProjectImageId());
        }
    }
}
