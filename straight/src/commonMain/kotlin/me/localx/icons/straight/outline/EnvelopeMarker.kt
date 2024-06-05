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

public val Icons.Outline.EnvelopeMarker: ImageVector
    get() {
        if (_envelopeMarker != null) {
            return _envelopeMarker!!
        }
        _envelopeMarker = Builder(name = "EnvelopeMarker", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 0.0f)
                lineTo(15.0f, 8.948f)
                arcToRelative(2.051f, 2.051f, 0.0f, false, false, 3.331f, 1.6f)
                lineTo(19.5f, 9.613f)
                lineToRelative(1.169f, 0.936f)
                arcTo(2.051f, 2.051f, 0.0f, false, false, 24.0f, 8.948f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(21.919f, 8.987f)
                lineTo(19.5f, 7.052f)
                lineTo(17.0f, 8.948f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(4.99f)
                close()
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(13.0f, 3.0f)
                lineTo(13.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineToRelative(0.242f)
                lineToRelative(7.878f, 7.88f)
                arcToRelative(3.074f, 3.074f, 0.0f, false, false, 4.243f, 0.0f)
                lineTo(15.243f, 13.0f)
                horizontalLineToRelative(2.828f)
                lineToRelative(-2.536f, 2.536f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -7.071f, 0.0f)
                lineTo(2.0f, 9.071f)
                lineTo(2.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                close()
            }
        }
        .build()
        return _envelopeMarker!!
    }

private var _envelopeMarker: ImageVector? = null
