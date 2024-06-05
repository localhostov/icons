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

public val Icons.Filled.Squirrel: ImageVector
    get() {
        if (_squirrel != null) {
            return _squirrel!!
        }
        _squirrel = Builder(name = "Squirrel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 6.5f)
                curveToRelative(0.0f, -0.945f, 0.381f, -1.803f, 1.0f, -2.433f)
                verticalLineToRelative(-1.067f)
                curveToRelative(0.0f, -1.657f, 1.343f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(3.025f)
                curveToRelative(2.418f, 0.27f, 4.0f, 2.699f, 4.0f, 4.35f)
                curveToRelative(0.0f, 1.933f, -2.481f, 2.625f, -4.444f, 2.625f)
                reflectiveCurveToRelative(-3.556f, -1.567f, -3.556f, -3.5f)
                close()
                moveTo(17.982f, 15.516f)
                lineToRelative(0.911f, -1.458f)
                curveToRelative(0.477f, 0.588f, 1.122f, 1.046f, 1.882f, 1.3f)
                curveToRelative(0.758f, 0.253f, 1.482f, 0.619f, 2.151f, 1.087f)
                lineToRelative(1.146f, -1.639f)
                curveToRelative(-0.827f, -0.579f, -1.723f, -1.031f, -2.664f, -1.345f)
                curveToRelative(-0.696f, -0.233f, -1.204f, -0.797f, -1.359f, -1.472f)
                curveToRelative(-0.162f, 0.007f, -0.327f, 0.011f, -0.495f, 0.011f)
                curveToRelative(-2.683f, 0.0f, -4.928f, -1.893f, -5.444f, -4.401f)
                curveToRelative(-0.604f, 0.487f, -1.423f, 1.019f, -2.147f, 1.489f)
                curveToRelative(-0.052f, 0.034f, -0.615f, 0.401f, -0.668f, 0.435f)
                curveToRelative(-2.815f, 1.851f, -6.224f, 4.371f, -6.295f, 8.514f)
                lineToRelative(-0.016f, -0.029f)
                curveToRelative(-1.142f, -2.064f, -0.924f, -4.65f, 0.638f, -6.417f)
                curveToRelative(1.091f, -1.234f, 2.516f, -2.407f, 3.742f, -3.257f)
                curveToRelative(1.001f, -0.871f, 1.634f, -2.154f, 1.634f, -3.585f)
                curveToRelative(0.0f, -2.623f, -2.377f, -4.75f, -5.0f, -4.75f)
                curveTo(2.636f, -0.067f, 0.0f, 2.651f, 0.0f, 6.0f)
                curveToRelative(0.0f, 7.615f, 2.983f, 12.78f, 4.266f, 14.647f)
                curveToRelative(1.442f, 2.099f, 3.841f, 3.353f, 6.419f, 3.353f)
                horizontalLineToRelative(11.315f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.537f)
                curveToRelative(0.341f, -0.589f, 0.537f, -1.272f, 0.537f, -2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.527f, 0.0f, 2.922f, 0.573f, 3.982f, 1.516f)
                close()
            }
        }
        .build()
        return _squirrel!!
    }

private var _squirrel: ImageVector? = null
