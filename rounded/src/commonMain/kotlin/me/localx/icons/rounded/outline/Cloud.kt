package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.792f, 7.2121f)
                curveTo(17.3476f, 5.3014f, 16.2167f, 3.6205f, 14.6142f, 2.4891f)
                curveTo(13.0116f, 1.3576f, 11.0492f, 0.8544f, 9.1f, 1.0751f)
                curveTo(7.1507f, 1.2958f, 5.3505f, 2.225f, 4.0415f, 3.6861f)
                curveTo(2.7325f, 5.1472f, 2.006f, 7.0384f, 2.0f, 9.0001f)
                curveTo(1.9992f, 10.2785f, 2.308f, 11.5381f, 2.9f, 12.6711f)
                curveTo(1.8211f, 13.2492f, 0.9664f, 14.1713f, 0.4716f, 15.2909f)
                curveTo(-0.0231f, 16.4104f, -0.1296f, 17.6632f, 0.1692f, 18.8502f)
                curveTo(0.468f, 20.0372f, 1.1549f, 21.0903f, 2.1207f, 21.8422f)
                curveTo(3.0866f, 22.5941f, 4.276f, 23.0016f, 5.5f, 23.0001f)
                horizontalLineTo(16.0f)
                curveTo(17.9591f, 22.991f, 19.8468f, 22.2633f, 21.3051f, 20.9551f)
                curveTo(22.7634f, 19.6469f, 23.6909f, 17.849f, 23.9119f, 15.9024f)
                curveTo(24.1328f, 13.9558f, 23.6318f, 11.9958f, 22.5038f, 10.394f)
                curveTo(21.3758f, 8.7922f, 19.6992f, 7.66f, 17.792f, 7.2121f)
                close()
                moveTo(16.0f, 21.0001f)
                horizontalLineTo(5.5f)
                curveTo(4.6484f, 21.0026f, 3.8253f, 20.6938f, 3.1855f, 20.1318f)
                curveTo(2.5458f, 19.5697f, 2.1335f, 18.7932f, 2.0263f, 17.9484f)
                curveTo(1.9192f, 17.1036f, 2.1245f, 16.2488f, 2.6037f, 15.5448f)
                curveTo(3.0828f, 14.8408f, 3.8028f, 14.3363f, 4.628f, 14.1261f)
                curveTo(4.7867f, 14.0852f, 4.933f, 14.006f, 5.0539f, 13.8953f)
                curveTo(5.1748f, 13.7847f, 5.2666f, 13.646f, 5.3213f, 13.4916f)
                curveTo(5.376f, 13.3371f, 5.392f, 13.1715f, 5.3677f, 13.0094f)
                curveTo(5.3434f, 12.8474f, 5.2796f, 12.6937f, 5.182f, 12.5621f)
                curveTo(4.4132f, 11.5338f, 3.9984f, 10.284f, 4.0f, 9.0001f)
                curveTo(4.0114f, 7.4861f, 4.5948f, 6.0323f, 5.6332f, 4.9304f)
                curveTo(6.6715f, 3.8285f, 8.0881f, 3.1599f, 9.5987f, 3.0587f)
                curveTo(11.1094f, 2.9575f, 12.6025f, 3.4311f, 13.7786f, 4.3847f)
                curveTo(14.9546f, 5.3382f, 15.7267f, 6.7011f, 15.94f, 8.2001f)
                curveTo(15.9688f, 8.4177f, 16.0684f, 8.6199f, 16.2235f, 8.7753f)
                curveTo(16.3785f, 8.9307f, 16.5804f, 9.0308f, 16.798f, 9.0601f)
                curveTo(18.2968f, 9.2733f, 19.6596f, 10.0453f, 20.6132f, 11.2211f)
                curveTo(21.5667f, 12.397f, 22.0405f, 13.8898f, 21.9396f, 15.4004f)
                curveTo(21.8386f, 16.9109f, 21.1704f, 18.3274f, 20.0688f, 19.366f)
                curveTo(18.9673f, 20.4045f, 17.5139f, 20.9882f, 16.0f, 21.0001f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
