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

public val Icons.Filled.SolarSystem: ImageVector
    get() {
        if (_solarSystem != null) {
            return _solarSystem!!
        }
        _solarSystem = Builder(name = "SolarSystem", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                curveToRelative(1.681f, 0.0f, 3.281f, 0.35f, 4.734f, 0.977f)
                curveToRelative(-0.555f, 0.437f, -1.007f, 0.993f, -1.308f, 1.64f)
                curveToRelative(-1.071f, -0.392f, -2.221f, -0.618f, -3.426f, -0.618f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.486f, 10.0f, -10.0f)
                curveToRelative(0.0f, -1.205f, -0.225f, -2.356f, -0.618f, -3.426f)
                curveToRelative(0.648f, -0.301f, 1.203f, -0.753f, 1.64f, -1.308f)
                curveToRelative(0.627f, 1.454f, 0.977f, 3.053f, 0.977f, 4.734f)
                close()
                moveTo(10.0f, 8.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
                moveTo(19.5f, 7.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(13.5f, 12.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
                moveTo(10.759f, 5.117f)
                curveToRelative(0.532f, 0.509f, 0.915f, 1.163f, 1.103f, 1.897f)
                curveToRelative(0.047f, -0.001f, 0.091f, -0.014f, 0.138f, -0.014f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.047f, 0.013f, -0.091f, 0.014f, -0.138f)
                curveToRelative(-0.735f, -0.188f, -1.388f, -0.571f, -1.897f, -1.103f)
                curveToRelative(-0.073f, 0.403f, -0.117f, 0.817f, -0.117f, 1.241f)
                curveToRelative(0.0f, 3.859f, 3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                curveToRelative(-0.424f, 0.0f, -0.837f, 0.044f, -1.241f, 0.117f)
                close()
            }
        }
        .build()
        return _solarSystem!!
    }

private var _solarSystem: ImageVector? = null
