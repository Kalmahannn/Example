package dom_10;

class TV {
    void on() { System.out.println("TV is on"); }
    void off() { System.out.println("TV is off"); }
    void setChannel(int channel) { System.out.println("TV channel set to " + channel); }
}

class AudioSystem {
    void on() { System.out.println("Audio system is on"); }
    void off() { System.out.println("Audio system is off"); }
    void setVolume(int level) { System.out.println("Volume set to " + level); }
}

class DVDPlayer {
    void play() { System.out.println("DVD is playing"); }
    void pause() { System.out.println("DVD is paused"); }
    void stop() { System.out.println("DVD stopped"); }
}

class GameConsole {
    void on() { System.out.println("Game console is on"); }
    void startGame(String game) { System.out.println("Game " + game + " is starting"); }
}

class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audio;
    private DVDPlayer dvd;
    private GameConsole console;

    public HomeTheaterFacade(TV tv, AudioSystem audio, DVDPlayer dvd, GameConsole console) {
        this.tv = tv;
        this.audio = audio;
        this.dvd = dvd;
        this.console = console;
    }

    void watchMovie() {
        tv.on();
        audio.on();
        dvd.play();
        System.out.println("Movie mode started");
    }

    void stopMovie() {
        dvd.stop();
        tv.off();
        audio.off();
        System.out.println("Movie mode stopped");
    }

    void playGame(String game) {
        console.on();
        console.startGame(game);
    }

    void listenToMusic() {
        tv.on();
        audio.on();
        audio.setVolume(5);
        System.out.println("Music mode started");
    }

    void turnOffAll() {
        tv.off();
        audio.off();
        dvd.stop();
        console.on();
        System.out.println("All devices turned off");
    }
}

class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer dvd = new DVDPlayer();
        GameConsole console = new GameConsole();

        HomeTheaterFacade theater = new HomeTheaterFacade(tv, audio, dvd, console);

        theater.watchMovie();
        theater.stopMovie();
        theater.listenToMusic();
        theater.playGame("Adventure Quest");
        theater.turnOffAll();
    }
}
