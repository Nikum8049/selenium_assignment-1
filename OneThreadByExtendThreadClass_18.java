package JavaAssingment;
class T5 extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T5 is running........... : " + i);
        }
    }
}

class T6 extends Thread
{
    public void run()
    {
        for(int i=1; i<=10;i++)
        {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("T6 is running......... : "+i);
        }
    }
}

public class OneThreadByExtendThreadClass_18 {
    public static void main(String[] args) {
        T5 t5 = new T5();
        T6 t6 = new T6();

        // t5.run();
        //t6.run();
        t5.start();
        t6.start();
    }
}
