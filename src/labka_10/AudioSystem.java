package labka_10;

public class AudioSystem {
    public void turnOn() {
        System.out.println("Аудио жүйе қосулы.");
    }

    public void setVolume(int level) {
        System.out.println("Дыбыс деңгейі келесіге орнатылған " + level + ".");
    }

    public void turnOff() {
        System.out.println("Аудио жүйе өшірілген.");
    }
}

class VideoProjector {
    public void turnOn() {
        System.out.println("Бейне проектор қосулы.");
    }

    public void setResolution(String resolution) {
        System.out.println("Бейне ажыратымдылығы келесіге орнатылған " + resolution + ".");
    }

    public void turnOff() {
        System.out.println("Бейне проектор өшірулі.");
    }
}

 class LightingSystem {
    public void turnOn() {
        System.out.println("Шамдар жанып тұр.");
    }

    public void setBrightness(int level) {
        System.out.println("Шамдардың жарықтығы келесіге орнатылған " + level + ".");
    }

    public void turnOff() {
        System.out.println("Шамдар сөндірілген.");
    }
}
 class HomeTheaterFacade {
    private AudioSystem audioSystem;
    private VideoProjector videoProjector;
    private LightingSystem lightingSystem;

    public HomeTheaterFacade(AudioSystem audioSystem, VideoProjector videoProjector, LightingSystem lightingSystem) {
        this.audioSystem = audioSystem;
        this.videoProjector = videoProjector;
        this.lightingSystem = lightingSystem;
    }

    public void startMovie() {
        System.out.println("Фильмді бастауға дайындық...");
        lightingSystem.turnOn();
        lightingSystem.setBrightness(5);
        audioSystem.turnOn();
        audioSystem.setVolume(8);
        videoProjector.turnOn();
        videoProjector.setResolution("HD");
        System.out.println("Фильм басталды.");
    }

    public void endMovie() {
        System.out.println("Фильмді өшіру...");
        videoProjector.turnOff();
        audioSystem.turnOff();
        lightingSystem.turnOff();
        System.out.println("Фильм аяқталды.");
    }
}

class Main {
    public static void main(String[] args) {
        AudioSystem audio = new AudioSystem();
        VideoProjector video = new VideoProjector();
        LightingSystem lights = new LightingSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(audio, video, lights);

        homeTheater.startMovie();
        System.out.println();
        homeTheater.endMovie();
    }
}