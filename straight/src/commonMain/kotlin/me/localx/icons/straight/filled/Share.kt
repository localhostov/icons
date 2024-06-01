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

public val Icons.Filled.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.3327f, 14.6671f)
                    curveTo(18.5761f, 14.6673f, 17.8309f, 14.8516f, 17.1614f, 15.204f)
                    curveTo(16.4919f, 15.5564f, 15.9182f, 16.0665f, 15.4897f, 16.6901f)
                    lineTo(8.9897f, 13.7551f)
                    curveTo(9.4456f, 12.6357f, 9.4492f, 11.3831f, 8.9997f, 10.2611f)
                    lineTo(15.4937f, 7.3121f)
                    curveTo(16.127f, 8.2308f, 17.0686f, 8.8922f, 18.1477f, 9.1761f)
                    curveTo(19.2268f, 9.46f, 20.3719f, 9.3478f, 21.3754f, 8.8596f)
                    curveTo(22.3788f, 8.3715f, 23.174f, 7.5399f, 23.6168f, 6.5157f)
                    curveTo(24.0595f, 5.4915f, 24.1205f, 4.3425f, 23.7886f, 3.2771f)
                    curveTo(23.4567f, 2.2118f, 22.754f, 1.3007f, 21.8078f, 0.7091f)
                    curveTo(20.8617f, 0.1176f, 19.7349f, -0.1152f, 18.6318f, 0.0529f)
                    curveTo(17.5287f, 0.2211f, 16.5224f, 0.779f, 15.7955f, 1.6256f)
                    curveTo(15.0686f, 2.4722f, 14.6692f, 3.5512f, 14.6697f, 4.6671f)
                    curveTo(14.6697f, 4.9325f, 14.6921f, 5.1975f, 14.7367f, 5.4591f)
                    lineTo(7.8457f, 8.5871f)
                    curveTo(7.1814f, 7.9675f, 6.3507f, 7.5553f, 5.4556f, 7.4009f)
                    curveTo(4.5604f, 7.2466f, 3.6396f, 7.3569f, 2.8062f, 7.7182f)
                    curveTo(1.9727f, 8.0795f, 1.2629f, 8.6762f, 0.7636f, 9.4351f)
                    curveTo(0.2644f, 10.194f, -0.0025f, 11.0821f, -0.0044f, 11.9905f)
                    curveTo(-0.0062f, 12.8989f, 0.257f, 13.7881f, 0.7532f, 14.549f)
                    curveTo(1.2493f, 15.31f, 1.9567f, 15.9096f, 2.7887f, 16.2743f)
                    curveTo(3.6206f, 16.6391f, 4.5409f, 16.7531f, 5.4367f, 16.6024f)
                    curveTo(6.3325f, 16.4518f, 7.1649f, 16.0429f, 7.8317f, 15.4261f)
                    lineTo(14.7317f, 18.5431f)
                    curveTo(14.5696f, 19.4861f, 14.7012f, 20.4563f, 15.1088f, 21.322f)
                    curveTo(15.5164f, 22.1878f, 16.1802f, 22.9073f, 17.0104f, 23.3831f)
                    curveTo(17.8406f, 23.859f, 18.797f, 24.0681f, 19.75f, 23.9823f)
                    curveTo(20.7031f, 23.8964f, 21.6067f, 23.5196f, 22.3385f, 22.903f)
                    curveTo(23.0702f, 22.2865f, 23.5948f, 21.4598f, 23.841f, 20.5352f)
                    curveTo(24.0873f, 19.6105f, 24.0434f, 18.6325f, 23.7152f, 17.7336f)
                    curveTo(23.3871f, 16.8347f, 22.7905f, 16.0585f, 22.0065f, 15.51f)
                    curveTo(21.2224f, 14.9614f, 20.2886f, 14.6672f, 19.3317f, 14.6671f)
                    horizontalLineTo(19.3327f)
                    close()
                }
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
