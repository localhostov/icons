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

public val Icons.Bold.CompassWest: ImageVector
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
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.038f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.038f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(15.875f, 8.269f)
                lineToRelative(-1.61f, 3.731f)
                lineToRelative(1.592f, 3.75f)
                curveToRelative(0.168f, 0.303f, 0.167f, 0.672f, -0.004f, 0.974f)
                curveToRelative(-0.271f, 0.481f, -0.881f, 0.652f, -1.362f, 0.381f)
                lineTo(5.78f, 12.0f)
                lineTo(14.509f, 6.913f)
                curveToRelative(0.302f, -0.17f, 0.671f, -0.171f, 0.974f, -0.004f)
                curveToRelative(0.483f, 0.267f, 0.658f, 0.876f, 0.391f, 1.359f)
                close()
            }
        }
        .build()
        return _compassWest!!
    }

private var _compassWest: ImageVector? = null
