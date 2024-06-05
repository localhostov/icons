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

public val Icons.Filled.DurationAlt: ImageVector
    get() {
        if (_durationAlt != null) {
            return _durationAlt!!
        }
        _durationAlt = Builder(name = "DurationAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 6.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(19.079f, 14.441f)
                lineToRelative(-2.079f, -2.019f)
                verticalLineToRelative(-3.423f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.577f)
                lineToRelative(1.472f, 1.43f)
                lineToRelative(-1.393f, 1.435f)
                close()
                moveTo(12.624f, 19.0f)
                horizontalLineToRelative(-7.241f)
                curveToRelative(0.734f, -1.9f, 2.378f, -3.372f, 3.632f, -4.274f)
                curveToRelative(1.248f, 0.896f, 2.884f, 2.363f, 3.609f, 4.274f)
                close()
                moveTo(17.931f, 19.997f)
                curveToRelative(0.032f, 0.33f, 0.069f, 0.658f, 0.069f, 1.003f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -4.006f, 2.24f, -7.013f, 4.442f, -9.0f)
                curveTo(2.24f, 10.013f, 0.0f, 7.006f, 0.0f, 3.0f)
                curveTo(0.0f, 1.346f, 1.346f, 0.0f, 3.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 0.345f, -0.037f, 0.673f, -0.069f, 1.003f)
                curveToRelative(-4.379f, 0.038f, -7.931f, 3.608f, -7.931f, 7.997f)
                curveToRelative(0.0f, 0.348f, 0.03f, 0.689f, 0.073f, 1.026f)
                curveToRelative(-0.179f, -0.126f, -0.352f, -0.246f, -0.513f, -0.35f)
                lineToRelative(-0.548f, -0.358f)
                lineToRelative(-0.547f, 0.359f)
                curveToRelative(-1.763f, 1.156f, -4.806f, 3.625f, -5.373f, 7.165f)
                lineToRelative(-0.186f, 1.158f)
                horizontalLineToRelative(12.185f)
                lineToRelative(-0.182f, -1.155f)
                curveToRelative(-0.028f, -0.175f, -0.066f, -0.345f, -0.105f, -0.515f)
                curveToRelative(0.959f, 0.42f, 2.015f, 0.657f, 3.125f, 0.666f)
                close()
            }
        }
        .build()
        return _durationAlt!!
    }

private var _durationAlt: ImageVector? = null
