/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 */

import java.util.Scanner;

public class MainConsole {
    /*
     * A csoni objektum osztáj tagjává kellen tenni.
     * Meg fontolandü a egy try() utasításba zárása is,
     * így le lesz zárva biztosan.
     * Ezzel valamit kezdünk.
     * Most jó lesz így.
     */
    String transport = "";
    String name = "";
    String quantity = "";    
    public MainConsole() {
        putHeader();
     
        
        /* A bekérő: */
        Scanner csoni = new Scanner(System.in);        

System.out.println("──────────────────────────────────────────");
System.out.print("Szállítási költség: ");
transport = csoni.nextLine();

System.out.println("──────────────────────────────────────────");
System.out.print("Üzleti költség: ");
name = csoni.nextLine();

System.out.println("──────────────────────────────────────────");
 System.out.print("Javítási költség: ");
  quantity = csoni.nextLine();        
  Koltseg k = new Koltseg(transport, name, quantity);
  Filehandler f = new Filehandler();
  f.i(k);
    }
    public void putHeader(){
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");   
    }
}
