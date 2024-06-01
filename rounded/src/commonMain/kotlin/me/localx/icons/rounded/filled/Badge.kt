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

public val Icons.Filled.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.9998f, 16.0f)
                    curveTo(10.4175f, 16.0f, 8.8708f, 15.5308f, 7.5552f, 14.6517f)
                    curveTo(6.2396f, 13.7727f, 5.2142f, 12.5233f, 4.6087f, 11.0615f)
                    curveTo(4.0032f, 9.5997f, 3.8448f, 7.9911f, 4.1535f, 6.4393f)
                    curveTo(4.4622f, 4.8874f, 5.2241f, 3.462f, 6.3429f, 2.3431f)
                    curveTo(7.4617f, 1.2243f, 8.8872f, 0.4624f, 10.4391f, 0.1537f)
                    curveTo(11.9909f, -0.155f, 13.5994f, 0.0035f, 15.0612f, 0.609f)
                    curveTo(16.5231f, 1.2145f, 17.7725f, 2.2399f, 18.6515f, 3.5554f)
                    curveTo(19.5306f, 4.871f, 19.9998f, 6.4177f, 19.9998f, 8.0f)
                    curveTo(19.9974f, 10.121f, 19.1538f, 12.1544f, 17.654f, 13.6542f)
                    curveTo(16.1542f, 15.154f, 14.1208f, 15.9976f, 11.9998f, 16.0f)
                    close()
                    moveTo(11.9998f, 18.0f)
                    curveTo(9.8332f, 17.999f, 7.7262f, 17.29f, 5.9998f, 15.981f)
                    verticalLineTo(21.5f)
                    curveTo(5.9998f, 21.9709f, 6.1328f, 22.4323f, 6.3835f, 22.831f)
                    curveTo(6.6342f, 23.2296f, 6.9925f, 23.5494f, 7.4169f, 23.7533f)
                    curveTo(7.8414f, 23.9573f, 8.3149f, 24.0373f, 8.7828f, 23.9839f)
                    curveTo(9.2507f, 23.9306f, 9.6941f, 23.7462f, 10.0618f, 23.452f)
                    lineTo(11.6878f, 22.152f)
                    curveTo(11.7764f, 22.0812f, 11.8864f, 22.0427f, 11.9998f, 22.0427f)
                    curveTo(12.1132f, 22.0427f, 12.2232f, 22.0812f, 12.3118f, 22.152f)
                    lineTo(13.9378f, 23.452f)
                    curveTo(14.3055f, 23.7462f, 14.7488f, 23.9306f, 15.2167f, 23.9839f)
                    curveTo(15.6847f, 24.0373f, 16.1581f, 23.9573f, 16.5826f, 23.7533f)
                    curveTo(17.0071f, 23.5494f, 17.3653f, 23.2296f, 17.616f, 22.831f)
                    curveTo(17.8668f, 22.4323f, 17.9998f, 21.9709f, 17.9998f, 21.5f)
                    verticalLineTo(15.981f)
                    curveTo(16.2733f, 17.2899f, 14.1664f, 17.9989f, 11.9998f, 18.0f)
                    close()
                }
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
