package me.localx.icons.rounded.outline

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

public val Icons.Outline.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9669f, 10.4164f)
                    curveTo(23.6652f, 8.1937f, 22.7486f, 6.0995f, 21.3203f, 4.3698f)
                    curveTo(19.8921f, 2.6401f, 18.0091f, 1.3438f, 15.8836f, 0.6271f)
                    curveTo(13.758f, -0.0897f, 11.4746f, -0.1984f, 9.2906f, 0.3131f)
                    curveTo(7.1065f, 0.8247f, 5.1089f, 1.9362f, 3.5227f, 3.5223f)
                    curveTo(1.9366f, 5.1084f, 0.8251f, 7.1061f, 0.3136f, 9.2901f)
                    curveTo(-0.198f, 11.4741f, -0.0892f, 13.7576f, 0.6275f, 15.8831f)
                    curveTo(1.3443f, 18.0086f, 2.6406f, 19.8916f, 4.3703f, 21.3199f)
                    curveTo(6.0999f, 22.7481f, 8.1942f, 23.6647f, 10.4169f, 23.9664f)
                    curveTo(10.579f, 23.9876f, 10.7424f, 23.9983f, 10.9059f, 23.9984f)
                    curveTo(11.9606f, 23.9897f, 12.969f, 23.5641f, 13.7109f, 22.8144f)
                    lineTo(22.8109f, 13.7144f)
                    curveTo(23.2429f, 13.2897f, 23.5718f, 12.7715f, 23.7722f, 12.1998f)
                    curveTo(23.9726f, 11.628f, 24.0392f, 11.018f, 23.9669f, 10.4164f)
                    close()
                    moveTo(2.0669f, 10.8904f)
                    curveTo(2.3359f, 8.5172f, 3.4426f, 6.3177f, 5.1881f, 4.6874f)
                    curveTo(6.9336f, 3.057f, 9.2035f, 2.1029f, 11.5895f, 1.9963f)
                    curveTo(13.9756f, 1.8898f, 16.3215f, 2.6379f, 18.2053f, 4.1062f)
                    curveTo(20.0892f, 5.5745f, 21.3875f, 7.6666f, 21.8669f, 10.0064f)
                    curveTo(18.7346f, 10.0443f, 15.7411f, 11.3049f, 13.5253f, 13.5192f)
                    curveTo(11.3095f, 15.7335f, 10.0469f, 18.7261f, 10.0069f, 21.8584f)
                    curveTo(7.5471f, 21.3624f, 5.3641f, 19.9587f, 3.8922f, 17.9264f)
                    curveTo(2.4202f, 15.8941f, 1.7672f, 13.3823f, 2.0629f, 10.8904f)
                    horizontalLineTo(2.0669f)
                    close()
                    moveTo(12.2999f, 21.3994f)
                    curveTo(12.2137f, 21.4821f, 12.1207f, 21.5574f, 12.0219f, 21.6244f)
                    curveTo(12.119f, 19.1077f, 13.1622f, 16.7203f, 14.943f, 14.9393f)
                    curveTo(16.7239f, 13.1583f, 19.1112f, 12.1148f, 21.6279f, 12.0174f)
                    curveTo(21.5615f, 12.1168f, 21.4866f, 12.2102f, 21.4039f, 12.2964f)
                    lineTo(12.2999f, 21.3994f)
                    close()
                }
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
