// Interface 1
interface Camera {
    void clickPhoto();
}

// Interface 2
interface MusicPlayer {
    void playMusic();
}

// Interface 3
interface Calling {
    void makeCall(String number);
}

// Samsung class implementing features
class Samsung implements Camera, MusicPlayer, Calling {
    public void clickPhoto() {
        System.out.println("Samsung: HD Photo clicked");
    }
    public void playMusic() {
        System.out.println("Samsung: Playing music in Dolby sound");
    }
    public void makeCall(String number) {
        System.out.println("Samsung: Calling " + number + " via VoLTE");
    }
}

// iPhone class implementing features
class iPhone implements Camera, MusicPlayer, Calling {
    public void clickPhoto() {
        System.out.println("iPhone: Portrait photo clicked");
    }
    public void playMusic() {
        System.out.println("iPhone: Playing music in high quality");
    }
    public void makeCall(String number) {
        System.out.println("iPhone: Calling " + number + " via FaceTime");
    }
}

// Main class
public class TestSmartphone {
    public static void main(String[] args) {
        // Polymorphism using interface reference
        Camera cam;
        MusicPlayer mp;
        Calling call;

        cam = new Samsung();
        cam.clickPhoto();   // Output: Samsung: HD Photo clicked

        cam = new iPhone();
        cam.clickPhoto();   // Output: iPhone: Portrait photo clicked

        mp = new Samsung();
        mp.playMusic();     // Output: Samsung: Playing music in Dolby sound

        mp = new iPhone();
        mp.playMusic();     // Output: iPhone: Playing music in high quality

        call = new Samsung();
        call.makeCall("9876543210");  // Output: Samsung: Calling ... via VoLTE

        call = new iPhone();
        call.makeCall("9876543210");  // Output: iPhone: Calling ... via FaceTime
    }
}
