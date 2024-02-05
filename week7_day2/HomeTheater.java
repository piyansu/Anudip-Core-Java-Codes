package week7_day2;

// DVD class representing a DVD player
class DVD {
    void start() {
        System.out.println("DVD Player is ON");
    }

    void playMovie(String movie) {
        System.out.println("Now Playing: " + movie);
    }

    void turnOff() {
        System.out.println("DVD Player is OFF");
    }
}

// SoundSystem class representing a surround sound system
class SoundSystem {
    void powerOn() {
        System.out.println("Sound System is ON");
    }

    void setSurroundSound() {
        System.out.println("Surround Sound is enabled");
    }

    void powerOff() {
        System.out.println("Sound System is OFF");
    }
}

// MovieProjector class representing a movie projector
class MovieProjector {
    void switchOn() {
        System.out.println("Projector is ON");
    }

    void connectDVD(DVD dvd) {
        System.out.println("Connected to DVD Player");
    }

    void switchOff() {
        System.out.println("Projector is OFF");
    }
}

// ProjectionScreen class representing a projection screen
class ProjectionScreen {
    void raise() {
        System.out.println("Projection Screen is UP");
    }

    void lower() {
        System.out.println("Projection Screen is DOWN");
    }
}

// CinemaExperienceFacade class representing a facade for a home theater system
class CinemaExperienceFacade {
    private DVD dvd;
    private SoundSystem soundSystem;
    private MovieProjector movieProjector;
    private ProjectionScreen projectionScreen;

    // Constructor to initialize components
    public CinemaExperienceFacade(DVD dvd, SoundSystem soundSystem, MovieProjector movieProjector, ProjectionScreen projectionScreen) {
        this.dvd = dvd;
        this.soundSystem = soundSystem;
        this.movieProjector = movieProjector;
        this.projectionScreen = projectionScreen;
    }

    // Method to play a movie with the home theater system
    public void playMovie(String movie) {
        System.out.println("Get ready for an immersive movie experience...");
        dvd.start();
        soundSystem.powerOn();
        soundSystem.setSurroundSound();
        movieProjector.switchOn();
        movieProjector.connectDVD(dvd);
        projectionScreen.lower();
        dvd.playMovie(movie);
    }

    // Method to end the movie and shut down the home theater system
    public void endMovie() {
        System.out.println("Ending the cinematic experience...");
        dvd.turnOff();
        soundSystem.powerOff();
        movieProjector.switchOff();
        projectionScreen.raise();
    }
}

// Main class to demonstrate the usage of the home theater system
public class HomeTheater {
    public static void main(String[] args) {
        // Create instances of components
        DVD dvd = new DVD();
        SoundSystem soundSystem = new SoundSystem();
        MovieProjector movieProjector = new MovieProjector();
        ProjectionScreen projectionScreen = new ProjectionScreen();

        // Create CinemaExperienceFacade with the components
        CinemaExperienceFacade cinemaFacade = new CinemaExperienceFacade(dvd, soundSystem, movieProjector, projectionScreen);

        // Watch a movie using the facade
        cinemaFacade.playMovie("Interstellar");

        // End the movie using the facade
        cinemaFacade.endMovie();
    }
}
