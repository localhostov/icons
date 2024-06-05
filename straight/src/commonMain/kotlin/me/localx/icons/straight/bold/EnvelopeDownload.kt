package me.localx.icons.straight.bold

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

public val Icons.Bold.EnvelopeDownload: ImageVector
    get() {
        if (_envelopeDownload != null) {
            return _envelopeDownload!!
        }
        _envelopeDownload = Builder(name = "EnvelopeDownload", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                lineTo(17.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-4.688f, 4.642f)
                arcToRelative(1.222f, 1.222f, 0.0f, false, true, -1.728f, 0.0f)
                lineTo(13.0f, 8.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 11.2f)
                lineToRelative(5.239f, 5.24f)
                arcToRelative(5.317f, 5.317f, 0.0f, false, false, 7.521f, 0.0f)
                lineToRelative(1.583f, -1.582f)
                arcToRelative(3.192f, 3.192f, 0.0f, false, true, -1.388f, -0.8f)
                lineToRelative(-1.019f, -1.032f)
                lineToRelative(-1.3f, 1.3f)
                arcToRelative(2.373f, 2.373f, 0.0f, false, true, -3.278f, 0.0f)
                lineTo(3.0f, 6.96f)
                lineTo(3.0f, 6.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.5f, 6.0f)
                lineTo(15.0f, 6.0f)
                lineTo(15.0f, 3.0f)
                lineTo(3.5f, 3.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 0.0f, 6.5f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 10.6f)
                lineToRelative(-3.0f, 2.97f)
                close()
            }
        }
        .build()
        return _envelopeDownload!!
    }

private var _envelopeDownload: ImageVector? = null
