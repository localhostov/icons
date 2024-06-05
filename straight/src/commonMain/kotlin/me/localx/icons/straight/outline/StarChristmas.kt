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

public val Icons.Outline.StarChristmas: ImageVector
    get() {
        if (_starChristmas != null) {
            return _starChristmas!!
        }
        _starChristmas = Builder(name = "StarChristmas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.185f, 14.822f)
                lineToRelative(6.854f, -2.822f)
                lineToRelative(-6.854f, -2.822f)
                lineToRelative(4.815f, -7.178f)
                lineToRelative(-7.178f, 4.815f)
                lineTo(12.0f, -0.038f)
                lineToRelative(-2.798f, 6.796f)
                lineTo(2.0f, 2.0f)
                lineToRelative(4.758f, 7.202f)
                lineTo(-0.039f, 12.0f)
                lineToRelative(6.854f, 2.822f)
                lineToRelative(-4.815f, 7.178f)
                lineToRelative(7.178f, -4.815f)
                lineToRelative(2.822f, 6.853f)
                lineToRelative(2.822f, -6.853f)
                lineToRelative(7.178f, 4.815f)
                lineToRelative(-4.815f, -7.178f)
                close()
                moveTo(10.02f, 13.979f)
                lineToRelative(-4.806f, -1.979f)
                lineToRelative(4.806f, -1.979f)
                lineToRelative(1.979f, -4.806f)
                lineToRelative(1.979f, 4.806f)
                lineToRelative(4.806f, 1.979f)
                lineToRelative(-4.806f, 1.979f)
                lineToRelative(-1.979f, 4.806f)
                lineToRelative(-1.979f, -4.806f)
                close()
            }
        }
        .build()
        return _starChristmas!!
    }

private var _starChristmas: ImageVector? = null
