package me.localx.icons.rounded.bold

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

public val Icons.Bold.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) {
            return _pokerChip!!
        }
        _pokerChip = Builder(name = "PokerChip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcToRelative(12.013f, 12.013f, 0.0f, false, false, -12.0f, -12.0f)
                close()
                moveTo(20.617f, 9.415f)
                lineTo(17.746f, 10.276f)
                arcToRelative(6.007f, 6.007f, 0.0f, false, false, -4.022f, -4.022f)
                lineToRelative(0.861f, -2.871f)
                arcToRelative(9.027f, 9.027f, 0.0f, false, true, 6.032f, 6.032f)
                close()
                moveTo(12.738f, 15.631f)
                arcToRelative(0.922f, 0.922f, 0.0f, false, true, -1.476f, 0.0f)
                lineToRelative(-1.893f, -2.523f)
                arcToRelative(1.848f, 1.848f, 0.0f, false, true, 0.0f, -2.216f)
                lineToRelative(1.893f, -2.523f)
                arcToRelative(0.922f, 0.922f, 0.0f, false, true, 1.476f, 0.0f)
                lineToRelative(1.893f, 2.523f)
                arcToRelative(1.848f, 1.848f, 0.0f, false, true, 0.0f, 2.216f)
                close()
                moveTo(9.415f, 3.383f)
                lineTo(10.276f, 6.254f)
                arcToRelative(6.007f, 6.007f, 0.0f, false, false, -4.022f, 4.022f)
                lineToRelative(-2.871f, -0.861f)
                arcToRelative(9.031f, 9.031f, 0.0f, false, true, 6.032f, -6.032f)
                close()
                moveTo(3.383f, 14.583f)
                lineTo(6.254f, 13.722f)
                arcToRelative(6.009f, 6.009f, 0.0f, false, false, 4.022f, 4.022f)
                lineToRelative(-0.861f, 2.871f)
                arcToRelative(9.031f, 9.031f, 0.0f, false, true, -6.032f, -6.03f)
                close()
                moveTo(14.583f, 20.615f)
                lineTo(13.722f, 17.744f)
                arcToRelative(6.009f, 6.009f, 0.0f, false, false, 4.022f, -4.022f)
                lineToRelative(2.871f, 0.861f)
                arcToRelative(9.027f, 9.027f, 0.0f, false, true, -6.03f, 6.034f)
                close()
            }
        }
        .build()
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
