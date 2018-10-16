package sample2darray;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample2darray {

    //   boolean RUnning = true;
    public static void main(String[] args) {
        ArrayList<Enemy> enemies = new ArrayList();
        for (int i = 0; i < 3; i++) {
            enemies.add(new Enemy(2 + i, 3 - i));
        }
        ArrayList<Treasure> dinero = new ArrayList();
        for (int i = 0; i < 2; i++) {
            dinero.add(new Treasure(1 + i, 2 - i));
        }

        Wall w = new Wall(0,0);
        Player p = new Player(0, 0);
        char twoarray[][] = new char[4][4];
        Scanner userinput = new Scanner(System.in);
        Scanner hello = new Scanner(System.in);
        System.out.println("What is your name?");
        String Firstname = hello.next();
        System.out.println("Welcome " + Firstname);
        System.out.println("Welcome to the captains den. There are nice people on board who will pay you and pirates who will suck the health out of you ");
        System.out.println("The @ symbol represents the pirates and the $ symbol represnts the nice people who will give you money. You are the ! symbol ");
        System.out.println("The point of the game is to try to collect as much money before the pirates eat the soul out of you ");
        System.out.println("Do beware that when your soul is taken captive it can disquise as a pirate");

        boolean win = false;
        while (!win) {
            System.out.println("ASWD to move " + Firstname);
            String Userinput = userinput.nextLine();
            System.out.println("");
            //This moves my Player method left
            if (Userinput.contains("a")) {
                p.moveleft();

            }
            //This moves my Player method down
            if (Userinput.contains("s")) {
                p.movedown();

            }

            //This moves my Player method right 
            if (Userinput.contains("d")) {
                p.moveright();

            }

            //This moves my Player method up
            if (Userinput.contains("w")) {
                p.moveup();

            }
            //This is the array that the player moves on 
            for (int i = 0; i < 4; i++) {
                // System.out.println(".");
                for (int j = 0; j < 4; j++) {
                    twoarray[i][j] = '.';
                }
                 if (Userinput.contains("q")) {
                reset();
            }

            }
//This is defining my enemy its symbol

            twoarray[p.getY()][p.getX()] = '!';
// This is where the player is pased through the chase value. 
            for (Enemy e : enemies) {
                e.chase(p);
                twoarray[e.getY()][e.getX()] = '@';
            }
            // This is where the player is pased through the treasure value. 

            for (Treasure t : dinero) {
                t.Collect(p);
                twoarray[t.getY()][t.getX()] = '$';
            }

            // This is checking for intersections between the player and Treasure
            for (Treasure t : dinero) {
                if (p.getX() == t.getX() && p.getY() == t.getY()) {
                    twoarray[t.getY()][t.getX()] = '$';
                    p.inventory();
                    t.Collect();
                }
            }
            // This is checking for intersections between the player and enemy
            for (Enemy e : enemies) {
                if (p.getX() == e.getX() && p.getY() == e.getY()) {
                    twoarray[e.getY()][e.getX()] = '@';
                    p.health();
                    e.getlost();
                }
            }

            //This is the array that the player moves on 
            for (int k = 0; k < 4; k++) {
                System.out.println(".");

                for (int l = 0; l < 4; l++) {
                    System.out.print(twoarray[k][l]);
                    //   System.out.print(".");

                }
            }
            System.out.println("");
            System.out.println("Your health is " + p.health);
            System.out.println("You have " + p.inventory + " dollars");

            // My lose condition is set here to if you have less than 30 health 
            if (p.health <= 10) {
                System.out.println("You lose your health was less than 10");

            }
            // This is hwere my win condition is set. THe player wins if the player has more than $30
            if (p.inventory >= 30) {
                System.out.println("You Win you earned more $30");
//                p.Reset();
//                dinero.findReset();
//                Enemy.followReset();
//                
            }
            // The while loop ends here 
        }
        //This is where my main ends. 
    }
    public static void reset(){
         ArrayList<Enemy> enemies = new ArrayList();
        for (int i = 0; i < 3; i++) {
            enemies.add(new Enemy(2 + i, 3 - i));
        }
        ArrayList<Treasure> dinero = new ArrayList();
        for (int i = 0; i < 2; i++) {
            dinero.add(new Treasure(1 + i, 2 - i));
        }

        Wall w = new Wall(0,0);
        Player p = new Player(0, 0);
        char twoarray[][] = new char[4][4];
        Scanner userinput = new Scanner(System.in);
        Scanner hello = new Scanner(System.in);
        System.out.println("What is your name?");
        String Firstname = hello.next();
        System.out.println("Welcome " + Firstname);
        System.out.println("Welcome to the captains den. There are nice people on board who will pay you and pirates who will suck the health out of you ");
        System.out.println("The @ symbol represents the pirates and the $ symbol represnts the nice people who will give you money. You are the ! symbol ");
        System.out.println("The point of the game is to try to collect as much money before the pirates eat the soul out of you ");
        System.out.println("Do beware that when your soul is taken captive it can disquise as a pirate");
        
    }
// The public class ends here 
}

// This is my Treasure class is constructed 
class Wall {

    int x, y;

    Wall(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}

class Treasure {

    int x, y;

    Treasure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //ALL OF THESE ARE METHODS IF THEY START WITH MOVE it moves my enemy 
    public void finddown() {
        this.y += 1;
    }

    public void findright() {
        this.x += 1;
    }

    public void findup() {
        this.y -= 1;
    }

    public void findleft() {
        this.x -= 1;
    }

    public void Collect() {
        this.x = 0;
        this.y = 0;

    }

    public void Collect(Player p) {
        if (p.x > this.x) {
            this.findright();
        }
        if (p.y > this.y) {
            this.finddown();
        }
        if (p.x < this.x) {
            this.findleft();
        }
        if (p.y < this.y) {
            this.findup();
        }
    }

    public void findReset() {
        this.x = 0;
        this.y = 0;
    }
}
// This is my Enemy class is constructed 

class Enemy {

    int x, y;

    Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //ALL OF THESE ARE METHODS IF THEY START WITH MOVE it moves my enemy 
    public void followdown() {
        this.y += 1;
    }

    public void followright() {
        this.x += 1;
    }

    public void followup() {
        this.y -= 1;
    }

    public void followleft() {
        this.x -= 1;
    }

    public void getlost() {
        this.x = 0;
        this.y = 0;

    }

    public void chase(Player p) {
        if (p.x > this.x) {
            this.followright();
        }
        if (p.y > this.y) {
            this.followdown();
        }
        if (p.x < this.x) {
            this.followleft();
        }
        if (p.y < this.y) {
            this.followup();
        }
    }

    public void followReset() {
        this.x = 0;
        this.y = 0;
    }
}
// This is my player class is constructed 

class Player {

    int x, y, health, inventory;

    Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getInventory() {
        return inventory;
    }
    //ALL OF THESE ARE METHODS IF THEY START WITH MOVE it moves my player

    public void moveleft() {
        if (this.x >= 1) {
            this.x -= 1;
        } else {
            //   This is an boundary to tell the player he cant go past the array if he does it subracts 1
            this.x = this.x + 1;
        }
    }

    public void moveright() {
        if (this.x < 3) {
            this.x += 1;
        } else {
            // This is an boundary to tell the player he cant go past the array if he does it adds 1
            this.x -= 1;
        }
    }

    public void moveup() {
        if (this.y == 0) {
            this.y += 1;
        } else {
            // This is an boundary to tell the player he cant go past the array if he does it adds 1
            this.y -= 1;
        }
    }

    public void movedown() {
        if (this.y == 3) {
            this.y -= 1;
        } else {
            // This is an boundary to tell the player he cant go past the array if he does it subracts 1
            this.y += 1;
        }
    }
// This is the health method that adds 1 i use this in my if statement 

    public void health() {
        if (this.health == 10) {
            this.health -= 1;
        } else {
            this.health += 1;
        }
    }

    public void inventory() {
        //  this.health = health;
        this.inventory += 1;
    }

 
    }

