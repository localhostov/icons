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

public val Icons.Outline.CompassSouth: ImageVector
    get() {
        if (_compassSouth != null) {
            return _compassSouth!!
        }
        _compassSouth = Builder(name = "CompassSouth", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(17.214f, 7.275f)
                curveToRelative(-0.582f, -0.327f, -1.303f, -0.339f, -1.895f, -0.035f)
                lineToRelative(-3.316f, 1.408f)
                lineToRelative(-3.251f, -1.398f)
                curveToRelative(-0.965f, -0.533f, -2.185f, -0.182f, -2.718f, 0.782f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.338f, 0.611f, -0.334f, 1.339f, 0.021f, 1.97f)
                lineToRelative(5.942f, 9.941f)
                lineToRelative(5.98f, -9.946f)
                curveToRelative(0.54f, -0.96f, 0.198f, -2.182f, -0.764f, -2.724f)
                close()
                moveTo(12.002f, 16.055f)
                lineToRelative(-4.217f, -7.054f)
                reflectiveCurveToRelative(0.0f, -0.001f, 0.0f, -0.003f)
                lineToRelative(4.212f, 1.825f)
                lineToRelative(4.251f, -1.83f)
                lineToRelative(-4.246f, 7.062f)
                close()
            }
        }
        .build()
        return _compassSouth!!
    }

private var _compassSouth: ImageVector? = null
