/*
   Copyright 2014-2015 Sam Gleske - https://github.com/samrocketman/jervis

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   */
package net.gleske.jervis.exceptions

import net.gleske.jervis.exceptions.wikiPages

/**
  A type of <tt>{@link jervis.exceptions.GeneratorException}</tt> which is thrown when an unsupported language lifecycle generation is attempted.

  <h2>Sample usage</h2>
<pre><tt>import net.gleske.jervis.exceptions.UnsupportedLanguageException
throw new UnsupportedLanguageException('derpy')</tt></pre><br>
 */
class UnsupportedLanguageException extends GeneratorException {
    private static String wiki_page = wikiPages.supported_languages

    /**
      Throw an exception when an unsupported language lifecycle generation is attempted.

      @param message A simple message that will be prepended with <tt>'ERROR: Unsupported language in yaml -> language: ' + message</tt> as well as provide a link to a helpful wiki page, <tt>{@link jervis.exceptions.wikiPages#supported_languages}</tt>.
     */
    def UnsupportedLanguageException(String message) {
        super('\nERROR: Unsupported language in yaml -> language: ' + message + ['\n\nSee wiki page:', wiki_page,'\n'].join('\n'))
    }
}
