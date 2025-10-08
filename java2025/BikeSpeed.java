class BikeSpeed {
    final int speedlimit = 300;  // Set value once, cannot be reassigned

    void run() {
        // speedlimit = 400;  // ❌ This will cause an error
        System.out.println("Speed limit is " + speedlimit);
    }

    public static void main(String args[]) {
        BikeSpeed obj = new BikeSpeed();
        obj.run();
    }
}
