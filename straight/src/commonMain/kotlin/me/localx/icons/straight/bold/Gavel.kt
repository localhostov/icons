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

public val Icons.Bold.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.824f, 10.055f)
                lineToRelative(-0.74f, 0.74f)
                lineTo(13.206f, 2.916f)
                lineToRelative(0.74f, -0.74f)
                lineTo(11.824f, 0.055f)
                lineTo(3.822f, 8.057f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(0.685f, -0.685f)
                lineToRelative(2.879f, 2.879f)
                lineTo(0.036f, 21.843f)
                lineToRelative(2.121f, 2.121f)
                lineTo(11.628f, 14.493f)
                lineToRelative(2.879f, 2.879f)
                lineToRelative(-0.704f, 0.704f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(8.021f, -8.021f)
                lineToRelative(-2.121f, -2.121f)
                close()
                moveTo(12.315f, 6.268f)
                lineToRelative(5.417f, 5.417f)
                lineToRelative(-2.335f, 2.336f)
                lineToRelative(-5.417f, -5.417f)
                lineToRelative(2.335f, -2.336f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
