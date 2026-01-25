package BehavioralDesignPattern.Memento.Implementation;

public class FileWriterUtil {
    private String filename;
    private StringBuilder content;

    public FileWriterUtil(String file) {
        this.filename = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    // creates the memento
    public Memento save() {
        return new Memento(this.filename, this.content);
    }

    // restore into its earlier state
    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.filename = memento.filename;
        this.content = memento.content;
    }

    private class Memento {
        private String filename;
        private StringBuilder content;

        public Memento(String file, StringBuilder content) {
            this.filename = file;
            // notice the deep copy so that Memento and FileWriterUtil
            // content variables don't refer to same object
            this.content = new StringBuilder(content);
        }
    }
}
