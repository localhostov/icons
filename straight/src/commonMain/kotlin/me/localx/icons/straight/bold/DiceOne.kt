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

public val Icons.Bold.DiceOne: ImageVector
    get() {
        if (_diceOne != null) {
            return _diceOne!!
        }
        _diceOne = Builder(name = "DiceOne", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 24.0f, 3.5f)
                close()
                moveTo(3.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(3.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 12.0f)
                close()
            }
        }
        .build()
        return _diceOne!!
    }

private var _diceOne: ImageVector? = null
