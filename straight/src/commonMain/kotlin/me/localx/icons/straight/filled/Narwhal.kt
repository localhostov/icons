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

public val Icons.Filled.Narwhal: ImageVector
    get() {
        if (_narwhal != null) {
            return _narwhal!!
        }
        _narwhal = Builder(name = "Narwhal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.386f, 10.089f)
                lineTo(24.0f, 0.53f)
                lineToRelative(-0.904f, -0.53f)
                lineToRelative(-4.895f, 8.31f)
                curveToRelative(-0.702f, -0.201f, -1.443f, -0.308f, -2.208f, -0.308f)
                curveToRelative(-0.994f, 0.0f, -1.676f, 0.0f, -1.694f, 0.001f)
                curveToRelative(0.0f, 0.0f, -0.001f, 0.0f, -0.002f, 0.0f)
                curveToRelative(-4.244f, 0.11f, -8.598f, 3.618f, -10.297f, 5.355f)
                verticalLineToRelative(-2.781f)
                curveToRelative(0.656f, -0.592f, 1.433f, -1.202f, 2.298f, -1.778f)
                curveToRelative(0.033f, -0.228f, 0.068f, -0.455f, 0.106f, -0.682f)
                lineToRelative(0.466f, -2.765f)
                curveToRelative(2.374f, -0.615f, 4.129f, -2.788f, 4.129f, -5.352f)
                curveToRelative(-4.173f, 0.0f, -5.5f, 2.776f, -5.5f, 2.776f)
                curveToRelative(0.0f, 0.0f, -1.378f, -2.776f, -5.5f, -2.776f)
                curveToRelative(0.0f, 2.278f, 1.385f, 4.247f, 3.358f, 5.089f)
                lineToRelative(-0.503f, 0.754f)
                curveTo(0.994f, 8.637f, 0.0f, 11.919f, 0.0f, 15.276f)
                verticalLineToRelative(2.724f)
                curveToRelative(0.0f, 3.314f, 2.686f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(10.001f)
                curveToRelative(4.418f, 0.0f, 7.999f, -3.581f, 7.999f, -7.999f)
                curveToRelative(0.0f, -2.342f, -1.008f, -4.449f, -2.614f, -5.912f)
                close()
                moveTo(17.5f, 18.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _narwhal!!
    }

private var _narwhal: ImageVector? = null
