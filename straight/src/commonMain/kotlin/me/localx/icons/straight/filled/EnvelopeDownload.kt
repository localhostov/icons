package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.EnvelopeDownload: ImageVector
    get() {
        if (_envelopeDownload != null) {
            return _envelopeDownload!!
        }
        _envelopeDownload = Builder(name = "EnvelopeDownload", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.2f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 8.2f)
                lineToRelative(2.242f, -2.242f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.909f, 2.909f)
                arcToRelative(2.472f, 2.472f, 0.0f, false, true, -3.494f, 0.0f)
                lineTo(14.382f, 7.406f)
                lineTo(15.8f, 5.992f)
                close()
                moveTo(12.0f, 15.426f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.122f, -0.876f)
                lineToRelative(2.341f, -2.341f)
                arcToRelative(4.552f, 4.552f, 0.0f, false, true, -0.625f, -0.514f)
                lineTo(12.968f, 8.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineTo(15.96f, 3.0f)
                lineTo(3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.219f, 4.886f)
                lineToRelative(9.659f, 9.66f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.422f)
                close()
                moveTo(22.161f, 11.695f)
                arcToRelative(4.074f, 4.074f, 0.0f, false, true, -3.621f, 1.264f)
                lineToRelative(-3.0f, 3.005f)
                arcToRelative(5.007f, 5.007f, 0.0f, false, true, -7.072f, 0.0f)
                lineTo(0.0f, 7.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 9.852f)
                close()
            }
        }
        .build()
        return _envelopeDownload!!
    }

private var _envelopeDownload: ImageVector? = null
