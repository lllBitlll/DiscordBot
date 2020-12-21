import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class Main
{
    public static void main (String args []) throws LoginException {
        JDA jda = JDABuilder.createDefault("Nzg5OTM1NTcwNzg0MjIzMjY0.X95S1A.czzNje-lanMv18gT76LUPh1yBn0").build();
        jda.addEventListener(new Commands());
    }
}
