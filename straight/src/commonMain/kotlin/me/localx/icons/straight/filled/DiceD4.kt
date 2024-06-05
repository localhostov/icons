package me.localx.icons.straight.filled

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

public val Icons.Filled.DiceD4: ImageVector
    get() {
        if (_diceD4 != null) {
            return _diceD4!!
        }
        _diceD4 = Builder(name = "DiceD4", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 0.0f)
                arcToRelative(2.962f, 2.962f, 0.0f, false, true, 1.419f, 1.036f)
                lineTo(24.0f, 15.236f)
                lineTo(13.0f, 24.0f)
                close()
                moveTo(11.0f, 0.0f)
                arcTo(2.962f, 2.962f, 0.0f, false, false, 9.581f, 1.036f)
                lineTo(0.0f, 15.236f)
                lineTo(11.0f, 24.0f)
                close()
            }
        }
        .build()
        return _diceD4!!
    }

private var _diceD4: ImageVector? = null
