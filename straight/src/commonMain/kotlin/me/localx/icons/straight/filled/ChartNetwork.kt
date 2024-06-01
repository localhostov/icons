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

public val Icons.Filled.ChartNetwork: ImageVector
    get() {
        if (_chartNetwork != null) {
            return _chartNetwork!!
        }
        _chartNetwork = Builder(name = "ChartNetwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0166f, 13.4249f)
                    curveTo(20.2065f, 13.4252f, 19.4317f, 13.7564f, 18.8716f, 14.3417f)
                    lineTo(16.5974f, 13.3752f)
                    curveTo(16.7528f, 12.9101f, 16.8347f, 12.4236f, 16.84f, 11.9332f)
                    curveTo(16.8345f, 9.2993f, 14.7007f, 7.1655f, 12.0668f, 7.16f)
                    curveTo(11.6686f, 7.165f, 11.2726f, 7.2204f, 10.8884f, 7.3251f)
                    lineTo(9.5807f, 4.9971f)
                    curveTo(10.6879f, 3.7837f, 10.6017f, 1.9024f, 9.3883f, 0.7952f)
                    curveTo(8.1748f, -0.312f, 6.2935f, -0.2258f, 5.1863f, 0.9877f)
                    curveTo(4.0792f, 2.2011f, 4.1653f, 4.0824f, 5.3788f, 5.1896f)
                    curveTo(5.9291f, 5.6917f, 6.6479f, 5.9691f, 7.393f, 5.9667f)
                    curveTo(7.536f, 5.9626f, 7.6786f, 5.9483f, 7.8196f, 5.924f)
                    lineTo(9.1054f, 8.2111f)
                    curveTo(7.1741f, 9.715f, 6.7157f, 12.447f, 8.0503f, 14.4989f)
                    lineTo(4.2874f, 18.1395f)
                    curveTo(2.7477f, 17.4564f, 0.9458f, 18.1509f, 0.2627f, 19.6906f)
                    curveTo(-0.4204f, 21.2303f, 0.2741f, 23.0322f, 1.8138f, 23.7153f)
                    curveTo(3.3535f, 24.3983f, 5.1554f, 23.7039f, 5.8385f, 22.1642f)
                    curveTo(6.2184f, 21.3078f, 6.1837f, 20.3243f, 5.7442f, 19.4969f)
                    lineTo(9.4445f, 15.917f)
                    curveTo(11.4104f, 17.2251f, 14.04f, 16.8816f, 15.6039f, 15.1124f)
                    lineTo(18.0582f, 16.1546f)
                    curveTo(18.0512f, 16.2391f, 18.0333f, 16.3207f, 18.0333f, 16.4062f)
                    curveTo(18.0333f, 18.0538f, 19.369f, 19.3895f, 21.0166f, 19.3895f)
                    curveTo(22.6642f, 19.3895f, 23.9999f, 18.0538f, 23.9999f, 16.4062f)
                    curveTo(23.9999f, 14.7585f, 22.6642f, 13.4229f, 21.0166f, 13.4229f)
                    verticalLineTo(13.4249f)
                    close()
                }
            }
        }
        .build()
        return _chartNetwork!!
    }

private var _chartNetwork: ImageVector? = null
