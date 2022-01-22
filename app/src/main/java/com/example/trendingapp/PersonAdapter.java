package com.example.trendingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonHolder> {

    private Context context;
    private List<Person> PersonList;

    public PersonAdapter(Context context , List<Person> Persons){
        this.context=context;
        PersonList=Persons;
    }
    @NonNull
    @Override
    public PersonHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup parent =null;
        View view = LayoutInflater.from(context).inflate(R.layout.item , parent , false);
        return new PersonHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonHolder personHolder, int i) {

        int position = 0;
        Person person = PersonList.get(position);
        personHolder.username.setText(person.getUsername());
        personHolder.languagevalue.setText(person.getLanguage());
        personHolder.reponame.setText(person.getReponame());
        personHolder.starvalue.setText(person.getTotalstars());
        personHolder.forksvalue.setText(person.getForks());
        Glide.with(context).load(person.getAvatar()).into(PersonHolder.imageview);

    }

    @Override
    public int getItemCount() {
        return PersonList.size();
    }

    public static class PersonHolder extends RecyclerView.ViewHolder{

        public static ImageView imageview;
        ImageView imageView;
        TextView username , reponame , starvalue ,languagevalue , forksvalue ;
        public PersonHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageview);
            username=itemView.findViewById(R.id.username);
            reponame=itemView.findViewById(R.id.reponame);
            starvalue=itemView.findViewById(R.id.starvalue);
            languagevalue=itemView.findViewById(R.id.languagevalue);
            forksvalue=itemView.findViewById(R.id.forksvalue);
        }
    }
}
