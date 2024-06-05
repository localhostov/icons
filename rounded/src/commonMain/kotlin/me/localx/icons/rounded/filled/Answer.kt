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

public val Icons.Filled.Answer: ImageVector
    get() {
        if (_answer != null) {
            return _answer!!
        }
        _answer = Builder(name = "Answer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.138f, 6.118f)
                lineToRelative(1.168f, 4.89f)
                horizontalLineToRelative(-2.571f)
                lineToRelative(1.129f, -4.899f)
                curveToRelative(0.011f, -0.046f, 0.025f, -0.108f, 0.136f, -0.108f)
                reflectiveCurveToRelative(0.125f, 0.062f, 0.138f, 0.118f)
                close()
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-2.853f)
                lineToRelative(-3.847f, 3.18f)
                curveToRelative(-0.361f, 0.322f, -0.824f, 0.484f, -1.292f, 0.484f)
                curveToRelative(-0.476f, 0.0f, -0.955f, -0.168f, -1.337f, -0.508f)
                lineToRelative(-3.749f, -3.156f)
                horizontalLineToRelative(-2.923f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                lineTo(-0.001f, 4.0f)
                curveTo(0.0f, 1.794f, 1.794f, 0.0f, 4.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(16.261f, 14.768f)
                lineToRelative(-2.176f, -9.104f)
                curveToRelative(-0.227f, -0.995f, -1.064f, -1.663f, -2.085f, -1.663f)
                reflectiveCurveToRelative(-1.858f, 0.668f, -2.085f, 1.661f)
                lineToRelative(-2.102f, 9.114f)
                curveToRelative(-0.124f, 0.538f, 0.212f, 1.075f, 0.75f, 1.199f)
                curveToRelative(0.538f, 0.126f, 1.075f, -0.212f, 1.199f, -0.75f)
                lineToRelative(0.511f, -2.217f)
                horizontalLineToRelative(3.51f)
                lineToRelative(0.532f, 2.225f)
                curveToRelative(0.109f, 0.459f, 0.52f, 0.768f, 0.972f, 0.768f)
                curveToRelative(0.077f, 0.0f, 0.155f, -0.009f, 0.233f, -0.027f)
                curveToRelative(0.537f, -0.128f, 0.868f, -0.668f, 0.74f, -1.205f)
                close()
            }
        }
        .build()
        return _answer!!
    }

private var _answer: ImageVector? = null
