package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //String filePath = "/Users/dorian/Desktop/JAVA_Project/Tondeuse/src/main/java/instruction.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/dorian/Desktop/JAVA_Project/Tondeuse/src/main/java/instruction.txt"));
            String[] tailleSurface = reader.readLine().split(" ");
            Surface surface = new Surface(Integer.parseInt(tailleSurface[0]), Integer.parseInt(tailleSurface[1]));

            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] positionInitiale = ligne.split(" ");
                TondeusePosition position = new TondeusePosition(
                        Integer.parseInt(positionInitiale[0]),
                        Integer.parseInt(positionInitiale[1]),
                        Direction.valueOf(positionInitiale[2])
                );

                Tondeuse tondeuse = new Tondeuse(position, surface);
                String instructions = reader.readLine();
                tondeuse.instructions(instructions);

                System.out.println(tondeuse.getPosition());
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}