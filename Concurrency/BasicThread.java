package Concurrency;

class ThreadDemo extends Thread {
    // Default constructor
    ThreadDemo() {
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Child Thread");
        }
    }
}

class BasicThread {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo(); // Using default constructor
        t.start(); // Start the first thread

        for (int i = 0; i < 4; i++) {
            System.out.println("Main thread");
        }

        // Create a new instance to start a new thread
        ThreadDemo t2 = new ThreadDemo(); // Using default constructor
        t2.start(); // Start the second thread
    }
}
