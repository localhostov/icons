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
                    moveTo(18.9998f, 17.0005f)
                    curveTo(19.0014f, 18.149f, 18.7204f, 19.2803f, 18.1816f, 20.2946f)
                    curveTo(17.6427f, 21.3089f, 16.8625f, 22.1751f, 15.9099f, 22.8166f)
                    curveTo(14.9572f, 23.4582f, 13.8613f, 23.8554f, 12.7188f, 23.9734f)
                    curveTo(11.5763f, 24.0914f, 10.4224f, 23.9264f, 9.3587f, 23.4931f)
                    curveTo(8.295f, 23.0597f, 7.3543f, 22.3713f, 6.6196f, 21.4885f)
                    curveTo(5.8848f, 20.6057f, 5.3786f, 19.5557f, 5.1455f, 18.431f)
                    curveTo(4.9124f, 17.3064f, 4.9596f, 16.1416f, 5.283f, 15.0396f)
                    curveTo(5.6064f, 13.9375f, 6.196f, 12.9319f, 6.9998f, 12.1115f)
                    verticalLineTo(5.0005f)
                    curveTo(7.2108f, -1.6085f, 16.7908f, -1.5995f, 16.9998f, 5.0005f)
                    verticalLineTo(12.1115f)
                    curveTo(18.2787f, 13.4178f, 18.9965f, 15.1723f, 18.9998f, 17.0005f)
                    close()
                    moveTo(14.9998f, 17.0005f)
                    curveTo(14.9997f, 16.3802f, 14.8073f, 15.7751f, 14.4492f, 15.2687f)
                    curveTo(14.091f, 14.7622f, 13.5846f, 14.3792f, 12.9998f, 14.1725f)
                    verticalLineTo(8.0005f)
                    curveTo(12.9998f, 7.7353f, 12.8945f, 7.4809f, 12.7069f, 7.2934f)
                    curveTo(12.5194f, 7.1058f, 12.265f, 7.0005f, 11.9998f, 7.0005f)
                    curveTo(11.7346f, 7.0005f, 11.4802f, 7.1058f, 11.2927f, 7.2934f)
                    curveTo(11.1052f, 7.4809f, 10.9998f, 7.7353f, 10.9998f, 8.0005f)
                    verticalLineTo(14.1725f)
                    curveTo(10.4813f, 14.3558f, 10.0231f, 14.6782f, 9.6754f, 15.1043f)
                    curveTo(9.3277f, 15.5305f, 9.1038f, 16.0441f, 9.0282f, 16.5889f)
                    curveTo(8.9527f, 17.1337f, 9.0284f, 17.6887f, 9.247f, 18.1934f)
                    curveTo(9.4656f, 18.6981f, 9.8188f, 19.133f, 10.2679f, 19.4505f)
                    curveTo(10.717f, 19.768f, 11.2448f, 19.956f, 11.7935f, 19.9938f)
                    curveTo(12.3422f, 20.0316f, 12.8908f, 19.9179f, 13.3792f, 19.665f)
                    curveTo(13.8676f, 19.4121f, 14.2771f, 19.0298f, 14.5629f, 18.5599f)
                    curveTo(14.8488f, 18.0899f, 14.9999f, 17.5505f, 14.9998f, 17.0005f)
                    close()
                }
            }
        }
        .build()
        return _thermometerHalf!!
    }

private var _thermometerHalf: ImageVector? = null
