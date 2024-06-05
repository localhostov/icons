package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Narwhal: ImageVector
    get() {
        if (_narwhal != null) {
            return _narwhal!!
        }
        _narwhal = Builder(name = "Narwhal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 16.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(21.385f, 10.091f)
                lineTo(24.0f, 0.53f)
                lineToRelative(-0.904f, -0.53f)
                lineToRelative(-4.895f, 8.31f)
                curveToRelative(-0.697f, -0.2f, -1.432f, -0.307f, -2.192f, -0.308f)
                lineToRelative(-1.507f, -0.002f)
                verticalLineToRelative(0.003f)
                lineToRelative(-0.002f, -0.003f)
                curveToRelative(-3.382f, 0.0f, -7.183f, 2.855f, -9.5f, 4.931f)
                verticalLineToRelative(3.993f)
                lineToRelative(0.102f, 0.094f)
                curveToRelative(1.549f, -1.674f, 6.255f, -6.018f, 9.398f, -6.018f)
                lineToRelative(1.506f, 0.002f)
                curveToRelative(2.754f, 0.002f, 4.994f, 2.245f, 4.994f, 4.999f)
                reflectiveCurveToRelative(-2.243f, 4.999f, -4.999f, 4.999f)
                lineTo(6.5f, 21.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-3.973f)
                curveToRelative(0.0f, -1.684f, 0.494f, -3.313f, 1.428f, -4.715f)
                lineToRelative(2.281f, -3.421f)
                curveToRelative(2.456f, -0.556f, 4.292f, -2.769f, 4.292f, -5.391f)
                curveToRelative(-4.173f, 0.0f, -5.5f, 2.776f, -5.5f, 2.776f)
                curveToRelative(0.0f, 0.0f, -1.378f, -2.776f, -5.5f, -2.776f)
                curveToRelative(0.0f, 2.262f, 1.365f, 4.219f, 3.317f, 5.071f)
                lineToRelative(-1.385f, 2.077f)
                curveToRelative(-1.264f, 1.896f, -1.932f, 4.101f, -1.932f, 6.379f)
                verticalLineToRelative(3.973f)
                curveToRelative(0.0f, 3.584f, 2.916f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(9.501f)
                curveToRelative(4.411f, 0.0f, 7.999f, -3.588f, 7.999f, -7.999f)
                curveToRelative(0.0f, -2.338f, -1.009f, -4.446f, -2.615f, -5.91f)
                close()
            }
        }
        .build()
        return _narwhal!!
    }

private var _narwhal: ImageVector? = null
