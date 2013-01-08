/*******************************************************************************
 * Copyright 2012 Geoscience Australia
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package au.gov.ga.earthsci.bookmark.part.preferences;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.extensions.Preference;

/**
 * Default implementation of the {@link IBookmarksPreferences} interface that
 * uses the Eclipse preferences mechanism.
 * 
 * @author James Navin (james.navin@ga.gov.au)
 */
public class BookmarksPreferences implements IBookmarksPreferences
{
	
	@Inject
	@Preference(nodePath=QUALIFIER_ID)
	private IEclipsePreferences preferenceStore;

	@Inject
	@Preference(nodePath=QUALIFIER_ID, value=DEFAULT_TRANSITION_DURATION)
	private long defaultTransitionDuration;
	
	@Override
	public long getDefaultTransitionDuration()
	{
		return defaultTransitionDuration;
	}
	
}