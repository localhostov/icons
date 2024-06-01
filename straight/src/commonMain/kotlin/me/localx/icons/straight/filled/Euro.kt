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

public val Icons.Filled.Euro: ImageVector
    get() {
        if (_euro != null) {
            return _euro!!
        }
        _euro = Builder(name = "Euro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0f, 22.0004f)
                    curveTo(11.8727f, 21.9979f, 9.8015f, 21.318f, 8.0864f, 20.0595f)
                    curveTo(6.3714f, 18.8009f, 5.1016f, 17.029f, 4.461f, 15.0004f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(13.0005f)
                    horizontalLineTo(4.051f)
                    curveTo(3.983f, 12.3355f, 3.983f, 11.6654f, 4.051f, 11.0005f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(9.0005f)
                    horizontalLineTo(4.461f)
                    curveTo(5.001f, 7.2832f, 5.9946f, 5.7435f, 7.3369f, 4.544f)
                    curveTo(8.6792f, 3.3444f, 10.3204f, 2.5294f, 12.0873f, 2.185f)
                    curveTo(13.8543f, 1.8406f, 15.6814f, 1.9796f, 17.376f, 2.5872f)
                    curveTo(19.0705f, 3.1949f, 20.5696f, 4.2487f, 21.715f, 5.6375f)
                    lineTo(23.257f, 4.3635f)
                    curveTo(21.8496f, 2.6577f, 19.998f, 1.3745f, 17.9067f, 0.6557f)
                    curveTo(15.8155f, -0.0632f, 13.5661f, -0.1897f, 11.4075f, 0.2903f)
                    curveTo(9.2488f, 0.7702f, 7.265f, 1.8378f, 5.6753f, 3.375f)
                    curveTo(4.0856f, 4.9122f, 2.9521f, 6.8591f, 2.4f, 9.0005f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(11.0005f)
                    horizontalLineTo(2.051f)
                    curveTo(2.023f, 11.3315f, 2.0f, 11.6625f, 2.0f, 12.0005f)
                    curveTo(2.0f, 12.3385f, 2.023f, 12.6695f, 2.051f, 13.0005f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(15.0004f)
                    horizontalLineTo(2.4f)
                    curveTo(2.9514f, 17.1429f, 4.0849f, 19.091f, 5.675f, 20.6291f)
                    curveTo(7.265f, 22.1672f, 9.2497f, 23.2354f, 11.4093f, 23.7154f)
                    curveTo(13.5688f, 24.1954f, 15.8191f, 24.0685f, 17.911f, 23.3488f)
                    curveTo(20.0029f, 22.6291f, 21.8549f, 21.3446f, 23.262f, 19.6374f)
                    lineTo(21.72f, 18.3634f)
                    curveTo(20.7823f, 19.5029f, 19.6034f, 20.4201f, 18.2685f, 21.049f)
                    curveTo(16.9335f, 21.6779f, 15.4757f, 22.0029f, 14.0f, 22.0004f)
                    close()
                }
            }
        }
        .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
