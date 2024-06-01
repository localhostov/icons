package me.localx.icons.straight.bold

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

public val Icons.Bold.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 10.0f)
                    horizontalLineTo(21.0f)
                    curveTo(20.9979f, 8.1441f, 20.2597f, 6.3649f, 18.9474f, 5.0526f)
                    curveTo(17.6351f, 3.7403f, 15.8559f, 3.0021f, 14.0f, 3.0f)
                    verticalLineTo(0.0f)
                    curveTo(16.6513f, 0.0029f, 19.1931f, 1.0574f, 21.0679f, 2.9321f)
                    curveTo(22.9426f, 4.8069f, 23.9971f, 7.3487f, 24.0f, 10.0f)
                    close()
                    moveTo(14.0f, 5.0f)
                    verticalLineTo(8.0f)
                    curveTo(14.5305f, 8.0f, 15.0392f, 8.2107f, 15.4142f, 8.5858f)
                    curveTo(15.7893f, 8.9609f, 16.0f, 9.4696f, 16.0f, 10.0f)
                    horizontalLineTo(19.0f)
                    curveTo(18.9984f, 8.6744f, 18.4711f, 7.4036f, 17.5338f, 6.4662f)
                    curveTo(16.5965f, 5.5289f, 15.3256f, 5.0016f, 14.0f, 5.0f)
                    close()
                    moveTo(20.265f, 22.235f)
                    lineTo(23.91f, 18.59f)
                    lineTo(17.269f, 11.948f)
                    lineTo(14.3f, 14.923f)
                    curveTo(11.9973f, 13.8536f, 10.15f, 12.0002f, 9.088f, 9.694f)
                    lineTo(12.052f, 6.731f)
                    lineTo(5.41f, 0.09f)
                    lineTo(1.766f, 3.734f)
                    curveTo(1.2f, 4.3019f, 0.7525f, 4.9766f, 0.4493f, 5.7189f)
                    curveTo(0.1462f, 6.4611f, -0.0066f, 7.2562f, 0.0f, 8.058f)
                    curveTo(0.0f, 15.209f, 8.791f, 24.0f, 15.942f, 24.0f)
                    curveTo(16.7436f, 24.0066f, 17.5384f, 23.854f, 18.2805f, 23.551f)
                    curveTo(19.0226f, 23.248f, 19.6971f, 22.8007f, 20.265f, 22.235f)
                    close()
                    moveTo(7.809f, 6.731f)
                    lineTo(5.541f, 9.0f)
                    lineTo(5.91f, 9.919f)
                    curveTo(6.6103f, 11.791f, 7.7049f, 13.4905f, 9.1198f, 14.9022f)
                    curveTo(10.5346f, 16.3139f, 12.2365f, 17.4049f, 14.11f, 18.101f)
                    lineTo(15.018f, 18.447f)
                    lineTo(17.273f, 16.191f)
                    lineTo(19.673f, 18.591f)
                    lineTo(18.149f, 20.116f)
                    curveTo(17.8591f, 20.4017f, 17.5154f, 20.6271f, 17.1377f, 20.779f)
                    curveTo(16.7601f, 20.9309f, 16.3561f, 21.0064f, 15.949f, 21.001f)
                    curveTo(10.949f, 21.0f, 3.0f, 13.934f, 3.0f, 8.058f)
                    curveTo(2.995f, 7.6509f, 3.0707f, 7.2469f, 3.2228f, 6.8693f)
                    curveTo(3.3749f, 6.4917f, 3.6003f, 6.148f, 3.886f, 5.858f)
                    lineTo(5.41f, 4.332f)
                    lineTo(7.809f, 6.731f)
                    close()
                }
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
