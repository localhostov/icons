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

public val Icons.Outline.Answer: ImageVector
    get() {
        if (_answer != null) {
            return _answer!!
        }
        _answer = Builder(name = "Answer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(2.923f)
                lineToRelative(3.749f, 3.156f)
                curveToRelative(0.382f, 0.34f, 0.861f, 0.509f, 1.337f, 0.508f)
                curveToRelative(0.468f, 0.0f, 0.931f, -0.162f, 1.292f, -0.484f)
                lineToRelative(3.847f, -3.18f)
                horizontalLineToRelative(2.853f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                lineTo(24.001f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.212f)
                curveToRelative(-0.232f, 0.0f, -0.458f, 0.081f, -0.637f, 0.229f)
                lineToRelative(-4.171f, 3.415f)
                lineToRelative(-4.048f, -3.409f)
                curveToRelative(-0.181f, -0.152f, -0.409f, -0.235f, -0.645f, -0.235f)
                horizontalLineToRelative(-3.288f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(1.999f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(14.085f, 5.663f)
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
                lineToRelative(-2.176f, -9.104f)
                close()
                moveTo(10.735f, 11.008f)
                lineToRelative(1.129f, -4.899f)
                curveToRelative(0.011f, -0.046f, 0.025f, -0.108f, 0.136f, -0.108f)
                reflectiveCurveToRelative(0.125f, 0.062f, 0.138f, 0.118f)
                lineToRelative(1.168f, 4.89f)
                horizontalLineToRelative(-2.571f)
                close()
            }
        }
        .build()
        return _answer!!
    }

private var _answer: ImageVector? = null
