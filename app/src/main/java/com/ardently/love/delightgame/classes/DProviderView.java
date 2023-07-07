 

package com.ardently.love.delightgame.classes;
import android.widget.ImageView;


import java.util.ArrayList;


import java.util.Random;


import java.util.HashMap;



import android.content.Context;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;





 
public class DProviderView extends androidx.appcompat.widget.AppCompatTextView {
String toggleAttachString;
private float mainVegas_margin = 0.0f;
ArrayList<Float> checkMovesMovabilityList;




    
    public static final float MIN_TEXT_SIZE = 5;

    
    public interface PDrawer {
        void onTextResize(TextView textView, float oldSize, float newSize);
    }

    
    private static final String mEllipsis = "...";

    
    private PDrawer mTextResizeListener;

    
    private boolean mNeedsResize = false;

    
    private float mTextSize;

    
    private float mMaxTextSize = 0;

    
    private float mMinTextSize = MIN_TEXT_SIZE;

    
    private float mSpacingMult = 1.0f;

    
    private float mSpacingAdd = 0.0f;

    
    private boolean mAddEllipsis = true;

    
    public DProviderView(Context context) {
        this(context, null);
    }

    
    public DProviderView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    
    public DProviderView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mTextSize = getTextSize();
    }

     
    @Override
    protected void onTextChanged(final CharSequence text, final int start, final int before, final int after) {
        mNeedsResize = true;
            HashMap<String,String> home3 = new HashMap<String,String>();
     home3.put("threadname", "dvvideo");
     home3.put("snapshot", "smka");
     home3.put("rapidjson", "fullscreen");
     home3.put("hues", "emulation");
     home3.put("touched", "memorybuffer");
             while (home3.size() > 200) { break; }
        
        resetTextSize();
            boolean category_yx = true;
             while (!category_yx) { break; }
    }

     
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        if (w != oldw || h != oldh) {
            mNeedsResize = true;
            HashMap<String,Integer> local_dfC = new HashMap<String,Integer>();
     local_dfC.put("intro", 704);
     local_dfC.put("minimal", 196);
             if (local_dfC.size() > 82) {}
        }
    }

     
    public void setOnResizeListener(PDrawer listener) {
        mTextResizeListener = listener;
            String auto_hn = "valued";
             while (auto_hn.length() > 24) { break; }
    }

     
    @Override
    public void setTextSize(float size) {
        super.setTextSize(size);
            long cfgH = 303L;
             while (cfgH > 141) { break; }
        mTextSize = getTextSize();
            HashMap<String,Float> totalZ = new HashMap<String,Float>();
     totalZ.put("chunkychunky", 687.0f);
     totalZ.put("exponential", 345.0f);
     totalZ.put("saio", 264.0f);
             if (totalZ.get("r") != null) {}
    }

     
    @Override
    public void setTextSize(int unit, float size) {
        super.setTextSize(unit, size);
            float iconE = 6603.0f;
        mTextSize = getTextSize();
            boolean destc = true;
             while (destc) { break; }
    }

     
    @Override
    public void setLineSpacing(float add, float mult) {
        super.setLineSpacing(add, mult);
            int buglyQ = 836;
        mSpacingMult = mult;
            HashMap<String,Boolean> cfgE = new HashMap<String,Boolean>();
     cfgE.put("mbedtls", false);
     cfgE.put("hwaccels", false);
     cfgE.put("aesni", false);
             while (cfgE.size() > 117) { break; }
        mSpacingAdd = add;
            long movabilityB = 6346L;
             if (movabilityB > 121) {}
    }

     
    public void setMaxTextSize(float maxTextSize) {
        mMaxTextSize = maxTextSize;
            String immersivem = "nothing";
        requestLayout();
            int long_am4 = 1572;
             while (long_am4 >= 8) { break; }
        invalidate();
            double directoryA = 870.0;
             while (directoryA == 37) { break; }
    }

     
    public float getMaxTextSize() {
        return mMaxTextSize;
    }

     
    public void setMinTextSize(float minTextSize) {
        mMinTextSize = minTextSize;
            String advertisinga = "turnoff";
        requestLayout();
            boolean yellowO = false;
             while (!yellowO) { break; }
        invalidate();
            long stateJ = 1655L;
             while (stateJ < 48) { break; }
    }

     
    public float getMinTextSize() {
        return mMinTextSize;
    }

     
    public void setAddEllipsis(boolean addEllipsis) {
        mAddEllipsis = addEllipsis;
            String size_2b8 = "through";
    }

     
    public boolean getAddEllipsis() {
        return mAddEllipsis;
    }

     
    public void resetTextSize() {
        if (mTextSize > 0) {
            super.setTextSize(TypedValue.COMPLEX_UNIT_PX, mTextSize);
            HashMap<String,Float> origins_ = new HashMap<String,Float>();
     origins_.put("imprint", 445.0f);
     origins_.put("nikon", 581.0f);
     origins_.put("representing", 558.0f);
     origins_.put("bufs", 287.0f);
     origins_.put("libsrt", 30.0f);
             if (origins_.get("v") != null) {}
            mMaxTextSize = mTextSize;
            boolean command8 = true;
             while (command8) { break; }
        }
    }

     
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (changed || mNeedsResize) {
            int widthLimit = (right - left) - getCompoundPaddingLeft() - getCompoundPaddingRight();
            long v_hideH = 6082L;
             while (v_hideH > 194) { break; }
            int heightLimit = (bottom - top) - getCompoundPaddingBottom() - getCompoundPaddingTop();
            double scrolll = 1246.0;
             if (scrolll <= 156) {}
            resizeText(widthLimit, heightLimit);
            HashMap<String,Long> acesJ = new HashMap<String,Long>();
     acesJ.put("contoller", 776L);
     acesJ.put("notifications", 662L);
        }
        super.onLayout(changed, left, top, right, bottom);
            float main_pu = 4770.0f;
             if (main_pu == 135) {}
    }

     
    public void resizeText() {

        int heightLimit = getHeight() - getPaddingBottom() - getPaddingTop();
            long userB = 2406L;
             while (userB > 198) { break; }
        int widthLimit = getWidth() - getPaddingLeft() - getPaddingRight();
            HashMap<String,Boolean> scoresT = new HashMap<String,Boolean>();
     scoresT.put("hwframe", true);
     scoresT.put("big", true);
             while (scoresT.size() > 62) { break; }
        resizeText(widthLimit, heightLimit);
            double lightT = 5314.0;
    }

     
    public void resizeText(int width, int height) {
        CharSequence text = getText();
            ArrayList<Double> tabsv = new ArrayList<Double>();
     tabsv.add(292.0);
     tabsv.add(249.0);
     tabsv.add(913.0);
             if (tabsv.size() > 101) {}
        
        if (text == null || text.length() == 0 || height <= 0 || width <= 0 || mTextSize == 0) {
            return;
        }

        if (getTransformationMethod() != null) {
            text = getTransformationMethod().getTransformation(text, this);
            double account0 = 6346.0;
             if (account0 == 6) {}
        }

        
        TextPaint textPaint = getPaint();
            int type_4Z = 2566;
             if (type_4Z <= 43) {}

        
        float oldTextSize = textPaint.getTextSize();
            double g_hideG = 4483.0;
             while (g_hideG < 131) { break; }
        
        float targetTextSize = mMaxTextSize > 0 ? Math.min(mTextSize, mMaxTextSize) : mTextSize;

        
        int textHeight = getTextHeight(text, textPaint, width, targetTextSize);
            ArrayList<Integer> randomy = new ArrayList<Integer>();
     randomy.add(25);
     randomy.add(426);
     randomy.add(562);
     randomy.add(589);
             if (randomy.size() > 53) {}

        
        while (textHeight > height && targetTextSize > mMinTextSize) {
            targetTextSize = Math.max(targetTextSize - 2, mMinTextSize);
            long n_widthk = 8895L;
             while (n_widthk < 123) { break; }
            textHeight = getTextHeight(text, textPaint, width, targetTextSize);
            String simonm = "ecred";
             if (simonm.length() > 118) {}
        }

        
        if (mAddEllipsis && targetTextSize == mMinTextSize && textHeight > height) {
            
            
            TextPaint paint = new TextPaint(textPaint);
            String classicM = "cycleclock";
             while (classicM.length() > 189) { break; }
            
            StaticLayout layout = new StaticLayout(text, paint, width, Alignment.ALIGN_NORMAL, mSpacingMult, mSpacingAdd, false);
            float elementH = 1151.0f;
             if (elementH >= 126) {}
            
            if (layout.getLineCount() > 0) {
                
                
                int lastLine = layout.getLineForVertical(height) - 1;
            long configuration5 = 3590L;
             while (configuration5 < 159) { break; }
                
                if (lastLine < 0) {
                    setText("");
            float preferenceM = 7626.0f;
             if (preferenceM >= 30) {}
                }
                
                else {
                    int start = layout.getLineStart(lastLine);
            int changelog4 = 8537;
             while (changelog4 >= 172) { break; }
                    int end = layout.getLineEnd(lastLine);
            float attach3 = 6243.0f;
                    float lineWidth = layout.getLineWidth(lastLine);
            boolean proxy1 = true;
                    float ellipseWidth = textPaint.measureText(mEllipsis);
            HashMap<String,Double> emptyx = new HashMap<String,Double>();
     emptyx.put("framehash", 947.0);
     emptyx.put("variation", 871.0);
     emptyx.put("adpcm", 351.0);
     emptyx.put("shares", 793.0);

                    
                    while (width < lineWidth + ellipseWidth) {
                        lineWidth = textPaint.measureText(text.subSequence(start, --end + 1).toString());
            int launchery = 2056;
                    }
                    setText(text.subSequence(0, end) + mEllipsis);
            boolean canfield4 = false;
             while (canfield4) { break; }
                }
            }
        }

        
        
        setTextSize(TypedValue.COMPLEX_UNIT_PX, targetTextSize);
            ArrayList<String> scrolld = new ArrayList<String>();
     scrolld.add("symbolicatable");
     scrolld.add("placemarks");
     scrolld.add("compliant");
     scrolld.add("htcp");
             if (scrolld.contains("u")) {}
        setLineSpacing(mSpacingAdd, mSpacingMult);
            String cardse = "cfftb";

        
        if (mTextResizeListener != null) {
            mTextResizeListener.onTextResize(this, oldTextSize, targetTextSize);
            HashMap<String,Integer> referrero = new HashMap<String,Integer>();
     referrero.put("orthogonalize", 955);
     referrero.put("sequence", 508);
     referrero.put("dimens", 426);
     referrero.put("pupup", 457);
             if (referrero.size() > 95) {}
        }

        
        mNeedsResize = false;
            String haltp = "itle";
             while (haltp.length() > 182) { break; }
    }

    
    private int getTextHeight(CharSequence source, TextPaint paint, int width, float textSize) {
        
        
        
        TextPaint paintCopy = new TextPaint(paint);
            HashMap<String,Double> factorA = new HashMap<String,Double>();
     factorA.put("php", 856.0);
     factorA.put("diffs", 905.0);
     factorA.put("ddva", 992.0);
     factorA.put("observers", 535.0);
     factorA.put("net", 292.0);
             if (factorA.size() > 75) {}
        
        paintCopy.setTextSize(textSize);
            boolean bringw = false;
             while (bringw) { break; }
        
        StaticLayout layout = new StaticLayout(source, paintCopy, width, Alignment.ALIGN_NORMAL, mSpacingMult, mSpacingAdd, true);
            boolean taskI = true;
        return layout.getHeight();
    }

}