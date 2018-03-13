package xyg.study.forInterview.exception;

class Human extends Exception
{
}

class Sneeze extends Human
{
}

public class HumanC
{
    public static void main(String[] args) throws Exception {
        try {
            try {
                throw new Sneeze();
            }
            catch (Human a) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        }
        catch (Sneeze s) {
            System.out.println("Caught Sneeze");
            return;
        }
        finally {
            System.out.println("Hello World!");
        }
    }
}
