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

public val Icons.Filled.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = Builder(name = "Mailbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                lineTo(9.883f, 3.0f)
                curveToRelative(1.344f, 1.314f, 2.117f, 3.118f, 2.117f, 5.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.13f, -0.391f, 2.162f, -1.026f, 3.0f)
                horizontalLineToRelative(10.026f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(24.0f, 9.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(-0.006f, 1.308f, -1.995f, 1.307f, -2.0f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.308f, -0.006f, -1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.501f, 3.024f)
                curveTo(1.903f, 3.278f, 0.0f, 5.612f, 0.0f, 8.222f)
                verticalLineToRelative(9.778f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                lineTo(7.0f, 21.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                lineTo(10.0f, 8.0f)
                curveToRelative(0.0f, -2.922f, -2.519f, -5.266f, -5.499f, -4.976f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.308f, -0.006f, -1.307f, -1.994f, 0.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.308f, 0.006f, 1.307f, 1.994f, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
