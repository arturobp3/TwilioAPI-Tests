
// Install the Java helper library from twilio.com/docs/libraries/java
import java.net.URI;
import java.net.URISyntaxException;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;
import com.twilio.rest.api.v2010.account.Call.Status;
import com.twilio.rest.api.v2010.account.ValidationRequest;
import com.twilio.rest.api.v2010.account.Message;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "XXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "XXXXXXXXXXXXXXXXXXXXX";

    public static void main(String[] args) throws URISyntaxException {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String from = "XXXXXXXXXXXX";
        String to = "XXXXXXXXXXX";
        
        
        /*Message message = Message.creator(
                new com.twilio.type.PhoneNumber(to),
                new com.twilio.type.PhoneNumber(from),
                "Hi there!")
            .create();

        System.out.println(message.getSid());*/
  

        Call call = Call.creator(new PhoneNumber(to), new PhoneNumber(from),
                new com.twilio.type.Twiml(
                		"<Response>"
                		+ "<Say voice=\"man\" language=\"es-ES\">"
                		+ "Enter your message here"
                		+ "</Say></Response>"
                )).create();


        System.out.println(call.getStatus());
        
    }
}