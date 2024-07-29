package JavaAssingment;

import static java.lang.Thread.sleep;

class Demo
{

}
class Thred1 extends Demo implements Runnable
{
    @Override
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try {
                sleep(2000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println("Thred a is running : " + i);
        }
    }
}

class Thred2 implements Runnable
{
    @Override
    public void run()
    {
        for (int i=1;i<=10;i++)
        {
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thred 2 is running...... : "+ i);
        }
    }
}

public class OneThredByImplementingRunnableInterface_17 {
    public static void main(String[] args) {


        Thred1 thr1 = new Thred1();
        Thred2 thr2 = new Thred2();

        thr1.run();
        thr2.run();

    }
}
