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

public val Icons.Outline.Galaxy: ImageVector
    get() {
        if (_galaxy != null) {
            return _galaxy!!
        }
        _galaxy = Builder(name = "Galaxy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 12.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 14.255f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.682f, -0.382f, 1.286f, -0.998f, 1.577f)
                curveToRelative(-0.613f, 0.29f, -1.318f, 0.202f, -1.839f, -0.227f)
                curveToRelative(-0.686f, -0.563f, -1.492f, -1.02f, -2.449f, -1.386f)
                curveToRelative(0.11f, 1.034f, 0.035f, 2.078f, -0.226f, 3.113f)
                curveToRelative(-0.982f, 3.889f, -4.551f, 6.616f, -8.705f, 6.667f)
                curveToRelative(-0.013f, 0.0f, -0.025f, 0.0f, -0.038f, 0.0f)
                curveToRelative(-0.01f, 0.0f, -0.016f, 0.0f, -0.024f, 0.0f)
                horizontalLineToRelative(-0.053f)
                curveToRelative(-0.65f, -0.029f, -1.219f, -0.406f, -1.5f, -0.998f)
                curveToRelative(-0.289f, -0.612f, -0.203f, -1.317f, 0.227f, -1.839f)
                curveToRelative(0.563f, -0.686f, 1.02f, -1.492f, 1.386f, -2.449f)
                curveToRelative(-1.034f, 0.111f, -2.078f, 0.035f, -3.113f, -0.226f)
                curveTo(2.743f, 17.496f, 0.001f, 13.901f, 0.0f, 9.745f)
                curveToRelative(0.0f, -0.682f, 0.382f, -1.286f, 0.998f, -1.577f)
                curveToRelative(0.613f, -0.291f, 1.318f, -0.203f, 1.839f, 0.227f)
                curveToRelative(0.686f, 0.563f, 1.492f, 1.02f, 2.449f, 1.386f)
                curveToRelative(-0.11f, -1.034f, -0.035f, -2.078f, 0.226f, -3.113f)
                curveTo(6.504f, 2.743f, 10.099f, 0.001f, 14.255f, 0.0f)
                curveToRelative(0.682f, 0.0f, 1.286f, 0.382f, 1.577f, 0.998f)
                curveToRelative(0.289f, 0.612f, 0.203f, 1.317f, -0.227f, 1.839f)
                curveToRelative(-0.563f, 0.686f, -1.02f, 1.492f, -1.386f, 2.449f)
                curveToRelative(1.035f, -0.109f, 2.078f, -0.034f, 3.113f, 0.226f)
                curveToRelative(3.925f, 0.991f, 6.667f, 4.586f, 6.667f, 8.742f)
                close()
                moveTo(21.979f, 13.71f)
                curveToRelative(-0.223f, -3.004f, -2.272f, -5.535f, -5.136f, -6.258f)
                curveToRelative(-1.011f, -0.254f, -2.031f, -0.283f, -3.032f, -0.081f)
                curveToRelative(-0.534f, 0.107f, -1.067f, -0.07f, -1.429f, -0.472f)
                curveToRelative(-0.366f, -0.407f, -0.486f, -0.965f, -0.32f, -1.491f)
                curveToRelative(0.413f, -1.316f, 0.955f, -2.431f, 1.649f, -3.388f)
                curveToRelative(-3.004f, 0.223f, -5.535f, 2.272f, -6.258f, 5.136f)
                curveToRelative(-0.255f, 1.011f, -0.282f, 2.032f, -0.081f, 3.032f)
                curveToRelative(0.107f, 0.534f, -0.07f, 1.068f, -0.472f, 1.429f)
                curveToRelative(-0.407f, 0.366f, -0.965f, 0.484f, -1.491f, 0.32f)
                curveToRelative(-1.316f, -0.413f, -2.431f, -0.955f, -3.388f, -1.649f)
                curveToRelative(0.223f, 3.004f, 2.272f, 5.535f, 5.136f, 6.258f)
                curveToRelative(1.01f, 0.254f, 2.028f, 0.283f, 3.026f, 0.083f)
                curveToRelative(0.103f, -0.021f, 0.205f, -0.03f, 0.306f, -0.03f)
                curveToRelative(0.428f, 0.0f, 0.835f, 0.179f, 1.129f, 0.506f)
                curveToRelative(0.365f, 0.407f, 0.485f, 0.962f, 0.321f, 1.485f)
                curveToRelative(-0.413f, 1.315f, -0.953f, 2.428f, -1.646f, 3.383f)
                curveToRelative(3.014f, -0.251f, 5.537f, -2.291f, 6.254f, -5.131f)
                curveToRelative(0.255f, -1.011f, 0.282f, -2.032f, 0.081f, -3.032f)
                curveToRelative(-0.107f, -0.534f, 0.07f, -1.068f, 0.472f, -1.429f)
                curveToRelative(0.406f, -0.367f, 0.964f, -0.487f, 1.491f, -0.32f)
                curveToRelative(1.316f, 0.413f, 2.431f, 0.955f, 3.388f, 1.649f)
                close()
            }
        }
        .build()
        return _galaxy!!
    }

private var _galaxy: ImageVector? = null
