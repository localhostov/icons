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

public val Icons.Outline.PokerChip: ImageVector
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
                moveTo(22.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -0.186f, 1.9f)
                lineToRelative(-1.932f, -0.58f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, 0.0f, -2.64f)
                lineToRelative(1.932f, -0.58f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.186f, 1.9f)
                close()
                moveTo(21.24f, 8.184f)
                lineTo(19.31f, 8.763f)
                arcToRelative(8.048f, 8.048f, 0.0f, false, false, -4.073f, -4.073f)
                lineToRelative(0.579f, -1.93f)
                arcToRelative(10.058f, 10.058f, 0.0f, false, true, 5.424f, 5.424f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.0f, -6.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, -6.0f, 6.0f)
                close()
                moveTo(13.9f, 2.186f)
                lineTo(13.32f, 4.118f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, -2.64f, 0.0f)
                lineToRelative(-0.58f, -1.932f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, true, 3.8f, 0.0f)
                close()
                moveTo(8.184f, 2.76f)
                lineTo(8.763f, 4.69f)
                arcToRelative(8.048f, 8.048f, 0.0f, false, false, -4.073f, 4.073f)
                lineToRelative(-1.93f, -0.579f)
                arcToRelative(10.058f, 10.058f, 0.0f, false, true, 5.424f, -5.424f)
                close()
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.186f, -1.9f)
                lineToRelative(1.932f, 0.58f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, 0.0f, 2.64f)
                lineToRelative(-1.932f, 0.58f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -0.186f, -1.9f)
                close()
                moveTo(2.76f, 15.816f)
                lineTo(4.69f, 15.237f)
                arcToRelative(8.048f, 8.048f, 0.0f, false, false, 4.073f, 4.073f)
                lineToRelative(-0.579f, 1.93f)
                arcToRelative(10.058f, 10.058f, 0.0f, false, true, -5.424f, -5.424f)
                close()
                moveTo(10.1f, 21.816f)
                lineTo(10.68f, 19.884f)
                arcToRelative(7.442f, 7.442f, 0.0f, false, false, 2.64f, 0.0f)
                lineToRelative(0.58f, 1.932f)
                arcToRelative(9.8f, 9.8f, 0.0f, false, true, -3.8f, 0.0f)
                close()
                moveTo(15.816f, 21.241f)
                lineTo(15.237f, 19.312f)
                arcToRelative(8.048f, 8.048f, 0.0f, false, false, 4.073f, -4.073f)
                lineToRelative(1.93f, 0.579f)
                arcToRelative(10.053f, 10.053f, 0.0f, false, true, -5.424f, 5.421f)
                close()
                moveTo(14.631f, 10.892f)
                arcToRelative(1.848f, 1.848f, 0.0f, false, true, 0.0f, 2.216f)
                lineToRelative(-1.893f, 2.523f)
                arcToRelative(0.922f, 0.922f, 0.0f, false, true, -1.476f, 0.0f)
                lineToRelative(-1.893f, -2.523f)
                arcToRelative(1.848f, 1.848f, 0.0f, false, true, 0.0f, -2.216f)
                lineToRelative(1.893f, -2.523f)
                arcToRelative(0.922f, 0.922f, 0.0f, false, true, 1.476f, 0.0f)
                close()
            }
        }
        .build()
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
