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

public val Icons.Outline.RightFromBracket: ImageVector
    get() {
        if (_rightFromBracket != null) {
            return _rightFromBracket!!
        }
        _rightFromBracket = Builder(name = "RightFromBracket", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                lineTo(0.0f, 4.5f)
                curveTo(0.0f, 2.019f, 2.019f, 0.0f, 4.5f, 0.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(22.864f, 14.817f)
                curveToRelative(-0.007f, 0.007f, -6.768f, 6.368f, -6.768f, 6.368f)
                curveToRelative(-0.561f, 0.562f, -1.299f, 0.861f, -2.064f, 0.861f)
                curveToRelative(-0.385f, 0.0f, -0.778f, -0.076f, -1.158f, -0.232f)
                curveToRelative(-1.134f, -0.467f, -1.843f, -1.518f, -1.849f, -2.744f)
                verticalLineToRelative(-2.074f)
                lineToRelative(-2.037f, -0.022f)
                curveToRelative(-2.18f, 0.0f, -3.963f, -1.782f, -3.963f, -3.974f)
                verticalLineToRelative(-1.982f)
                curveToRelative(0.0f, -2.191f, 1.783f, -3.974f, 3.974f, -3.974f)
                lineToRelative(2.0f, 0.005f)
                verticalLineToRelative(-2.054f)
                curveToRelative(0.004f, -1.231f, 0.712f, -2.283f, 1.846f, -2.75f)
                curveToRelative(1.135f, -0.467f, 2.379f, -0.217f, 3.246f, 0.651f)
                lineToRelative(6.746f, 6.281f)
                curveToRelative(1.572f, 1.574f, 1.573f, 4.093f, 0.027f, 5.641f)
                close()
                moveTo(21.448f, 10.614f)
                lineToRelative(-6.746f, -6.281f)
                curveToRelative(-0.457f, -0.457f, -0.953f, -0.299f, -1.095f, -0.24f)
                reflectiveCurveToRelative(-0.605f, 0.296f, -0.607f, 0.904f)
                verticalLineToRelative(3.053f)
                curveToRelative(0.0f, 0.266f, -0.105f, 0.521f, -0.294f, 0.708f)
                reflectiveCurveToRelative(-0.487f, 0.272f, -0.708f, 0.292f)
                lineToRelative(-3.0f, -0.007f)
                curveToRelative(-1.086f, 0.0f, -1.972f, 0.886f, -1.972f, 1.974f)
                verticalLineToRelative(1.982f)
                curveToRelative(0.0f, 1.088f, 0.886f, 1.974f, 1.974f, 1.974f)
                lineToRelative(3.037f, 0.034f)
                curveToRelative(0.548f, 0.006f, 0.989f, 0.452f, 0.989f, 1.0f)
                verticalLineToRelative(3.058f)
                curveToRelative(0.003f, 0.603f, 0.467f, 0.841f, 0.609f, 0.899f)
                reflectiveCurveToRelative(0.639f, 0.215f, 1.069f, -0.215f)
                lineToRelative(6.755f, -6.356f)
                curveToRelative(0.758f, -0.769f, 0.754f, -2.013f, -0.011f, -2.779f)
                close()
            }
        }
        .build()
        return _rightFromBracket!!
    }

private var _rightFromBracket: ImageVector? = null
