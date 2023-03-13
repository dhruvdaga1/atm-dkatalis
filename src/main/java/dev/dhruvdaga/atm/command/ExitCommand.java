package dev.dhruvdaga.atm.command;

import dev.dhruvdaga.atm.service.BankService;
import org.jetbrains.annotations.NotNull;


public class ExitCommand extends AbstractCommand {

    public ExitCommand(
            @NotNull CommandArguments commandArguments) {
        super(commandArguments);
    }

    @Override
    @NotNull
    public String execute(BankService service) {
        if (args.length != 0) {
            throw new IllegalArgumentException("Wrong argument count.\n Correct command format 'exit'");
        }
        return "ATM stopped.";
    }
}
