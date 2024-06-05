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
                moveTo(16.78f, 7.598f)
                curveToRelative(-0.279f, -0.631f, -0.788f, -1.116f, -1.432f, -1.364f)
                curveToRelative(-0.645f, -0.248f, -1.348f, -0.23f, -1.975f, 0.046f)
                curveToRelative(-1.447f, 0.625f, -6.256f, 3.287f, -6.429f, 3.383f)
                curveToRelative(-0.883f, 0.449f, -1.429f, 1.342f, -1.426f, 2.332f)
                curveToRelative(0.003f, 0.989f, 0.555f, 1.879f, 1.419f, 2.311f)
                curveToRelative(0.0f, 0.0f, 6.394f, 3.396f, 6.413f, 3.404f)
                curveToRelative(0.34f, 0.156f, 0.7f, 0.231f, 1.057f, 0.231f)
                curveToRelative(0.662f, 0.0f, 1.317f, -0.26f, 1.827f, -0.757f)
                curveToRelative(0.728f, -0.726f, 0.966f, -1.818f, 0.561f, -2.787f)
                curveToRelative(-0.063f, -0.124f, -0.829f, -1.622f, -1.225f, -2.396f)
                curveToRelative(0.53f, -1.03f, 1.06f, -2.045f, 1.179f, -2.255f)
                curveToRelative(0.324f, -0.676f, 0.335f, -1.459f, 0.031f, -2.148f)
                close()
                moveTo(13.556f, 12.455f)
                reflectiveCurveToRelative(1.37f, 2.676f, 1.423f, 2.777f)
                curveToRelative(0.045f, 0.107f, 0.027f, 0.353f, -0.148f, 0.527f)
                curveToRelative(-0.182f, 0.177f, -0.438f, 0.228f, -0.649f, 0.132f)
                curveToRelative(-0.339f, -0.183f, -1.575f, -0.839f, -6.327f, -3.363f)
                curveToRelative(-0.302f, -0.151f, -0.336f, -0.429f, -0.336f, -0.541f)
                curveToRelative(0.0f, -0.112f, 0.031f, -0.389f, 0.363f, -0.559f)
                curveToRelative(0.049f, -0.027f, 4.927f, -2.727f, 6.292f, -3.317f)
                curveToRelative(0.147f, -0.065f, 0.309f, -0.068f, 0.456f, -0.013f)
                curveToRelative(0.145f, 0.056f, 0.259f, 0.165f, 0.321f, 0.306f)
                curveToRelative(0.068f, 0.154f, 0.066f, 0.328f, 0.037f, 0.399f)
                curveToRelative(-0.175f, 0.296f, -1.223f, 2.333f, -1.431f, 2.738f)
                curveToRelative(-0.147f, 0.287f, -0.147f, 0.626f, 0.0f, 0.913f)
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
        return _compassWest!!
    }

private var _compassWest: ImageVector? = null
