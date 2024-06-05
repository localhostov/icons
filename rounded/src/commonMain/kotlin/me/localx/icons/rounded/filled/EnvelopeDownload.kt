package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(14.746f, 6.285f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.16f, 6.3f)
                lineTo(18.0f, 8.181f)
                lineTo(18.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                lineTo(20.0f, 8.181f)
                lineTo(21.84f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.43f, 1.4f)
                lineTo(20.755f, 10.27f)
                arcTo(2.478f, 2.478f, 0.0f, false, true, 19.012f, 11.0f)
                arcToRelative(0.04f, 0.04f, 0.0f, false, true, -0.019f, 0.0f)
                arcToRelative(2.456f, 2.456f, 0.0f, false, true, -1.74f, -0.722f)
                lineTo(14.73f, 7.7f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.746f, 6.285f)
                close()
                moveTo(12.0f, 15.422f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.122f, -0.876f)
                lineToRelative(2.341f, -2.341f)
                arcToRelative(4.493f, 4.493f, 0.0f, false, true, -0.625f, -0.514f)
                lineTo(13.3f, 9.1f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.046f, -4.242f)
                curveTo(13.82f, 4.394f, 14.792f, 3.543f, 15.42f, 3.0f)
                lineTo(5.0f, 3.0f)
                arcTo(4.986f, 4.986f, 0.0f, false, false, 0.744f, 5.411f)
                lineToRelative(9.134f, 9.135f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.422f)
                close()
                moveTo(22.185f, 11.668f)
                arcToRelative(4.348f, 4.348f, 0.0f, false, true, -3.644f, 1.287f)
                lineTo(15.536f, 15.96f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, true, -7.072f, 0.0f)
                lineTo(0.046f, 7.542f)
                curveTo(0.032f, 7.7f, 0.0f, 7.843f, 0.0f, 8.0f)
                lineTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 9.812f)
                close()
            }
        }
        .build()
        return _envelopeDownload!!
    }

private var _envelopeDownload: ImageVector? = null
