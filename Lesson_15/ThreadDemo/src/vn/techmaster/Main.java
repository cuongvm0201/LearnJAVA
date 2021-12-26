package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        //Tạo bằng extends class Thread
        CreatThread thread1 = new CreatThread();
        System.out.println(thread1.getId()+"-"+thread1.getName());
        thread1.start();

        try {
            thread1.join(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        CreatThread thread2 = new CreatThread();
        System.out.println(thread2.getId()+"-"+thread2.getName());
        thread2.setName("Luồng 2");
        System.out.println(thread2.getId()+"-"+thread2.getName());
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadByInterface thread = new ThreadByInterface();
        Thread t = new Thread(thread);
        t.start();
    }
}
