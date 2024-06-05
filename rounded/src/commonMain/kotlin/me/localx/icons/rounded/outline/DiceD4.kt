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

public val Icons.Outline.DiceD4: ImageVector
    get() {
        if (_diceD4 != null) {
            return _diceD4!!
        }
        _diceD4 = Builder(name = "DiceD4", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.287f, 12.967f)
                lineTo(15.155f, 1.543f)
                curveToRelative(-0.011f, -0.016f, -0.023f, -0.031f, -0.035f, -0.046f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.275f, 0.046f)
                lineTo(0.7f, 12.98f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, 5.541f)
                lineToRelative(7.666f, 4.733f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, 5.254f, 0.0f)
                lineToRelative(7.73f, -4.776f)
                arcTo(3.984f, 3.984f, 0.0f, false, false, 23.287f, 12.967f)
                close()
                moveTo(2.822f, 16.862f)
                arcToRelative(1.987f, 1.987f, 0.0f, false, true, -0.48f, -2.735f)
                lineToRelative(8.1f, -11.378f)
                arcTo(2.008f, 2.008f, 0.0f, false, true, 11.0f, 2.268f)
                lineTo(11.0f, 21.829f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, true, -0.576f, -0.276f)
                close()
                moveTo(21.242f, 16.819f)
                lineTo(13.576f, 21.553f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, true, -0.576f, 0.276f)
                lineTo(13.0f, 2.268f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, true, 0.544f, 0.461f)
                lineToRelative(8.1f, 11.384f)
                arcTo(1.979f, 1.979f, 0.0f, false, true, 21.242f, 16.819f)
                close()
            }
        }
        .build()
        return _diceD4!!
    }

private var _diceD4: ImageVector? = null
