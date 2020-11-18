package maximsblog.blogspot.com.jlatexmath.cjk;

import maximsblog.blogspot.com.jlatexmath.core.AlphabetRegistration;

public class KatakanaRegistration implements AlphabetRegistration {
    public KatakanaRegistration() {
    }

    @Override
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return new Character.UnicodeBlock[] { Character.UnicodeBlock.KATAKANA };
    }

    @Override
    public Object getPackage() {
        return this;
    }

    @Override
    public String getTeXFontFileName() {
        return "fonts/language_katakana.xml";
    }
}
