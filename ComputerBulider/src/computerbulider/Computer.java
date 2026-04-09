
class Computer 
{
    // Configuration fields
    private String processor;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String operatingSystem;

    // Private constructor to enforce Builder usage
    private Computer(Builder builder)
    {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.operatingSystem = builder.operatingSystem;
    }

    // Show details method
    public void showDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("-----------------------------------");
    }

    // Builder Class
    public static class Builder {
        private String processor;
        private String ram;
        private String storage;
        private String graphicsCard;
        private String operatingSystem;

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

