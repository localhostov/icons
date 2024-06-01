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

public val Icons.Bold.PhoneSlash: ImageVector
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
                    moveTo(21.814f, 0.0641f)
                    lineTo(10.256f, 11.6231f)
                    curveTo(9.8085f, 11.017f, 9.4178f, 10.3709f, 9.089f, 9.6931f)
                    lineTo(12.052f, 6.7311f)
                    lineTo(5.41f, 0.0901f)
                    lineTo(1.766f, 3.7341f)
                    curveTo(1.2f, 4.302f, 0.7525f, 4.9767f, 0.4493f, 5.7189f)
                    curveTo(0.1462f, 6.4612f, -0.0066f, 7.2563f, 0.0f, 8.0581f)
                    curveTo(0.0f, 11.0891f, 1.577f, 14.5501f, 4.277f, 17.6001f)
                    lineTo(0.064f, 21.8141f)
                    lineTo(2.186f, 23.9361f)
                    lineTo(23.936f, 2.1861f)
                    lineTo(21.814f, 0.0641f)
                    close()
                    moveTo(3.0f, 8.0581f)
                    curveTo(2.995f, 7.651f, 3.0707f, 7.247f, 3.2228f, 6.8694f)
                    curveTo(3.3749f, 6.4918f, 3.6003f, 6.148f, 3.886f, 5.8581f)
                    lineTo(5.41f, 4.3321f)
                    lineTo(7.81f, 6.7321f)
                    lineTo(5.541f, 9.0001f)
                    lineTo(5.91f, 9.9191f)
                    curveTo(6.4599f, 11.2976f, 7.2063f, 12.5893f, 8.126f, 13.7541f)
                    lineTo(6.406f, 15.4741f)
                    curveTo(4.281f, 13.0201f, 3.0f, 10.3001f, 3.0f, 8.0581f)
                    close()
                    moveTo(17.269f, 11.9481f)
                    lineTo(23.91f, 18.5901f)
                    lineTo(20.265f, 22.2351f)
                    curveTo(19.6971f, 22.8008f, 19.0226f, 23.2481f, 18.2805f, 23.5511f)
                    curveTo(17.5384f, 23.854f, 16.7436f, 24.0067f, 15.942f, 24.0001f)
                    curveTo(13.1039f, 23.8285f, 10.3826f, 22.8092f, 8.13f, 21.0741f)
                    lineTo(10.292f, 18.9111f)
                    curveTo(11.9421f, 20.1236f, 13.9f, 20.8475f, 15.942f, 21.0001f)
                    curveTo(16.349f, 21.0055f, 16.7531f, 20.93f, 17.1307f, 20.7781f)
                    curveTo(17.5084f, 20.6262f, 17.8521f, 20.4008f, 18.142f, 20.1151f)
                    lineTo(19.666f, 18.5901f)
                    lineTo(17.266f, 16.1901f)
                    lineTo(15.011f, 18.4461f)
                    lineTo(14.103f, 18.1001f)
                    curveTo(13.402f, 17.8281f, 12.7225f, 17.5038f, 12.07f, 17.1301f)
                    lineTo(17.269f, 11.9481f)
                    close()
                }
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
