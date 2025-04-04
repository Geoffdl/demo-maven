package fr.diginamic.d022025.dev;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try
        {
            String asciiArt = FigletFont.convertOneLine("Wouuaow, Demo-repo looking stylish");
            System.out.println(asciiArt);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

}