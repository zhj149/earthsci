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
package au.gov.ga.earthsci.bookmark.part;

import au.gov.ga.earthsci.bookmark.IBookmarkPropertyApplicator;
import au.gov.ga.earthsci.bookmark.model.IBookmark;

/**
 * A controller interface for the bookmarks feature
 * 
 * @author James Navin (james.navin@ga.gov.au)
 */
public interface IBookmarksController
{

	/**
	 * Apply the given bookmark using appropriate {@link IBookmarkPropertyApplicator}s
	 * and user preferences.
	 * 
	 * @param bookmark The bookmark to apply
	 */
	void apply(IBookmark bookmark);

	/**
	 * Launch an editor to collect user edits to the provided bookmark.
	 * 
	 * @param bookmark The bookmark to edit
	 */
	void edit(IBookmark bookmark);
	
}