package me.localx.icons.straight.bold

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

public val Icons.Bold.Meat: ImageVector
    get() {
        if (_meat != null) {
            return _meat!!
        }
        _meat = Builder(name = "Meat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.4f, 6.6f)
                curveToRelative(0.663f, 0.663f, 0.797f, 1.603f, 0.3f, 2.1f)
                reflectiveCurveToRelative(-1.437f, 0.363f, -2.1f, -0.3f)
                reflectiveCurveToRelative(-0.797f, -1.603f, -0.3f, -2.1f)
                curveToRelative(0.497f, -0.497f, 1.437f, -0.363f, 2.1f, 0.3f)
                close()
                moveTo(22.36f, 13.36f)
                curveToRelative(-5.215f, 5.216f, -12.663f, 5.623f, -12.978f, 5.638f)
                lineToRelative(-0.662f, 0.031f)
                lineToRelative(-0.814f, -0.814f)
                lineToRelative(-2.433f, 2.433f)
                curveToRelative(0.327f, 0.356f, 0.527f, 0.831f, 0.527f, 1.352f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.521f, 0.0f, 0.996f, 0.2f, 1.352f, 0.527f)
                lineToRelative(2.433f, -2.433f)
                lineToRelative(-0.832f, -0.832f)
                lineToRelative(0.051f, -0.686f)
                curveToRelative(0.024f, -0.322f, 0.666f, -7.946f, 5.635f, -12.937f)
                curveToRelative(2.571f, -2.569f, 7.29f, -2.031f, 10.521f, 1.2f)
                curveToRelative(3.231f, 3.23f, 3.77f, 7.95f, 1.2f, 10.521f)
                close()
                moveTo(15.355f, 14.462f)
                curveToRelative(-1.272f, -0.48f, -2.481f, -1.267f, -3.516f, -2.302f)
                curveToRelative(-1.041f, -1.041f, -1.802f, -2.237f, -2.27f, -3.465f)
                curveToRelative(-0.952f, 2.275f, -1.346f, 4.407f, -1.494f, 5.446f)
                lineToRelative(1.799f, 1.8f)
                curveToRelative(1.024f, -0.125f, 3.164f, -0.487f, 5.481f, -1.478f)
                close()
                moveTo(19.039f, 4.961f)
                curveToRelative(-1.27f, -1.27f, -2.872f, -1.959f, -4.23f, -1.959f)
                curveToRelative(-0.81f, 0.0f, -1.534f, 0.245f, -2.048f, 0.76f)
                curveToRelative(-1.376f, 1.376f, -0.827f, 4.251f, 1.2f, 6.278f)
                curveToRelative(1.054f, 1.054f, 2.333f, 1.734f, 3.6f, 1.916f)
                curveToRelative(1.105f, 0.157f, 2.059f, -0.096f, 2.679f, -0.715f)
                curveToRelative(1.376f, -1.376f, 0.827f, -4.251f, -1.2f, -6.278f)
                close()
            }
        }
        .build()
        return _meat!!
    }

private var _meat: ImageVector? = null
