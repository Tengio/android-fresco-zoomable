package com.tengio.android.fresco_zoomable.demo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.common.util.UriUtil;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeController;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.tengio.android.fresco_zoomable.ZoomableDraweeView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);

        setContentView(R.layout.activity_main);

        ZoomableDraweeView view = (ZoomableDraweeView) findViewById(R.id.example);
        view.getHierarchy().setActualImageScaleType(ScalingUtils.ScaleType.CENTER_INSIDE);
        Uri uri = new Uri.Builder()
                .scheme(UriUtil.LOCAL_RESOURCE_SCHEME)
                .path(String.valueOf(R.drawable.a_drunk_developer))
                .build();
        PipelineDraweeController controller = (PipelineDraweeController)
                Fresco.newDraweeControllerBuilder()
                        .setImageRequest(ImageRequestBuilder.newBuilderWithSource(uri).build())
                        .setOldController(view.getController())
                        .build();
        view.setController(controller);
    }
}
