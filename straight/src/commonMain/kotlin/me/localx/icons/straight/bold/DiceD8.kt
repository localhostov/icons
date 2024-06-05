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

public val Icons.Bold.DiceD8: ImageVector
    get() {
        if (_diceD8 != null) {
            return _diceD8!!
        }
        _diceD8 = Builder(name = "DiceD8", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4f, 0.987f)
                arcToRelative(3.489f, 3.489f, 0.0f, false, false, -4.8f, 0.0f)
                lineTo(0.012f, 12.0f)
                lineTo(9.6f, 23.013f)
                arcToRelative(3.407f, 3.407f, 0.0f, false, false, 4.8f, 0.0f)
                lineTo(23.988f, 12.0f)
                close()
                moveTo(19.275f, 11.151f)
                lineTo(13.5f, 12.856f)
                lineTo(13.5f, 4.518f)
                close()
                moveTo(10.5f, 4.518f)
                verticalLineToRelative(8.338f)
                lineToRelative(-5.773f, -1.7f)
                close()
                moveTo(6.4f, 14.774f)
                lineToRelative(4.1f, 1.211f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(13.5f, 19.482f)
                verticalLineToRelative(-3.5f)
                lineToRelative(4.1f, -1.211f)
                close()
            }
        }
        .build()
        return _diceD8!!
    }

private var _diceD8: ImageVector? = null
