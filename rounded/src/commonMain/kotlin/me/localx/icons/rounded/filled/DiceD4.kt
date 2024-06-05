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
                moveTo(11.0f, 24.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -1.627f, -0.637f)
                lineTo(1.707f, 18.521f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, -5.541f)
                lineTo(8.845f, 1.406f)
                arcTo(4.045f, 4.045f, 0.0f, false, true, 11.0f, 0.0f)
                close()
                moveTo(23.287f, 12.967f)
                lineTo(15.155f, 1.406f)
                lineTo(15.12f, 1.36f)
                arcTo(3.977f, 3.977f, 0.0f, false, false, 13.0f, 0.0f)
                verticalLineTo(24.0f)
                arcToRelative(5.011f, 5.011f, 0.0f, false, false, 1.627f, -0.637f)
                lineToRelative(7.73f, -4.885f)
                arcTo(3.984f, 3.984f, 0.0f, false, false, 23.287f, 12.967f)
                close()
            }
        }
        .build()
        return _diceD4!!
    }

private var _diceD4: ImageVector? = null
