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

public val Icons.Outline.LeftFromBracket: ImageVector
    get() {
        if (_leftFromBracket != null) {
            return _leftFromBracket!!
        }
        _leftFromBracket = Builder(name = "LeftFromBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                lineTo(22.0f, 4.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                close()
                moveTo(15.0f, 16.957f)
                lineToRelative(-2.0f, -0.005f)
                verticalLineToRelative(2.054f)
                curveToRelative(-0.004f, 1.23f, -0.711f, 2.283f, -1.846f, 2.75f)
                curveToRelative(-0.378f, 0.156f, -0.769f, 0.232f, -1.153f, 0.232f)
                curveToRelative(-0.77f, 0.0f, -1.515f, -0.304f, -2.093f, -0.883f)
                lineTo(1.163f, 14.824f)
                curveToRelative(-1.573f, -1.574f, -1.573f, -4.093f, -0.026f, -5.641f)
                curveToRelative(0.007f, -0.007f, 6.767f, -6.368f, 6.767f, -6.368f)
                curveToRelative(0.847f, -0.847f, 2.09f, -1.096f, 3.223f, -0.629f)
                curveToRelative(1.134f, 0.466f, 1.843f, 1.518f, 1.849f, 2.744f)
                verticalLineToRelative(2.073f)
                reflectiveCurveToRelative(2.037f, 0.023f, 2.037f, 0.023f)
                curveToRelative(2.18f, 0.0f, 3.962f, 1.783f, 3.962f, 3.974f)
                verticalLineToRelative(1.982f)
                curveToRelative(0.0f, 2.191f, -1.782f, 3.974f, -3.974f, 3.974f)
                close()
                moveTo(15.003f, 14.957f)
                curveToRelative(1.085f, 0.0f, 1.971f, -0.886f, 1.971f, -1.974f)
                verticalLineToRelative(-1.982f)
                curveToRelative(0.0f, -1.088f, -0.886f, -1.974f, -1.974f, -1.974f)
                lineToRelative(-3.038f, -0.034f)
                curveToRelative(-0.548f, -0.006f, -0.988f, -0.452f, -0.988f, -1.0f)
                verticalLineToRelative(-3.057f)
                curveToRelative(-0.002f, -0.603f, -0.466f, -0.84f, -0.608f, -0.899f)
                curveToRelative(-0.141f, -0.058f, -0.637f, -0.216f, -1.069f, 0.214f)
                lineTo(2.541f, 10.606f)
                curveToRelative(-0.758f, 0.769f, -0.754f, 2.013f, 0.011f, 2.778f)
                lineToRelative(6.746f, 6.281f)
                curveToRelative(0.455f, 0.457f, 0.954f, 0.299f, 1.095f, 0.24f)
                curveToRelative(0.143f, -0.059f, 0.605f, -0.296f, 0.607f, -0.904f)
                verticalLineToRelative(-3.053f)
                curveToRelative(0.0f, -0.266f, 0.105f, -0.521f, 0.294f, -0.708f)
                curveToRelative(0.188f, -0.187f, 0.441f, -0.292f, 0.706f, -0.292f)
                horizontalLineToRelative(0.003f)
                lineToRelative(3.0f, 0.007f)
                close()
            }
        }
        .build()
        return _leftFromBracket!!
    }

private var _leftFromBracket: ImageVector? = null
