package me.localx.icons.straight.outline

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

public val Icons.Outline.EnvelopeDownload: ImageVector
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
                moveTo(22.161f, 11.7f)
                curveToRelative(-0.05f, 0.05f, -0.109f, 0.086f, -0.161f, 0.133f)
                lineTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 9.07f)
                lineToRelative(6.465f, 6.466f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 7.07f, 0.0f)
                lineToRelative(2.618f, -2.619f)
                arcToRelative(4.393f, 4.393f, 0.0f, false, true, -1.923f, -0.9f)
                lineToRelative(-2.109f, 2.109f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, -4.242f, 0.0f)
                lineTo(2.0f, 6.242f)
                lineTo(2.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 5.0f)
                lineTo(14.0f, 5.0f)
                lineToRelative(2.0f, -2.0f)
                lineTo(3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
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
