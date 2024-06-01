package me.localx.icons.straight.outline

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

public val Icons.Outline.Euro: ImageVector
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
                    moveTo(2.4f, 15.0005f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(13.0005f)
                    horizontalLineTo(2.051f)
                    curveTo(2.023f, 12.6695f, 2.0f, 12.3385f, 2.0f, 12.0005f)
                    curveTo(2.0f, 11.6625f, 2.023f, 11.3315f, 2.051f, 11.0005f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(9.0005f)
                    horizontalLineTo(2.4f)
                    curveTo(2.9521f, 6.8591f, 4.0856f, 4.9122f, 5.6753f, 3.375f)
                    curveTo(7.265f, 1.8378f, 9.2488f, 0.7702f, 11.4075f, 0.2903f)
                    curveTo(13.5661f, -0.1897f, 15.8155f, -0.0632f, 17.9067f, 0.6557f)
                    curveTo(19.998f, 1.3745f, 21.8496f, 2.6578f, 23.257f, 4.3635f)
                    lineTo(21.715f, 5.6375f)
                    curveTo(20.5696f, 4.2487f, 19.0705f, 3.1949f, 17.376f, 2.5872f)
                    curveTo(15.6814f, 1.9796f, 13.8543f, 1.8406f, 12.0873f, 2.185f)
                    curveTo(10.3204f, 2.5294f, 8.6792f, 3.3444f, 7.3369f, 4.544f)
                    curveTo(5.9946f, 5.7435f, 5.001f, 7.2832f, 4.461f, 9.0005f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(11.0005f)
                    horizontalLineTo(4.051f)
                    curveTo(3.983f, 11.6654f, 3.983f, 12.3355f, 4.051f, 13.0005f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(15.0005f)
                    horizontalLineTo(4.461f)
                    curveTo(5.001f, 16.7178f, 5.9946f, 18.2574f, 7.3369f, 19.457f)
                    curveTo(8.6792f, 20.6565f, 10.3204f, 21.4715f, 12.0873f, 21.8159f)
                    curveTo(13.8543f, 22.1603f, 15.6814f, 22.0214f, 17.376f, 21.4137f)
                    curveTo(19.0705f, 20.8061f, 20.5696f, 19.7522f, 21.715f, 18.3635f)
                    lineTo(23.257f, 19.6375f)
                    curveTo(21.8496f, 21.3432f, 19.998f, 22.6264f, 17.9067f, 23.3453f)
                    curveTo(15.8155f, 24.0641f, 13.5661f, 24.1906f, 11.4075f, 23.7107f)
                    curveTo(9.2488f, 23.2308f, 7.265f, 22.1632f, 5.6753f, 20.6259f)
                    curveTo(4.0856f, 19.0887f, 2.9521f, 17.1418f, 2.4f, 15.0005f)
                    close()
                }
            }
        }
        .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
