package me.localx.icons.straight.bold

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

public val Icons.Bold.EnvelopeBan: ImageVector
    get() {
        if (_envelopeBan != null) {
            return _envelopeBan!!
        }
        _envelopeBan = Builder(name = "EnvelopeBan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 13.0f)
                arcTo(6.5f, 6.5f, 0.0f, true, false, 11.0f, 6.5f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 17.5f, 13.0f)
                close()
                moveTo(17.5f, 10.0f)
                arcToRelative(3.463f, 3.463f, 0.0f, false, true, -1.164f, -0.214f)
                lineToRelative(4.45f, -4.45f)
                arcTo(3.463f, 3.463f, 0.0f, false, true, 21.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.5f, 10.0f)
                close()
                moveTo(17.5f, 3.0f)
                arcToRelative(3.463f, 3.463f, 0.0f, false, true, 1.164f, 0.214f)
                lineToRelative(-4.45f, 4.45f)
                arcTo(3.463f, 3.463f, 0.0f, false, true, 14.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 17.5f, 3.0f)
                close()
                moveTo(24.0f, 11.966f)
                lineTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 6.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.0f)
                lineTo(9.763f, 3.0f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, false, -0.738f, 3.0f)
                lineTo(3.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(0.46f)
                lineToRelative(7.361f, 7.361f)
                arcToRelative(2.373f, 2.373f, 0.0f, false, false, 3.278f, 0.0f)
                lineToRelative(0.174f, -0.174f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, false, 3.4f, 0.839f)
                lineTo(15.76f, 16.442f)
                arcToRelative(5.317f, 5.317f, 0.0f, false, true, -7.521f, 0.0f)
                lineTo(3.0f, 11.2f)
                lineTo(3.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 14.237f)
                arcTo(8.546f, 8.546f, 0.0f, false, false, 24.0f, 11.966f)
                close()
            }
        }
        .build()
        return _envelopeBan!!
    }

private var _envelopeBan: ImageVector? = null
