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

public val Icons.Outline.DownFromBracket: ImageVector
    get() {
        if (_downFromBracket != null) {
            return _downFromBracket!!
        }
        _downFromBracket = Builder(name = "DownFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(4.5f, 2.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                curveTo(0.0f, 2.019f, 2.019f, 0.0f, 4.5f, 0.0f)
                horizontalLineToRelative(15.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(21.814f, 12.874f)
                curveToRelative(0.467f, 1.134f, 0.218f, 2.377f, -0.65f, 3.245f)
                curveToRelative(0.0f, 0.0f, -6.34f, 6.738f, -6.347f, 6.745f)
                curveToRelative(-0.774f, 0.773f, -1.791f, 1.16f, -2.807f, 1.16f)
                reflectiveCurveToRelative(-2.034f, -0.387f, -2.809f, -1.161f)
                lineToRelative(-6.331f, -6.797f)
                curveToRelative(-0.843f, -0.841f, -1.093f, -2.085f, -0.626f, -3.219f)
                curveToRelative(0.467f, -1.134f, 1.52f, -1.842f, 2.747f, -1.846f)
                horizontalLineToRelative(2.057f)
                lineToRelative(-0.005f, -1.998f)
                curveToRelative(0.0f, -2.194f, 1.783f, -3.977f, 3.974f, -3.977f)
                horizontalLineToRelative(1.982f)
                curveToRelative(2.191f, 0.0f, 3.974f, 1.783f, 3.974f, 3.974f)
                lineToRelative(0.023f, 2.026f)
                horizontalLineToRelative(2.068f)
                curveToRelative(1.231f, 0.006f, 2.283f, 0.714f, 2.749f, 1.848f)
                close()
                moveTo(19.964f, 13.635f)
                curveToRelative(-0.059f, -0.143f, -0.296f, -0.606f, -0.904f, -0.609f)
                horizontalLineToRelative(-3.052f)
                curveToRelative(-0.548f, 0.0f, -0.994f, -0.44f, -1.0f, -0.988f)
                lineToRelative(-0.034f, -3.026f)
                curveToRelative(0.0f, -1.1f, -0.886f, -1.985f, -1.974f, -1.985f)
                horizontalLineToRelative(-1.982f)
                curveToRelative(-1.088f, 0.0f, -1.974f, 0.886f, -1.974f, 1.974f)
                lineToRelative(0.007f, 2.998f)
                curveToRelative(0.0f, 0.266f, -0.104f, 0.521f, -0.292f, 0.708f)
                curveToRelative(-0.188f, 0.188f, -0.442f, 0.294f, -0.708f, 0.294f)
                horizontalLineToRelative(-3.056f)
                curveToRelative(-0.604f, 0.002f, -0.842f, 0.466f, -0.901f, 0.607f)
                reflectiveCurveToRelative(-0.216f, 0.639f, 0.215f, 1.068f)
                lineToRelative(6.332f, 6.798f)
                curveToRelative(0.74f, 0.739f, 1.984f, 0.742f, 2.753f, -0.015f)
                lineToRelative(6.336f, -6.733f)
                curveToRelative(0.451f, -0.452f, 0.294f, -0.949f, 0.235f, -1.091f)
                close()
            }
        }
        .build()
        return _downFromBracket!!
    }

private var _downFromBracket: ImageVector? = null
