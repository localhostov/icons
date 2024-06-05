package me.localx.icons.rounded.outline

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
                moveTo(17.063f, 9.694f)
                curveToRelative(-5.102f, -2.71f, -6.156f, -3.27f, -6.415f, -3.399f)
                lineToRelative(0.002f, -0.004f)
                curveToRelative(-0.97f, -0.444f, -2.099f, -0.241f, -2.883f, 0.525f)
                curveToRelative(-0.729f, 0.725f, -0.967f, 1.817f, -0.562f, 2.787f)
                curveToRelative(0.063f, 0.125f, 0.829f, 1.622f, 1.225f, 2.396f)
                curveToRelative(-0.48f, 0.932f, -1.054f, 2.036f, -1.179f, 2.255f)
                curveToRelative(-0.324f, 0.677f, -0.335f, 1.46f, -0.031f, 2.147f)
                curveToRelative(0.279f, 0.632f, 0.788f, 1.116f, 1.432f, 1.365f)
                curveToRelative(0.303f, 0.116f, 0.618f, 0.174f, 0.933f, 0.174f)
                curveToRelative(0.355f, 0.0f, 0.71f, -0.074f, 1.042f, -0.221f)
                curveToRelative(1.447f, -0.626f, 6.256f, -3.286f, 6.429f, -3.383f)
                curveToRelative(0.883f, -0.449f, 1.429f, -1.342f, 1.426f, -2.332f)
                curveToRelative(-0.003f, -0.989f, -0.555f, -1.879f, -1.419f, -2.312f)
                close()
                moveTo(16.119f, 12.57f)
                curveToRelative(-0.049f, 0.027f, -4.927f, 2.727f, -6.292f, 3.317f)
                curveToRelative(-0.147f, 0.064f, -0.308f, 0.067f, -0.455f, 0.013f)
                curveToRelative(-0.145f, -0.057f, -0.259f, -0.165f, -0.321f, -0.307f)
                curveToRelative(-0.068f, -0.154f, -0.066f, -0.327f, -0.036f, -0.399f)
                curveToRelative(0.175f, -0.297f, 1.222f, -2.333f, 1.43f, -2.737f)
                curveToRelative(0.147f, -0.287f, 0.147f, -0.626f, 0.0f, -0.913f)
                curveToRelative(0.0f, 0.0f, -1.37f, -2.677f, -1.423f, -2.776f)
                curveToRelative(-0.045f, -0.108f, -0.027f, -0.353f, 0.148f, -0.527f)
                curveToRelative(0.121f, -0.118f, 0.273f, -0.18f, 0.425f, -0.18f)
                curveToRelative(0.069f, 0.0f, 0.139f, 0.013f, 0.204f, 0.04f)
                curveToRelative(0.472f, 0.25f, 6.327f, 3.36f, 6.347f, 3.371f)
                curveToRelative(0.302f, 0.151f, 0.336f, 0.429f, 0.336f, 0.541f)
                curveToRelative(0.0f, 0.112f, -0.031f, 0.389f, -0.363f, 0.559f)
                close()
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
            }
        }
        .build()
        return _compassEast!!
    }

private var _compassEast: ImageVector? = null
