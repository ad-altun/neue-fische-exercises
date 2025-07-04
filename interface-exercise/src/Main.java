
public class Main {
    public static void main(String[] args) {

        Playable[] playables = { new MusicPlayer(), new VideoPlayer() };
        String musicPlayer = playables[0].play();
        String videoPlayer = playables[1].play();

// previous steps
//        System.out.println();
//        System.out.println(musicPlayer);
//        System.out.println();
//        System.out.println(videoPlayer);

        // later steps in the exercise
        MusicPlayer musicPlayer1 = new MusicPlayer();
        VideoPlayer videoPlayer1 = new VideoPlayer();

        MediaController mediaController1 = new MediaController();

        System.out.println();
        System.out.println(mediaController1.playMedia( musicPlayer1));;
        System.out.println();
        System.out.println(mediaController1.playMedia( videoPlayer1));;

    }
}