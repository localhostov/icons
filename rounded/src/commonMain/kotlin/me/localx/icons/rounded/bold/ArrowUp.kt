package me.localx.icons.rounded.bold

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
import me.localx.icons.rounded.Icons

public val Icons.Bold.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.427f, 4.911f)
                    lineTo(14.508f, 0.992f)
                    curveTo(13.8413f, 0.3551f, 12.9549f, -2.0E-4f, 12.033f, -2.0E-4f)
                    curveTo(11.111f, -2.0E-4f, 10.2246f, 0.3551f, 9.558f, 0.992f)
                    lineTo(5.639f, 4.911f)
                    curveTo(5.3657f, 5.1939f, 5.2145f, 5.5728f, 5.2179f, 5.9661f)
                    curveTo(5.2214f, 6.3593f, 5.3791f, 6.7356f, 5.6572f, 7.0137f)
                    curveTo(5.9353f, 7.2918f, 6.3116f, 7.4495f, 6.7049f, 7.453f)
                    curveTo(7.0982f, 7.4564f, 7.4771f, 7.3052f, 7.76f, 7.0319f)
                    lineTo(10.54f, 4.2519f)
                    lineTo(10.563f, 22.5019f)
                    curveTo(10.563f, 22.8997f, 10.721f, 23.2813f, 11.0023f, 23.5626f)
                    curveTo(11.2836f, 23.8439f, 11.6651f, 24.0019f, 12.063f, 24.0019f)
                    curveTo(12.4608f, 24.0019f, 12.8423f, 23.8439f, 13.1236f, 23.5626f)
                    curveTo(13.4049f, 23.2813f, 13.563f, 22.8997f, 13.563f, 22.5019f)
                    lineTo(13.54f, 4.266f)
                    lineTo(16.306f, 7.0319f)
                    curveTo(16.4443f, 7.1752f, 16.6098f, 7.2895f, 16.7929f, 7.3681f)
                    curveTo(16.9759f, 7.4467f, 17.1727f, 7.4881f, 17.3719f, 7.4898f)
                    curveTo(17.571f, 7.4915f, 17.7685f, 7.4536f, 17.9529f, 7.3782f)
                    curveTo(18.1372f, 7.3028f, 18.3047f, 7.1914f, 18.4456f, 7.0505f)
                    curveTo(18.5864f, 6.9097f, 18.6978f, 6.7422f, 18.7732f, 6.5579f)
                    curveTo(18.8486f, 6.3735f, 18.8866f, 6.176f, 18.8848f, 5.9768f)
                    curveTo(18.8831f, 5.7777f, 18.8417f, 5.5808f, 18.7631f, 5.3978f)
                    curveTo(18.6845f, 5.2148f, 18.5702f, 5.0493f, 18.427f, 4.911f)
                    close()
                }
            }
        }
        .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
