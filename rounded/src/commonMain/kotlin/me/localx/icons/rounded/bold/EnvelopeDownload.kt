package me.localx.icons.rounded.bold

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
                moveTo(24.0f, 15.5f)
                verticalLineToRelative(3.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 24.0f)
                horizontalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                verticalLineTo(8.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(2.493f, 2.493f, 0.0f, false, false, 3.3f, 7.336f)
                lineToRelative(6.931f, 6.932f)
                arcToRelative(2.562f, 2.562f, 0.0f, false, false, 3.536f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.121f, 2.121f)
                arcToRelative(5.525f, 5.525f, 0.0f, false, true, -7.778f, 0.0f)
                lineTo(3.0f, 11.277f)
                verticalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                verticalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 15.5f)
                close()
                moveTo(14.824f, 8.0f)
                arcTo(1.162f, 1.162f, 0.0f, false, false, 14.0f, 9.984f)
                lineToRelative(3.676f, 3.676f)
                arcToRelative(1.164f, 1.164f, 0.0f, false, false, 1.644f, 0.0f)
                lineTo(23.0f, 9.984f)
                arcTo(1.162f, 1.162f, 0.0f, false, false, 22.176f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _envelopeDownload!!
    }

private var _envelopeDownload: ImageVector? = null
