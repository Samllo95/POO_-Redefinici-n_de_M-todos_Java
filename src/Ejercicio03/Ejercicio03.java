/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;

/**
 *
 * @author samll
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Audio myAudio=new Audio(75, "Flor Palida", 4.55, "MP3");
        Video myVideo=new Video(1080, "Constantine", 1244, "MP4");
                
        System.out.println("AUDIO**************************************************************\n");
        System.out.println(myAudio.infoMultimedia());
        System.out.println(myAudio.reproducir());
        
        System.out.println("VIDEO**************************************************************\n");
        System.out.println(myVideo.infoMultimedia());
        System.out.println(myVideo.reproducir());
        
    }
}
