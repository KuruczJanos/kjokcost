/*
 * Kurucz János, 2024-02-26
 * Copyright (c) 2024, Kurucz János
 * Licenc: MIT
 * Refakotárlva Kurucz János, 2024-02-26
 */

public class Koltseg {
    Double szallitas;
    Double uzlet;
    Double javitas;
    public Koltseg(String szallitas, String uzlet, String javitas) {
        this.szallitas = Double.parseDouble(szallitas);
        this.uzlet = Double.parseDouble(uzlet);
        this.javitas = Double.parseDouble(javitas);
    }
    
}
