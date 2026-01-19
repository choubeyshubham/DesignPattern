package StructuralDesignPattern.Adaptor.Challange;

public class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {
    AdvancedMediaPlayerInterface advancedMusicPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface myMediaPlayer) {
        advancedMusicPlayer = myMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        advancedMusicPlayer.loadFilename(filename);
        advancedMusicPlayer.listen();
    }
}
