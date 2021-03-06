/*
 * generated by Fujaba - CodeGen2
 */
package FileSystem;
import java.util.Iterator;

import de.uni_kassel.features.annotation.util.Property; // requires Fujaba5/libs/features.jar in classpath
import de.uni_kassel.features.ReferenceHandler; // requires Fujaba5/libs/features.jar in classpath
import de.upb.tools.sdm.*; // requires Fujaba5/libs/RuntimeTools.jar in classpath


public class CountFileVisitor extends Visitor
{

   private Directory lastDirector = null;

   public static final String PROPERTY_FILE_COUNT = "fileCount";

   @Property( name = PROPERTY_FILE_COUNT, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private int fileCount;

   @Property( name = PROPERTY_FILE_COUNT )
   public void setFileCount (int value)
   {
      this.fileCount = value;
   }

   public CountFileVisitor withFileCount (int value)
   {
      setFileCount (value);
      return this;
   }

   @Property( name = PROPERTY_FILE_COUNT )
   public int getFileCount ()
   {
      return this.fileCount;
   }

   public int getFileCount (String ext)
   {
	   if(lastDirector==null) return 0;
	   int result = 0;
	   Iterator<? extends AbstractFile> I= lastDirector.iteratorOfAbstractFile();
	   while(I.hasNext()){
	    	  String s = I.next().getName();
	    	  if(s!=null&&s.endsWith("."+ext))result++;
	   }
	   return result;
   }
   
   public void visit (Directory directory )
   {
	  this.fileCount=0;
	   lastDirector = directory;
	  Iterator<? extends AbstractFile> I= directory.iteratorOfAbstractFile();
      while(I.hasNext()){
    	  visit((RegularFile)I.next());
      }
	  return ;
   }

   public void visit (RegularFile file )
   {
      boolean fujaba__Success = false;

      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 

         // assign attribute this
         this.setFileCount (fileCount+1);
         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }

      return ;
   }

}


