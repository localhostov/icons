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

public val Icons.Filled.DiceD6: ImageVector
    get() {
        if (_diceD6 != null) {
            return _diceD6!!
        }
        _diceD6 = Builder(name = "DiceD6", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.246f, 5.316f)
                arcToRelative(4.964f, 4.964f, 0.0f, false, true, 1.181f, -1.0f)
                lineToRelative(6.0f, -3.6f)
                arcToRelative(4.987f, 4.987f, 0.0f, false, true, 5.145f, 0.0f)
                lineToRelative(6.0f, 3.6f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, true, 1.182f, 1.0f)
                lineTo(12.0f, 11.169f)
                close()
                moveTo(13.0f, 12.9f)
                lineTo(13.0f, 23.889f)
                arcToRelative(4.981f, 4.981f, 0.0f, false, false, 1.572f, -0.6f)
                lineToRelative(6.0f, -3.6f)
                arcTo(5.027f, 5.027f, 0.0f, false, false, 23.0f, 15.4f)
                lineTo(23.0f, 8.6f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, false, -0.258f, -1.544f)
                close()
                moveTo(11.0f, 12.9f)
                lineTo(1.258f, 7.056f)
                arcTo(4.95f, 4.95f, 0.0f, false, false, 1.0f, 8.6f)
                verticalLineToRelative(6.8f)
                arcToRelative(5.027f, 5.027f, 0.0f, false, false, 2.427f, 4.288f)
                lineToRelative(6.0f, 3.6f)
                arcToRelative(4.986f, 4.986f, 0.0f, false, false, 1.573f, 0.6f)
                close()
            }
        }
        .build()
        return _diceD6!!
    }

private var _diceD6: ImageVector? = null
