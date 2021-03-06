/*
 * generated by Fujaba - CodeGen2
 */
import de.upb.tools.sdm.*; // requires Fujaba5/libs/RuntimeTools.jar in classpath
import java.util.*;
import de.uni_kassel.features.annotation.util.Property; // requires Fujaba5/libs/features.jar in classpath
import de.uni_kassel.features.ReferenceHandler; // requires Fujaba5/libs/features.jar in classpath
import de.upb.tools.fca.*; // requires Fujaba5/libs/RuntimeTools.jar in classpath


public class Mancala
{



   public  Mancala ()
   {
      boolean fujaba__Success = false;
      Player player1 = null;
      Player player2 = null;
      Pit pit1 = null;
      Pit pit2 = null;
      Pit pit3 = null;
      Pit pit4 = null;
      Pit pit5 = null;
      Pit pit6 = null;
      Store store1 = null;
      Pit pit7 = null;
      Pit pit8 = null;
      Pit pit9 = null;
      Pit pit10 = null;
      Pit pit11 = null;
      Pit pit12 = null;
      Store store2 = null;
      Object _TmpObject = null;
      Seed seed1 = null;
      Seed seed3 = null;
      Seed seed2 = null;
      Seed seed4 = null;
      Iterator fujaba__IterPlayer1ToPit = null;
      Pit pit = null;
      Iterator fujaba__IterPlayer2ToPit = null;

      // // create gameboard
      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 

         // create object player1
         player1 = new Player ( );

         // create object player2
         player2 = new Player ( );

         // create object pit1
         pit1 = new Pit ( );

         // create object pit2
         pit2 = new Pit ( );

         // create object pit3
         pit3 = new Pit ( );

         // create object pit4
         pit4 = new Pit ( );

         // create object pit5
         pit5 = new Pit ( );

         // create object pit6
         pit6 = new Pit ( );

         // create object store1
         store1 = new Store ( );

         // create object pit7
         pit7 = new Pit ( );

         // create object pit8
         pit8 = new Pit ( );

         // create object pit9
         pit9 = new Pit ( );

         // create object pit10
         pit10 = new Pit ( );

         // create object pit11
         pit11 = new Pit ( );

         // create object pit12
         pit12 = new Pit ( );

         // create object store2
         store2 = new Store ( );

         // create link next player from player2 to player1
         player2.setPlayer (player1);

         // create link has store from store1 to player1
         store1.setPlayer (player1);

         // create link next player from player2 to player1
         player2.setPlayer (player1);

         // create link player from this to player1
         this.addToPlayer (player1);

         // create link has store from store2 to player2
         store2.setPlayer (player2);

         // create link player from this to player2
         this.addToPlayer (player2);

         // create link next from pit2 to pit1
         pit2.setPit (pit1);

         // create link next to from store2 to pit1
         store2.setPit (pit1);

         // create link has pits from player1 to pit1
         player1.addToPit (pit1);

         // create link next from pit3 to pit2
         pit3.setPit (pit2);

         // create link has pits from player1 to pit2
         player1.addToPit (pit2);

         // create link next from pit4 to pit3
         pit4.setPit (pit3);

         // create link has pits from player1 to pit3
         player1.addToPit (pit3);

         // create link next from pit5 to pit4
         pit5.setPit (pit4);

         // create link has pits from player1 to pit4
         player1.addToPit (pit4);

         // create link next from pit6 to pit5
         pit6.setPit (pit5);

         // create link has pits from player1 to pit5
         player1.addToPit (pit5);

         // create link next to from store1 to pit6
         store1.setPit (pit6);

         // create link has pits from player1 to pit6
         player1.addToPit (pit6);

         // create link next to from store1 to pit7
         store1.setPit (pit7);

         // create link next from pit8 to pit7
         pit8.setPit (pit7);

         // create link has pits from player2 to pit7
         player2.addToPit (pit7);

         // create link next from pit9 to pit8
         pit9.setPit (pit8);

         // create link has pits from player2 to pit8
         player2.addToPit (pit8);

         // create link next from pit10 to pit9
         pit10.setPit (pit9);

         // create link has pits from player2 to pit9
         player2.addToPit (pit9);

         // create link next from pit11 to pit10
         pit11.setPit (pit10);

         // create link has pits from player2 to pit10
         player2.addToPit (pit10);

         // create link next from pit12 to pit11
         pit12.setPit (pit11);

         // create link has pits from player2 to pit11
         player2.addToPit (pit11);

         // create link next to from store2 to pit12
         store2.setPit (pit12);

         // create link has pits from player2 to pit12
         player2.addToPit (pit12);

         // collabStat call
         player2.setName("player 2");
         // collabStat call
         player1.setName("player 1");
         // collabStat call
         player1.setTurn(true);
         // collabStat call
         player2.setTurn(false);
         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }

      // // give 3 seeds for every player pit
      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 

         // check object player1 is really bound
         JavaSDM.ensure ( player1 != null );
         // iterate to-many link has pits from player1 to pit
         fujaba__Success = false;
         fujaba__IterPlayer1ToPit = player1.iteratorOfPit ();

         while ( fujaba__IterPlayer1ToPit.hasNext () )
         {
            try
            {
               pit = (Pit) fujaba__IterPlayer1ToPit.next ();

               // check object pit is really bound
               JavaSDM.ensure ( pit != null );
               // story pattern successor
               try 
               {
                  fujaba__Success = false; 

                  // check object pit is really bound
                  JavaSDM.ensure ( pit != null );
                  // create object seed1
                  seed1 = new Seed ( );

                  // create object seed3
                  seed3 = new Seed ( );

                  // create object seed2
                  seed2 = new Seed ( );

                  // create object seed4
                  seed4 = new Seed ( );

                  // create link has seeds from pit to seed1
                  pit.addToSeed (seed1);

                  // create link has seeds from pit to seed2
                  pit.addToSeed (seed2);

                  // create link has seeds from pit to seed3
                  pit.addToSeed (seed3);

                  // create link has seeds from pit to seed4
                  pit.addToSeed (seed4);

                  fujaba__Success = true;
               }
               catch ( JavaSDMException fujaba__InternalException )
               {
                  fujaba__Success = false;
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

      // story pattern Successor of storypatternwiththis
      try 
      {
         fujaba__Success = false; 

         // check object player2 is really bound
         JavaSDM.ensure ( player2 != null );
         // iterate to-many link has pits from player2 to pit
         fujaba__Success = false;
         fujaba__IterPlayer2ToPit = player2.iteratorOfPit ();

         while ( fujaba__IterPlayer2ToPit.hasNext () )
         {
            try
            {
               pit = (Pit) fujaba__IterPlayer2ToPit.next ();

               // check object pit is really bound
               JavaSDM.ensure ( pit != null );
               // story pattern Successor of successor
               try 
               {
                  fujaba__Success = false; 

                  // check object pit is really bound
                  JavaSDM.ensure ( pit != null );
                  // create object seed1
                  seed1 = new Seed ( );

                  // create object seed3
                  seed3 = new Seed ( );

                  // create object seed2
                  seed2 = new Seed ( );

                  // create object seed4
                  seed4 = new Seed ( );

                  // create link has seeds from pit to seed1
                  pit.addToSeed (seed1);

                  // create link has seeds from pit to seed2
                  pit.addToSeed (seed2);

                  // create link has seeds from pit to seed3
                  pit.addToSeed (seed3);

                  // create link has seeds from pit to seed4
                  pit.addToSeed (seed4);

                  fujaba__Success = true;
               }
               catch ( JavaSDMException fujaba__InternalException )
               {
                  fujaba__Success = false;
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

   public static final String PROPERTY__MANCALA = "_mancala";

   @Property( name = PROPERTY__MANCALA, kind = ReferenceHandler.ReferenceKind.ATTRIBUTE )
   private Mancala _mancala;

   @Property( name = PROPERTY__MANCALA )
   private void set_mancala (Mancala value)
   {
      this._mancala = value;
   }

   private Mancala with_mancala (Mancala value)
   {
      set_mancala (value);
      return this;
   }

   @Property( name = PROPERTY__MANCALA )
   private Mancala get_mancala ()
   {
      return this._mancala;
   }

   public Player checkWin ()
   {
      boolean fujaba__Success = false;
      Iterator fujaba__IterThisToPlayer2 = null;
      Player player2 = null;
      Iterator fujaba__IterThisToPlayer1 = null;
      Player player1 = null;

      // // check which player wins the game and return Player
      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 

         // iterate to-many link player from this to player1
         fujaba__Success = false;
         fujaba__IterThisToPlayer1 = this.iteratorOfPlayer ();

         while ( !(fujaba__Success) && fujaba__IterThisToPlayer1.hasNext () )
         {
            try
            {
               player1 = (Player) fujaba__IterThisToPlayer1.next ();

               // check object player1 is really bound
               JavaSDM.ensure ( player1 != null );
               // iterate to-many link player from this to player2
               fujaba__Success = false;
               fujaba__IterThisToPlayer2 = this.iteratorOfPlayer ();

               while ( !(fujaba__Success) && fujaba__IterThisToPlayer2.hasNext () )
               {
                  try
                  {
                     player2 = (Player) fujaba__IterThisToPlayer2.next ();

                     // check object player2 is really bound
                     JavaSDM.ensure ( player2 != null );
                     // check isomorphic binding between objects player2 and player1
                     JavaSDM.ensure ( !player2.equals (player1) );


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
         }
         JavaSDM.ensure (fujaba__Success);
         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }

      if ( !( player1.checkGameEnd() == true || player2.checkGameEnd() == true ) )
      {
         return null;

      }
      if ( !( player1.countSeeds() > player2.countSeeds() ) )
      {
         return player2;

      }
      return player1;
   }

   public Mancala getInstance ()
   {
      boolean fujaba__Success = false;

      return this._mancala;
   }

   public Player getPlayer (int number )
   {
      boolean fujaba__Success = false;
      Player player2 = null;
      Iterator fujaba__IterThisToPlayer1 = null;
      Player player1 = null;

      // // get player by number
      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 

         // iterate to-many link player from this to player1
         fujaba__Success = false;
         fujaba__IterThisToPlayer1 = this.iteratorOfPlayer ();

         while ( !(fujaba__Success) && fujaba__IterThisToPlayer1.hasNext () )
         {
            try
            {
               player1 = (Player) fujaba__IterThisToPlayer1.next ();

               // check object player1 is really bound
               JavaSDM.ensure ( player1 != null );
               // search to-one link next player from player1 to player2
               player2 = player1.getPlayer ();

               // check object player2 is really bound
               JavaSDM.ensure ( player2 != null );

               // check isomorphic binding between objects player2 and player1
               JavaSDM.ensure ( !player2.equals (player1) );



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

      if ( !( number == 0 ) )
      {
         return player2;

      }
      return player1;
   }

   public Player getPlayerWithTurn ()
   {
      boolean fujaba__Success = false;
      Iterator fujaba__IterThisToPlayer2 = null;
      Player player2 = null;
      Iterator fujaba__IterThisToPlayer1 = null;
      Player player1 = null;

      // // return player with a turn
      // story pattern storypatternwiththis
      try 
      {
         fujaba__Success = false; 

         // iterate to-many link player from this to player1
         fujaba__Success = false;
         fujaba__IterThisToPlayer1 = this.iteratorOfPlayer ();

         while ( !(fujaba__Success) && fujaba__IterThisToPlayer1.hasNext () )
         {
            try
            {
               player1 = (Player) fujaba__IterThisToPlayer1.next ();

               // check object player1 is really bound
               JavaSDM.ensure ( player1 != null );
               // iterate to-many link player from this to player2
               fujaba__Success = false;
               fujaba__IterThisToPlayer2 = this.iteratorOfPlayer ();

               while ( !(fujaba__Success) && fujaba__IterThisToPlayer2.hasNext () )
               {
                  try
                  {
                     player2 = (Player) fujaba__IterThisToPlayer2.next ();

                     // check object player2 is really bound
                     JavaSDM.ensure ( player2 != null );
                     // check isomorphic binding between objects player2 and player1
                     JavaSDM.ensure ( !player2.equals (player1) );


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
         }
         JavaSDM.ensure (fujaba__Success);
         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }

      if ( !( player1.getTurn() == true ) )
      {
         return player2;

      }
      return player1;
   }

   /**
    * <pre>
    *           0..1     player     n
    * Mancala ------------------------- Player
    *           mancala               player
    * </pre>
    */
   public static final String PROPERTY_PLAYER = "player";

   @Property( name = PROPERTY_PLAYER, partner = Player.PROPERTY_MANCALA, kind = ReferenceHandler.ReferenceKind.TO_MANY,
         adornment = ReferenceHandler.Adornment.NONE)
   private FHashSet<Player> player;

   @Property( name = PROPERTY_PLAYER )
   public Set<? extends Player> getPlayer()
   {
      return ((this.player == null)
              ? Collections.EMPTY_SET
              : Collections.unmodifiableSet(this.player));
   }

   @Property( name = PROPERTY_PLAYER )
   public boolean addToPlayer (Player value)
   {
      boolean changed = false;

      if (value != null)
      {
         if (this.player == null)
         {
            this.player = new FHashSet<Player> ();

         }
      
         changed = this.player.add (value);
         if (changed)
         {
            value.setMancala (this);
         }
      
      }
      return changed;
   }

   @Property( name = PROPERTY_PLAYER )
   public Mancala withPlayer (Player value)
   {
      addToPlayer (value);
      return this;
   }

   public Mancala withoutPlayer (Player value)
   {
      removeFromPlayer (value);
      return this;
   }


   public boolean removeFromPlayer (Player value)
   {
      boolean changed = false;

      if ((this.player != null) && (value != null))
      {
      
         changed = this.player.remove (value);
         if (changed)
         {
            value.setMancala (null);
         }
      
      }
      return changed;
   }

   @Property( name = PROPERTY_PLAYER )
   public void removeAllFromPlayer (){
   
      Player tmpValue;
      Iterator<? extends Player> iter = this.iteratorOfPlayer ();
      while (iter.hasNext ())
      {
         tmpValue = (Player) iter.next ();
         this.removeFromPlayer (tmpValue);
      }
   
   }

   @Property( name = PROPERTY_PLAYER )
   public boolean hasInPlayer (Player value)
   {
      return ((this.player != null) &&
              (value != null) &&
              this.player.contains (value));
   }

   @Property( name = PROPERTY_PLAYER )
   public Iterator<? extends Player> iteratorOfPlayer ()
   {
      return ((this.player == null)
              ? FEmptyIterator.<Player>get ()
              : this.player.iterator ());
   }

   @Property( name = PROPERTY_PLAYER )
   public int sizeOfPlayer ()
   {
      return ((this.player == null)
              ? 0
              : this.player.size ());
   }

   public void removeYou()
   {
      this.removeAllFromPlayer ();
   }
}


