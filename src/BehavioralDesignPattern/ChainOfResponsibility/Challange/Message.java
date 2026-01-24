package BehavioralDesignPattern.ChainOfResponsibility.Challange;

enum MessagePriority {
    Normal,
    High
}

class Message {
    public String text;
    public MessagePriority priority;

    public Message(String msg, MessagePriority p){
        text = msg;
        priority = p;
    }
}
