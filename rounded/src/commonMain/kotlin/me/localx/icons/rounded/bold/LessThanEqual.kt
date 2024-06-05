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

public val Icons.Bold.LessThanEqual: ImageVector
    get() {
        if (_lessThanEqual != null) {
            return _lessThanEqual!!
        }
        _lessThanEqual = Builder(name = "LessThanEqual", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(4.5f, 24.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(20.093f, 16.122f)
                lineToRelative(-13.687f, -5.894f)
                curveToRelative(-0.396f, -0.17f, -0.426f, -0.601f, -0.426f, -0.729f)
                reflectiveCurveToRelative(0.031f, -0.559f, 0.426f, -0.729f)
                lineToRelative(13.687f, -5.894f)
                curveToRelative(0.761f, -0.328f, 1.112f, -1.21f, 0.785f, -1.971f)
                curveToRelative(-0.329f, -0.763f, -1.212f, -1.111f, -1.971f, -0.785f)
                lineTo(5.219f, 6.016f)
                curveToRelative(-1.381f, 0.596f, -2.239f, 1.931f, -2.239f, 3.484f)
                reflectiveCurveToRelative(0.858f, 2.889f, 2.239f, 3.484f)
                lineToRelative(13.687f, 5.894f)
                curveToRelative(0.193f, 0.083f, 0.395f, 0.122f, 0.593f, 0.122f)
                curveToRelative(0.581f, 0.0f, 1.134f, -0.339f, 1.378f, -0.907f)
                curveToRelative(0.328f, -0.761f, -0.024f, -1.643f, -0.785f, -1.971f)
                close()
            }
        }
        .build()
        return _lessThanEqual!!
    }

private var _lessThanEqual: ImageVector? = null
