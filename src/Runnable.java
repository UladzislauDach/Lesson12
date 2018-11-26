public interface Runnable {
    void run ();
    void runFast ();
    static void ranSlow(){
        System.out.println("slow");
    }

}
