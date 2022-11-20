import java.util.Scanner;

import java.io.IOException;

import java.util.*; 

import Song;

 

class SongListClass

{

    private ArrayList<Song> listOfSongs;

    public void mainFunction(){

        listOfSongs = new ArrayList<Song>();

        listOfSongs.add(new Song("Shape of you","Ed Sheeren",322339));

        listOfSongs.add(new Song("Blinding Lights","The Weeknd",312806));

        listOfSongs.add(new Song("Dance Monkey","Tones And I",264270));

        listOfSongs.add(new Song("Rockstar","Post Malone & 21 Savage",248946));

        listOfSongs.add(new Song("Someone You Loved","Lewis Capaldi",245487));

        listOfSongs.add(new Song("One Dance","Drake",239727));

        listOfSongs.add(new Song("Sunflower","Post Malone and Swae Lee",238927));

        listOfSongs.add(new Song("Closer","The Chainsmokers ft. Halsey",235083));

        listOfSongs.add(new Song("Señorita","Shawn Mendes and Camila Cabello",221604));

        listOfSongs.add(new Song("Believer","Imagine Dragons",219503));

        showMusicPlayerOptions();

        

    }

public void showMusicPlayerOptions(){

    //createFileFirst();

    clearScreen();

    System.out.println("\n\n----Welcome to music player----");

System.out.println("");

System.out.println("           1) Add new song (Press 1)");

System.out.println("           2) Remove a song (Press 2)");

System.out.println("           3) List all songs (Press 3)");

System.out.println("           4) Search a song (Press 4)");

System.out.println("           5) Exit program (Press 5)");

System.out.println(" ");

Scanner scannerObject = new Scanner(System.in);  // Create a Scanner object

        String choiceOptions = scannerObject.nextLine();

    clearScreen();

        switch(choiceOptions) {

          case "1":

            showAddMusicOptions();

            break;

          case "2":

            showRemoveMusicOptions();

            break;

          case "3":

            showListMusicOptions();

            break;

          case "4":

            showListParticularOptions();

            break;

          case "5":

            System.exit(0);

            break;

          default:

            System.out.println("try again");

            clearScreen();

    showMusicPlayerOptions();

        }

}

public void showAddMusicOptions(){

   

    Scanner scannerObject = new Scanner(System.in);  // Create a Scanner object

        System.out.println("----Add a new song----\n\n");

System.out.println("Enter the name of the song ");

String songName = scannerObject.nextLine();

System.out.println("Enter the name of the artist ");

String artistName = scannerObject.nextLine();

System.out.println("Enter the play count of the song ");

String playCount = scannerObject.nextLine();

 

if((!songName.isEmpty())&&(!artistName.isEmpty())&&(!playCount.isEmpty())){

  //  appendToFile(songName+","+artistName+","+playCount);

  //  System.out.println("Data added successfully. Press enter to continue");

  //  String pressToContinue = scannerObject.nextLine();

  //  clearScreen();

  //  showMusicPlayerOptions();

  Song newTemporarySong = new Song(songName,artistName,Integer.parseInt(playCount));

  listOfSongs.add(newTemporarySong);

  System.out.println("Data added successfully. Press enter to continue");

  String pressToContinue = scannerObject.nextLine();

  clearScreen();

  showMusicPlayerOptions();

}else{

  System.out.println("Complete the form before submitting. Press enter to try again.");

  String pressToContinue = scannerObject.nextLine();

  clearScreen();

  showAddMusicOptions();

}

 

}

public void showListMusicOptions(){

    System.out.println("----List the songs----\n\n");

        // String dataOfFile = readFromFile();

        // String[] arrayOfIndividualListing = dataOfFile.split("\n");

        // int i =0;

        // for(String individualItemString : arrayOfIndividualListing){

        //     String[] individualItemArray = individualItemString.split(",");

        //     System.out.println(""+(i+1)+") Song name : "+individualItemArray[0]+"\n"+

        //     "   Artist name : "+individualItemArray[1]+"\n"+

        //     "   Play count : "+individualItemArray[2]+"\n");

        //     i++;

        // }

        int i=0;

        for(Song individualSong:listOfSongs){

            System.out.println(""+(i+1)+") Song name : "+individualSong.getNameOfSong()+"\n"+

            "   Artist name : "+individualSong.getNameOfArtist()+"\n"+

            "   Play count : "+individualSong.getNumberOfPlays()+"\n");

            i++;

        } 

System.out.println("Press any key to continue ");

Scanner scannerObject = new Scanner(System.in);  // Create a Scanner object

String pressedkey = scannerObject.nextLine();

        clearScreen();

showMusicPlayerOptions();

   

}

public void showRemoveMusicOptions(){

    clearScreen();

    Scanner scannerObject = new Scanner(System.in);  // Create a Scanner object

        System.out.println("----Remove a song---- \n\n");

        

        int i=0;

        for(Song individualSong:listOfSongs){

            System.out.println(""+(i+1)+") Song name : "+individualSong.getNameOfSong()+"\n"+

            "   Artist name : "+individualSong.getNameOfArtist()+"\n"+

            "   Play count : "+individualSong.getNumberOfPlays()+"\n");

            i++;

        }

        

        System.out.println("Enter the id of the song to delete \n\n ");

String idToDelete = scannerObject.nextLine();

if(idToDelete.isEmpty()){

    System.out.println("Please enter id. press enter to continue");

    clearScreen();

    showMusicPlayerOptions();

}else if (isObjectInteger(Integer.parseInt(idToDelete))){

            listOfSongs.remove(Integer.parseInt(idToDelete)-1);

            System.out.println("deleted Successfully");

            String pressedkey = scannerObject.nextLine();

            clearScreen();

    showMusicPlayerOptions();

        }else{

            System.out.println("Enter a valid number");

            clearScreen();

    showMusicPlayerOptions();

        }

    

}

public void showListParticularOptions(){

   

    Scanner scannerObject = new Scanner(System.in);  // Create a Scanner object

        System.out.println("----Search for song----");

        System.out.println("\n\n");

System.out.println("Enter the play count above which you want the song ");

String playCount = scannerObject.nextLine();

if(playCount.isEmpty()){

    System.out.println("Please enter data. press enter to try again");

    clearScreen();

    showMusicPlayerOptions();

}else if (isObjectInteger(Integer.parseInt(playCount))){

    int i=0;

    for(Song individualSong:listOfSongs){

                String temporarySongName = individualSong.getNameOfSong();

                String temporaryNameOfArtist = individualSong.getNameOfArtist();

                int temporaryNumberOfPlays = individualSong.getNumberOfPlays();

                if(temporaryNumberOfPlays>(Integer.parseInt(playCount))){

                    System.out.println(""+(i+1)+") Song name : "+individualSong.getNameOfSong()+"\n"+

                    "   Artist name : "+individualSong.getNameOfArtist()+"\n"+

                    "   Play count : "+individualSong.getNumberOfPlays()+"\n");

                }

                i++;

            }

            System.out.println("Press enter to continue");

            String pressToContinue = scannerObject.nextLine();

    clearScreen();

   

}else{

            System.out.println("Enter a valid number");

            clearScreen();

    showMusicPlayerOptions();

        }

clearScreen();

showMusicPlayerOptions();

}

public void clearScreen(){

    System.out.print("\033[H\033[2J");  

        System.out.flush();

}

public boolean isObjectInteger(Object o){

        return o instanceof Integer;

    }

 

}

public class Main{

    public static void main(String[] args){

        SongListClass listClass = new SongListClass();

        listClass.mainFunction();

    }

}