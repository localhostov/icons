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

public val Icons.Outline.CompassWest: ImageVector
    get() {
        if (_compassWest != null) {
            return _compassWest!!
        }
        _compassWest = Builder(name = "CompassWest", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(15.967f, 6.034f)
                curveToRelative(-0.61f, -0.337f, -1.338f, -0.335f, -1.971f, 0.021f)
                lineTo(4.055f, 11.998f)
                lineToRelative(9.946f, 5.98f)
                curveToRelative(0.309f, 0.173f, 0.645f, 0.256f, 0.977f, 0.256f)
                curveToRelative(0.699f, 0.0f, 1.38f, -0.367f, 1.748f, -1.02f)
                curveToRelative(0.327f, -0.583f, 0.339f, -1.303f, 0.035f, -1.895f)
                lineToRelative(-1.408f, -3.317f)
                lineToRelative(1.398f, -3.25f)
                curveToRelative(0.533f, -0.965f, 0.182f, -2.185f, -0.783f, -2.718f)
                close()
                moveTo(14.936f, 16.14f)
                lineToRelative(0.07f, 0.107f)
                lineToRelative(-7.062f, -4.246f)
                lineToRelative(7.062f, -4.222f)
                lineToRelative(-1.831f, 4.216f)
                lineToRelative(1.759f, 4.144f)
                close()
            }
        }
        .build()
        return _compassWest!!
    }

private var _compassWest: ImageVector? = null
