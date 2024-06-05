package me.localx.icons.rounded.filled

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

public val Icons.Filled.CarBolt: ImageVector
    get() {
        if (_carBolt != null) {
            return _carBolt!!
        }
        _carBolt = Builder(name = "CarBolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.038f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.038f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.663f)
                curveToRelative(-0.022f, -0.081f, -0.036f, -0.164f, -0.065f, -0.243f)
                lineToRelative(-2.701f, -7.427f)
                curveToRelative(-0.715f, -1.969f, -2.603f, -3.292f, -4.698f, -3.292f)
                lineTo(7.802f, 1.038f)
                curveToRelative(-2.096f, 0.0f, -3.983f, 1.323f, -4.698f, 3.291f)
                lineTo(0.402f, 11.756f)
                curveToRelative(-0.029f, 0.08f, -0.043f, 0.163f, -0.065f, 0.244f)
                lineTo(7.0f, 12.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.038f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 14.038f)
                verticalLineToRelative(1.962f)
                curveToRelative(0.0f, 2.045f, 1.237f, 3.802f, 3.0f, 4.576f)
                verticalLineToRelative(1.424f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-1.424f)
                curveToRelative(1.763f, -0.774f, 3.0f, -2.531f, 3.0f, -4.576f)
                verticalLineToRelative(-1.962f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(14.731f, 11.49f)
                lineToRelative(-1.881f, 3.037f)
                curveToRelative(-0.189f, 0.305f, -0.517f, 0.473f, -0.851f, 0.473f)
                curveToRelative(-0.18f, 0.0f, -0.362f, -0.048f, -0.526f, -0.15f)
                curveToRelative(-0.469f, -0.291f, -0.614f, -0.908f, -0.323f, -1.377f)
                lineToRelative(1.533f, -2.473f)
                horizontalLineToRelative(-2.068f)
                curveToRelative(-0.509f, 0.0f, -0.994f, -0.244f, -1.297f, -0.653f)
                reflectiveCurveToRelative(-0.396f, -0.943f, -0.249f, -1.43f)
                curveToRelative(0.025f, -0.082f, 2.079f, -3.441f, 2.079f, -3.441f)
                curveToRelative(0.289f, -0.471f, 0.905f, -0.618f, 1.375f, -0.328f)
                curveToRelative(0.471f, 0.289f, 0.617f, 0.905f, 0.328f, 1.375f)
                lineToRelative(-1.523f, 2.476f)
                horizontalLineToRelative(2.067f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.413f, 0.846f)
                reflectiveCurveToRelative(0.25f, 1.151f, -0.077f, 1.645f)
                close()
            }
        }
        .build()
        return _carBolt!!
    }

private var _carBolt: ImageVector? = null
