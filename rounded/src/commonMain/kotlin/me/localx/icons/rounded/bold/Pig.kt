package me.localx.icons.rounded.bold

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

public val Icons.Bold.Pig: ImageVector
    get() {
        if (_pig != null) {
            return _pig!!
        }
        _pig = Builder(name = "Pig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 11.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-0.084f)
                curveToRelative(-0.744f, 1.832f, -2.148f, 3.329f, -3.916f, 4.193f)
                verticalLineToRelative(0.307f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.208f, 0.0f, -2.217f, -0.86f, -2.45f, -2.0f)
                horizontalLineToRelative(-4.101f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.45f, 2.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-0.574f)
                curveTo(1.61f, 17.541f, 0.0f, 14.955f, 0.0f, 12.0f)
                curveTo(0.0f, 10.574f, 0.375f, 9.234f, 1.031f, 8.074f)
                curveTo(0.43f, 7.131f, 0.089f, 5.962f, 0.015f, 4.581f)
                curveToRelative(-0.044f, -0.828f, 0.59f, -1.534f, 1.417f, -1.579f)
                curveToRelative(0.821f, -0.043f, 1.534f, 0.59f, 1.579f, 1.417f)
                curveToRelative(0.024f, 0.442f, 0.085f, 0.838f, 0.184f, 1.188f)
                curveToRelative(1.339f, -1.009f, 3.003f, -1.608f, 4.805f, -1.608f)
                horizontalLineToRelative(5.123f)
                curveToRelative(0.346f, -1.407f, 1.394f, -2.601f, 2.738f, -2.968f)
                curveToRelative(0.573f, -0.157f, 1.14f, 0.283f, 1.14f, 0.877f)
                verticalLineToRelative(2.492f)
                curveToRelative(2.234f, 0.737f, 4.036f, 2.433f, 4.916f, 4.599f)
                horizontalLineToRelative(0.084f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                close()
                moveTo(14.5f, 7.0f)
                horizontalLineToRelative(-6.538f)
                curveToRelative(-2.741f, 0.0f, -4.962f, 2.259f, -4.962f, 5.0f)
                curveToRelative(0.0f, 2.726f, 2.209f, 5.0f, 4.935f, 5.0f)
                horizontalLineToRelative(6.342f)
                curveToRelative(2.61f, 0.0f, 4.945f, -1.903f, 5.199f, -4.5f)
                curveToRelative(0.291f, -2.98f, -2.054f, -5.5f, -4.976f, -5.5f)
                close()
            }
        }
        .build()
        return _pig!!
    }

private var _pig: ImageVector? = null
