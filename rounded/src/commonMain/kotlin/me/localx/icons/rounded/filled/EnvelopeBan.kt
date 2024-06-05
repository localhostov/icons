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

public val Icons.Filled.EnvelopeBan: ImageVector
    get() {
        if (_envelopeBan != null) {
            return _envelopeBan!!
        }
        _envelopeBan = Builder(name = "EnvelopeBan", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 11.0f)
                curveToRelative(7.269f, -0.231f, 7.267f, -10.77f, 0.0f, -11.0f)
                curveTo(11.231f, 0.231f, 11.233f, 10.77f, 18.5f, 11.0f)
                close()
                moveTo(18.5f, 9.0f)
                arcToRelative(3.449f, 3.449f, 0.0f, false, true, -1.652f, -0.434f)
                lineToRelative(4.718f, -4.718f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 9.0f)
                close()
                moveTo(18.5f, 2.0f)
                arcToRelative(3.449f, 3.449f, 0.0f, false, true, 1.652f, 0.434f)
                lineTo(15.434f, 7.152f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 2.0f)
                close()
                moveTo(18.5f, 13.0f)
                arcTo(7.474f, 7.474f, 0.0f, false, false, 24.0f, 10.587f)
                lineTo(24.0f, 19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, 5.0f)
                lineTo(5.0f, 24.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(0.0f, 8.0f)
                curveToRelative(0.0f, -0.157f, 0.032f, -0.3f, 0.046f, -0.458f)
                lineTo(8.464f, 15.96f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, 7.072f, 0.0f)
                lineTo(18.5f, 13.0f)
                close()
                moveTo(9.878f, 14.546f)
                lineTo(0.744f, 5.411f)
                arcTo(4.986f, 4.986f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineToRelative(6.436f)
                arcToRelative(7.532f, 7.532f, 0.0f, false, false, 4.64f, 9.592f)
                lineToRelative(-1.954f, 1.954f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, true, -4.244f, 0.0f)
                close()
            }
        }
        .build()
        return _envelopeBan!!
    }

private var _envelopeBan: ImageVector? = null
