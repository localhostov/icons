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

public val Icons.Filled.EyeDropper: ImageVector
    get() {
        if (_eyeDropper != null) {
            return _eyeDropper!!
        }
        _eyeDropper = Builder(name = "EyeDropper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.6782f, 7.3928f)
                    curveTo(19.7622f, 8.3088f, 19.9712f, 10.2308f, 20.7032f, 11.5598f)
                    curveTo(20.9826f, 12.0867f, 21.0635f, 12.6964f, 20.9312f, 13.2779f)
                    curveTo(20.7989f, 13.8594f, 20.4622f, 14.3741f, 19.9824f, 14.7283f)
                    curveTo(19.5026f, 15.0825f, 18.9116f, 15.2527f, 18.3169f, 15.2078f)
                    curveTo(17.7222f, 15.1629f, 17.1634f, 14.906f, 16.7422f, 14.4838f)
                    lineTo(9.5162f, 7.2578f)
                    curveTo(9.0964f, 6.836f, 8.8417f, 6.2779f, 8.7981f, 5.6845f)
                    curveTo(8.7545f, 5.0911f, 8.9249f, 4.5017f, 9.2785f, 4.0231f)
                    curveTo(9.632f, 3.5445f, 10.1453f, 3.2085f, 10.7253f, 3.0758f)
                    curveTo(11.3053f, 2.9431f, 11.9137f, 3.0225f, 12.4402f, 3.2998f)
                    curveTo(13.7692f, 4.0308f, 15.6912f, 4.2408f, 16.6072f, 3.3248f)
                    lineTo(19.0862f, 0.8428f)
                    curveTo(19.6344f, 0.3191f, 20.3635f, 0.0269f, 21.1217f, 0.0269f)
                    curveTo(21.8799f, 0.0269f, 22.6089f, 0.3191f, 23.1572f, 0.8428f)
                    curveTo(23.4249f, 1.1102f, 23.6373f, 1.4279f, 23.7822f, 1.7775f)
                    curveTo(23.9271f, 2.1271f, 24.0017f, 2.5018f, 24.0017f, 2.8803f)
                    curveTo(24.0017f, 3.2587f, 23.9271f, 3.6335f, 23.7822f, 3.9831f)
                    curveTo(23.6373f, 4.3327f, 23.4249f, 4.6503f, 23.1572f, 4.9178f)
                    lineTo(20.6782f, 7.3928f)
                    close()
                    moveTo(1.9691f, 17.3468f)
                    curveTo(1.4762f, 17.8443f, 1.1539f, 18.4855f, 1.0488f, 19.1779f)
                    curveTo(0.9437f, 19.8704f, 1.0611f, 20.5783f, 1.3842f, 21.1998f)
                    lineTo(0.2932f, 22.2928f)
                    curveTo(0.1057f, 22.4803f, 4.0E-4f, 22.7346f, 4.0E-4f, 22.9998f)
                    curveTo(4.0E-4f, 23.2649f, 0.1057f, 23.5192f, 0.2932f, 23.7068f)
                    curveTo(0.4807f, 23.8942f, 0.735f, 23.9996f, 1.0001f, 23.9996f)
                    curveTo(1.2653f, 23.9996f, 1.5196f, 23.8942f, 1.7071f, 23.7068f)
                    lineTo(2.8001f, 22.6158f)
                    curveTo(3.4202f, 22.9459f, 4.1303f, 23.0673f, 4.8248f, 22.9617f)
                    curveTo(5.5193f, 22.8561f, 6.1612f, 22.5293f, 6.6551f, 22.0298f)
                    lineTo(14.0552f, 14.6298f)
                    lineTo(9.3731f, 9.9438f)
                    lineTo(1.9691f, 17.3468f)
                    close()
                }
            }
        }
        .build()
        return _eyeDropper!!
    }

private var _eyeDropper: ImageVector? = null
