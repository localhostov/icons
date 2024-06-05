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

public val Icons.Filled.DiceD8: ImageVector
    get() {
        if (_diceD8 != null) {
            return _diceD8!!
        }
        _diceD8 = Builder(name = "DiceD8", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5f, 10.576f)
                lineTo(9.846f, 0.724f)
                arcTo(3.045f, 3.045f, 0.0f, false, true, 11.0f, 0.007f)
                lineTo(11.0f, 13.662f)
                close()
                moveTo(13.0f, 13.662f)
                lineToRelative(10.5f, -3.088f)
                lineTo(14.155f, 0.725f)
                lineTo(14.109f, 0.676f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 13.0f, 0.0f)
                close()
                moveTo(13.0f, 15.747f)
                lineTo(13.0f, 24.0f)
                arcToRelative(3.113f, 3.113f, 0.0f, false, false, 1.155f, -0.731f)
                lineTo(24.0f, 12.513f)
                close()
                moveTo(11.0f, 15.747f)
                lineTo(0.0f, 12.513f)
                lineToRelative(9.891f, 10.8f)
                arcTo(2.953f, 2.953f, 0.0f, false, false, 11.0f, 24.0f)
                close()
            }
        }
        .build()
        return _diceD8!!
    }

private var _diceD8: ImageVector? = null
