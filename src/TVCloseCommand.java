public class TVCloseCommand implements AbstractCommand {
    private TV tv;
    public TVCloseCommand(){
        tv=new TV();
    }
    public void execute(){
        tv.close();
    }
}
