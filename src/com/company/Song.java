package com.company;
/*
* The song class is part of an assignment from Java Bootcamp
* This class models a song from a recording artist
*
* Kim Levin
* 5/5/2020
*/
public class Song {
    private String artist;
    private String title;

    public Song () {

    }

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String display() {
        return "Artist: " + artist + "\tSong Title " + title;
    }
}
