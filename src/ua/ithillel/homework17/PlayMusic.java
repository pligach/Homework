package ua.ithillel.homework17;

public class PlayMusic {
    public static void main(String[] args) {
        MusicStyles diskPopMusic = new PopMusic();
        MusicStyles diskRockMusic = new RockMusic();
        MusicStyles diskClassicMusic = new ClassicMusic();

        MusicStyles[] disk = {diskPopMusic, diskRockMusic, diskClassicMusic};
        for (MusicStyles style : disk) {
            style.playMusic();
        }
    }
}

