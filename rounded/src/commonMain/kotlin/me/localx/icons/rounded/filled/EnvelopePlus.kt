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

public val Icons.Filled.EnvelopePlus: ImageVector
    get() {
        if (_envelopePlus != null) {
            return _envelopePlus!!
        }
        _envelopePlus = Builder(name = "EnvelopePlus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.878f, 14.546f)
                lineTo(0.744f, 5.411f)
                arcTo(4.986f, 4.986f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineToRelative(7.294f)
                arcToRelative(7.037f, 7.037f, 0.0f, false, false, 4.675f, 8.7f)
                lineToRelative(-2.847f, 2.848f)
                arcTo(3.007f, 3.007f, 0.0f, false, true, 9.878f, 14.546f)
                close()
                moveTo(15.536f, 15.96f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, true, -7.072f, 0.0f)
                lineTo(0.046f, 7.542f)
                curveTo(0.032f, 7.7f, 0.0f, 7.843f, 0.0f, 8.0f)
                lineTo(0.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(19.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 9.894f)
                arcToRelative(6.972f, 6.972f, 0.0f, false, true, -4.478f, 2.08f)
                close()
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(20.0f, 4.0f)
                lineTo(20.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(18.0f, 4.0f)
                lineTo(15.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 6.0f)
                close()
            }
        }
        .build()
        return _envelopePlus!!
    }

private var _envelopePlus: ImageVector? = null
