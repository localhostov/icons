package me.localx.icons.rounded.outline

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
                moveTo(20.573f, 4.312f)
                lineToRelative(-6.0f, -3.6f)
                arcToRelative(4.989f, 4.989f, 0.0f, false, false, -5.146f, 0.0f)
                lineToRelative(-6.0f, 3.6f)
                arcTo(5.027f, 5.027f, 0.0f, false, false, 1.0f, 8.6f)
                verticalLineToRelative(6.8f)
                arcToRelative(5.027f, 5.027f, 0.0f, false, false, 2.427f, 4.288f)
                lineToRelative(6.0f, 3.6f)
                arcToRelative(4.987f, 4.987f, 0.0f, false, false, 5.146f, 0.0f)
                lineToRelative(6.0f, -3.6f)
                arcTo(5.027f, 5.027f, 0.0f, false, false, 23.0f, 15.4f)
                lineTo(23.0f, 8.6f)
                arcTo(5.027f, 5.027f, 0.0f, false, false, 20.573f, 4.312f)
                close()
                moveTo(3.005f, 8.437f)
                lineToRelative(2.733f, 1.639f)
                lineTo(3.0f, 14.09f)
                reflectiveCurveTo(3.0f, 8.491f, 3.005f, 8.437f)
                close()
                moveTo(12.005f, 3.059f)
                lineTo(15.3f, 9.0f)
                lineTo(8.7f, 9.0f)
                close()
                moveTo(21.005f, 13.977f)
                lineTo(18.275f, 10.072f)
                lineTo(21.0f, 8.437f)
                curveTo(21.0f, 8.491f, 21.0f, 13.977f, 21.0f, 13.977f)
                close()
                moveTo(8.805f, 11.0f)
                lineTo(15.2f, 11.0f)
                lineTo(12.0f, 16.113f)
                close()
                moveTo(4.018f, 16.147f)
                lineToRelative(2.943f, -4.322f)
                lineTo(10.007f, 16.7f)
                close()
                moveTo(17.047f, 11.813f)
                lineTo(20.074f, 16.145f)
                lineTo(14.0f, 16.683f)
                close()
                moveTo(19.547f, 6.027f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, 0.668f, 0.548f)
                lineTo(17.233f, 8.361f)
                lineToRelative(-3.1f, -5.579f)
                close()
                moveTo(4.461f, 6.027f)
                lineTo(9.868f, 2.781f)
                lineTo(6.77f, 8.363f)
                lineTo(3.789f, 6.575f)
                arcTo(2.98f, 2.98f, 0.0f, false, true, 4.457f, 6.027f)
                close()
                moveTo(4.901f, 18.237f)
                lineTo(11.0f, 18.8f)
                verticalLineToRelative(3.03f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, -0.543f, -0.257f)
                close()
                moveTo(13.547f, 21.572f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, -0.543f, 0.257f)
                verticalLineToRelative(-3.05f)
                lineToRelative(6.1f, -0.54f)
                close()
            }
        }
        .build()
        return _diceD20!!
    }

private var _diceD20: ImageVector? = null
