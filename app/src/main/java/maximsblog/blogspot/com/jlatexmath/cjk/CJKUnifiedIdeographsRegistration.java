package maximsblog.blogspot.com.jlatexmath.cjk;

import maximsblog.blogspot.com.jlatexmath.core.AlphabetRegistration;

public class CJKUnifiedIdeographsRegistration implements AlphabetRegistration {
    public CJKUnifiedIdeographsRegistration() {
    }

    @Override
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return new Character.UnicodeBlock[] { Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS };
    }

    @Override
    public Object getPackage() {
        return this;
    }

    @Override
    public String getTeXFontFileName() {
        return "fonts/language_CJKUnifiedIdeographs.xml";
    }
}
