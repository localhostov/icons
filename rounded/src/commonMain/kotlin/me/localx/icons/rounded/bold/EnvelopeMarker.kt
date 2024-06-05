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

public val Icons.Bold.EnvelopeMarker: ImageVector
    get() {
        if (_envelopeMarker != null) {
            return _envelopeMarker!!
        }
        _envelopeMarker = Builder(name = "EnvelopeMarker", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 16.5f)
                verticalLineToRelative(2.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 24.0f)
                horizontalLineTo(5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                verticalLineTo(8.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                arcTo(2.493f, 2.493f, 0.0f, false, false, 3.3f, 7.336f)
                lineToRelative(6.931f, 6.932f)
                arcToRelative(2.555f, 2.555f, 0.0f, false, false, 3.017f, 0.4f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.5f, 2.6f)
                arcToRelative(5.523f, 5.523f, 0.0f, false, true, -6.64f, -0.874f)
                lineTo(3.0f, 11.278f)
                verticalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                verticalLineToRelative(-2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 16.5f)
                close()
                moveTo(22.0f, 0.0f)
                horizontalLineTo(17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(9.654f)
                arcToRelative(1.35f, 1.35f, 0.0f, false, false, 2.193f, 1.054f)
                lineTo(19.5f, 10.863f)
                lineToRelative(2.307f, 1.845f)
                arcTo(1.35f, 1.35f, 0.0f, false, false, 24.0f, 11.654f)
                verticalLineTo(2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 0.0f)
                close()
            }
        }
        .build()
        return _envelopeMarker!!
    }

private var _envelopeMarker: ImageVector? = null
