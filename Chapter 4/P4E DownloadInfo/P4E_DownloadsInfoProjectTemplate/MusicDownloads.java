import java.util.List;
import java.util.ArrayList;

public class MusicDownloads
   {
   private List<DownloadInfo> downloadList;
   
   public MusicDownloads()
      {
      downloadList = new ArrayList<DownloadInfo>();
      downloadList.add( new DownloadInfo( "Hey Jude", 5 ) );
      downloadList.add( new DownloadInfo( "Soul Sister", 3 ) );
      downloadList.add( new DownloadInfo( "Aqualung", 10 ) );
      } // end constructor
      
   public DownloadInfo getDownloadInfo( String title )
      {
      for(DownloadInfo download : downloadList)
      {
          if(download.getTitle()== title)
          {
              return download;
          }
      }
      return null;
      } // end method getDownloadInfo
      
   public void updateDownloads( List<String> titles )
      {
          for( String title : titles)
          {
              if( getDownloadInfo( title ) != null)
              {
                  getDownloadInfo(title).incrementTimesDownloaded();
              }
              else
              {
                  downloadList.add( new DownloadInfo( title, 1));
              }
          }

      } // end method updateDownloads
      
   public String toString()
      {
      String musicDownloads = new String( "" );
      
      for( DownloadInfo item : downloadList )
         {
         musicDownloads = musicDownloads + item;    
         } // end for each
         
      return musicDownloads;
      } // end toString
   } // end class MusicDownloads