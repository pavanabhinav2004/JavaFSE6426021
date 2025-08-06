public class Main {
    public static void main(String[] args) {
        Computer highEnd = new Computer.Builder()
                .setCpu("i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .build();

        Computer budget = new Computer.Builder()
                .setCpu("i3")
                .setRam("8GB")
                .build();

        highEnd.specs();
        budget.specs();
    }
}
