import singleton.CLIrunner;

import java.io.IOException;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws IOException, SQLException {
        CLIrunner runner = CLIrunner.getInstance();
        runner.clirunner(args);
    }
}
