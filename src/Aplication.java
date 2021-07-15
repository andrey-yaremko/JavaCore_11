import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Aplication {

        final static Random random = new Random();

          static void menu(){

            System.out.println("1.  Вивести toString() даних елементів масиву на консоль.");
            System.out.println("2.  Для всіх об`єктів даного масиву засетити одинаковий  об`єкт класу Авто");

        }

    public static void main(String[] args) {

              Integer[] mass = new Integer[10];
              for (int i = 0; i< mass.length;i++){
                  mass[i] = random.nextInt(9);
              }

        Arrays.sort(mass);
        System.out.println(Arrays.deepToString(mass));
        Arrays.sort(mass, Collections.reverseOrder());
        System.out.println(Arrays.deepToString(mass));

        Integer count = 2 + (int) (Math.random()*4);
        Integer count2 = 2 + (int) (Math.random()*4);
        System.out.println(count);
        System.out.println(count2);
        Object[][] automobil = new Object[count][count2];
        String steeringwheelmaterial = "Alkantara";


        int i,j;
        for(i = 0;i<count;i++)
            for(j = 0;j<count2;j++){
                automobil[i][j] = new Auto(50 + (int) (Math.random()*950),1950 + (int) (Math.random()*70),new SteeringWheel(2 + (int)(Math.random())*4,steeringwheelmaterial),new Engine(1 + (int) (Math.random()*15)));
                System.out.println(automobil[i][j]);
        }

        while (true) {
            menu();
            Scanner sc = new Scanner(System.in);
            switch (sc.next()) {
                case "1": {
                    System.out.println(Arrays.deepToString(automobil));
                    break;
                }
                case "2": {
                    Auto automobil1 = new Auto(50 + (int) (Math.random()*950),1950 + (int) (Math.random()*70),new SteeringWheel(2 + (int)(Math.random())*4,steeringwheelmaterial),new Engine(1 + (int) (Math.random()*15)));



                    for (Object[] row : automobil)
                        Arrays.fill(row, automobil1);
                    for(int c = 0;c<count;c++)
                        for(int v = 0;v<count2;v++){
                            System.out.println(automobil[c][v]);
                        }
                    break;
                }
            }
        }


    }

    }


