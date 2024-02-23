package bossman.task;

import bossman.ui.Ui;

public class Event extends Todo {
    private final String FROM;
    private final String TO;
    public Event(String task, boolean isMark, String from, String to) {
        super(task, isMark);
        this.FROM = from;
        this.TO = to;
        this.typeSymbol = "[E]";
    }

    @Override
    public void printTask() {
        super.printTask();
        Ui.printMessageNoSepSameLine(" (from:" + FROM + " to:" + TO + ")");
    }

    @Override
    public String formatForSave() {
        return "E" + "," + isMark + "," + DESCRIPTION + "," + FROM + "," + TO;
    }
}
