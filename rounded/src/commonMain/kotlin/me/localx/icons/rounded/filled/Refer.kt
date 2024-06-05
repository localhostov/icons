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

public val Icons.Filled.Refer: ImageVector
    get() {
        if (_refer != null) {
            return _refer!!
        }
        _refer = Builder(name = "Refer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.5f, 7.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(7.43f, 0.0f, 5.5f, 0.0f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(17.5f, 17.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.019f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(8.433f, 18.607f)
                curveToRelative(0.76f, 0.762f, 0.76f, 2.023f, -0.013f, 2.798f)
                lineToRelative(-2.199f, 2.288f)
                curveToRelative(-0.196f, 0.204f, -0.458f, 0.307f, -0.721f, 0.307f)
                curveToRelative(-0.25f, 0.0f, -0.499f, -0.093f, -0.693f, -0.279f)
                curveToRelative(-0.398f, -0.383f, -0.411f, -1.016f, -0.028f, -1.414f)
                lineToRelative(1.256f, -1.307f)
                horizontalLineToRelative(-2.035f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.029f)
                lineToRelative(-1.25f, -1.307f)
                curveToRelative(-0.383f, -0.398f, -0.371f, -1.031f, 0.028f, -1.414f)
                curveToRelative(0.398f, -0.382f, 1.031f, -0.371f, 1.414f, 0.027f)
                lineToRelative(2.212f, 2.301f)
                close()
                moveTo(23.959f, 22.717f)
                curveToRelative(-0.816f, -2.777f, -3.473f, -4.718f, -6.459f, -4.718f)
                reflectiveCurveToRelative(-5.643f, 1.94f, -6.459f, 4.718f)
                curveToRelative(-0.089f, 0.303f, -0.03f, 0.629f, 0.159f, 0.882f)
                curveToRelative(0.189f, 0.252f, 0.486f, 0.4f, 0.801f, 0.4f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.315f, 0.0f, 0.612f, -0.148f, 0.801f, -0.4f)
                curveToRelative(0.188f, -0.253f, 0.247f, -0.579f, 0.158f, -0.882f)
                close()
                moveTo(5.5f, 8.0f)
                curveToRelative(-2.434f, 0.0f, -4.618f, 1.467f, -5.437f, 3.649f)
                curveToRelative(-0.115f, 0.307f, -0.072f, 0.65f, 0.115f, 0.92f)
                curveToRelative(0.187f, 0.27f, 0.494f, 0.431f, 0.822f, 0.431f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.328f, 0.0f, 0.635f, -0.161f, 0.822f, -0.431f)
                curveToRelative(0.187f, -0.27f, 0.229f, -0.613f, 0.115f, -0.92f)
                curveToRelative(-0.818f, -2.183f, -3.003f, -3.649f, -5.437f, -3.649f)
                close()
            }
        }
        .build()
        return _refer!!
    }

private var _refer: ImageVector? = null
