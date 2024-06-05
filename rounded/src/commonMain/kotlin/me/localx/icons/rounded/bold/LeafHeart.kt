package me.localx.icons.rounded.bold

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

public val Icons.Bold.LeafHeart: ImageVector
    get() {
        if (_leafHeart != null) {
            return _leafHeart!!
        }
        _leafHeart = Builder(name = "LeafHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.398f, 0.365f)
                curveToRelative(-0.851f, -0.49f, -1.836f, -0.487f, -2.641f, 0.013f)
                curveToRelative(-2.336f, 1.45f, -4.646f, 1.601f, -6.879f, 1.747f)
                curveToRelative(-2.707f, 0.178f, -5.507f, 0.361f, -7.949f, 2.804f)
                curveToRelative(-1.944f, 1.945f, -2.984f, 4.53f, -2.927f, 7.28f)
                curveToRelative(0.043f, 2.098f, 0.723f, 4.074f, 1.944f, 5.723f)
                lineToRelative(-3.507f, 3.507f)
                curveToRelative(-0.586f, 0.585f, -0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                lineToRelative(3.509f, -3.509f)
                curveToRelative(1.652f, 1.212f, 3.629f, 1.854f, 5.721f, 1.854f)
                curveToRelative(0.306f, 0.0f, 0.613f, -0.014f, 0.923f, -0.042f)
                curveToRelative(3.001f, -0.268f, 5.779f, -1.814f, 7.623f, -4.244f)
                horizontalLineToRelative(0.0f)
                curveToRelative(2.222f, -2.928f, 3.453f, -7.77f, 3.661f, -14.392f)
                curveToRelative(0.035f, -1.14f, -0.608f, -2.29f, -1.601f, -2.863f)
                close()
                moveTo(17.948f, 15.806f)
                curveToRelative(-1.335f, 1.758f, -3.34f, 2.877f, -5.501f, 3.069f)
                curveToRelative(-1.937f, 0.175f, -3.786f, -0.436f, -5.181f, -1.718f)
                curveToRelative(-1.42f, -1.308f, -2.225f, -3.087f, -2.265f, -5.011f)
                curveToRelative(-0.04f, -1.925f, 0.688f, -3.735f, 2.049f, -5.097f)
                curveToRelative(1.645f, -1.644f, 3.577f, -1.771f, 6.024f, -1.931f)
                curveToRelative(2.386f, -0.156f, 5.078f, -0.333f, 7.925f, -1.988f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.002f, 0.0f, 0.004f)
                curveToRelative(-0.186f, 5.902f, -1.241f, 10.284f, -3.053f, 12.672f)
                close()
                moveTo(17.0f, 10.474f)
                curveToRelative(0.0f, 1.879f, -2.495f, 4.199f, -3.796f, 5.261f)
                curveToRelative(-0.489f, 0.399f, -1.179f, 0.399f, -1.668f, 0.0f)
                curveToRelative(-1.301f, -1.062f, -3.536f, -3.382f, -3.536f, -5.261f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                curveToRelative(0.0f, -1.367f, 1.007f, -2.475f, 2.25f, -2.475f)
                reflectiveCurveToRelative(2.25f, 1.108f, 2.25f, 2.475f)
                close()
            }
        }
        .build()
        return _leafHeart!!
    }

private var _leafHeart: ImageVector? = null
