package StructuralDesignPattern.Adaptor.Challange;

interface MediaPlayerInterface {
    public void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayerInterface {
    @Override
    public void play(String audioType, String filename)
    {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + filename);
        }
        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
