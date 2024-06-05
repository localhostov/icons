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

public val Icons.Bold.DiceD6: ImageVector
    get() {
        if (_diceD6 != null) {
            return _diceD6!!
        }
        _diceD6 = Builder(name = "DiceD6", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.753f, 0.488f)
                arcToRelative(3.387f, 3.387f, 0.0f, false, false, -3.505f, 0.0f)
                lineTo(1.0f, 6.062f)
                lineTo(1.0f, 17.938f)
                lineToRelative(9.247f, 5.574f)
                arcToRelative(3.385f, 3.385f, 0.0f, false, false, 3.505f, 0.0f)
                lineTo(23.0f, 17.938f)
                lineTo(23.0f, 6.062f)
                close()
                moveTo(11.8f, 3.057f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, true, 0.4f, 0.0f)
                lineTo(18.6f, 6.91f)
                lineTo(12.0f, 10.886f)
                lineTo(5.405f, 6.911f)
                close()
                moveTo(4.0f, 16.242f)
                lineTo(4.0f, 9.566f)
                lineToRelative(6.5f, 3.919f)
                verticalLineToRelative(6.676f)
                close()
                moveTo(13.5f, 20.161f)
                lineTo(13.5f, 13.485f)
                lineTo(20.0f, 9.566f)
                verticalLineToRelative(6.676f)
                close()
            }
        }
        .build()
        return _diceD6!!
    }

private var _diceD6: ImageVector? = null
