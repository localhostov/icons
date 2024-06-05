package me.localx.icons.straight.outline

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

public val Icons.Outline.CompassEast: ImageVector
    get() {
        if (_compassEast != null) {
            return _compassEast!!
        }
        _compassEast = Builder(name = "CompassEast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(10.004f, 6.055f)
                lineToRelative(-0.023f, -0.013f)
                curveToRelative(-0.609f, -0.342f, -1.338f, -0.344f, -1.948f, -0.007f)
                curveToRelative(-0.965f, 0.533f, -1.316f, 1.752f, -0.826f, 2.63f)
                lineToRelative(1.44f, 3.339f)
                lineToRelative(-1.408f, 3.316f)
                curveToRelative(-0.304f, 0.592f, -0.292f, 1.312f, 0.036f, 1.896f)
                curveToRelative(0.365f, 0.647f, 1.039f, 1.013f, 1.741f, 1.013f)
                curveToRelative(0.34f, 0.0f, 0.686f, -0.085f, 1.007f, -0.266f)
                lineToRelative(9.921f, -5.965f)
                lineTo(10.004f, 6.055f)
                close()
                moveTo(9.018f, 16.236f)
                lineToRelative(1.805f, -4.239f)
                lineToRelative(-1.825f, -4.211f)
                horizontalLineToRelative(0.001f)
                reflectiveCurveToRelative(7.056f, 4.217f, 7.056f, 4.217f)
                lineToRelative(-7.038f, 4.233f)
                close()
            }
        }
        .build()
        return _compassEast!!
    }

private var _compassEast: ImageVector? = null
