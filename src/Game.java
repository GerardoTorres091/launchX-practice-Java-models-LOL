public class Game {
    public static void main(String[] args) throws InterruptedException{
        TestAshe();
    }

    private static void TestAshe() throws InterruptedException{
        Screen screen = new Screen();
        Ashe ashe = new Ashe(
                01,
                "Ashe",
                "Marksman",
                "Moderate",
                "Iceborn warmother of the Avarosa."
        );

        //Ejecutar nuestra interfaz runnable de manera anomima
        Runnable attack = new Runnable() {
            @Override
            public void run() {

                try {
                    ashe.frostShot(screen);
                    Thread.sleep(3000);

                    ashe.hawkShot(screen);
                    Thread.sleep(3000);

                    ashe.volley(screen);
                    Thread.sleep(3000);

                    ashe.rangerFocus(screen);
                    Thread.sleep(3000);

                    ashe.crystalArrow(screen);
                    Thread.sleep(3000);

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread attackAshe = new Thread(attack);
        attackAshe.start();
    }
}
