/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RabloExceptions;

/**
 *
 * @author Chong
 */
public class AtomException extends Exception {
  public AtomException() { super(); }
  public AtomException(String message) { super(message); }
  public AtomException(String message, Throwable cause) { super(message, cause); }
  public AtomException(Throwable cause) { super(cause); }
}
