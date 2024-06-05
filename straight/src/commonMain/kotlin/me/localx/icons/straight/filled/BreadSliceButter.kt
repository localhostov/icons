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

public val Icons.Filled.BreadSliceButter: ImageVector
    get() {
        if (_breadSliceButter != null) {
            return _breadSliceButter!!
        }
        _breadSliceButter = Builder(name = "BreadSliceButter", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                curveTo(2.243f, 1.0f, 0.0f, 3.243f, 0.0f, 6.0f)
                curveToRelative(0.0f, 1.563f, 0.754f, 3.04f, 2.0f, 3.979f)
                verticalLineToRelative(13.021f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-13.021f)
                curveToRelative(1.246f, -0.939f, 2.0f, -2.416f, 2.0f, -3.979f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(16.501f, 14.156f)
                lineToRelative(-3.346f, 3.345f)
                curveToRelative(-0.308f, 0.309f, -0.718f, 0.479f, -1.155f, 0.479f)
                reflectiveCurveToRelative(-0.847f, -0.17f, -1.156f, -0.479f)
                lineToRelative(-3.345f, -3.345f)
                curveToRelative(-0.309f, -0.308f, -0.479f, -0.718f, -0.479f, -1.155f)
                reflectiveCurveToRelative(0.17f, -0.848f, 0.479f, -1.156f)
                lineToRelative(3.346f, -3.345f)
                curveToRelative(0.616f, -0.617f, 1.693f, -0.618f, 2.312f, 0.0f)
                lineToRelative(3.345f, 3.345f)
                curveToRelative(0.309f, 0.308f, 0.479f, 0.718f, 0.479f, 1.155f)
                reflectiveCurveToRelative(-0.17f, 0.848f, -0.479f, 1.156f)
                close()
                moveTo(12.0f, 10.172f)
                lineToRelative(2.829f, 2.828f)
                lineToRelative(-2.829f, 2.828f)
                lineToRelative(-2.829f, -2.828f)
                lineToRelative(2.829f, -2.828f)
                close()
            }
        }
        .build()
        return _breadSliceButter!!
    }

private var _breadSliceButter: ImageVector? = null
