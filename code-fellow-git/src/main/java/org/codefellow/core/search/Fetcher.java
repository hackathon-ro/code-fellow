/**
 * Copyright 2012 CodeFellow
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.codefellow.core.search;

/**
 * Abstracts the reading of html page
 *
 * @author abserban
 * @since 2012
 */
public interface Fetcher {
    /**
     * Reade the content of page based on the specified keywords
     *
     * @param keyword used for search for a page
     * @return the body of a html page
     */
    public StringBuffer getPage(String keyword);

}
