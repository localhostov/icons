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

public val Icons.Filled.EnvelopeDownload: ImageVector
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
                    moveTo(12.0f, 15.426f)
                    curveTo(12.7955f, 15.4269f, 13.5588f, 15.1118f, 14.122f, 14.55f)
                    lineTo(16.463f, 12.209f)
                    curveTo(16.2398f, 12.0566f, 16.0307f, 11.8845f, 15.838f, 11.695f)
                    lineTo(12.968f, 8.82f)
                    curveTo(12.5931f, 8.4449f, 12.3824f, 7.9363f, 12.3824f, 7.406f)
                    curveTo(12.3824f, 6.8757f, 12.5931f, 6.3671f, 12.968f, 5.992f)
                    lineTo(15.96f, 3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.4012f, 3.0009f, 1.8163f, 3.181f, 1.3207f, 3.5171f)
                    curveTo(0.8251f, 3.8532f, 0.4414f, 4.33f, 0.219f, 4.886f)
                    lineTo(9.878f, 14.546f)
                    curveTo(10.4412f, 15.1078f, 11.2045f, 15.4229f, 12.0f, 15.422f)
                    verticalLineTo(15.426f)
                    close()
                    moveTo(22.161f, 11.695f)
                    curveTo(21.7076f, 12.1868f, 21.1401f, 12.5593f, 20.5085f, 12.7797f)
                    curveTo(19.877f, 13.0002f, 19.2009f, 13.0618f, 18.54f, 12.959f)
                    lineTo(15.54f, 15.964f)
                    curveTo(14.6014f, 16.9003f, 13.3297f, 17.426f, 12.004f, 17.426f)
                    curveTo(10.6783f, 17.426f, 9.4066f, 16.9003f, 8.468f, 15.964f)
                    lineTo(0.0f, 7.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.852f)
                    lineTo(22.161f, 11.695f)
                    close()
                }
            }
        }
        .build()
        return _envelopeDownload!!
    }

private var _envelopeDownload: ImageVector? = null
