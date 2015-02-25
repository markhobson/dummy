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

import java.net.URL;
import java.util.Date;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.Assert.assertThat;

/**
 * Tests {@code Dummy}.
 */
public class DummyTest
{
	// ----------------------------------------------------------------------------------------------------------------
	// tests
	// ----------------------------------------------------------------------------------------------------------------
	
	@Test
	public void someByteReturnsByte()
	{
		assertThat(Dummy.someByte(), isA(Byte.class));
	}
	
	@Test
	public void someShortReturnsShort()
	{
		assertThat(Dummy.someShort(), isA(Short.class));
	}
	
	@Test
	public void someIntReturnsInt()
	{
		assertThat(Dummy.someInt(), isA(Integer.class));
	}
	
	@Test
	public void someNonNegativeIntReturnsNonNegativeInt()
	{
		assertThat(Dummy.someNonNegativeInt(), is(greaterThanOrEqualTo(0)));
	}
	
	@Test
	public void someLongReturnsLong()
	{
		assertThat(Dummy.someLong(), isA(Long.class));
	}
	
	@Test
	public void someFloatReturnsFloat()
	{
		assertThat(Dummy.someFloat(), isA(Float.class));
	}
	
	@Test
	public void someDoubleReturnsDouble()
	{
		assertThat(Dummy.someDouble(), isA(Double.class));
	}
	
	@Test
	public void someBooleanReturnsBoolean()
	{
		assertThat(Dummy.someBoolean(), isA(Boolean.class));
	}
	
	@Test
	public void someCharReturnsChar()
	{
		assertThat(Dummy.someChar(), isA(Character.class));
	}
	
	@Test
	public void someStringReturnsString()
	{
		assertThat(Dummy.someString(), isA(String.class));
	}
	
	@Test
	public void someDateReturnsDate()
	{
		assertThat(Dummy.someDate(), isA(Date.class));
	}
	
	@Test
	public void someUrlReturnsUrl()
	{
		assertThat(Dummy.someUrl(), isA(URL.class));
	}
}
