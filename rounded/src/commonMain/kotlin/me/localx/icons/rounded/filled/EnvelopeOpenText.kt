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

public val Icons.Filled.EnvelopeOpenText: ImageVector
    get() {
        if (_envelopeOpenText != null) {
            return _envelopeOpenText!!
        }
        _envelopeOpenText = Builder(name = "EnvelopeOpenText", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.878f, 17.122f)
                curveToRelative(1.134f, 1.133f, 3.11f, 1.133f, 4.243f, 0.0f)
                lineToRelative(6.879f, -6.879f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(7.0f, 0.0f)
                curveTo(4.794f, 0.0f, 3.0f, 1.794f, 3.0f, 4.0f)
                verticalLineToRelative(6.243f)
                lineToRelative(6.878f, 6.879f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.308f, 0.006f, 1.307f, 1.995f, 0.0f, 2.0f)
                lineTo(8.0f, 6.0f)
                curveToRelative(-1.308f, -0.006f, -1.307f, -1.994f, 0.0f, -2.0f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.308f, 0.006f, 1.307f, 1.995f, 0.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.308f, -0.006f, -1.307f, -1.994f, 0.0f, -2.0f)
                close()
                moveTo(23.5f, 10.57f)
                curveToRelative(0.316f, 0.665f, 0.5f, 1.392f, 0.5f, 2.137f)
                verticalLineToRelative(6.292f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.999f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.292f)
                curveToRelative(0.0f, -0.746f, 0.184f, -1.472f, 0.5f, -2.137f)
                lineToRelative(7.965f, 7.966f)
                curveToRelative(1.862f, 1.939f, 5.21f, 1.94f, 7.071f, 0.0f)
                lineToRelative(7.965f, -7.966f)
                close()
            }
        }
        .build()
        return _envelopeOpenText!!
    }

private var _envelopeOpenText: ImageVector? = null
