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

public val Icons.Filled.DiceD20: ImageVector
    get() {
        if (_diceD20 != null) {
            return _diceD20!!
        }
        _diceD20 = Builder(name = "DiceD20", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2f, 11.0f)
                lineTo(12.0f, 16.113f)
                lineTo(8.805f, 11.0f)
                close()
                moveTo(15.3f, 9.0f)
                lineTo(12.0f, 2.974f)
                lineTo(8.694f, 9.0f)
                close()
                moveTo(6.944f, 11.8f)
                lineTo(3.83f, 16.158f)
                lineToRelative(6.182f, 0.548f)
                close()
                moveTo(18.281f, 10.075f)
                lineTo(23.0f, 16.68f)
                lineTo(23.0f, 7.27f)
                close()
                moveTo(5.717f, 10.075f)
                lineTo(1.0f, 7.291f)
                lineTo(1.0f, 16.68f)
                close()
                moveTo(17.237f, 8.366f)
                lineTo(22.03f, 5.52f)
                lineTo(13.543f, 0.342f)
                arcTo(2.958f, 2.958f, 0.0f, false, false, 12.636f, 0.0f)
                close()
                moveTo(13.0f, 18.782f)
                lineTo(13.0f, 24.0f)
                arcToRelative(2.914f, 2.914f, 0.0f, false, false, 0.543f, -0.233f)
                lineToRelative(9.42f, -5.846f)
                close()
                moveTo(11.0f, 18.8f)
                lineToRelative(-9.967f, -0.883f)
                lineToRelative(9.424f, 5.849f)
                arcTo(2.914f, 2.914f, 0.0f, false, false, 11.0f, 24.0f)
                close()
                moveTo(17.059f, 11.793f)
                lineTo(14.0f, 16.688f)
                lineToRelative(6.167f, -0.534f)
                close()
                moveTo(6.761f, 8.37f)
                lineTo(11.364f, 0.0f)
                arcToRelative(2.958f, 2.958f, 0.0f, false, false, -0.907f, 0.342f)
                lineTo(1.953f, 5.53f)
                close()
            }
        }
        .build()
        return _diceD20!!
    }

private var _diceD20: ImageVector? = null
