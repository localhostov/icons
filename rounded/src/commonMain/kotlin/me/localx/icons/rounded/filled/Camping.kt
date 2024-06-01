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

public val Icons.Filled.Camping: ImageVector
    get() {
        if (_camping != null) {
            return _camping!!
        }
        _camping = Builder(name = "Camping", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.8871f, 16.573f)
                    lineTo(16.451f, 24.0f)
                    horizontalLineTo(7.188f)
                    lineTo(11.1211f, 16.562f)
                    curveTo(11.1995f, 16.3933f, 11.3247f, 16.2507f, 11.4819f, 16.1512f)
                    curveTo(11.6391f, 16.0516f, 11.8215f, 15.9993f, 12.0076f, 16.0004f)
                    curveTo(12.1936f, 16.0016f, 12.3754f, 16.0562f, 12.5313f, 16.1577f)
                    curveTo(12.6873f, 16.2592f, 12.8107f, 16.4034f, 12.8871f, 16.573f)
                    close()
                    moveTo(23.522f, 16.868f)
                    lineTo(16.535f, 2.9f)
                    curveTo(16.1346f, 2.038f, 15.4966f, 1.3079f, 14.6961f, 0.7954f)
                    curveTo(13.8955f, 0.283f, 12.9654f, 0.0093f, 12.0148f, 0.0066f)
                    curveTo(11.0643f, 0.0039f, 10.1326f, 0.2722f, 9.3291f, 0.78f)
                    curveTo(8.5256f, 1.2879f, 7.8835f, 2.0143f, 7.4781f, 2.874f)
                    lineTo(0.4701f, 16.9f)
                    curveTo(0.1188f, 17.6558f, -0.0379f, 18.4874f, 0.0145f, 19.3192f)
                    curveTo(0.0668f, 20.1509f, 0.3264f, 20.9563f, 0.7696f, 21.6621f)
                    curveTo(1.2129f, 22.3678f, 1.8256f, 22.9515f, 2.5521f, 23.3598f)
                    curveTo(3.2786f, 23.7682f, 4.0957f, 23.9883f, 4.929f, 24.0f)
                    lineTo(9.3291f, 15.678f)
                    curveTo(9.5744f, 15.1725f, 9.9582f, 14.747f, 10.4357f, 14.4509f)
                    curveTo(10.9133f, 14.1548f, 11.465f, 14.0002f, 12.0269f, 14.0051f)
                    curveTo(12.5888f, 14.0101f, 13.1378f, 14.1743f, 13.61f, 14.4787f)
                    curveTo(14.0823f, 14.7832f, 14.4586f, 15.2153f, 14.6951f, 15.725f)
                    lineTo(18.6691f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(19.8425f, 23.9999f, 20.6712f, 23.787f, 21.4093f, 23.3809f)
                    curveTo(22.1475f, 22.9749f, 22.771f, 22.3889f, 23.2221f, 21.6774f)
                    curveTo(23.6732f, 20.966f, 23.9372f, 20.1521f, 23.9897f, 19.3113f)
                    curveTo(24.0421f, 18.4705f, 23.8813f, 17.6301f, 23.522f, 16.868f)
                    close()
                }
            }
        }
        .build()
        return _camping!!
    }

private var _camping: ImageVector? = null
