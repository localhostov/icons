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

public val Icons.Bold.ClockEleven: ImageVector
    get() {
        if (_clockEleven != null) {
            return _clockEleven!!
        }
        _clockEleven = Builder(name = "ClockEleven", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.383f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(7.038f, 3.0f, 3.0f, 7.038f, 3.0f, 12.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.038f, 9.0f, -9.0f)
                reflectiveCurveTo(16.963f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.982f, 13.92f)
                curveToRelative(0.608f, -0.207f, 1.018f, -0.778f, 1.018f, -1.42f)
                lineTo(14.0f, 6.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(1.586f)
                curveToRelative(-0.506f, -0.648f, -1.441f, -0.769f, -2.096f, -0.266f)
                curveToRelative(-0.657f, 0.505f, -0.78f, 1.446f, -0.275f, 2.104f)
                lineToRelative(2.682f, 3.49f)
                curveToRelative(0.29f, 0.376f, 0.732f, 0.586f, 1.19f, 0.586f)
                curveToRelative(0.161f, 0.0f, 0.324f, -0.026f, 0.482f, -0.08f)
                close()
            }
        }
        .build()
        return _clockEleven!!
    }

private var _clockEleven: ImageVector? = null
