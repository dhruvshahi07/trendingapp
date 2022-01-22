package com.example.trendingapp;

public class Person {

    private String username , avatar , reponame , language , totalstars , forks;

    public Person(String username , String avatar , String reponame , String language , String totalstars , String forks){
        this.username=username;
        this.avatar=avatar;
        this.reponame=reponame;
        this.language=language;
        this.totalstars=totalstars;
        this.forks=forks;
    }

    public String getUsername() {
        return username;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getReponame() {
        return reponame;
    }

    public String getLanguage() {
        return language;
    }

    public String getTotalstars() {
        return totalstars;
    }

    public String getForks() {
        return forks;
    }
}
