public class TVOpenCommand implements AbstractCommand{
    private TV tv;

    public TVOpenCommand(){
        tv=new TV();
    }

    public void execute(){
        tv.open();

    }
}
