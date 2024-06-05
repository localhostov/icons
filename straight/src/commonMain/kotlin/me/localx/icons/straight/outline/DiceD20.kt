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

public val Icons.Outline.DiceD20: ImageVector
    get() {
        if (_diceD20 != null) {
            return _diceD20!!
        }
        _diceD20 = Builder(name = "DiceD20", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.543f, 0.428f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, false, -3.086f, 0.0f)
                lineTo(1.0f, 6.1f)
                lineTo(1.0f, 17.9f)
                lineToRelative(9.457f, 5.674f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, false, 3.086f, 0.0f)
                lineTo(23.0f, 17.9f)
                lineTo(23.0f, 6.1f)
                close()
                moveTo(8.805f, 11.0f)
                lineTo(15.2f, 11.0f)
                lineTo(12.0f, 16.113f)
                close()
                moveTo(12.051f, 3.151f)
                lineTo(15.3f, 9.0f)
                lineTo(8.721f, 9.0f)
                close()
                moveTo(17.233f, 8.361f)
                lineTo(14.411f, 3.281f)
                lineTo(20.056f, 6.668f)
                close()
                moveTo(6.781f, 8.37f)
                lineToRelative(-2.837f, -1.7f)
                lineTo(9.722f, 3.2f)
                close()
                moveTo(5.738f, 10.076f)
                lineTo(3.0f, 14.091f)
                lineTo(3.0f, 8.434f)
                close()
                moveTo(6.962f, 11.826f)
                lineTo(10.007f, 16.7f)
                lineToRelative(-5.989f, -0.552f)
                close()
                moveTo(17.049f, 11.808f)
                lineTo(20.076f, 16.144f)
                lineTo(14.0f, 16.683f)
                close()
                moveTo(18.27f, 10.072f)
                lineTo(21.0f, 8.434f)
                verticalLineToRelative(5.543f)
                close()
                moveTo(5.552f, 18.3f)
                lineTo(11.0f, 18.8f)
                verticalLineToRelative(2.767f)
                close()
                moveTo(13.0f, 21.566f)
                lineTo(13.0f, 18.779f)
                lineToRelative(5.449f, -0.483f)
                close()
            }
        }
        .build()
        return _diceD20!!
    }

private var _diceD20: ImageVector? = null
