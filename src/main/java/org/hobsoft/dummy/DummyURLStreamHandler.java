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

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/**
 * Dummy {@code URLStreamHandler} for dummy URLs.
 */
final class DummyURLStreamHandler extends URLStreamHandler
{
	// ----------------------------------------------------------------------------------------------------------------
	// constants
	// ----------------------------------------------------------------------------------------------------------------

	public static final DummyURLStreamHandler INSTANCE = new DummyURLStreamHandler();

	// ----------------------------------------------------------------------------------------------------------------
	// constructors
	// ----------------------------------------------------------------------------------------------------------------

	private DummyURLStreamHandler()
	{
		// singleton
	}
	
	// ----------------------------------------------------------------------------------------------------------------
	// URLStreamHandler methods
	// ----------------------------------------------------------------------------------------------------------------

	@Override
	protected URLConnection openConnection(URL url) throws IOException
	{
		throw new IOException("Cannot open connection to dummy URL");
	}
}
