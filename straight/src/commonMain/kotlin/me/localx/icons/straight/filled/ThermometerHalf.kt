package me.localx.icons.straight.filled

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

public val Icons.Filled.ThermometerHalf: ImageVector
    get() {
        if (_thermometerHalf != null) {
            return _thermometerHalf!!
        }
        _thermometerHalf = Builder(name = "ThermometerHalf", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0001f, 12.1115f)
                    verticalLineTo(5.0005f)
                    curveTo(16.7891f, -1.6085f, 7.2091f, -1.5995f, 7.0001f, 5.0005f)
                    verticalLineTo(12.1115f)
                    curveTo(6.0355f, 13.096f, 5.3829f, 14.3435f, 5.1244f, 15.6974f)
                    curveTo(4.8658f, 17.0513f, 5.0127f, 18.4514f, 5.5467f, 19.7222f)
                    curveTo(6.0807f, 20.993f, 6.978f, 22.0778f, 8.126f, 22.8406f)
                    curveTo(9.274f, 23.6035f, 10.6217f, 24.0104f, 12.0001f, 24.0104f)
                    curveTo(13.3785f, 24.0104f, 14.7262f, 23.6035f, 15.8743f, 22.8406f)
                    curveTo(17.0223f, 22.0778f, 17.9196f, 20.993f, 18.4535f, 19.7222f)
                    curveTo(18.9875f, 18.4514f, 19.1344f, 17.0513f, 18.8759f, 15.6974f)
                    curveTo(18.6173f, 14.3435f, 17.9648f, 13.096f, 17.0001f, 12.1115f)
                    close()
                    moveTo(12.0001f, 20.0005f)
                    curveTo(11.2985f, 19.9925f, 10.6219f, 19.7389f, 10.0879f, 19.2837f)
                    curveTo(9.5539f, 18.8285f, 9.1964f, 18.2005f, 9.0775f, 17.509f)
                    curveTo(8.9586f, 16.8175f, 9.0858f, 16.1062f, 9.4371f, 15.4988f)
                    curveTo(9.7884f, 14.8914f, 10.3414f, 14.4263f, 11.0001f, 14.1845f)
                    verticalLineTo(8.0005f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(14.1845f)
                    curveTo(13.6588f, 14.4263f, 14.2119f, 14.8914f, 14.5632f, 15.4988f)
                    curveTo(14.9144f, 16.1062f, 15.0417f, 16.8175f, 14.9228f, 17.509f)
                    curveTo(14.8039f, 18.2005f, 14.4464f, 18.8285f, 13.9124f, 19.2837f)
                    curveTo(13.3784f, 19.7389f, 12.7018f, 19.9925f, 12.0001f, 20.0005f)
                    close()
                }
            }
        }
        .build()
        return _thermometerHalf!!
    }

private var _thermometerHalf: ImageVector? = null
