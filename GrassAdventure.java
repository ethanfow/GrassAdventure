import java.util.*;
import java.util.concurrent.TimeUnit;

/* Ethan Fowler
 * 2019/11/29
 * GrassAdventure.java
 * ICS4U RST
 * This is a game called Grass Adventure. It is text-based and played entirely in the console.
 */

public class GrassAdventure {

public static void printWithDelays(String data, TimeUnit unit, long delay) throws InterruptedException {
    for (char ch:data.toCharArray()) {
        System.out.print(ch);
        unit.sleep(delay);
    }
}

public static void suburban() throws InterruptedException {
    //Story #1, places you in the suburbs
    int choice;
    int grassHeight = 1;

    Scanner suburban = new Scanner(System.in);
    
    printWithDelays("You wake up on the lawn of a small blue house. You look around\n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("and see fellow blades of grass, and a car about to leave. The \n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("wind is picking up.\n", TimeUnit.MILLISECONDS, 25);

    do {
        printWithDelays("Talk to the blades of grass(1): \n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Let the wind blow you onto the car(2):\n", TimeUnit.MILLISECONDS, 25);
        choice = suburban.nextInt();

        if (choice == 1) {
            printWithDelays("Unknown Grass: Hi, welcome to Frank's lawn. You're never leaving.\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("*You feel uneasy, the car has now left the driveway.*\n", TimeUnit.MILLISECONDS, 25);
            do {
                printWithDelays("Just grow(1): \n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Keep talking(2): \n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Wait until tommorow morning(3): \n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
                if (choice == 3) {
                    printWithDelays("You decide to wait until the car returns the next morning.\n", TimeUnit.MILLISECONDS, 25);
                } else if (choice == 2) {
                    printWithDelays("Unknown Grass: I have nothing to say to you.\n", TimeUnit.MILLISECONDS, 25);
                } else if (choice == 1) {
                    printWithDelays("You grow 1mm taller.\n", TimeUnit.MILLISECONDS, 25);
                    grassHeight += 1;
                }
            } while (choice == 2 || choice == 1);
            choice = 2;
        }
    }while (choice > 3 || choice < 1);

    if (choice == 2) {
        printWithDelays("You manage to attach yourself to the car, and ride with it for a while.\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("You see a tunnel ahead, other grass blades are standing just inside.\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Go into the tunnel(1)\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Stay attached to the car(2)\n", TimeUnit.MILLISECONDS, 25);
        choice = suburban.nextInt();
        if (choice == 1) {
            printWithDelays("You enter the tunnel and visit the other blades of grass. They are a cult.\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("You are inducted as their leader and spend your days leading a cult.\n", TimeUnit.MILLISECONDS, 25);
            do {
                printWithDelays("Restart game(1)\n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Check height of grass(2)\n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
                if (choice == 1) {
                    grassAdventure();
                } else if (choice == 2) {
                    printWithDelays("Your height is " + grassHeight + "mm\n", TimeUnit.MILLISECONDS, 25);
                }
            } while (choice != 1);

        } else if (choice == 2) {
            printWithDelays("You stay with the car until you reach a large desert. You fall off and\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("die of dehydration.\n", TimeUnit.MILLISECONDS, 50);
            do {
                printWithDelays("Restart game(1)\n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Check height of grass(2)\n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
                if (choice == 1) {
                    grassAdventure();
                } else if (choice == 2) {
                    printWithDelays("Your height is " + grassHeight + "mm\n", TimeUnit.MILLISECONDS, 25);
                }
            } while (choice != 1);
        }
    }
    suburban.close();
}

public static void mountain() throws InterruptedException {
    //Story #2, places you in the mountains
    int choice;
    int grassHeight = 1;

    Scanner suburban = new Scanner(System.in);

    printWithDelays("You wake up in a large area on the top of a mountain. You see \n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("fellow blades of grass, and a gust of wind is picking up.\n", TimeUnit.MILLISECONDS, 25);

    do {
        printWithDelays("Talk to the blades of grass(1): \n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Let the wind blow you into the air(2): \n", TimeUnit.MILLISECONDS, 25);
        choice = suburban.nextInt();

        if (choice == 1) {
            printWithDelays("Unknown Grass: Hi, this is Mt. Grundle. You're never leaving.\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("*You feel uneasy, the gust has now weakened.*\n", TimeUnit.MILLISECONDS, 25);
        do {
            printWithDelays("Just grow(1): \n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("Keep talking(2): \n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("Wait until tommorow morning(3): \n", TimeUnit.MILLISECONDS, 25);
            choice = suburban.nextInt();
            if (choice == 3) {
                printWithDelays("You decide to wait until the wind returns the next morning.\n", TimeUnit.MILLISECONDS, 25);
            } else if (choice == 2) {
                printWithDelays("Unknown Grass: I have nothing to say to you.\n", TimeUnit.MILLISECONDS, 25);
            } else if (choice == 1) {
                printWithDelays("You grow 1mm taller.\n", TimeUnit.MILLISECONDS, 25);
                grassHeight += 1;
            }
        } while (choice == 2 || choice == 1);
        choice = 2;
        }
    }while (choice > 3 || choice < 1);

    if (choice == 2) {
        printWithDelays("You manage to get blown into the air, and ride with it for a while.\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("You see an open field ahead, other grass blades are standing together.\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Go to the field(1)\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Stay in the gust of wind(2)\n", TimeUnit.MILLISECONDS, 25);
        choice = suburban.nextInt();
        if (choice == 1) {
            printWithDelays("You go down to the field and visit the other blades of grass. They have\n", TimeUnit.MILLISECONDS, 50);
            printWithDelays("knives and stab you viciously, you don't survive.\n", TimeUnit.MILLISECONDS, 50);

            do {
                printWithDelays("Restart game(1)\n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Check height of grass(2)\n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
                if (choice == 1) {
                    grassAdventure();
                } else if (choice == 2) {
                    printWithDelays("Your height is " + grassHeight + "mm\n", TimeUnit.MILLISECONDS, 25);
                }
            } while (choice != 1);
        } else if (choice == 2) {
            printWithDelays("You stay with the wind until you reach a cold peak. The frost kills\n", TimeUnit.MILLISECONDS, 50);
            printWithDelays("you rapidly.\n", TimeUnit.MILLISECONDS, 50);
            do {
                printWithDelays("Restart game(1)\n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Check height of grass(2)\n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
                if (choice == 1) {
                    grassAdventure();
                } else if (choice == 2) {
                    printWithDelays("Your height is " + grassHeight + "mm\n", TimeUnit.MILLISECONDS, 25);
                }
            } while (choice != 1);
        }
    }
    suburban.close();
}

public static void forest() throws InterruptedException {
    //Story #3, places you in the forest
    int choice;
    int grassHeight = 1;

    Scanner suburban = new Scanner(System.in);

    printWithDelays("You wake up in a forest with tall trees all around. There is a\n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("variety of wildlife around you. A parrot stands on a branch just\n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("in reach. You are next to a tall tree. \n", TimeUnit.MILLISECONDS, 25);

    do {
        printWithDelays("Talk to the tree next to you(1): \n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Grab onto the parrot(2): \n", TimeUnit.MILLISECONDS, 25);
        choice = suburban.nextInt();

        if (choice == 1) {
            printWithDelays("Unknown Tree: Hi, this forest is massive and you'll never escape.\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("*You feel uneasy, the parrot has now flown away.*\n", TimeUnit.MILLISECONDS, 25);
            do {
                printWithDelays("Just grow(1):\n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Keep talking(2):\n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Wait until tommorow morning(3):\n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
                if (choice == 3) {
                    printWithDelays("You decide to wait until the parrot returns the next morning.\n", TimeUnit.MILLISECONDS, 25);
                } else if (choice == 2) {
                    printWithDelays("Unknown Tree: Don't talk to me.\n", TimeUnit.MILLISECONDS, 25);
                } else if (choice == 1) {
                    printWithDelays("You grow 1mm taller.\n", TimeUnit.MILLISECONDS, 25);
                    grassHeight += 1;
                }
            } while (choice == 2 || choice == 1);
            choice = 2;
        }
    } while (choice > 3 || choice < 1);

    if (choice == 2) {
        printWithDelays("You manage to attach yourself to the parrot, and fly with it for a while.\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("You see a cave ahead, a group of humans are standing just inside.\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Go into the cave(1)\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Stay attached to the parrot(2)\n", TimeUnit.MILLISECONDS, 25);
        choice = suburban.nextInt();
        if (choice == 1) {
            printWithDelays("You enter the cave and visit the humans. They are cavemen, and use you\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("to help generate their fire.\n", TimeUnit.MILLISECONDS, 50);

            do {
                printWithDelays("Restart game(1)\n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Check height of grass(2)\n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
                if (choice == 1) {
                    grassAdventure();
                } else if (choice == 2) {
                    printWithDelays("Your height is " + grassHeight + "mm\n", TimeUnit.MILLISECONDS, 25);
                }
            } while (choice != 1);

        } else if (choice == 2) {
            printWithDelays("You stay with the parrot until you reach an open field. You're free!\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("You spend your days on the field with fellow grass blades.\n", TimeUnit.MILLISECONDS, 25);

            do {
                printWithDelays("Restart game(1)\n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Check height of grass(2)\n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
                if (choice == 1) {
                    grassAdventure();
                } else if (choice == 2) {
                    printWithDelays("Your height is " + grassHeight + "mm\n", TimeUnit.MILLISECONDS, 25);
                }
            } while (choice != 1);
        }
    }
    suburban.close();
}

public static void desert() throws InterruptedException {
    //Story #4, places you in the desert
    int choice;
    int grassHeight = 1;

    Scanner suburban = new Scanner(System.in);

    printWithDelays("You wake up next to a palm tree with a pool of water next to it.\n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("You see a cactus near you, and a large open desert. A sand storm\n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("is picking up.\n", TimeUnit.MILLISECONDS, 25);

    do {
        printWithDelays("Talk to the cactus(1): \n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Let the wind blow you into the sand storm(2): \n", TimeUnit.MILLISECONDS, 25);
        choice = suburban.nextInt();

        if (choice == 1) {
            printWithDelays("Unknown Cactus: Hi, this desert is massive. You're never escaping.\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("You feel uneasy, the sandstorm has now passed.\n", TimeUnit.MILLISECONDS, 25);
            do {
                printWithDelays("Just grow(1): \n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Keep talking(2): \n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Wait until tommorow morning(3): \n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
            if (choice == 3) {
                printWithDelays("You decide to wait until the storm returns the next morning.\n", TimeUnit.MILLISECONDS, 25);
            } else if (choice == 2) {
                printWithDelays("Unknown Cactus: I'M BUSY!\n", TimeUnit.MILLISECONDS, 25);
            } else if (choice == 1) {
                printWithDelays("You grow 1mm taller.\n", TimeUnit.MILLISECONDS, 25);
                grassHeight += 0.1;
            }
            }while (choice != 3);
            choice = 2;
        }
    } while (choice > 3 || choice < 1);
    
    if (choice == 2) {
        printWithDelays("You manage to boost yourself to the air, and ride with it for a while.\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("You see a large pit ahead, many palm trees are inside.\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Go into the pit(1)\n", TimeUnit.MILLISECONDS, 25);
        printWithDelays("Stay in the storm(2)\n", TimeUnit.MILLISECONDS, 25);
        choice = suburban.nextInt();

        if (choice == 1) {
            printWithDelays("You enter the pit and visit the palm trees. They are doing a ritual.\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("You are used as a sacrifice and die a painful death.\n", TimeUnit.MILLISECONDS, 50);
            do {
                printWithDelays("Restart game(1)\n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Check height of grass(2)\n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
                if (choice == 1) {
                    grassAdventure();
                } else if (choice == 2) {
                    printWithDelays("Your height is " + grassHeight + "mm\n", TimeUnit.MILLISECONDS, 25);
                }
            } while (choice != 1);
        } else if (choice == 2) {
            printWithDelays("You stay with the storm until you are torn to pieces by the sand.\n", TimeUnit.MILLISECONDS, 50);
            printWithDelays("You die slowly.\n", TimeUnit.MILLISECONDS, 25);

            do {
                printWithDelays("Restart game(1)\n", TimeUnit.MILLISECONDS, 25);
                printWithDelays("Check height of grass(2)\n", TimeUnit.MILLISECONDS, 25);
                choice = suburban.nextInt();
                if (choice == 1) {
                    grassAdventure();
                } else if (choice == 2) {
                    printWithDelays("Your height is " + grassHeight + "mm\n", TimeUnit.MILLISECONDS, 25);
                }
            } while (choice != 1);
        }
        suburban.close();
    }
}

public static void grassAdventure() throws InterruptedException {
    //Title sequence, shows rules and starts the game
    int choice;

    //Title Screen
    System.out.println("*****************************************************************************");
    System.out.println("*                                 WELCOME                                   *");
    System.out.println("*              *                  TO                          *             *");
    System.out.println("*              ^                  GRASS                       ^             *");
    System.out.println("*             ^^^                 ADVENTURE                  ^^^            *");
    System.out.println("*            ^^^^^                TTTTTTTTTT                ^^^^^           *");
    System.out.println("*              |                  ||||||||||                  |             *");
    System.out.println("*****************************************************************************");

    Scanner gameStart = new Scanner(System.in);

    do {
        System.out.println("            PRESS 1 TO START THE GAME | PRESS 2 FOR THE RULES\n");
        choice = gameStart.nextInt();
        if (choice == 2) {
            printWithDelays("Rules:\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("Grass Adventure will be following a blade of grass through a text based adventure.\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("The player will be provided a choice between different paths they can go through,\n", TimeUnit.MILLISECONDS, 25);
            printWithDelays("leading to different endings to the story.\n", TimeUnit.MILLISECONDS, 25);
        }
    } while (choice != 1);

    printWithDelays("Choose a starting area: \n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("Suburban home lawn(1) \n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("Mountain(2) \n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("Forest(3) \n", TimeUnit.MILLISECONDS, 25);
    printWithDelays("Desert(4) \n", TimeUnit.MILLISECONDS, 25);
    
    //decide the starting area of the game
    do {
        choice = gameStart.nextInt();
        switch (choice) {
            case 1: suburban(); break;
            case 2: mountain(); break;
            case 3: forest(); break;
            case 4: desert(); break;
        }
    } while (choice < 1 || choice > 4);

    gameStart.close();
}

public static void main(String[] args) throws InterruptedException {
        grassAdventure();
    }
}