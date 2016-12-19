Android Fresco Zoomable
=======================

Extract of the Fresco Zoomable Sample app so that is easy to reuse the code.

This code is just a copy of what is in the [fresco project](https://github.com/facebook/fresco/tree/master/samples/zoomable/src/main/java/com/facebook/samples/zoomable):


Version
-------

[ ![Download](https://api.bintray.com/packages/tengioltd/maven/android-fresco-zoomable/images/download.svg) ](https://bintray.com/tengioltd/maven/android-fresco-zoomable/_latestVersion)


Examples
========

SimpleZoomableDraweeView
------------------------

SimpleZoomableDraweeView expose two attributes to change max and min zoomable scale.

```
app:zoomableMaxScale="8"
app:zoomableMinScale="1"
```

Dependencies
------------

```
dependencies {
    ...
    compile('com.tengio.android:fresco-zoomable:latest_version')
    ...
}
```

Android Fresco Zoomable uses:

```
compile 'com.facebook.fresco:fresco:1.0.0'
```


Library updates
---------------

We use bintray to deploy changes to jcenter. To deploy a new version make sure to define BINTRAY_USER and BINTRAY_KEY variables. Then run:

```
gradle bintrayUpload
```