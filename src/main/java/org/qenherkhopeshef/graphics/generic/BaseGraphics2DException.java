/*
 * Created on 4 juil. 2005 by rosmord
 *
 * TODO document the file BaseGraphics2DException.java
 * 
 * This file is distributed along the GNU Lesser Public License (LGPL)
 * author : rosmord
 */
package org.qenherkhopeshef.graphics.generic;

/**
 * An error occuring while manipulating a BaseGraphics2D.
 * <p>Can encapsulate another exception, which 
 * will probably be really a IOException. 
 * @author rosmord
 */
public class BaseGraphics2DException extends Exception {
    /** The wrapped exception, or null if none. */
    private Exception baseException=null;
    
    /**
     * Builds an exception wrapping another one.
     *
     * @param baseException the underlying exception (typically an IOException).
     */
    public BaseGraphics2DException(Exception baseException) {
        super(baseException.getMessage());
        this.baseException= baseException;
    }

    /**
     * Builds an exception with an error message.
     *
     * @param message the error message.
     */
    public BaseGraphics2DException(String message) {
        super(message);
    }

    /**
     * Builds an exception with an error message, wrapping another exception.
     *
     * @param message the error message.
     * @param baseException the underlying exception (typically an IOException).
     */
    public BaseGraphics2DException(String message, Exception baseException) {
        super(message);
        this.baseException= baseException; 
    }
    
    /**
     * Return the exception that created the present one, if any.
     * <p> Can return null.
     * @return Returns the baseException.
     */
    public Exception getBaseException() {
        return baseException;
    }
}
