/*
 * Kurucz János, 2024-02-26
 * Copyright (c) 2024, Kurucz János
 * Licenc: MIT
 * Refakotárlva Kurucz János, 2024-02-26
 */

import java.util.Scanner;

public class MainConsole {
    String transportCost = "";
    String buisnessCost = "";
    String repairCost = "";
    Scanner scanner;   
    public MainConsole() {
        putHeader();
        scanner = new Scanner(System.in);
        startInput();
        writeData();        
     
    }
    public void putHeader(){
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");   
    }
    private void startInput() {
        transportCost = input("Szállítási költség: ");
        buisnessCost = input("Üzleti költség: ");
        repairCost = input("Javítási költség: ");
    }
    private String input(String msg) {
        System.out.println("──────────────────────────────────────────");
        System.out.print(msg);
        String indata = scanner.nextLine();
        return indata;
    }
    private void writeData(){
        Koltseg k = new Koltseg(transportCost, buisnessCost, repairCost);
        Filehandler write = new Filehandler("adat.txt");
        write.writeData(k);
        write.closeFile();
    }
}
