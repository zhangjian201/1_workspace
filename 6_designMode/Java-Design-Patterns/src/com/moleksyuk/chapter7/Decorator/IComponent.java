/**
 * 
 */
package com.moleksyuk.chapter7.Decorator;

/**
 * Based on: "Patterns in Java", Mark Grand.
 * 
 * Date: Aug 11, 2011
 * 
 * @author moleksyuk
 */
public interface IComponent {

	public void requestOpent(String key);

	public void close();
}
