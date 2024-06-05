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
                moveTo(1.852f, 5.59f)
                lineTo(10.457f, 0.428f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, true, 3.086f, 0.0f)
                lineTo(22.065f, 5.54f)
                lineTo(12.0f, 11.508f)
                close()
                moveTo(11.0f, 13.242f)
                lineTo(1.0f, 7.408f)
                lineTo(1.0f, 18.093f)
                lineToRelative(9.457f, 5.674f)
                arcTo(2.982f, 2.982f, 0.0f, false, false, 11.0f, 24.0f)
                close()
                moveTo(13.0f, 13.242f)
                lineTo(13.0f, 24.0f)
                arcToRelative(3.021f, 3.021f, 0.0f, false, false, 0.544f, -0.233f)
                lineTo(23.0f, 18.093f)
                lineTo(23.0f, 7.311f)
                close()
            }
        }
        .build()
        return _diceD6!!
    }

private var _diceD6: ImageVector? = null
