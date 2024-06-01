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

public val Icons.Filled.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) {
            return _cloudDownload!!
        }
        _cloudDownload = Builder(name = "CloudDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.79f, 7.2088f)
                curveTo(17.3438f, 5.2998f, 16.2122f, 3.6211f, 14.6099f, 2.4913f)
                curveTo(13.0077f, 1.3616f, 11.0463f, 0.8596f, 9.0983f, 1.0805f)
                curveTo(7.1503f, 1.3015f, 5.3513f, 2.2301f, 4.0428f, 3.6899f)
                curveTo(2.7342f, 5.1498f, 2.0073f, 7.0394f, 2.0f, 8.9998f)
                curveTo(1.999f, 10.2782f, 2.3078f, 11.5378f, 2.9f, 12.6708f)
                curveTo(1.8211f, 13.249f, 0.9664f, 14.1711f, 0.4716f, 15.2906f)
                curveTo(-0.0231f, 16.4102f, -0.1296f, 17.663f, 0.1692f, 18.85f)
                curveTo(0.468f, 20.037f, 1.1549f, 21.0901f, 2.1207f, 21.8419f)
                curveTo(3.0866f, 22.5938f, 4.276f, 23.0014f, 5.5f, 22.9998f)
                horizontalLineTo(16.0f)
                curveTo(17.9612f, 22.9933f, 19.8516f, 22.2667f, 21.3122f, 20.958f)
                curveTo(22.7728f, 19.6493f, 23.7017f, 17.8496f, 23.9226f, 15.901f)
                curveTo(24.1435f, 13.9523f, 23.6409f, 11.9904f, 22.5103f, 10.3879f)
                curveTo(21.3798f, 8.7855f, 19.6999f, 7.6541f, 17.79f, 7.2088f)
                close()
                moveTo(16.747f, 20.2758f)
                curveTo(16.2835f, 20.7388f, 15.6552f, 20.9989f, 15.0f, 20.9989f)
                curveTo(14.3449f, 20.9989f, 13.7165f, 20.7388f, 13.253f, 20.2758f)
                lineTo(10.053f, 17.0758f)
                lineTo(11.467f, 15.6618f)
                lineTo(14.0f, 18.1998f)
                verticalLineTo(9.9998f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.1998f)
                lineTo(18.535f, 15.6648f)
                lineTo(19.949f, 17.0788f)
                lineTo(16.747f, 20.2758f)
                close()
            }
        }
        .build()
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
