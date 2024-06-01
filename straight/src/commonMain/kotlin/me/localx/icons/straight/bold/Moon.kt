package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.9999f, 23.9997f)
                    curveTo(10.8184f, 23.9963f, 7.7682f, 22.7309f, 5.5185f, 20.4812f)
                    curveTo(3.2688f, 18.2315f, 2.0034f, 15.1813f, 2.0f, 11.9997f)
                    curveTo(1.847f, 3.0427f, 12.0309f, -2.9833f, 19.7919f, 1.5077f)
                    lineTo(22.1219f, 2.7997f)
                    lineTo(19.8089f, 4.1217f)
                    curveTo(18.4531f, 4.9075f, 17.3392f, 6.0508f, 16.5891f, 7.4267f)
                    curveTo(15.839f, 8.8026f, 15.4815f, 10.3582f, 15.5556f, 11.9236f)
                    curveTo(15.6297f, 13.4889f, 16.1326f, 15.0038f, 17.0093f, 16.3027f)
                    curveTo(17.886f, 17.6016f, 19.1029f, 18.6345f, 20.5269f, 19.2887f)
                    lineTo(22.9599f, 20.3887f)
                    lineTo(20.7599f, 21.8967f)
                    curveTo(18.7716f, 23.2661f, 16.4142f, 23.9994f, 13.9999f, 23.9997f)
                    close()
                    moveTo(13.9999f, 2.9997f)
                    curveTo(12.6938f, 2.996f, 11.4026f, 3.2767f, 10.2158f, 3.8222f)
                    curveTo(9.0291f, 4.3677f, 7.9753f, 5.165f, 7.1276f, 6.1587f)
                    curveTo(6.2799f, 7.1524f, 5.6587f, 8.3187f, 5.307f, 9.5765f)
                    curveTo(4.9554f, 10.8344f, 4.8817f, 12.1538f, 5.0912f, 13.443f)
                    curveTo(5.3007f, 14.7322f, 5.7882f, 15.9604f, 6.52f, 17.0423f)
                    curveTo(7.2518f, 18.1241f, 8.2103f, 19.0337f, 9.329f, 19.7079f)
                    curveTo(10.4477f, 20.3822f, 11.6997f, 20.8048f, 12.9981f, 20.9465f)
                    curveTo(14.2965f, 21.0883f, 15.6102f, 20.9457f, 16.8479f, 20.5287f)
                    curveTo(11.4819f, 16.5067f, 11.0549f, 7.7587f, 16.0309f, 3.2287f)
                    curveTo(15.365f, 3.0744f, 14.6835f, 2.9976f, 13.9999f, 2.9997f)
                    close()
                }
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
