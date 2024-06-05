package me.localx.icons.straight.filled

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

public val Icons.Filled.CircleNodes: ImageVector
    get() {
        if (_circleNodes != null) {
            return _circleNodes!!
        }
        _circleNodes = Builder(name = "CircleNodes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 0.067f, 0.017f, 0.13f, 0.02f, 0.196f)
                lineTo(7.386f, 6.894f)
                curveToRelative(-0.707f, -1.133f, -1.955f, -1.894f, -3.386f, -1.894f)
                curveTo(1.794f, 5.0f, 0.0f, 6.794f, 0.0f, 9.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                curveToRelative(0.802f, 0.0f, 1.547f, -0.243f, 2.174f, -0.651f)
                lineToRelative(6.31f, 5.784f)
                curveToRelative(-0.299f, 0.56f, -0.484f, 1.189f, -0.484f, 1.867f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.513f, -0.854f, -2.816f, -2.096f, -3.496f)
                lineToRelative(2.127f, -8.507f)
                curveToRelative(2.191f, -0.017f, 3.969f, -1.802f, 3.969f, -3.997f)
                close()
                moveTo(16.614f, 6.106f)
                curveToRelative(0.365f, 0.584f, 0.876f, 1.058f, 1.482f, 1.39f)
                lineToRelative(-2.126f, 8.508f)
                curveToRelative(-0.79f, 0.006f, -1.524f, 0.245f, -2.143f, 0.647f)
                lineToRelative(-6.31f, -5.784f)
                curveToRelative(0.299f, -0.56f, 0.484f, -1.189f, 0.484f, -1.867f)
                curveToRelative(0.0f, -0.067f, -0.017f, -0.13f, -0.02f, -0.196f)
                lineToRelative(8.634f, -2.698f)
                close()
            }
        }
        .build()
        return _circleNodes!!
    }

private var _circleNodes: ImageVector? = null
