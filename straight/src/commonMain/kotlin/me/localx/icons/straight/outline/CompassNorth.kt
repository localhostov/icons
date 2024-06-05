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

public val Icons.Outline.CompassNorth: ImageVector
    get() {
        if (_compassNorth != null) {
            return _compassNorth!!
        }
        _compassNorth = Builder(name = "CompassNorth", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(11.997f, 4.055f)
                lineTo(6.055f, 13.996f)
                lineToRelative(-0.014f, 0.023f)
                curveToRelative(-0.341f, 0.607f, -0.345f, 1.335f, -0.007f, 1.949f)
                curveToRelative(0.372f, 0.671f, 1.075f, 1.045f, 1.765f, 1.045f)
                curveToRelative(0.301f, 0.0f, 0.6f, -0.072f, 0.866f, -0.221f)
                lineToRelative(3.338f, -1.44f)
                lineToRelative(3.316f, 1.408f)
                curveToRelative(0.591f, 0.303f, 1.31f, 0.293f, 1.896f, -0.036f)
                curveToRelative(0.96f, -0.542f, 1.302f, -1.763f, 0.747f, -2.748f)
                lineTo(11.997f, 4.055f)
                close()
                moveTo(11.997f, 13.177f)
                lineToRelative(-4.212f, 1.825f)
                verticalLineToRelative(-0.002f)
                lineToRelative(4.218f, -7.056f)
                lineToRelative(4.232f, 7.038f)
                lineToRelative(-4.238f, -1.805f)
                close()
            }
        }
        .build()
        return _compassNorth!!
    }

private var _compassNorth: ImageVector? = null
