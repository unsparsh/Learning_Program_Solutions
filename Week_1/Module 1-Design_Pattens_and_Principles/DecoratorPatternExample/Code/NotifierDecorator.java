package Code;

public abstract class NotifierDecorator implements Notifier{
    protected Notifier wrappNotifier;
        public NotifierDecorator(Notifier notifier) {
        this.wrappNotifier = notifier;
    }    

    public void send(String message){
        if(wrappNotifier != null) {
            wrappNotifier.send(message);
        }
    }
}
