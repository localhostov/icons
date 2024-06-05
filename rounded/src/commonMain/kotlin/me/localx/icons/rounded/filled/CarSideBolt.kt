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

public val Icons.Filled.CarSideBolt: ImageVector
    get() {
        if (_carSideBolt != null) {
            return _carSideBolt!!
        }
        _carSideBolt = Builder(name = "CarSideBolt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.942f, 20.0f)
                curveToRelative(0.034f, 0.162f, 0.058f, 0.328f, 0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, 0.024f, -0.338f, 0.058f, -0.5f)
                lineTo(7.942f, 20.0f)
                close()
                moveTo(16.057f, 20.0f)
                curveToRelative(-0.034f, 0.162f, -0.058f, 0.328f, -0.058f, 0.5f)
                curveToRelative(0.0f, 1.381f, 1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                curveToRelative(0.0f, -0.172f, -0.024f, -0.338f, -0.058f, -0.5f)
                horizontalLineToRelative(-4.885f)
                close()
                moveTo(23.999f, 15.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.591f, 0.0f, -1.16f, 0.089f, -1.699f, 0.249f)
                lineToRelative(1.525f, -4.021f)
                curveToRelative(0.737f, -1.943f, 2.598f, -3.228f, 4.675f, -3.228f)
                horizontalLineToRelative(3.835f)
                curveToRelative(1.635f, 0.0f, 3.167f, 0.799f, 4.102f, 2.141f)
                lineToRelative(3.387f, 4.859f)
                horizontalLineToRelative(-1.825f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                close()
                moveTo(13.808f, 9.846f)
                curveToRelative(-0.28f, -0.521f, -0.821f, -0.846f, -1.413f, -0.846f)
                horizontalLineToRelative(-2.067f)
                lineToRelative(1.523f, -2.476f)
                curveToRelative(0.29f, -0.47f, 0.143f, -1.086f, -0.328f, -1.375f)
                curveToRelative(-0.47f, -0.291f, -1.086f, -0.143f, -1.375f, 0.328f)
                curveToRelative(0.0f, 0.0f, -2.054f, 3.359f, -2.079f, 3.441f)
                curveToRelative(-0.147f, 0.487f, -0.055f, 1.021f, 0.249f, 1.43f)
                reflectiveCurveToRelative(0.788f, 0.653f, 1.297f, 0.653f)
                horizontalLineToRelative(2.068f)
                lineToRelative(-1.533f, 2.473f)
                curveToRelative(-0.291f, 0.469f, -0.146f, 1.086f, 0.323f, 1.377f)
                curveToRelative(0.164f, 0.102f, 0.346f, 0.15f, 0.526f, 0.15f)
                curveToRelative(0.334f, 0.0f, 0.662f, -0.168f, 0.851f, -0.473f)
                lineToRelative(1.881f, -3.037f)
                curveToRelative(0.327f, -0.493f, 0.357f, -1.123f, 0.077f, -1.645f)
                close()
            }
        }
        .build()
        return _carSideBolt!!
    }

private var _carSideBolt: ImageVector? = null
