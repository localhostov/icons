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

public val Icons.Bold.CompassNorth: ImageVector
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
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.038f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(17.105f, 14.491f)
                curveToRelative(0.271f, 0.481f, 0.1f, 1.091f, -0.381f, 1.362f)
                curveToRelative(-0.302f, 0.17f, -0.671f, 0.171f, -0.974f, 0.004f)
                lineToRelative(-3.75f, -1.592f)
                lineToRelative(-3.731f, 1.61f)
                curveToRelative(-0.483f, 0.267f, -1.092f, 0.092f, -1.359f, -0.391f)
                curveToRelative(-0.168f, -0.303f, -0.167f, -0.672f, 0.004f, -0.974f)
                lineTo(12.0f, 5.779f)
                lineToRelative(5.105f, 8.712f)
                close()
            }
        }
        .build()
        return _compassNorth!!
    }

private var _compassNorth: ImageVector? = null
