
interface Video {
    void play();
}

class RealVideo implements Video {
    String title;

    public RealVideo(String title) {
        this.title = title;
        System.out.println("--> [DOWNLOADING] Connecting to server & buffering 4K video: " + title);
    }

    public void play() {
        System.out.println("Playing video: " + title);
    }
}

class ProxyVideo implements Video {
    RealVideo realVideo;
    String title;
    private int viewCount = 0;

    public ProxyVideo(String title) {
        this.title = title;
    }

    public void play() {
        viewCount++;
        System.out.println("--> [AUDIT] Video has been played " + viewCount + " time(s).");

        if (realVideo == null) {
            realVideo = new RealVideo(title);
        }

        realVideo.play();
    }
}

public class Main {
    public static void main(String[] args) {
        Video video = new ProxyVideo("Cat_Memes.mp4");

        video.play();
        video.play();
        video.play();
    }
}
