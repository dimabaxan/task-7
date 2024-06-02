import java.util.HashMap;
import java.util.Map;



public class Calculator {private Map<String, Command> commands = new HashMap<>();

    public void addCommand(String operation, Command command) {
        commands.put(operation, command);
    }

    public double executeCommand(String operation, double a, double b) {
        Command command = commands.get(operation);
        if (command == null) {
            throw new IllegalArgumentException("Операция не поддерживается");
        }
        return command.execute(a, b);
    }
}

