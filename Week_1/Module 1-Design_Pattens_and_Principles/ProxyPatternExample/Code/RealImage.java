public class RealImage implements Image{
    private String file_name;
    public RealImage(String file_name){
        this.file_name = file_name;
        loadfromserver();
    }

    public void loadfromserver(){
        System.out.println("Loading "+file_name+" from Server");
    }
    
    public void display(){
        System.out.println("Displaying "+file_name+" image");
    }
}
