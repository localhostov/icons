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

public val Icons.Bold.Manhole: ImageVector
    get() {
        if (_manhole != null) {
            return _manhole!!
        }
        _manhole = Builder(name = "Manhole", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.987f, 20.778f)
                curveToRelative(-0.111f, -0.999f, -0.959f, -1.778f, -1.987f, -1.778f)
                reflectiveCurveToRelative(-1.877f, 0.78f, -1.987f, 1.778f)
                curveToRelative(-4.009f, -0.907f, -7.013f, -4.498f, -7.013f, -8.778f)
                reflectiveCurveToRelative(3.003f, -7.871f, 7.013f, -8.778f)
                curveToRelative(0.111f, 0.999f, 0.959f, 1.778f, 1.987f, 1.778f)
                reflectiveCurveToRelative(1.877f, -0.78f, 1.987f, -1.778f)
                curveToRelative(4.009f, 0.907f, 7.013f, 4.498f, 7.013f, 8.778f)
                reflectiveCurveToRelative(-3.003f, 7.871f, -7.013f, 8.778f)
                close()
                moveTo(18.317f, 9.0f)
                lineTo(5.683f, 9.0f)
                curveToRelative(0.594f, -1.249f, 1.546f, -2.292f, 2.725f, -3.0f)
                horizontalLineToRelative(7.184f)
                curveToRelative(1.18f, 0.708f, 2.131f, 1.751f, 2.725f, 3.0f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, 0.515f, -0.059f, 1.016f, -0.165f, 1.5f)
                lineTo(5.165f, 13.5f)
                curveToRelative(-0.106f, -0.484f, -0.165f, -0.985f, -0.165f, -1.5f)
                reflectiveCurveToRelative(0.059f, -1.016f, 0.165f, -1.5f)
                horizontalLineToRelative(13.67f)
                curveToRelative(0.106f, 0.484f, 0.165f, 0.985f, 0.165f, 1.5f)
                close()
                moveTo(5.683f, 15.0f)
                horizontalLineToRelative(12.635f)
                curveToRelative(-0.594f, 1.249f, -1.546f, 2.292f, -2.725f, 3.0f)
                horizontalLineToRelative(-7.184f)
                curveToRelative(-1.18f, -0.708f, -2.131f, -1.751f, -2.725f, -3.0f)
                close()
            }
        }
        .build()
        return _manhole!!
    }

private var _manhole: ImageVector? = null
