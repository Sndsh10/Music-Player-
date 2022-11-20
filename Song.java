class Song{

    String nameOfSong;

    String nameOfArtist;

    int numberOfPlays;

    public Song(String nameOfSong,String nameOfArtist,int numberOfPlays){

        this.nameOfSong = nameOfSong;

        this.nameOfArtist = nameOfArtist;

        this.numberOfPlays = numberOfPlays;

    }

    public void setNameOfSong(String nameOfSong){

        this.nameOfSong = nameOfSong;

    }

    public void setNameOfArtist(String nameOfArtist){

        this.nameOfArtist = nameOfArtist;

    }

    public void setNumberOfPlays(int numberOfPlays){

        this.numberOfPlays = numberOfPlays;

    }

    public String getNameOfSong(){

        return this.nameOfSong;

    }

    public String getNameOfArtist(){

        return this.nameOfArtist;

    }

    public int getNumberOfPlays(){

        return this.numberOfPlays; 

    }

}

