package sg.edu.np.mad.mad_recyclerview;

import android.widget.CheckBox;

public class Object {

    private String myText;
    private int myCheckBox;

    public Object(String Text){
        this.myText = Text;
    }

    public String getMyText() {
        return myText;
    }

    public void setMyText(String myText) {
        this.myText = myText;
    }

    public int getMyCheckBox() {
        return myCheckBox;
    }

    public void setMyCheckBox(int myCheckBox) {
        this.myCheckBox = myCheckBox;
    }
}
