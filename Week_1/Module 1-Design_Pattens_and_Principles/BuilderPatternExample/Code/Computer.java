public class Computer{
    //These are the components of a computer
    private String ram;
    private String gpu;
    private String processor;
    private String ssd;

    private Computer(Builder builder){
        this.ram = builder.ram;
        this.gpu = builder.gpu;
        this.processor = builder.processor;
        this.ssd = builder.ssd;
    }

    public static class Builder{
        private String ram;
        private String gpu;
        private String processor;
        private String ssd;

        public Builder setRam(String ram){
            this.ram = ram;
            return this;
        }

        public Builder setgpu(String gpu){
            this.gpu = gpu;
            return this;
        }

        public Builder setProcessor(String processor){
            this.processor = processor;
            return this;
        }

        public Builder setSsd(String ssd){
            this.ssd = ssd;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
    //Getters for the computer components
    //These methods allow access to the private fields of the Computer class
    public String getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    public String getProcessor() {
        return processor;
    }

    public String getSsd() {
        return ssd;
    }
}