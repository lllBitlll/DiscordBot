import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Locale;

public class Commands extends ListenerAdapter {
    char character[] = {'!','#','$'};// bugs out on 3ed character on commands
    String command = "";
    String prefix = "";

    public void onMessageReceived(MessageReceivedEvent event) {
        //Checks so Bot dosent read own messages and spam
        //Check if message isnt a bot
        if (!event.getAuthor().equals(event.getJDA().getSelfUser()) && !event.getAuthor().isBot()) {
            String message = event.getMessage().toString().split("\\(")[0].split(":")[2];
         //   message = message.split("\\(")[0];

            System.out.println(message);

            for (int x = 0; x < character.length; x++){
                if (message.startsWith(String.valueOf(character[x]))) {
                    prefix = String.valueOf(character[x]);
                    //System.out.println(prefix);
                }
        }
            //if
            if(message.startsWith(prefix)) {
                try {
                    command = message.split(prefix)[1];
                 } catch (Exception e){
                    //event.getChannel().sendMessage("Not a Command").queue();
                    e.printStackTrace();
                }
                if (command.equals("ping")) {
                    event.getChannel().sendMessage("pong").queue();
                }

            }
            }
        }
    }

