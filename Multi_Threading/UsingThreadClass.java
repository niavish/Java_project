

class UsingThreadClass extends Thread {
        public void run() {
            System.out.println("Running the thread classs");
        }

        public static void main(String[] args) {
            UsingThreadClass t = new UsingThreadClass();
            //t.run();
            t.start();
        }


}