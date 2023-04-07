package src;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo
{
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        p.setProperty("XBOX","Xenia");
        p.setProperty("PS4","Orbit");
        p.setProperty("PS3","RPCS3");
        p.setProperty("Wii","Dolphin");
        p.setProperty("PS2","PCSX2");
p.setProperty("PS1","PCSX");

    p.store(new java.io.FileOutputStream("I:\\Text files\\Emulators.txt"), "Emulators");
    }

}



