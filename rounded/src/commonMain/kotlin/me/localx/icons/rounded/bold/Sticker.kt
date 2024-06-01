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

public val Icons.Bold.Sticker: ImageVector
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
                    moveTo(23.964f, 10.4168f)
                    curveTo(23.6623f, 8.1947f, 22.7459f, 6.1011f, 21.318f, 4.3719f)
                    curveTo(19.8901f, 2.6428f, 18.0076f, 1.3469f, 15.8827f, 0.6304f)
                    curveTo(13.7578f, -0.0862f, 11.475f, -0.1949f, 9.2916f, 0.3165f)
                    curveTo(7.1082f, 0.8278f, 5.1111f, 1.939f, 3.5254f, 3.5246f)
                    curveTo(1.9396f, 5.1102f, 0.8284f, 7.1072f, 0.3168f, 9.2906f)
                    curveTo(-0.1947f, 11.4739f, -0.0861f, 13.7568f, 0.6303f, 15.8817f)
                    curveTo(1.3467f, 18.0067f, 2.6424f, 19.8893f, 4.3714f, 21.3173f)
                    curveTo(6.1004f, 22.7453f, 8.194f, 23.6619f, 10.416f, 23.9638f)
                    curveTo(10.5944f, 23.9877f, 10.7741f, 23.9998f, 10.954f, 23.9998f)
                    curveTo(12.1061f, 23.9907f, 13.2081f, 23.5271f, 14.02f, 22.7098f)
                    lineTo(22.709f, 14.0208f)
                    curveTo(23.1797f, 13.5559f, 23.5376f, 12.9893f, 23.7551f, 12.3645f)
                    curveTo(23.9727f, 11.7398f, 24.0441f, 11.0734f, 23.964f, 10.4168f)
                    close()
                    moveTo(3.057f, 11.0008f)
                    curveTo(3.2922f, 8.9714f, 4.2078f, 7.0814f, 5.6544f, 5.6389f)
                    curveTo(7.1011f, 4.1964f, 8.9936f, 3.2863f, 11.0237f, 3.0569f)
                    curveTo(13.0537f, 2.8275f, 15.1016f, 3.2924f, 16.8337f, 4.3757f)
                    curveTo(18.5658f, 5.4591f, 19.8799f, 7.097f, 20.562f, 9.0228f)
                    curveTo(17.538f, 9.1366f, 14.6686f, 10.3888f, 12.5286f, 12.5286f)
                    curveTo(10.3886f, 14.6684f, 9.1362f, 17.5377f, 9.022f, 20.5618f)
                    curveTo(7.0879f, 19.8852f, 5.4425f, 18.5689f, 4.3579f, 16.8304f)
                    curveTo(3.2733f, 15.0919f, 2.8144f, 13.0354f, 3.057f, 11.0008f)
                    close()
                    moveTo(12.027f, 20.4578f)
                    curveTo(12.1618f, 18.2656f, 13.0934f, 16.1984f, 14.6465f, 14.6455f)
                    curveTo(16.1996f, 13.0926f, 18.2669f, 12.1612f, 20.459f, 12.0268f)
                    lineTo(12.027f, 20.4578f)
                    close()
                }
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
