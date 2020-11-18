package maximsblog.blogspot.com.jlatexmath.cjk;

import maximsblog.blogspot.com.jlatexmath.core.AlphabetRegistration;

public class HiraganaRegistration implements AlphabetRegistration {
    public HiraganaRegistration() {
    }

    @Override
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return new Character.UnicodeBlock[] { Character.UnicodeBlock.HIRAGANA };
    }

    @Override
    public Object getPackage() {
        return this;
    }

    @Override
    public String getTeXFontFileName() {
        return "fonts/language_hiragana.xml";
    }
}
