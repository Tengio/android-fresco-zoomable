package com.tengio.android.fresco_zoomable;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class SimpleZoomableDraweeView extends ZoomableDraweeView {

    private float maxScale = 4;
    private float minScale = 1;

    public SimpleZoomableDraweeView(Context context) {
        super(context);
        init(null);
    }

    public SimpleZoomableDraweeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    @Override
    protected void init(AttributeSet attrs) {
        if (attrs == null) {
            return;
        }
        TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.SimpleZoomableDraweeView);
        maxScale = ta.getFloat(R.styleable.SimpleZoomableDraweeView_zoomableMaxScale, maxScale);
        minScale = ta.getFloat(R.styleable.SimpleZoomableDraweeView_zoomableMinScale, minScale);
        ta.recycle();
        super.init(attrs);
    }

    @Override
    protected ZoomableController createZoomableController() {
        AnimatedZoomableController c = AnimatedZoomableController.newInstance();
        c.setMaxScaleFactor(maxScale);
        c.setMinScaleFactor(minScale);
        return c;
    }
}
