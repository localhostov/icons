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

public val Icons.Outline.UpFromBracket: ImageVector
    get() {
        if (_upFromBracket != null) {
            return _upFromBracket!!
        }
        _upFromBracket = Builder(name = "UpFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(2.245f, 11.154f)
                curveToRelative(-0.467f, -1.135f, -0.218f, -2.378f, 0.651f, -3.246f)
                lineTo(9.176f, 1.163f)
                curveToRelative(1.573f, -1.572f, 4.093f, -1.574f, 5.641f, -0.027f)
                curveToRelative(0.007f, 0.007f, 6.368f, 6.768f, 6.368f, 6.768f)
                curveToRelative(0.846f, 0.844f, 1.096f, 2.087f, 0.629f, 3.222f)
                reflectiveCurveToRelative(-1.518f, 1.843f, -2.744f, 1.849f)
                horizontalLineToRelative(-2.074f)
                lineToRelative(-0.022f, 2.038f)
                curveToRelative(0.0f, 2.18f, -1.782f, 3.962f, -3.974f, 3.962f)
                horizontalLineToRelative(-1.982f)
                curveToRelative(-2.191f, 0.0f, -3.974f, -1.782f, -3.974f, -3.974f)
                lineToRelative(0.005f, -2.0f)
                horizontalLineToRelative(-2.054f)
                curveToRelative(-1.231f, -0.004f, -2.283f, -0.712f, -2.75f, -1.846f)
                close()
                moveTo(4.094f, 10.392f)
                curveToRelative(0.059f, 0.142f, 0.296f, 0.605f, 0.904f, 0.607f)
                horizontalLineToRelative(3.053f)
                curveToRelative(0.266f, 0.0f, 0.521f, 0.105f, 0.708f, 0.294f)
                curveToRelative(0.188f, 0.188f, 0.292f, 0.443f, 0.292f, 0.708f)
                lineToRelative(-0.007f, 3.0f)
                curveToRelative(0.0f, 1.085f, 0.886f, 1.971f, 1.974f, 1.971f)
                horizontalLineToRelative(1.982f)
                curveToRelative(1.088f, 0.0f, 1.974f, -0.886f, 1.974f, -1.974f)
                lineToRelative(0.034f, -3.037f)
                curveToRelative(0.006f, -0.548f, 0.452f, -0.989f, 1.0f, -0.989f)
                horizontalLineToRelative(3.058f)
                curveToRelative(0.603f, -0.003f, 0.841f, -0.467f, 0.899f, -0.609f)
                reflectiveCurveToRelative(0.216f, -0.639f, -0.215f, -1.069f)
                lineTo(13.394f, 2.541f)
                curveToRelative(-0.383f, -0.377f, -0.883f, -0.565f, -1.383f, -0.565f)
                curveToRelative(-0.505f, 0.0f, -1.011f, 0.192f, -1.396f, 0.576f)
                lineToRelative(-6.281f, 6.746f)
                curveToRelative(-0.456f, 0.456f, -0.299f, 0.953f, -0.24f, 1.095f)
                close()
            }
        }
        .build()
        return _upFromBracket!!
    }

private var _upFromBracket: ImageVector? = null
