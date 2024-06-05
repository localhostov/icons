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

public val Icons.Outline.Bath: ImageVector
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
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(-7.518f)
                curveToRelative(0.0f, -0.841f, 0.38f, -1.673f, 1.093f, -2.12f)
                curveToRelative(1.089f, -0.683f, 2.419f, -0.347f, 3.107f, 0.571f)
                lineToRelative(0.259f, 0.345f)
                lineToRelative(-0.483f, 2.771f)
                curveToRelative(-0.058f, 0.334f, 0.011f, 0.678f, 0.194f, 0.963f)
                curveToRelative(0.425f, 0.662f, 1.323f, 0.824f, 1.952f, 0.352f)
                lineToRelative(3.606f, -2.704f)
                curveToRelative(0.567f, -0.425f, 0.71f, -1.217f, 0.327f, -1.814f)
                lineToRelative(-0.013f, -0.021f)
                curveToRelative(-0.237f, -0.37f, -0.64f, -0.602f, -1.079f, -0.622f)
                lineToRelative(-2.906f, -0.129f)
                lineToRelative(-0.174f, -0.232f)
                curveToRelative(-0.658f, -0.877f, -1.593f, -1.542f, -2.669f, -1.755f)
                curveTo(2.44f, -0.462f, 0.0f, 1.656f, 0.0f, 4.333f)
                curveToRelative(0.0f, 0.0f, 0.004f, 5.71f, 0.006f, 7.923f)
                curveToRelative(0.0f, 0.576f, 0.037f, 1.145f, 0.108f, 1.717f)
                curveToRelative(0.101f, 0.809f, 0.237f, 1.9f, 0.237f, 1.9f)
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
                moveTo(21.992f, 15.124f)
                lineToRelative(-0.062f, 0.501f)
                curveToRelative(-0.383f, 3.064f, -3.001f, 5.375f, -6.089f, 5.375f)
                horizontalLineToRelative(-7.417f)
                curveToRelative(-3.088f, 0.0f, -5.705f, -2.311f, -6.088f, -5.375f)
                lineToRelative(-0.203f, -1.625f)
                horizontalLineToRelative(18.867f)
                curveToRelative(0.291f, 0.0f, 0.558f, 0.12f, 0.75f, 0.338f)
                curveToRelative(0.192f, 0.219f, 0.278f, 0.497f, 0.242f, 0.786f)
                close()
            }
        }
        .build()
        return _bath!!
    }

private var _bath: ImageVector? = null
