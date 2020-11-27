package maximsblog.blogspot.com.jlatexmath.cjk;

import maximsblog.blogspot.com.jlatexmath.core.AlphabetRegistration;

public class CJKSymbolsAndPunctuationRegistration implements AlphabetRegistration {
    public CJKSymbolsAndPunctuationRegistration() {
    }

    @Override
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return new Character.UnicodeBlock[] { Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION };
    }

    @Override
    public Object getPackage() {
        return this;
    }

    @Override
    public String getTeXFontFileName() {
        return "fonts/language_CJKSymbolsAndPunctuation.xml";
    }
}
