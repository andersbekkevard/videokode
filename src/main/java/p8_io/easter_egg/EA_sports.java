package p8_io.easter_egg;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EA_sports {

    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("src/main/java/x/GTA_VI.java")) {
            EA_sports.developeGame(os, "GTA_VI");
        } catch (Exception e) {
            System.err.println("Feil oppstått" + e.getMessage());
        }
    }

    public static void developeGame(OutputStream os, String game) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("package x;\n\n");
        sb.append("public class " + game + "{\n\n");
        sb.append("     String[] characters = {\"Franklin\", \"Trevor\", \"Michael\"};\n");
        sb.append("     int dollarsPerCharacter = 999;\n\n");
        sb.append("     public void runGame() {\n");
        sb.append("         System.out.println(\"Error. Your credit card number has been stolen\");\n");
        sb.append("     }\n\n");
        sb.append("     public static void main(String[] args) {\n");
        sb.append("         " + game + " game = new " + game + "();\n");
        sb.append("         game.runGame();\n");
        sb.append("     }\n");
        sb.append("}\n");
        os.write(sb.toString().getBytes());
    }
}
