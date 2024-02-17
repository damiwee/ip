package bossman.task;
public class Deadline extends Todo {
    private final String BY;
    public Deadline(String task, boolean isMark, String by) {
        super(task, isMark);
        this.BY = by;
        this.typeSymbol = "[D]";
    }

    @Override
    public void printTask() {
        super.printTask();
        System.out.print("(do by:" + BY + ")");
    }

    @Override
    public String formatForSave() {
        return "D" + "," + isMark + "," + DESCRIPTION + "," + BY;
    }
}
