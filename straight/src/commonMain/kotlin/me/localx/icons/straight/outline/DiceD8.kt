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

public val Icons.Outline.DiceD8: ImageVector
    get() {
        if (_diceD8 != null) {
            return _diceD8!!
        }
        _diceD8 = Builder(name = "DiceD8", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.109f, 0.867f)
                arcTo(3.034f, 3.034f, 0.0f, false, false, 9.846f, 0.915f)
                lineTo(0.025f, 12.0f)
                lineTo(9.891f, 23.133f)
                arcTo(2.977f, 2.977f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(3.008f, 3.008f, 0.0f, false, false, 2.155f, -0.916f)
                lineTo(23.96f, 12.0f)
                close()
                moveTo(20.738f, 11.376f)
                lineTo(13.0f, 13.662f)
                lineTo(13.0f, 2.628f)
                close()
                moveTo(11.0f, 2.624f)
                lineTo(11.0f, 13.662f)
                lineTo(3.253f, 11.373f)
                close()
                moveTo(4.25f, 13.753f)
                lineTo(11.0f, 15.747f)
                verticalLineToRelative(5.626f)
                close()
                moveTo(13.0f, 21.375f)
                lineTo(13.0f, 15.747f)
                lineToRelative(6.736f, -1.99f)
                close()
            }
        }
        .build()
        return _diceD8!!
    }

private var _diceD8: ImageVector? = null
