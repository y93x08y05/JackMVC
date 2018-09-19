package org.jack.springinaction.demo.ioc.demo1;

import org.jack.springinaction.demo.ioc.demo1.face.CompactDisc;

import java.util.List;

/**
 * @Author: Jack
 * @Date: 2018/9/19 11:29
 */
public class BlackDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
    public BlackDisc(String title,String artist,List<String> tracks) {
        this.title=title;
        this.artist=artist;
        this.tracks=tracks;
    }
    @Override
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
        for (String track:tracks) {
            System.out.println("-Track: "+track);
        }
    }
}