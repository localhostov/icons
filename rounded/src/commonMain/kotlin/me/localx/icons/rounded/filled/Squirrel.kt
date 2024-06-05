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
                moveToRelative(24.0f, 15.29f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                curveToRelative(-0.181f, 0.0f, -0.342f, -0.061f, -0.488f, -0.145f)
                curveToRelative(-0.007f, 0.0f, -1.142f, -0.589f, -1.736f, -0.787f)
                curveToRelative(-0.76f, -0.254f, -1.405f, -0.713f, -1.882f, -1.3f)
                lineToRelative(-0.911f, 1.458f)
                curveToRelative(-1.06f, -0.942f, -2.455f, -1.516f, -3.982f, -1.516f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.541f, 0.43f, 0.982f, 0.968f, 0.999f)
                curveToRelative(1.561f, 0.049f, 3.036f, 0.818f, 3.657f, 2.251f)
                curveToRelative(0.591f, 1.362f, 0.444f, 2.705f, -0.162f, 3.75f)
                horizontalLineToRelative(3.537f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-10.315f)
                curveToRelative(-2.578f, 0.0f, -4.977f, -1.253f, -6.419f, -3.353f)
                curveTo(2.983f, 18.78f, 0.0f, 13.615f, 0.0f, 6.0f)
                curveTo(0.0f, 2.651f, 2.636f, -0.067f, 6.0f, 0.0f)
                curveToRelative(2.623f, 0.0f, 5.0f, 2.127f, 5.0f, 4.75f)
                curveToRelative(0.0f, 1.431f, -0.633f, 2.714f, -1.634f, 3.585f)
                curveToRelative(-1.226f, 0.849f, -2.651f, 2.023f, -3.742f, 3.257f)
                curveToRelative(-1.562f, 1.767f, -1.78f, 4.354f, -0.638f, 6.417f)
                lineToRelative(0.016f, 0.029f)
                curveToRelative(0.072f, -4.143f, 3.481f, -6.664f, 6.295f, -8.514f)
                curveToRelative(0.053f, -0.035f, 0.616f, -0.402f, 0.668f, -0.435f)
                curveToRelative(0.724f, -0.47f, 1.542f, -1.002f, 2.147f, -1.489f)
                curveToRelative(0.516f, 2.508f, 2.761f, 4.401f, 5.444f, 4.401f)
                curveToRelative(0.167f, 0.0f, 0.332f, -0.004f, 0.495f, -0.011f)
                curveToRelative(0.155f, 0.674f, 0.663f, 1.239f, 1.359f, 1.472f)
                curveToRelative(0.682f, 0.228f, 1.494f, 0.633f, 2.12f, 1.002f)
                curveToRelative(0.277f, 0.178f, 0.471f, 0.474f, 0.471f, 0.827f)
                close()
                moveTo(19.556f, 10.0f)
                curveToRelative(1.964f, 0.0f, 4.444f, -0.692f, 4.444f, -2.625f)
                curveToRelative(0.0f, -1.651f, -1.582f, -4.08f, -4.0f, -4.35f)
                lineTo(20.0f, 0.712f)
                curveToRelative(0.0f, -0.488f, -0.482f, -0.83f, -0.946f, -0.676f)
                curveToRelative(-1.193f, 0.396f, -2.054f, 1.638f, -2.054f, 2.964f)
                verticalLineToRelative(1.067f)
                curveToRelative(-0.619f, 0.63f, -1.0f, 1.488f, -1.0f, 2.433f)
                curveToRelative(0.0f, 1.933f, 1.592f, 3.5f, 3.556f, 3.5f)
                close()
            }
        }
        .build()
        return _squirrel!!
    }

private var _squirrel: ImageVector? = null
