package com.example.videos;

import java.util.List;

// to jest TaskDao

public interface VideoDao {


    // w interfejsie mamy metody bez implemtacji, widać?
    List<Video> findAll();
    // to analogicznie moglibyśmy napisać:
    // public abstract List<Task> findAll();

    // standardowo wszystkie metody jak nie napiszemy
    // są publiczne i abstrakcyjnie
    void addvideo (Video video);
   }
