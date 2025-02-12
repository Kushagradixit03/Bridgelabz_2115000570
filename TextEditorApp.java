class TextState {
    String content;
    TextState next, prev;

    public TextState(String content) {
        this.content = content;
        this.next = this.prev = null;
    }
}

class TextEditor {
    private TextState currentState;
    private int maxHistorySize;
    private int historySize;

    public TextEditor(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
        this.historySize = 0;
        this.currentState = null;
    }

    public void addState(String content) {
        TextState newState = new TextState(content);
        if (currentState != null) {
            if (historySize == maxHistorySize) {
                currentState = currentState.prev;
                currentState.next = null;
            } else {
                historySize++;
            }
            currentState.next = newState;
            newState.prev = currentState;
        }
        currentState = newState;
    }

    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo: " + currentState.content);
        } else {
            System.out.println("No more states to undo.");
        }
    }

    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo: " + currentState.content);
        } else {
            System.out.println("No more states to redo.");
        }
    }

    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current Text: " + currentState.content);
        } else {
            System.out.println("No content available.");
        }
    }
}

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(5);
        editor.addState("Hello");
        editor.addState("Hello, World!");
        editor.addState("Hello, World! How are you?");
        editor.addState("Hello, World! How are you? I am fine.");
        
        editor.displayCurrentState();

        editor.undo();
        editor.undo();

        editor.redo();
        editor.redo();
    }
}
