package main;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

/*
 * - Create a program that implements a playlist for songs - done 
 * 
 * - Create a Song class having Title and Duration for a song. - done
 * 
 * - The program will have an Album class containing a list of songs. - done 
 * 
 * - The albums will be stored in an ArrayList - done 
 * 
 * - Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
 * 
 * - Album class uses an inner class, SongList - done
 * 
 * - Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList - done 
 * 
 * - The inner SongList class will use an ArrayList and will provide a method to add a song.
 * 
 * - Add these songs: Love don't mean a thing(4.22),Holy man(4.3),Hold on(4.6)
 * 
 * - Print each of these song each in new line
 */

//Entrance into our main class
public class Main {
	//Entrance into our main method
    public static void main(String[] args) {
    	//Creating an album called album which is a new album
        Album album = new Album();
        //Adding the song Love don't mean a thing with a duration of 4.2
        album.addSong("Love don't mean a thing", 4.22);
        //Adding the song Holy Man with a duration of 4:3
        album.addSong("Holy man", 4.3);
        //Adding teh song Hold On with a duration of 5.6
        album.addSong("Hold on", 5.6);
        //Print out the album
        album.printAlbum();
    }
}
//Creating a new class Album
class Album {
	//Creating a Song List containing songs
    private SongList songs;
    //Creating an album and defining it as public
    public Album() {
    	//Adding the songs to a new song list
        this.songs = new SongList();
    }
    //Adding a song with the title and duration
    public boolean addSong(String title, double duration) {
    	//Returning the adding of new songs to songs with title and duration
        return this.songs.add(new Song(title, duration));
    }
    //Creating a printAlbum method
    public void printAlbum() {
    	//calling song's printSong method
        this.songs.printSong();
    }
    //Creating the SongList class
    private class SongList {
    	//Creating an ArrayList of songs 
        private ArrayList<Song> songs;
        //Declaring a SongList as public
        public SongList() {
        	//Calling an arraylist on songs
            this.songs = new ArrayList<Song>();
        }
        //Calling a boolean operation on add to create songs and songs
        public boolean add(Song song) {
        	//If the song in question contains this song in question
            if(songs.contains(song)) {
            	//Return false
                return false;
            }
            //Adding song to song
            this.songs.add(song);
            //or else it's true
            return true;
        }
        //Calling the printSong method
        public void printSong() {
        	//For every song song song
            for(Song song:songs)
            	//Print out the song's title
                System.out.println(song.getTitle());
        }
    }
}
//Creating the song class
class Song {
	//Taking in a private parameter title as a String
    private String title;
    //Taking in the duration
    private double duration;
    //Adding a new Song method taking in two paramters, the title of the song as a String and the duration of the song as a Double
    public Song(String title, double duration) {
    	//Setting instance variable
        this.title = title;
        //Setting the instance variable
        this.duration = duration;
    }
    //Creating the GetTitle method
    public String getTitle() {
    	//Returning the title
        return title;
    }
}