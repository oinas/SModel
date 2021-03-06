/*
 * generated by Fujaba - CodeGen2
 */
package FileSystem;
import java.io.File;
import de.upb.tools.sdm.*; // requires Fujaba5/libs/RuntimeTools.jar in classpath
import java.util.*;
import de.uni_kassel.features.annotation.util.Property; // requires Fujaba5/libs/features.jar in classpath
import de.uni_kassel.features.ReferenceHandler; // requires Fujaba5/libs/features.jar in classpath
import de.upb.tools.fca.*; // requires Fujaba5/libs/RuntimeTools.jar in classpath


public class Directory extends AbstractFile
{

   public  Directory (String name )
   {
      boolean fujaba__Success = false;
      File jFile = null;
      ArrayList<String> fileArray = null;
      Directory newDir = null;
      RegularFile newFile = null;
      Iterator fujaba__IterFileArrayToF = null;
      File f = null;

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

      if ( fujaba__Success )
      {
         // story pattern successor
         try 
         {
            fujaba__Success = false; 

            // check object jFile is really bound
            JavaSDM.ensure ( jFile != null );
            // create object fileArray
            fileArray = new java.util.ArrayList(java.util.Arrays.asList(jFile.list()));
            
            fujaba__Success = true;
         }
         catch ( JavaSDMException fujaba__InternalException )
         {
            fujaba__Success = false;
         }

         if ( fujaba__Success )
         {
            // story pattern successor
            try 
            {
               fujaba__Success = false; 

               // check object fileArray is really bound
               JavaSDM.ensure ( fileArray != null );
               // iterate to-many link iterator from fileArray to f
               fujaba__Success = false;
               fujaba__IterFileArrayToF = fileArray.iterator ();

               while ( fujaba__IterFileArrayToF.hasNext () )
               {
                  try
                  {
                     // (File)fujaba__IterFileArrayToF.next ());
                	 f = new java.io.File( fujaba__IterFileArrayToF.next().toString());
                	 	
                     // check object f is really bound
                     JavaSDM.ensure ( f != null );
                     if ( f.isDirectory() )
                     {
                        // story pattern storypatternwiththis
                        try 
                        {
                           fujaba__Success = false; 

                           // create object newDir
                           newDir = new Directory(f.getAbsolutePath());

                           // create link has from newDir to this
                           newDir.setDirectory (this);

                           fujaba__Success = true;
                        }
                        catch ( JavaSDMException fujaba__InternalException )
                        {
                           fujaba__Success = false;
                        }


                     }
                     else
                     {
                        // story pattern storypatternwiththis
                        try 
                        {
                           fujaba__Success = false; 

                           // create object newFile
                           newFile = new RegularFile(f.getAbsolutePath());

                           // create link has from newFile to this
                           newFile.setDirectory (this);

                           fujaba__Success = true;
                        }
                        catch ( JavaSDMException fujaba__InternalException )
                        {
                           fujaba__Success = false;
                        }


                     }

                     fujaba__Success = true;
                  }
                  catch ( JavaSDMException fujaba__InternalException )
                  {
                     fujaba__Success = false;
                  }
               }
               JavaSDM.ensure (fujaba__Success);
               fujaba__Success = true;
            }
            catch ( JavaSDMException fujaba__InternalException )
            {
               fujaba__Success = false;
            }

            return ;

         }

      }
      return ;
   }

   /**
    * <pre>
    *           1     has     0..n
    * Directory ------------------------- AbstractFile
    *           directory               abstractFile
    * </pre>
    */
   public static final String PROPERTY_ABSTRACT_FILE = "abstractFile";

   @Property( name = PROPERTY_ABSTRACT_FILE, partner = AbstractFile.PROPERTY_DIRECTORY, kind = ReferenceHandler.ReferenceKind.TO_MANY,
         adornment = ReferenceHandler.Adornment.COMPOSITION)
   private FHashSet<AbstractFile> abstractFile;

   @Property( name = PROPERTY_ABSTRACT_FILE )
   public Set<? extends AbstractFile> getAbstractFile()
   {
      return ((this.abstractFile == null)
              ? Collections.EMPTY_SET
              : Collections.unmodifiableSet(this.abstractFile));
   }

   @Property( name = PROPERTY_ABSTRACT_FILE )
   public boolean addToAbstractFile (AbstractFile value)
   {
      boolean changed = false;

      if (value != null)
      {
         if (this.abstractFile == null)
         {
            this.abstractFile = new FHashSet<AbstractFile> ();

         }
      
         changed = this.abstractFile.add (value);
         if (changed)
         {
            value.setDirectory (this);
         }
      
      }
      return changed;
   }

   @Property( name = PROPERTY_ABSTRACT_FILE )
   public Directory withAbstractFile (AbstractFile value)
   {
      addToAbstractFile (value);
      return this;
   }

   public Directory withoutAbstractFile (AbstractFile value)
   {
      removeFromAbstractFile (value);
      return this;
   }


   public boolean removeFromAbstractFile (AbstractFile value)
   {
      boolean changed = false;

      if ((this.abstractFile != null) && (value != null))
      {
      
         changed = this.abstractFile.remove (value);
         if (changed)
         {
            value.setDirectory (null);
         }
      
      }
      return changed;
   }

   @Property( name = PROPERTY_ABSTRACT_FILE )
   public void removeAllFromAbstractFile (){
   
      AbstractFile tmpValue;
      Iterator<? extends AbstractFile> iter = this.iteratorOfAbstractFile ();
      while (iter.hasNext ())
      {
         tmpValue = (AbstractFile) iter.next ();
         this.removeFromAbstractFile (tmpValue);
      }
   
   }

   @Property( name = PROPERTY_ABSTRACT_FILE )
   public boolean hasInAbstractFile (AbstractFile value)
   {
      return ((this.abstractFile != null) &&
              (value != null) &&
              this.abstractFile.contains (value));
   }

   @Property( name = PROPERTY_ABSTRACT_FILE )
   public Iterator<? extends AbstractFile> iteratorOfAbstractFile ()
   {
      return ((this.abstractFile == null)
              ? FEmptyIterator.<AbstractFile>get ()
              : this.abstractFile.iterator ());
   }

   @Property( name = PROPERTY_ABSTRACT_FILE )
   public int sizeOfAbstractFile ()
   {
      return ((this.abstractFile == null)
              ? 0
              : this.abstractFile.size ());
   }

   public void accept (Visitor visitor )
   {

      return ;
   }

   public int SummarizeFileSizes(){
	   int result = 0;
	   List<String> fileArray = java.util.Arrays.asList(this.getFile().list());
	   Iterator<String> iter = fileArray.iterator();
	   while (iter.hasNext ())
	   {
		   String path = this.getFile().getAbsolutePath()+"\\"+iter.next();
		   if(!(new java.io.File(path).isFile()))continue;
		   long k = (new java.io.File(path)).length();
		   result += k;
	   }
	   return result;
   }
   
   public void removeYou()
   {
      for (Iterator iterAbstractFile = this.iteratorOfAbstractFile (); iterAbstractFile.hasNext ();)
      {
         ((AbstractFile)iterAbstractFile.next ()).removeYou ();
      }
      super.removeYou ();
   }
}


