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

public val Icons.Filled.GiftCard: ImageVector
    get() {
        if (_giftCard != null) {
            return _giftCard!!
        }
        _giftCard = Builder(name = "GiftCard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                lineTo(24.0f, 19.0f)
                close()
                moveTo(24.0f, 10.0f)
                verticalLineToRelative(7.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(7.621f, 7.0f)
                curveToRelative(-0.428f, -0.246f, -0.867f, -0.548f, -1.299f, -0.932f)
                curveToRelative(-1.48f, -1.409f, -1.712f, -3.248f, -0.616f, -4.708f)
                curveTo(6.251f, 0.633f, 7.046f, 0.162f, 7.945f, 0.034f)
                curveToRelative(0.899f, -0.131f, 1.794f, 0.101f, 2.521f, 0.646f)
                curveToRelative(0.679f, 0.509f, 1.178f, 1.158f, 1.547f, 1.818f)
                curveToRelative(0.369f, -0.66f, 0.867f, -1.308f, 1.547f, -1.818f)
                curveToRelative(0.726f, -0.545f, 1.619f, -0.777f, 2.521f, -0.646f)
                curveToRelative(0.899f, 0.128f, 1.694f, 0.599f, 2.239f, 1.326f)
                curveToRelative(1.095f, 1.46f, 0.863f, 3.299f, -0.59f, 4.684f)
                curveToRelative(-0.445f, 0.395f, -0.897f, 0.704f, -1.337f, 0.956f)
                horizontalLineToRelative(4.607f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(13.0f, 6.0f)
                curveToRelative(0.094f, 0.0f, 1.791f, -0.021f, 3.376f, -1.428f)
                curveToRelative(0.387f, -0.369f, 0.984f, -1.158f, 0.343f, -2.013f)
                curveToRelative(-0.224f, -0.299f, -0.552f, -0.493f, -0.922f, -0.546f)
                curveToRelative(-0.368f, -0.049f, -0.739f, 0.042f, -1.038f, 0.267f)
                curveToRelative(-1.293f, 0.969f, -1.655f, 2.847f, -1.739f, 3.422f)
                verticalLineToRelative(0.015f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.011f, 0.074f, -0.019f, 0.283f, -0.019f, 0.283f)
                close()
                moveTo(7.676f, 4.597f)
                curveToRelative(1.558f, 1.381f, 3.256f, 1.403f, 3.305f, 1.403f)
                horizontalLineToRelative(0.02f)
                verticalLineToRelative(-0.328f)
                curveToRelative(-0.09f, -0.601f, -0.46f, -2.436f, -1.734f, -3.392f)
                curveToRelative(-0.299f, -0.224f, -0.666f, -0.314f, -1.038f, -0.267f)
                curveToRelative(-0.37f, 0.053f, -0.697f, 0.247f, -0.922f, 0.546f)
                curveToRelative(-0.641f, 0.855f, -0.043f, 1.643f, 0.37f, 2.037f)
                close()
                moveTo(18.002f, 11.0f)
                curveToRelative(-0.05f, 0.0f, -5.001f, -0.05f, -5.001f, -3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.95f, -4.952f, 3.0f, -5.001f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(1.72f, 0.0f, 4.518f, -0.533f, 6.001f, -2.252f)
                curveToRelative(1.484f, 1.719f, 4.282f, 2.252f, 6.0f, 2.252f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
