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

public val Icons.Filled.DiceAlt: ImageVector
    get() {
        if (_diceAlt != null) {
            return _diceAlt!!
        }
        _diceAlt = Builder(name = "DiceAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                lineTo(12.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                lineTo(9.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 9.0f)
                close()
                moveTo(14.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 15.0f)
                close()
                moveTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 20.0f)
                close()
                moveTo(11.485f, 0.879f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.242f, 0.0f)
                lineTo(0.959f, 7.162f)
                arcTo(3.162f, 3.162f, 0.0f, false, false, 0.051f, 8.8f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.828f, 2.686f)
                lineTo(7.0f, 17.607f)
                lineTo(7.0f, 12.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(5.606f)
                close()
                moveTo(5.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 6.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 10.0f)
                close()
                moveTo(10.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 9.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 5.0f)
                close()
            }
        }
        .build()
        return _diceAlt!!
    }

private var _diceAlt: ImageVector? = null
