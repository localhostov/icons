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

public val Icons.Bold.EnvelopeDownload: ImageVector
    get() {
        if (_envelopeDownload != null) {
            return _envelopeDownload!!
        }
        _envelopeDownload = Builder(name = "EnvelopeDownload", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0f, 8.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(24.0f)
                    lineTo(19.312f, 12.642f)
                    curveTo(19.0828f, 12.8711f, 18.7721f, 12.9998f, 18.448f, 12.9998f)
                    curveTo(18.1239f, 12.9998f, 17.8132f, 12.8711f, 17.584f, 12.642f)
                    lineTo(13.0f, 8.0f)
                    horizontalLineTo(17.0f)
                    close()
                    moveTo(21.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(11.2f)
                    lineTo(8.239f, 16.44f)
                    curveTo(8.7328f, 16.934f, 9.319f, 17.3258f, 9.9642f, 17.5932f)
                    curveTo(10.6095f, 17.8605f, 11.3011f, 17.9981f, 11.9995f, 17.9981f)
                    curveTo(12.6979f, 17.9981f, 13.3895f, 17.8605f, 14.0348f, 17.5932f)
                    curveTo(14.68f, 17.3258f, 15.2662f, 16.934f, 15.76f, 16.44f)
                    lineTo(17.343f, 14.858f)
                    curveTo(16.8198f, 14.7137f, 16.3421f, 14.4383f, 15.955f, 14.058f)
                    lineTo(14.936f, 13.026f)
                    lineTo(13.636f, 14.326f)
                    curveTo(13.1945f, 14.7477f, 12.6075f, 14.983f, 11.997f, 14.983f)
                    curveTo(11.3865f, 14.983f, 10.7995f, 14.7477f, 10.358f, 14.326f)
                    lineTo(3.0f, 6.96f)
                    verticalLineTo(6.5f)
                    curveTo(3.0f, 6.3674f, 3.0527f, 6.2402f, 3.1465f, 6.1465f)
                    curveTo(3.2402f, 6.0527f, 3.3674f, 6.0f, 3.5f, 6.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(3.5f)
                    curveTo(2.5717f, 3.0f, 1.6815f, 3.3688f, 1.0251f, 4.0251f)
                    curveTo(0.3687f, 4.6815f, 0.0f, 5.5717f, 0.0f, 6.5f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(10.6f)
                    lineTo(21.0f, 13.57f)
                    verticalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _envelopeDownload!!
    }

private var _envelopeDownload: ImageVector? = null
