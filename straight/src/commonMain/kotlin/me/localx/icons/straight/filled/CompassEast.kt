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

public val Icons.Filled.CompassEast: ImageVector
    get() {
        if (_compassEast != null) {
            return _compassEast!!
        }
        _compassEast = Builder(name = "CompassEast", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.785f)
                lineToRelative(7.056f, 4.218f)
                lineToRelative(-7.038f, 4.233f)
                lineToRelative(1.805f, -4.239f)
                lineToRelative(-1.825f, -4.211f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(24.0f, 11.999f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(19.945f, 11.997f)
                lineTo(10.004f, 6.055f)
                lineToRelative(-0.023f, -0.013f)
                curveToRelative(-0.609f, -0.342f, -1.338f, -0.344f, -1.948f, -0.007f)
                curveToRelative(-0.965f, 0.533f, -1.316f, 1.752f, -0.826f, 2.63f)
                lineToRelative(1.44f, 3.339f)
                lineToRelative(-1.408f, 3.316f)
                curveToRelative(-0.304f, 0.592f, -0.292f, 1.312f, 0.036f, 1.896f)
                curveToRelative(0.365f, 0.647f, 1.039f, 1.013f, 1.741f, 1.013f)
                curveToRelative(0.34f, 0.0f, 0.686f, -0.085f, 1.007f, -0.266f)
                lineToRelative(9.921f, -5.965f)
                close()
            }
        }
        .build()
        return _compassEast!!
    }

private var _compassEast: ImageVector? = null
