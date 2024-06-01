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

public val Icons.Bold.FileMusic: ImageVector
    get() {
        if (_fileMusic != null) {
            return _fileMusic!!
        }
        _fileMusic = Builder(name = "FileMusic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.5002f, 9.0f)
                    horizontalLineTo(16.0002f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(14.0002f)
                    verticalLineTo(16.0f)
                    curveTo(14.0002f, 16.5933f, 13.8242f, 17.1734f, 13.4946f, 17.6667f)
                    curveTo(13.1649f, 18.1601f, 12.6964f, 18.5446f, 12.1482f, 18.7716f)
                    curveTo(11.6f, 18.9987f, 10.9968f, 19.0581f, 10.4149f, 18.9424f)
                    curveTo(9.8329f, 18.8266f, 9.2984f, 18.5409f, 8.8788f, 18.1213f)
                    curveTo(8.4593f, 17.7018f, 8.1735f, 17.1672f, 8.0578f, 16.5853f)
                    curveTo(7.942f, 16.0033f, 8.0014f, 15.4001f, 8.2285f, 14.8519f)
                    curveTo(8.4556f, 14.3038f, 8.8401f, 13.8352f, 9.3334f, 13.5056f)
                    curveTo(9.8268f, 13.1759f, 10.4068f, 13.0f, 11.0002f, 13.0f)
                    verticalLineTo(11.5f)
                    curveTo(11.0002f, 10.837f, 11.2635f, 10.2011f, 11.7324f, 9.7322f)
                    curveTo(12.2012f, 9.2634f, 12.8371f, 9.0f, 13.5002f, 9.0f)
                    close()
                    moveTo(22.0002f, 5.879f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(3.0f)
                    curveTo(2.0001f, 2.2043f, 2.3162f, 1.4413f, 2.8788f, 0.8787f)
                    curveTo(3.4414f, 0.3161f, 4.2045f, 0.0f, 5.0002f, 0.0f)
                    lineTo(16.1212f, 0.0f)
                    lineTo(22.0002f, 5.879f)
                    close()
                    moveTo(19.0002f, 21.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(14.0002f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(5.0002f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(19.0002f)
                    close()
                }
            }
        }
        .build()
        return _fileMusic!!
    }

private var _fileMusic: ImageVector? = null
