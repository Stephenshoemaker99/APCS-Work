
public class LogMessage
   {
   private String machineID;
   private String description;
   
   public LogMessage( String message )
      {
         machineID = message.substring(0, message.indexOf(":"));
         description = message.substring(message.indexOf(":"));
      } // end one-arg constructor
      
   public boolean containsWord( String keyword )
      {
        boolean output = false;
        if (description.substring(keyword.length()).compareTo(keyword) == 0)
        {
            output = true;
        }
        else
        {
            if(description.substring(description.indexOf(" " + keyword + " "), keyword.length() + 2).compareTo(" " + keyword + " ") == 0)
            {
                output = true;
            }
            else
            {
                if(description.substring(description.indexOf(keyword + " "), keyword.length() + 1).compareTo(keyword) == 0)
                {
                    output = true;
                }
            }
        }// can do and or statement because it will get an out of index error
        return output;    
      } // end method containsWord
      
   public String getMachineID()
      {
      return machineID;    
      } // end method getMachineID
      
   public String getDescription()
      {
      return description;    
      } // end method getDescription
       
       
   } // end class LogMessage