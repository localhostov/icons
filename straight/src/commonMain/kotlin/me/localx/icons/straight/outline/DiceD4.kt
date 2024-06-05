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
                moveTo(14.419f, 1.226f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.838f, 0.0f)
                lineTo(0.0f, 15.236f)
                lineToRelative(12.0f, 8.751f)
                lineToRelative(12.0f, -8.751f)
                close()
                moveTo(21.252f, 14.764f)
                lineTo(13.0f, 20.783f)
                lineTo(13.0f, 2.693f)
                close()
                moveTo(11.0f, 2.692f)
                lineTo(11.0f, 20.783f)
                lineTo(2.748f, 14.764f)
                close()
            }
        }
        .build()
        return _diceD4!!
    }

private var _diceD4: ImageVector? = null
