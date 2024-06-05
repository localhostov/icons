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

public val Icons.Bold.CompassEast: ImageVector
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
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(9.491f, 6.913f)
                lineToRelative(8.73f, 5.087f)
                lineToRelative(-8.712f, 5.105f)
                curveToRelative(-0.481f, 0.271f, -1.091f, 0.1f, -1.362f, -0.381f)
                curveToRelative(-0.17f, -0.302f, -0.171f, -0.671f, -0.004f, -0.974f)
                lineToRelative(1.592f, -3.75f)
                lineToRelative(-1.61f, -3.731f)
                curveToRelative(-0.267f, -0.483f, -0.092f, -1.092f, 0.391f, -1.359f)
                curveToRelative(0.303f, -0.168f, 0.672f, -0.166f, 0.974f, 0.004f)
                close()
            }
        }
        .build()
        return _compassEast!!
    }

private var _compassEast: ImageVector? = null
