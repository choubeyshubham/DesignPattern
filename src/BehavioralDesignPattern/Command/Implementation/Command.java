package BehavioralDesignPattern.Command.Implementation;

import java.io.File;

interface Command {
    void execute();

    // could add an undo or redo commands
}

class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    // store previous stat for undo, String someState

    public OpenFileCommand(FileSystemReceiver fs) {
        fileSystem = fs;
    }

    @Override
    public void execute() {
        // save previous state, in case undo called  someState = …….;
        this.fileSystem.openFile();
    }
}

class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}

class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}


