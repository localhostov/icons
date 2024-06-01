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

public val Icons.Bold.CallOutgoing: ImageVector
    get() {
        if (_callOutgoing != null) {
            return _callOutgoing!!
        }
        _callOutgoing = Builder(name = "CallOutgoing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.2999f, 14.923f)
                    curveTo(11.9973f, 13.8538f, 10.1501f, 12.0003f, 9.0889f, 9.694f)
                    lineTo(12.0519f, 6.731f)
                    lineTo(5.4099f, 0.09f)
                    lineTo(1.7649f, 3.734f)
                    curveTo(1.1994f, 4.3022f, 0.7522f, 4.977f, 0.4493f, 5.7192f)
                    curveTo(0.1463f, 6.4614f, -0.0064f, 7.2564f, -1.0E-4f, 8.058f)
                    curveTo(-1.0E-4f, 15.209f, 8.7909f, 24.0f, 15.9419f, 24.0f)
                    curveTo(16.7434f, 24.0064f, 17.5382f, 23.8537f, 18.2803f, 23.5507f)
                    curveTo(19.0223f, 23.2478f, 19.6969f, 22.8006f, 20.2649f, 22.235f)
                    lineTo(23.9099f, 18.59f)
                    lineTo(17.2689f, 11.948f)
                    lineTo(14.2999f, 14.923f)
                    close()
                    moveTo(18.1479f, 20.114f)
                    curveTo(17.8581f, 20.3999f, 17.5144f, 20.6255f, 17.1367f, 20.7776f)
                    curveTo(16.7591f, 20.9296f, 16.355f, 21.0053f, 15.9479f, 21.0f)
                    curveTo(10.9489f, 21.0f, 2.9999f, 13.934f, 2.9999f, 8.058f)
                    curveTo(2.9948f, 7.6509f, 3.0706f, 7.2469f, 3.2226f, 6.8693f)
                    curveTo(3.3747f, 6.4917f, 3.6001f, 6.148f, 3.8859f, 5.858f)
                    lineTo(5.4099f, 4.332f)
                    lineTo(7.8099f, 6.732f)
                    lineTo(5.5419f, 9.0f)
                    lineTo(5.9109f, 9.919f)
                    curveTo(6.6104f, 11.7903f, 7.7042f, 13.4893f, 9.1179f, 14.9009f)
                    curveTo(10.5317f, 16.3124f, 12.2325f, 17.4034f, 14.1049f, 18.1f)
                    lineTo(15.0139f, 18.446f)
                    lineTo(17.2689f, 16.19f)
                    lineTo(19.6689f, 18.59f)
                    lineTo(18.1479f, 20.114f)
                    close()
                    moveTo(23.9999f, 1.0f)
                    verticalLineTo(6.5f)
                    lineTo(21.8109f, 4.311f)
                    lineTo(17.1859f, 8.936f)
                    lineTo(15.0639f, 6.814f)
                    lineTo(19.6889f, 2.189f)
                    lineTo(17.4999f, 0.0f)
                    horizontalLineTo(22.9999f)
                    curveTo(23.2651f, 0.0f, 23.5195f, 0.1054f, 23.707f, 0.2929f)
                    curveTo(23.8945f, 0.4804f, 23.9999f, 0.7348f, 23.9999f, 1.0f)
                    close()
                }
            }
        }
        .build()
        return _callOutgoing!!
    }

private var _callOutgoing: ImageVector? = null
