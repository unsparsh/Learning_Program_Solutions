public class Main {
    public static void main(String[] args){
        Computer myGamingPc = new Computer.Builder()
                .setRam("8GB")
                .setgpu("NVIDIA GTX 1650")
                .setProcessor("AMD Ryzen 5")
                .setSsd("512GB")
                .build();

        System.out.println("Gaming PC Configuration:");
        System.out.println("RAM: " + myGamingPc.getRam());
        System.out.println("GPU: " + myGamingPc.getGpu());
        System.out.println("Processor: " + myGamingPc.getProcessor());
        System.out.println("SSD: " + myGamingPc.getSsd());

        Computer myHomePc = new Computer.Builder()
                .setRam("4GB")
                .setgpu("NONE")
                .setProcessor("Intel i3")
                .setSsd("512GB")
                .build();
        System.out.println("\nHome PC Configuration:");
                System.out.println("RAM: " + myHomePc.getRam());
                System.out.println("GPU: " + myHomePc.getGpu());
                System.out.println("Processor: " + myHomePc.getProcessor());
                System.out.println("SSD: " + myHomePc.getSsd());    

    }
}
