/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hobsoft.dummy;

import java.util.Date;
import java.util.Random;

/**
 * Dummy argument factory for unit testing.
 * 
 * @see <a href="http://www.martinfowler.com/bliki/TestDouble.html">TestDouble</a>
 */
public final class Dummy
{
	// ----------------------------------------------------------------------------------------------------------------
	// fields
	// ----------------------------------------------------------------------------------------------------------------

	private static final long SEED = 363308145677738844L;

	private static final Random RANDOM = new Random(SEED);
	
	private static final int MAX_STRING_LENGTH = 16;

	// ----------------------------------------------------------------------------------------------------------------
	// constructors
	// ----------------------------------------------------------------------------------------------------------------

	private Dummy()
	{
		throw new AssertionError();
	}

	// ----------------------------------------------------------------------------------------------------------------
	// public methods
	// ----------------------------------------------------------------------------------------------------------------

	/**
	 * Returns an arbitrary primitive byte.
	 * 
	 * @return the byte
	 */
	public static byte someByte()
	{
		return (byte) someInt();
	}

	/**
	 * Returns an arbitrary primitive short.
	 * 
	 * @return the short
	 */
	public static short someShort()
	{
		return (short) someInt();
	}
	
	/**
	 * Returns an arbitrary primitive integer.
	 * 
	 * @return the int
	 */
	public static int someInt()
	{
		return RANDOM.nextInt();
	}

	/**
	 * Returns an arbitrary primitive long.
	 * 
	 * @return the long
	 */
	public static long someLong()
	{
		return RANDOM.nextLong();
	}

	/**
	 * Returns an arbitrary primitive float.
	 * 
	 * @return the float
	 */
	public static float someFloat()
	{
		return RANDOM.nextFloat();
	}

	/**
	 * Returns an arbitrary primitive double.
	 * 
	 * @return the double
	 */
	public static double someDouble()
	{
		return RANDOM.nextDouble();
	}

	/**
	 * Returns an arbitrary primitive boolean.
	 * 
	 * @return the boolean
	 */
	public static boolean someBoolean()
	{
		return RANDOM.nextBoolean();
	}

	/**
	 * Returns an arbitrary primitive character.
	 * 
	 * @return the char
	 */
	public static char someChar()
	{
		return (char) someInt();
	}
	
	/**
	 * Returns an arbitrary string of arbitrary length, never empty.
	 * 
	 * @return the string
	 */
	public static String someString()
	{
		int length = RANDOM.nextInt(MAX_STRING_LENGTH) + 1;
		char[] chars = new char[length];
		
		for (int index = 0; index < length; index++)
		{
			chars[index] = someChar();
		}
		
		return String.valueOf(chars);
	}

	/**
	 * Returns an arbitrary date.
	 * 
	 * @return the date
	 */
	public static Date someDate()
	{
		return new Date(someLong());
	}
}
