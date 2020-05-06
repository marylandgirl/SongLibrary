package com.company;

import java.util.ArrayList;
import java.util.Scanner;
/*
*  SongLibray class was created for an assigment from Java Bootcamp
*     this class accepts user input of music artist and  song title
*     The user input is used to create instances of Song objects
*     that can then be manipulated
*
* Kim Levin
* 05/05/2020
*/
public class SongLibrary {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        ArrayList<Song> songs;
        songs = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter a music artist: ");
            String artist = keyboard.nextLine();
            Song s = new Song();
            s.setArtist(artist);
            System.out.print("Please enter a song title: ");
            String title = keyboard.nextLine();
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the ArrayList
        for (Song song: songs) {
            System.out.println(song.display());
        }

        //look for title and print if found
        String titleToFind = "Purple Rain";
        for(Song song: songs) {
            if (song.getTitle().equals(titleToFind)) {
                System.out.printf("I found %s \r\n", song.display());
            }
        }
    }
}
