import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

//supported file types are .wav , .ai , .aiff
public class musicplayer {
    public static void main(String[] args) {
        String filepath = "pagalworld.com.mx-SPECIALZ.wav";
        File file = new File(filepath);

        try(Scanner sc = new Scanner(System.in);
        AudioInputStream audio = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            

            String response= "";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response= sc.nextLine().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }

       }catch(FileNotFoundException e){
        System.out.println("Could not locate file");
       }
        
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file not supported");
        }catch(LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }

        catch(IOException e){
            System.out.println("SOmething went wrong");
        }
        finally{
            System.out.println("bye");
            
        }
    }
}
