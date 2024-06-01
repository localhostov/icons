package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.5432f, 0.0424f)
                    lineTo(9.6772f, 12.9083f)
                    curveTo(8.8956f, 11.9616f, 8.2464f, 10.913f, 7.7472f, 9.7914f)
                    lineTo(11.1472f, 6.3913f)
                    lineTo(4.8872f, 0.1214f)
                    lineTo(1.7162f, 3.2913f)
                    curveTo(1.1662f, 3.8445f, 0.7314f, 4.5012f, 0.4368f, 5.2235f)
                    curveTo(0.1423f, 5.9458f, -0.0061f, 6.7193f, 2.0E-4f, 7.4994f)
                    curveTo(2.0E-4f, 10.7403f, 1.7912f, 14.4993f, 4.8252f, 17.7603f)
                    lineTo(0.0432f, 22.5423f)
                    lineTo(1.4572f, 23.9563f)
                    lineTo(23.9572f, 1.4564f)
                    lineTo(22.5432f, 0.0424f)
                    close()
                    moveTo(2.0002f, 7.4994f)
                    curveTo(1.9943f, 6.9822f, 2.0912f, 6.469f, 2.2852f, 5.9895f)
                    curveTo(2.4791f, 5.5101f, 2.7664f, 5.0739f, 3.1302f, 4.7063f)
                    lineTo(4.8872f, 2.9494f)
                    lineTo(8.3242f, 6.3864f)
                    lineTo(5.3892f, 9.3214f)
                    lineTo(5.6342f, 9.9354f)
                    curveTo(6.2649f, 11.5314f, 7.1522f, 13.0136f, 8.2612f, 14.3233f)
                    lineTo(6.2362f, 16.3493f)
                    curveTo(3.5692f, 13.4653f, 2.0002f, 10.2313f, 2.0002f, 7.4994f)
                    close()
                    moveTo(17.6132f, 12.8473f)
                    lineTo(23.8782f, 19.1123f)
                    lineTo(20.7072f, 22.2833f)
                    curveTo(20.1546f, 22.8337f, 19.4981f, 23.2688f, 18.7759f, 23.5634f)
                    curveTo(18.0537f, 23.858f, 17.2802f, 24.0061f, 16.5002f, 23.9993f)
                    curveTo(13.8352f, 23.9993f, 10.7002f, 22.6933f, 7.7832f, 20.4553f)
                    lineTo(9.2092f, 19.0293f)
                    curveTo(11.7002f, 20.8893f, 14.3562f, 21.9993f, 16.5002f, 21.9993f)
                    curveTo(17.0173f, 22.0055f, 17.5304f, 21.9087f, 18.0097f, 21.7147f)
                    curveTo(18.489f, 21.5207f, 18.925f, 21.2334f, 19.2922f, 20.8693f)
                    lineTo(21.0502f, 19.1123f)
                    lineTo(17.6132f, 15.6753f)
                    lineTo(14.6872f, 18.5993f)
                    lineTo(14.0812f, 18.3683f)
                    curveTo(13.1016f, 17.9945f, 12.1633f, 17.5203f, 11.2812f, 16.9533f)
                    lineTo(12.7382f, 15.4993f)
                    curveTo(13.209f, 15.7833f, 13.6973f, 16.0371f, 14.2002f, 16.2593f)
                    lineTo(17.6132f, 12.8473f)
                    close()
                }
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
