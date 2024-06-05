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

public val Icons.Filled.Knitting: ImageVector
    get() {
        if (_knitting != null) {
            return _knitting!!
        }
        _knitting = Builder(name = "Knitting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 4.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.142f, 0.019f, 0.279f, 0.042f, 0.415f)
                lineToRelative(-2.91f, 2.116f)
                curveToRelative(-0.62f, -0.807f, -1.369f, -1.507f, -2.222f, -2.065f)
                lineToRelative(1.369f, -2.489f)
                curveToRelative(0.074f, 0.007f, 0.146f, 0.022f, 0.222f, 0.022f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.573f, 0.201f, 1.095f, 0.525f, 1.516f)
                lineToRelative(-1.404f, 2.553f)
                curveToRelative(-0.974f, -0.362f, -2.022f, -0.569f, -3.121f, -0.569f)
                curveTo(4.037f, 6.0f, 0.0f, 10.038f, 0.0f, 15.0f)
                reflectiveCurveToRelative(4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -1.34f, -0.302f, -2.608f, -0.83f, -3.751f)
                lineToRelative(2.966f, -2.157f)
                curveToRelative(0.393f, 0.256f, 0.86f, 0.408f, 1.364f, 0.408f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9.004f, 22.0f)
                curveToRelative(-3.8f, -1.344f, -6.548f, -4.915f, -6.665f, -9.141f)
                curveToRelative(0.484f, -1.501f, 1.459f, -2.783f, 2.738f, -3.652f)
                curveToRelative(-0.494f, 1.059f, -0.753f, 2.191f, -0.753f, 3.372f)
                curveToRelative(0.0f, 4.162f, 3.779f, 8.139f, 8.354f, 8.366f)
                curveToRelative(-1.07f, 0.664f, -2.326f, 1.055f, -3.674f, 1.055f)
                close()
                moveTo(15.59f, 17.338f)
                curveToRelative(-0.249f, 0.7f, -0.605f, 1.347f, -1.051f, 1.925f)
                curveToRelative(-5.159f, -0.384f, -8.215f, -3.027f, -8.215f, -7.185f)
                curveToRelative(0.0f, -1.323f, 0.284f, -2.62f, 0.819f, -3.82f)
                curveToRelative(0.593f, -0.164f, 1.214f, -0.258f, 1.858f, -0.258f)
                curveToRelative(0.138f, 0.0f, 0.364f, -0.008f, 0.5f, 0.0f)
                curveToRelative(-0.769f, 1.2f, -1.161f, 2.888f, -1.161f, 4.305f)
                curveToRelative(1.562f, -0.793f, 2.85f, -2.055f, 3.701f, -3.601f)
                curveToRelative(0.615f, 0.298f, 1.178f, 0.682f, 1.677f, 1.138f)
                curveToRelative(-1.125f, 1.961f, -2.848f, 3.526f, -4.9f, 4.456f)
                curveToRelative(0.344f, 0.686f, 0.846f, 1.221f, 1.441f, 1.634f)
                curveToRelative(1.951f, -0.956f, 3.975f, -2.924f, 4.753f, -4.504f)
                curveToRelative(0.419f, 0.702f, 0.719f, 1.48f, 0.871f, 2.312f)
                curveToRelative(-0.815f, 1.195f, -1.98f, 2.308f, -3.336f, 3.193f)
                curveToRelative(0.934f, 0.24f, 2.2f, 0.369f, 3.045f, 0.404f)
                close()
                moveTo(8.339f, 12.304f)
                curveToRelative(0.0f, 0.079f, -0.003f, -0.077f, 0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _knitting!!
    }

private var _knitting: ImageVector? = null
