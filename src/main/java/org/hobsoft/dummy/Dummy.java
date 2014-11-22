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

/**
 * Dummy argument factory for unit testing.
 * 
 * @see <a href="http://www.martinfowler.com/bliki/TestDouble.html">TestDouble</a>
 */
public final class Dummy
{
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

	public static byte someByte()
	{
		return 100;
	}

	public static short someShort()
	{
		return 100;
	}
	
	public static int someInt()
	{
		return 100;
	}

	public static long someLong()
	{
		return 100;
	}

	public static float someFloat()
	{
		return 100;
	}

	public static double someDouble()
	{
		return 100;
	}

	public static boolean someBoolean()
	{
		return true;
	}

	public static char someChar()
	{
		return '_';
	}
	
	public static String someString()
	{
		return "_";
	}
}
