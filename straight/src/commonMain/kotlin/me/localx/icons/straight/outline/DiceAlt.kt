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

public val Icons.Outline.DiceAlt: ImageVector
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
                moveTo(22.0f, 22.0f)
                lineTo(11.0f, 22.0f)
                lineTo(11.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(15.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 14.0f)
                close()
                moveTo(20.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 19.0f)
                close()
                moveTo(8.657f, 6.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.657f, 6.707f)
                close()
                moveTo(6.707f, 8.657f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.707f, 8.657f)
                close()
                moveTo(2.293f, 10.071f)
                lineTo(7.0f, 14.779f)
                verticalLineToRelative(2.828f)
                lineTo(0.879f, 11.485f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -4.243f)
                lineTo(7.243f, 0.879f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.242f, 0.0f)
                lineTo(17.606f, 7.0f)
                lineTo(14.778f, 7.0f)
                lineTo(10.071f, 2.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(2.293f, 8.657f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _diceAlt!!
    }

private var _diceAlt: ImageVector? = null
