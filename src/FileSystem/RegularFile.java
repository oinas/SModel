/*
 * generated by Fujaba - CodeGen2
 */
package FileSystem;
import java.io.File;
import de.upb.tools.sdm.*; // requires Fujaba5/libs/RuntimeTools.jar in classpath
import de.uni_kassel.features.annotation.util.Property; // requires Fujaba5/libs/features.jar in classpath
import de.uni_kassel.features.ReferenceHandler; // requires Fujaba5/libs/features.jar in classpath

public class RegularFile extends AbstractFile
{



   public  RegularFile (String name )
   {
      boolean fujaba__Success = false;
      File jFile = null;
      
      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 
         
         // create object jFile
         jFile = new java.io.File(name);

         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }
      
      if ( !( fujaba__Success ) )
      {
         return ;

      }
      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 

         // check object jFile is really bound
         JavaSDM.ensure ( jFile != null );
         // create link file from this to jFile
         this.setFile (jFile);

         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }

      if ( !( fujaba__Success ) )
      {
         return ;

      }
      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 
         // check object jFile is really bound
         JavaSDM.ensure ( jFile != null );
         // check link file from this to jFile
         JavaSDM.ensure (jFile.equals (this.getFile ()));

         // assign attribute this
         this.setName (jFile.getAbsolutePath());
         // assign attribute this
         this.setSize (jFile.length());
         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }
      return ;
   }

   public void accept (Visitor visitor )
   {
   }

   public long getFileSize ()
   {
      boolean fujaba__Success = false;
      File jFile = null;

      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 

         // search to-one link file from this to jFile
         jFile = this.getFile ();

         // check object jFile is really bound
         JavaSDM.ensure ( jFile != null );


         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }
      //System.out.println(jFile.length());
      return jFile.length();
   }

   public static final String PROPERTY_NAME = "name";

   @Property( name = PROPERTY_NAME, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private String name;

   @Property( name = PROPERTY_NAME )
   private void setName (String value)
   {
      this.name = value;
   }

   private RegularFile withName (String value)
   {
      setName (value);
      return this;
   }

   @Property( name = PROPERTY_NAME )
   public String getName () /*?*/
   {
      return this.name;
   }

   public static final String PROPERTY_SIZE = "size";

   @Property( name = PROPERTY_SIZE, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private long size;

   @Property( name = PROPERTY_SIZE )
   private void setSize (long value)
   {
      this.size = value;
   }

   private RegularFile withSize (long value)
   {
      setSize (value);
      return this;
   }

   @Property( name = PROPERTY_SIZE )
   public long getSize ()
   {
      return this.size;
   }

}


