package maximsblog.blogspot.com.jlatexmath.cjk;

import maximsblog.blogspot.com.jlatexmath.core.AlphabetRegistration;


public class HalfwidthAndFullwidthFormsRegistration implements AlphabetRegistration {
    public HalfwidthAndFullwidthFormsRegistration() {
    }

    @Override
    public Character.UnicodeBlock[] getUnicodeBlock() {
        return new Character.UnicodeBlock[] { Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS };
    }

    @Override
    public Object getPackage() {
        return this;
    }

    @Override
    public String getTeXFontFileName() {
        return "fonts/language_HalfwidthAndFullwidthForms.xml";
    }
}
