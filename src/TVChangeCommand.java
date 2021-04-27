public class TVChangeCommand implements AbstractCommand {
    private TV tv;

    public TVChangeCommand(){
        tv = new TV();
    }
    public void execute(){
        tv.change();
    }
}
