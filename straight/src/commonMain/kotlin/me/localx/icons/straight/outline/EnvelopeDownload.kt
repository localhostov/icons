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

public val Icons.Outline.EnvelopeDownload: ImageVector
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
                    moveTo(18.0f, 8.2f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(8.2f)
                    lineTo(22.242f, 5.958f)
                    lineTo(23.656f, 7.372f)
                    lineTo(20.747f, 10.281f)
                    curveTo(20.2835f, 10.744f, 19.6551f, 11.0041f, 19.0f, 11.0041f)
                    curveTo(18.3449f, 11.0041f, 17.7165f, 10.744f, 17.253f, 10.281f)
                    lineTo(14.382f, 7.406f)
                    lineTo(15.8f, 5.992f)
                    lineTo(18.0f, 8.2f)
                    close()
                    moveTo(22.161f, 11.7f)
                    curveTo(22.111f, 11.75f, 22.052f, 11.786f, 22.0f, 11.833f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(9.07f)
                    lineTo(8.465f, 15.536f)
                    curveTo(9.4026f, 16.4734f, 10.6742f, 16.9999f, 12.0f, 16.9999f)
                    curveTo(13.3258f, 16.9999f, 14.5974f, 16.4734f, 15.535f, 15.536f)
                    lineTo(18.153f, 12.917f)
                    curveTo(17.4481f, 12.7787f, 16.7878f, 12.4697f, 16.23f, 12.017f)
                    lineTo(14.121f, 14.126f)
                    curveTo(13.5493f, 14.671f, 12.7898f, 14.975f, 12.0f, 14.975f)
                    curveTo(11.2102f, 14.975f, 10.4507f, 14.671f, 9.879f, 14.126f)
                    lineTo(2.0f, 6.242f)
                    verticalLineTo(6.0f)
                    curveTo(2.0f, 5.7348f, 2.1054f, 5.4804f, 2.2929f, 5.2929f)
                    curveTo(2.4804f, 5.1054f, 2.7348f, 5.0f, 3.0f, 5.0f)
                    horizontalLineTo(14.0f)
                    lineTo(16.0f, 3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 3.0f, 1.4413f, 3.3161f, 0.8787f, 3.8787f)
                    curveTo(0.3161f, 4.4413f, 0.0f, 5.2043f, 0.0f, 6.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.852f)
                    lineTo(22.161f, 11.7f)
                    close()
                }
            }
        }
        .build()
        return _envelopeDownload!!
    }

private var _envelopeDownload: ImageVector? = null
