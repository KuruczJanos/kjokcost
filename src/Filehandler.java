/*
 * Kurucz János, 2024-02-26
 * Copyright (c) 2024, Kurucz János
 * Licenc: MIT
 * Refakotárlva Kurucz János, 2024-02-26
 */
import java.io.FileWriter;
import java.io.IOException;

public class Filehandler {
    private FileWriter fw;

    public Filehandler(String fileName) {
        try {
            fw = new FileWriter(fileName, true);
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    public void writeData(Koltseg k) {
        try {
            StringBuilder data = new StringBuilder();
            data.append(k.szallitas).append(":")
                .append(k.uzlet).append(":")
                .append(k.javitas).append("\n");
            fw.write(data.toString());
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    public void closeFile() {
        try {
            if (fw != null) {
                fw.close();
            }
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    private void handleIOException(IOException e) {
        e.printStackTrace();
    }
}
