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
                moveTo(19.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 14.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 19.0f, 9.0f)
                close()
                moveTo(14.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 15.0f)
                close()
                moveTo(19.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 20.0f)
                close()
                moveTo(15.6f, 5.0f)
                lineTo(12.069f, 1.462f)
                arcTo(5.006f, 5.006f, 0.0f, false, false, 5.0f, 1.462f)
                lineTo(1.462f, 5.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 0.0f, 7.071f)
                lineTo(5.0f, 15.6f)
                arcToRelative(4.961f, 4.961f, 0.0f, false, false, 2.0f, 1.223f)
                lineTo(7.0f, 14.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, true, 7.0f, -7.0f)
                horizontalLineToRelative(2.827f)
                arcTo(4.961f, 4.961f, 0.0f, false, false, 15.6f, 5.0f)
                close()
                moveTo(5.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 6.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 10.0f)
                close()
                moveTo(9.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 6.0f)
                close()
            }
        }
        .build()
        return _diceAlt!!
    }

private var _diceAlt: ImageVector? = null
