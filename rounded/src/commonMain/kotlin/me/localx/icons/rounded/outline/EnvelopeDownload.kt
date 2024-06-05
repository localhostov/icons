package me.localx.icons.rounded.outline

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
                moveTo(14.73f, 7.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.43f, -1.4f)
                lineTo(18.0f, 8.181f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineTo(8.181f)
                lineTo(21.84f, 6.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.43f, 1.4f)
                lineTo(20.755f, 10.27f)
                arcTo(2.478f, 2.478f, 0.0f, false, true, 19.012f, 11.0f)
                arcToRelative(0.04f, 0.04f, 0.0f, false, true, -0.019f, 0.0f)
                arcToRelative(2.456f, 2.456f, 0.0f, false, true, -1.74f, -0.722f)
                close()
                moveTo(23.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineTo(9.071f)
                lineToRelative(6.465f, 6.465f)
                arcToRelative(5.025f, 5.025f, 0.0f, false, false, 7.06f, 0.01f)
                lineToRelative(1.882f, -1.829f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.394f, -1.434f)
                lineToRelative(-1.892f, 1.839f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, true, -4.242f, 0.0f)
                lineTo(2.361f, 6.6f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 5.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 0.0f, 8.0f)
                verticalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 11.0f)
                close()
            }
        }
        .build()
        return _envelopeDownload!!
    }

private var _envelopeDownload: ImageVector? = null
