import bridges.connect.Bridges;
import bridges.connect.Bridges;
import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @author Austin Minotto
 */
public class DLLVisualizer
{
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        final String API_KEY = "668519260933";
        final String USER_ID = "minotto";
        
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);

        Track song1 = new Track("Bellbottoms", "The Jon Spencer Blues Explosion");
        Track song2 = new Track("Harlem Shuffle", "Bob & Earl");
        Track song3 = new Track("Easy", "Commodores");
        Track song4 = new Track("Good Vibrations", "The Beach Boys");
        
        DLelement head = new DLelement(song1.toString(), song1);
        
        DLelement mid1 = new DLelement(song2.toString(), song2);
        DLelement mid2 = new DLelement(song3.toString(), song3);
        DLelement tail = new DLelement(song4.toString(), song4);
        
        head.setNext(mid1);
        mid1.setNext(mid2);
        mid2.setNext(tail);
        tail.setNext(null);
        tail.setPrev(mid2);
        mid2.setPrev(mid1);
        mid1.setPrev(head);
        head.setPrev(null);
        
        //Prepare for visualization
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();
    }
}
