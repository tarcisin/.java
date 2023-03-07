import java.util.ArrayList;
import java.util.Scanner;

import guitarra.Guitar;
import guitarra.Models;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Generic Music Center");
        System.out.println("Customize your guitar;");

        boolean progress = true;
        int progressProbe;
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);


        int id;
        String brand;
        String models;
        Models model = Models.STRATO;
        int strings;
        String wood;
        int knobs;
        String pickups;
        String head;
        boolean acoustic;
        String bridge;
        String color;
        String neck;
        String scales;


        ArrayList<Guitar> guitarras = new ArrayList<Guitar>();

        while(progress){
            System.out.println("1 - Customize Guitar:\n2 - Search Guitar (id):\n3 - Close Application:");
            progressProbe = sc.nextInt();

            if (progressProbe == 1){

                System.out.println("Define guitar model:");
                 models = sn.nextLine();
                if(models.equalsIgnoreCase("Stratocaster")){
                    model = model.STRATO;
                }
                else if(models.equalsIgnoreCase("Telecaster")){
                    model = model.TELE;
                }
                else if(models.equalsIgnoreCase("Super Stratocaster")){
                    model = model.SUPER;
                }
                else if(models.equalsIgnoreCase("Firebird")){
                    model = model.FIRE;
                }
                else if(models.equalsIgnoreCase("Jaguar")){
                    model = model.JAGUAR;
                }
                else if(models.equalsIgnoreCase("Flying V")){
                    model = model.FLYV;
                }
                else if(models.equalsIgnoreCase("Warlock")){
                    model = model.WARLOCK;
                }
                else if(models.equalsIgnoreCase("Les Paul")){
                    model = model.LESPAUL;
                }
                else if(models.equalsIgnoreCase("Semi Acoustic")){
                    model = model.SEMIA;
                }

                else{
                    System.out.println("Model 404! Defining default model: Stratocaster");
                    model = model.STRATO;
                }

                System.out.println("Insert guitar id:");
                 id = sn.nextInt();

                System.out.println("Define how many strings does the guitar have:");
                 strings = sn.nextInt();
                 if(strings == 7 || strings == 8){
                    System.out.println("You listen to the right kind of music!\nNice choice!");
                 }

                System.out.println("What kind of wood does the body is made?");
                 wood = sn.next();

                System.out.println("How many knobs does it have?");
                 knobs = sn.nextInt();
                
                System.out.println("What kind of pickups does the guitar uses?");
                 pickups = sn.next();
                
                System.out.println("What kind of head does the guitar have?");
                 head = sn.next();

                System.out.println("Does the guitar is semi-acoustic?(T/F)");
                 acoustic = sn.nextBoolean();

                if(model.equals(model.SEMIA)){
                    acoustic = true;
                }

                System.out.println("Insert the type of bridge:");
                 bridge = sn.next();

                System.out.println("What color is the guitar?");
                 color = sn.next();

                System.out.println("Define kind of neck!");
                 neck = sn.next();

                System.out.println("Scales?");
                 scales = sn.next();
                 if(scales.equalsIgnoreCase("Multiscale")){
                    System.out.println("Uhh, Nice!");
                 }

                 System.out.println("What brand is it?");
                 brand = sn.next();

                 guitarras.add(new Guitar(id, brand, model, strings, wood, knobs, pickups, head, acoustic, bridge, color, neck, scales));

            } 

            else if(progressProbe == 2){
                int idArray = 0;
                System.out.println("Insert guitar id on array:");
                idArray = sn.nextInt();
                System.out.println(guitarras.get(idArray).toString());
            }

            else{
                progress = false;
            }
            
        }

        sc.close();
        sn.close();

    }

}
