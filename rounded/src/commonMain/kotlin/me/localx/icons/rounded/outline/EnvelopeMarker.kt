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
                moveTo(22.0f, 0.0f)
                lineTo(17.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(15.0f, 8.948f)
                arcToRelative(2.051f, 2.051f, 0.0f, false, false, 3.331f, 1.6f)
                lineTo(19.5f, 9.613f)
                lineToRelative(1.169f, 0.936f)
                arcTo(2.051f, 2.051f, 0.0f, false, false, 24.0f, 8.948f)
                lineTo(24.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 0.0f)
                close()
                moveTo(21.919f, 8.987f)
                lineTo(20.125f, 7.552f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.25f, 0.0f)
                lineTo(17.0f, 8.948f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(24.0f, 14.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(0.0f, 8.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                lineTo(5.0f, 5.0f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 2.361f, 6.6f)
                lineToRelative(7.517f, 7.518f)
                arcToRelative(3.075f, 3.075f, 0.0f, false, false, 4.243f, 0.0f)
                lineToRelative(0.858f, -0.837f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.4f, 1.43f)
                lineToRelative(-0.849f, 0.829f)
                arcToRelative(5.025f, 5.025f, 0.0f, false, true, -7.062f, -0.008f)
                lineTo(2.0f, 9.071f)
                lineTo(2.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(19.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(22.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 24.0f, 14.0f)
                close()
            }
        }
        .build()
        return _envelopeMarker!!
    }

private var _envelopeMarker: ImageVector? = null
