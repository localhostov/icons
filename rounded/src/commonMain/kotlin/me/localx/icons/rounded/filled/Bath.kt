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

public val Icons.Filled.Bath: ImageVector
    get() {
        if (_bath != null) {
            return _bath!!
        }
        _bath = Builder(name = "Bath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.249f, 13.015f)
                curveToRelative(-0.569f, -0.645f, -1.389f, -1.015f, -2.249f, -1.015f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-7.667f)
                curveToRelative(0.0f, -1.286f, 1.047f, -2.333f, 2.333f, -2.333f)
                curveToRelative(0.73f, 0.0f, 1.429f, 0.349f, 1.867f, 0.933f)
                lineToRelative(0.259f, 0.345f)
                lineToRelative(-0.483f, 2.771f)
                curveToRelative(-0.058f, 0.334f, 0.011f, 0.678f, 0.194f, 0.963f)
                curveToRelative(0.425f, 0.662f, 1.323f, 0.824f, 1.952f, 0.352f)
                lineToRelative(3.606f, -2.704f)
                curveToRelative(0.567f, -0.425f, 0.71f, -1.217f, 0.327f, -1.814f)
                lineToRelative(-0.013f, -0.021f)
                curveToRelative(-0.237f, -0.37f, -0.64f, -0.602f, -1.079f, -0.622f)
                lineToRelative(-2.906f, -0.129f)
                lineToRelative(-0.256f, -0.342f)
                curveToRelative(-0.814f, -1.085f, -2.11f, -1.732f, -3.467f, -1.732f)
                curveTo(1.943f, 0.0f, 0.0f, 1.943f, 0.0f, 4.333f)
                verticalLineToRelative(8.667f)
                reflectiveCurveToRelative(0.0f, 0.004f, 0.0f, 0.006f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, 0.0f, 0.029f)
                curveToRelative(0.0f, 0.009f, 0.0f, 0.018f, 0.001f, 0.027f)
                curveToRelative(0.0f, 0.007f, 0.0f, 0.013f, 0.002f, 0.02f)
                curveToRelative(0.001f, 0.012f, 0.002f, 0.025f, 0.004f, 0.037f)
                curveToRelative(0.0f, 0.002f, 0.0f, 0.003f, 0.0f, 0.005f)
                lineToRelative(0.344f, 2.749f)
                curveToRelative(0.251f, 2.005f, 1.223f, 3.767f, 2.635f, 5.037f)
                lineToRelative(-0.457f, 1.85f)
                curveToRelative(-0.133f, 0.536f, 0.194f, 1.078f, 0.73f, 1.211f)
                curveToRelative(0.081f, 0.02f, 0.161f, 0.029f, 0.241f, 0.029f)
                curveToRelative(0.449f, 0.0f, 0.857f, -0.305f, 0.97f, -0.76f)
                lineToRelative(0.277f, -1.121f)
                curveToRelative(1.109f, 0.564f, 2.36f, 0.881f, 3.676f, 0.881f)
                horizontalLineToRelative(7.417f)
                curveToRelative(1.223f, 0.0f, 2.39f, -0.273f, 3.44f, -0.765f)
                lineToRelative(0.249f, 1.005f)
                curveToRelative(0.112f, 0.455f, 0.521f, 0.76f, 0.97f, 0.76f)
                curveToRelative(0.08f, 0.0f, 0.16f, -0.01f, 0.241f, -0.029f)
                curveToRelative(0.536f, -0.133f, 0.863f, -0.675f, 0.73f, -1.211f)
                lineToRelative(-0.41f, -1.66f)
                curveToRelative(1.53f, -1.282f, 2.591f, -3.12f, 2.854f, -5.226f)
                lineToRelative(0.062f, -0.501f)
                curveToRelative(0.106f, -0.854f, -0.158f, -1.712f, -0.728f, -2.357f)
                close()
            }
        }
        .build()
        return _bath!!
    }

private var _bath: ImageVector? = null
