package com.example.loveotudor.ui.dashboard;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loveotudor.Project;
import com.example.loveotudor.ProjectsAdapter;
import com.example.loveotudor.R;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    ArrayList<Project> mProjects;

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.rv_project);
        mProjects = new ArrayList<>();
        Project moovers = new Project(getResources().getString(R.string.moovers_ng), R.mipmap.ic_moovers_app_foreground, getResources().getString(R.string.moovers_app_details));
        mProjects.add(moovers);
        Project miwok = new Project(getResources().getString(R.string.miwok_app_name), R.mipmap.ic_miwok_app_foreground, getResources().getString(R.string.miwok_app));
        Project kidStories = new Project(getResources().getString(R.string.kids_stories_app), R.mipmap.ic_kids_stories_app_foreground, getResources().getString(R.string.kids_stories_details));
        Project cofee = new Project(getResources().getString(R.string.just_java), R.mipmap.ic_coffee_ordering_app_foreground, getResources().getString(R.string.about_just_java));
        mProjects.add(miwok);
        mProjects.add(kidStories);
        mProjects.add(cofee);


        ProjectsAdapter projectsAdapter = new ProjectsAdapter(mProjects);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        Log.v("ProjectAdapter: ", String.valueOf(projectsAdapter.getItemCount()));

        recyclerView.setAdapter(projectsAdapter);


        return root;
    }
}