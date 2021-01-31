package AVLTree;

import Exceptions.UnderflowException;

/**
 * @author jc
 * @date 2021/1/31
 */
public class Main {
    public static void main(String[] args) throws UnderflowException {
        AvlTree<Integer> t = new AvlTree<>( );
        final int SMALL = 40;
        final int NUMS = 1000000;  // must be even
        final int GAP  =   37;

        System.out.println( "Checking... (no more output means success)" );

        for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
        {
            //    System.out.println( "INSERT: " + i );
            t.insert( i );
            if( NUMS < SMALL ) {
                t.checkBalance( );
            }
        }

        for( int i = 1; i < NUMS; i+= 2 )
        {
            //   System.out.println( "REMOVE: " + i );
            t.remove( i );
            if( NUMS < SMALL ) {
                t.checkBalance( );
            }
        }
        if( NUMS < SMALL ) {
            t.printTree( );
        }
        if( t.findMin( ) != 2 || t.findMax( ) != NUMS - 2 ) {
            System.out.println( "FindMin or FindMax error!" );
        }

        for( int i = 2; i < NUMS; i+=2 ) {
            if( !t.contains( i ) ) {
                System.out.println( "Find error1!" );
            }
        }

        for( int i = 1; i < NUMS; i+=2 )
        {
            if( t.contains( i ) ) {
                System.out.println( "Find error2!" );
            }
        }
    }
}
