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

public val Icons.Filled.DiceTwo: ImageVector
    get() {
        if (_diceTwo != null) {
            return _diceTwo!!
        }
        _diceTwo = Builder(name = "DiceTwo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(7.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 8.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 8.0f)
                close()
                moveTo(17.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 18.0f)
                close()
            }
        }
        .build()
        return _diceTwo!!
    }

private var _diceTwo: ImageVector? = null
