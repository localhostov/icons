package me.localx.icons.rounded.bold

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

public val Icons.Bold.Coffee: ImageVector
    get() {
        if (_coffee != null) {
            return _coffee!!
        }
        _coffee = Builder(name = "Coffee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0001f, 5.0f)
                    curveTo(23.9985f, 4.3273f, 23.7708f, 3.6747f, 23.3537f, 3.147f)
                    curveTo(22.9366f, 2.6192f, 22.3542f, 2.247f, 21.7001f, 2.09f)
                    curveTo(21.4267f, 1.4689f, 20.9787f, 0.9407f, 20.4106f, 0.5696f)
                    curveTo(19.8424f, 0.1986f, 19.1787f, 7.0E-4f, 18.5001f, 0.0f)
                    lineTo(5.5001f, 0.0f)
                    curveTo(4.8215f, 7.0E-4f, 4.1578f, 0.1986f, 3.5896f, 0.5696f)
                    curveTo(3.0215f, 0.9407f, 2.5735f, 1.4689f, 2.3001f, 2.09f)
                    curveTo(1.6713f, 2.2495f, 1.1111f, 2.6085f, 0.7035f, 3.1133f)
                    curveTo(0.296f, 3.618f, 0.063f, 4.2413f, 0.0396f, 4.8896f)
                    curveTo(0.0162f, 5.5379f, 0.2035f, 6.1763f, 0.5736f, 6.7091f)
                    curveTo(0.9436f, 7.242f, 1.4764f, 7.6405f, 2.0921f, 7.845f)
                    lineTo(3.5391f, 19.4f)
                    curveTo(3.699f, 20.6693f, 4.3162f, 21.8367f, 5.2751f, 22.6835f)
                    curveTo(6.234f, 23.5303f, 7.4688f, 23.9983f, 8.7481f, 24.0f)
                    horizontalLineTo(15.2481f)
                    curveTo(16.5274f, 23.9983f, 17.7622f, 23.5303f, 18.7211f, 22.6835f)
                    curveTo(19.68f, 21.8367f, 20.2972f, 20.6693f, 20.4571f, 19.4f)
                    lineTo(21.9061f, 7.845f)
                    curveTo(22.5117f, 7.6541f, 23.041f, 7.2756f, 23.4174f, 6.7642f)
                    curveTo(23.7938f, 6.2528f, 23.9978f, 5.635f, 24.0001f, 5.0f)
                    close()
                    moveTo(18.2381f, 13.0f)
                    horizontalLineTo(14.8161f)
                    curveTo(13.9161f, 9.041f, 10.0831f, 9.043f, 9.1841f, 13.0f)
                    horizontalLineTo(5.7621f)
                    lineTo(5.1371f, 8.0f)
                    horizontalLineTo(18.8631f)
                    lineTo(18.2381f, 13.0f)
                    close()
                    moveTo(5.5001f, 3.0f)
                    horizontalLineTo(18.5001f)
                    curveTo(18.6327f, 3.0f, 18.7599f, 3.0527f, 18.8536f, 3.1465f)
                    curveTo(18.9474f, 3.2402f, 19.0001f, 3.3674f, 19.0001f, 3.5f)
                    verticalLineTo(5.0f)
                    horizontalLineTo(5.0001f)
                    verticalLineTo(3.5f)
                    curveTo(5.0001f, 3.3674f, 5.0528f, 3.2402f, 5.1465f, 3.1465f)
                    curveTo(5.2403f, 3.0527f, 5.3675f, 3.0f, 5.5001f, 3.0f)
                    close()
                    moveTo(15.2521f, 21.0f)
                    horizontalLineTo(8.7521f)
                    curveTo(8.2037f, 20.999f, 7.6746f, 20.7982f, 7.2636f, 20.4352f)
                    curveTo(6.8526f, 20.0723f, 6.5879f, 19.572f, 6.5191f, 19.028f)
                    lineTo(6.1371f, 16.0f)
                    horizontalLineTo(9.1841f)
                    curveTo(10.0841f, 19.959f, 13.9171f, 19.957f, 14.8161f, 16.0f)
                    horizontalLineTo(17.8631f)
                    lineTo(17.4841f, 19.029f)
                    curveTo(17.4155f, 19.5728f, 17.151f, 20.073f, 16.7401f, 20.4358f)
                    curveTo(16.3292f, 20.7986f, 15.8002f, 20.9992f, 15.2521f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _coffee!!
    }

private var _coffee: ImageVector? = null
