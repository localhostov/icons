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

public val Icons.Bold.InboxFull: ImageVector
    get() {
        if (_inboxFull != null) {
            return _inboxFull!!
        }
        _inboxFull = Builder(name = "InboxFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.193f, 3.0f)
                lineTo(6.817f, 3.0f)
                lineToRelative(0.555f, -3.0f)
                horizontalLineToRelative(9.269f)
                lineToRelative(0.552f, 3.0f)
                close()
                moveTo(24.0f, 12.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineToRelative(0.025f, -8.273f)
                lineTo(2.287f, 0.0f)
                horizontalLineToRelative(3.051f)
                lineToRelative(-2.035f, 11.0f)
                horizontalLineToRelative(5.197f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(5.199f)
                lineTo(18.674f, 0.0f)
                horizontalLineToRelative(3.047f)
                lineToRelative(2.279f, 12.5f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineToRelative(-2.528f)
                curveToRelative(-0.25f, 2.247f, -2.16f, 4.0f, -4.472f, 4.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.312f, 0.0f, -4.223f, -1.753f, -4.472f, -4.0f)
                horizontalLineToRelative(-2.528f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(17.579f, 5.0f)
                lineTo(6.421f, 5.0f)
                lineToRelative(-0.546f, 3.0f)
                horizontalLineToRelative(12.249f)
                lineToRelative(-0.546f, -3.0f)
                close()
            }
        }
        .build()
        return _inboxFull!!
    }

private var _inboxFull: ImageVector? = null
