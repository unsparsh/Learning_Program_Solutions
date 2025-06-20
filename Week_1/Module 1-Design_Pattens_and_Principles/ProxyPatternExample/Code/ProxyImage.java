public class ProxyImage implements Image{
    private String file_name;
    private RealImage realimage;

    public ProxyImage(String file_name){
        this.file_name = file_name;
    }

    public void display(){
        if(realimage == null){
            realimage = new RealImage(file_name);
        }
        realimage.display();
    }
}
