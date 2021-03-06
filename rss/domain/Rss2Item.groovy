/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Copyright @2010 bemoko 
 */
 
package rss.domain
import java.text.SimpleDateFormat

class Rss2Item{
    private def DATE_FORMAT = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z")

    String title
    String link
    String description
    String author
    List categories=[]
    String comments
    def enclosure =[:] //map of url, length, type
    String guid
    String pubDate
    
    Date getPubDate() { 
       DATE_FORMAT.parse(pubDate)
    }
    
    def source=[:] //map of url, text
}