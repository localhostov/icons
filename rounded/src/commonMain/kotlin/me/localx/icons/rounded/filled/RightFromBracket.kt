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

public val Icons.Filled.RightFromBracket: ImageVector
    get() {
        if (_rightFromBracket != null) {
            return _rightFromBracket!!
        }
        _rightFromBracket = Builder(name = "RightFromBracket", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 24.0f)
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
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(16.096f, 21.186f)
                lineToRelative(6.746f, -6.347f)
                curveToRelative(0.008f, -0.007f, 0.015f, -0.015f, 0.022f, -0.021f)
                curveToRelative(1.546f, -1.548f, 1.545f, -4.067f, -0.027f, -5.641f)
                lineToRelative(-6.746f, -6.281f)
                curveToRelative(-0.867f, -0.868f, -2.111f, -1.118f, -3.246f, -0.651f)
                curveToRelative(-1.134f, 0.467f, -1.841f, 1.519f, -1.846f, 2.75f)
                verticalLineToRelative(2.054f)
                lineToRelative(-2.0f, -0.005f)
                curveToRelative(-2.191f, 0.0f, -3.974f, 1.783f, -3.974f, 3.974f)
                verticalLineToRelative(1.982f)
                curveToRelative(0.0f, 2.191f, 1.783f, 3.974f, 3.963f, 3.974f)
                lineToRelative(2.037f, 0.022f)
                verticalLineToRelative(2.074f)
                curveToRelative(0.006f, 1.227f, 0.714f, 2.277f, 1.849f, 2.744f)
                curveToRelative(0.38f, 0.156f, 0.772f, 0.232f, 1.158f, 0.232f)
                curveToRelative(0.765f, 0.0f, 1.503f, -0.299f, 2.064f, -0.861f)
                close()
                moveTo(22.157f, 14.111f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _rightFromBracket!!
    }

private var _rightFromBracket: ImageVector? = null
