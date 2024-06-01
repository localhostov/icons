package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Reflect: ImageVector
    get() {
        if (_reflect != null) {
            return _reflect!!
        }
        _reflect = Builder(name = "Reflect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 13.0006f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 13.0006f, 0.4804f, 12.8953f, 0.2929f, 12.7077f)
                    curveTo(0.1054f, 12.5202f, 0.0f, 12.2658f, 0.0f, 12.0006f)
                    curveTo(0.0f, 11.7354f, 0.1054f, 11.481f, 0.2929f, 11.2935f)
                    curveTo(0.4804f, 11.106f, 0.7348f, 11.0006f, 1.0f, 11.0006f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 11.0006f, 23.5196f, 11.106f, 23.7071f, 11.2935f)
                    curveTo(23.8946f, 11.481f, 24.0f, 11.7354f, 24.0f, 12.0006f)
                    curveTo(24.0f, 12.2658f, 23.8946f, 12.5202f, 23.7071f, 12.7077f)
                    curveTo(23.5196f, 12.8953f, 23.2652f, 13.0006f, 23.0f, 13.0006f)
                    close()
                    moveTo(18.934f, 7.1266f)
                    curveTo(19.0597f, 6.5933f, 19.0012f, 6.0331f, 18.7681f, 5.5373f)
                    curveTo(18.5349f, 5.0414f, 18.1409f, 4.6391f, 17.65f, 4.3956f)
                    lineTo(9.668f, 0.4286f)
                    curveTo(9.1697f, 0.1456f, 8.6063f, -0.0027f, 8.0333f, -0.0018f)
                    curveTo(7.4603f, -0.001f, 6.8974f, 0.1491f, 6.4f, 0.4336f)
                    curveTo(5.9666f, 0.6848f, 5.6083f, 1.0473f, 5.3622f, 1.4835f)
                    curveTo(5.116f, 1.9197f, 4.991f, 2.4138f, 5.0f, 2.9146f)
                    verticalLineTo(6.0006f)
                    curveTo(5.0f, 6.7963f, 5.3161f, 7.5593f, 5.8787f, 8.1219f)
                    curveTo(6.4413f, 8.6845f, 7.2043f, 9.0006f, 8.0f, 9.0006f)
                    horizontalLineTo(16.318f)
                    curveTo(16.9035f, 9.0387f, 17.484f, 8.8729f, 17.961f, 8.5312f)
                    curveTo(18.4379f, 8.1895f, 18.7817f, 7.6932f, 18.934f, 7.1266f)
                    close()
                    moveTo(9.628f, 23.5926f)
                    lineTo(17.661f, 19.6006f)
                    curveTo(18.1491f, 19.3559f, 18.5403f, 18.9536f, 18.7713f, 18.4589f)
                    curveTo(19.0024f, 17.9642f, 19.0597f, 17.406f, 18.934f, 16.8746f)
                    curveTo(18.7817f, 16.308f, 18.4379f, 15.8117f, 17.961f, 15.47f)
                    curveTo(17.484f, 15.1284f, 16.9035f, 14.9625f, 16.318f, 15.0006f)
                    horizontalLineTo(8.0f)
                    curveTo(7.2043f, 15.0006f, 6.4413f, 15.3167f, 5.8787f, 15.8793f)
                    curveTo(5.3161f, 16.4419f, 5.0f, 17.205f, 5.0f, 18.0006f)
                    verticalLineTo(21.0856f)
                    curveTo(4.9909f, 21.5864f, 5.1158f, 22.0806f, 5.362f, 22.5168f)
                    curveTo(5.6082f, 22.9531f, 5.9666f, 23.3155f, 6.4f, 23.5666f)
                    curveTo(6.8955f, 23.8543f, 7.459f, 24.0041f, 8.032f, 24.0006f)
                    curveTo(8.59f, 24.0023f, 9.1393f, 23.8619f, 9.628f, 23.5926f)
                    close()
                }
            }
        }
        .build()
        return _reflect!!
    }

private var _reflect: ImageVector? = null
