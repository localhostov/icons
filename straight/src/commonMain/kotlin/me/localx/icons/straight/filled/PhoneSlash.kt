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

public val Icons.Filled.PhoneSlash: ImageVector
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
                    moveTo(23.9572f, 1.4573f)
                    lineTo(1.4572f, 23.9573f)
                    lineTo(0.0432f, 22.5433f)
                    lineTo(4.8252f, 17.7613f)
                    curveTo(1.7912f, 14.5003f, 2.0E-4f, 10.7413f, 2.0E-4f, 7.5003f)
                    curveTo(-0.0061f, 6.7203f, 0.1423f, 5.9468f, 0.4368f, 5.2245f)
                    curveTo(0.7314f, 4.5022f, 1.1662f, 3.8455f, 1.7162f, 3.2923f)
                    lineTo(4.8872f, 0.1223f)
                    lineTo(11.1522f, 6.3873f)
                    lineTo(7.0282f, 10.5113f)
                    curveTo(7.5265f, 11.6334f, 8.1758f, 12.6821f, 8.9582f, 13.6283f)
                    lineTo(22.5432f, 0.0433f)
                    lineTo(23.9572f, 1.4573f)
                    close()
                    moveTo(13.4802f, 16.9803f)
                    curveTo(12.9777f, 16.7581f, 12.4897f, 16.5043f, 12.0192f, 16.2203f)
                    lineTo(7.7832f, 20.4563f)
                    curveTo(10.7002f, 22.6943f, 13.8352f, 24.0003f, 16.5002f, 24.0003f)
                    curveTo(17.2802f, 24.0071f, 18.0537f, 23.8589f, 18.7759f, 23.5644f)
                    curveTo(19.4981f, 23.2698f, 20.1546f, 22.8347f, 20.7072f, 22.2843f)
                    lineTo(23.8782f, 19.1133f)
                    lineTo(17.6132f, 12.8483f)
                    lineTo(13.4802f, 16.9803f)
                    close()
                }
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
