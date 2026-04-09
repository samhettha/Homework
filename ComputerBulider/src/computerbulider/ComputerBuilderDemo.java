
public class ComputerBuilderDemo
{

    public static void main(String[] args)
    {
        // Office Computer
        Computer officeComputer = new Computer.Builder()
                .setProcessor("Intel i3")
                .setRAM("8GB RAM")
                .setStorage("256GB SSD")
                .setGraphicsCard("Integrated Graphics")
                .setOperatingSystem("Windows 10")
                .build();

        // Gaming Computer
        Computer gamingComputer = new Computer.Builder()
                .setProcessor("Intel i7")
                .setRAM("16GB RAM")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3060")
                .setOperatingSystem("Windows 11")
                .build();

        // Developer Computer
        Computer developerComputer = new Computer.Builder()
                .setProcessor("Intel i5")
                .setRAM("16GB RAM")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated Graphics")
                .setOperatingSystem("Linux")
                .build();

        // Display details
        System.out.println("Office Computer:");
        officeComputer.showDetails();

        System.out.println("Gaming Computer:");
        gamingComputer.showDetails();

        System.out.println("Developer Computer:");
        developerComputer.showDetails();
    }
}
