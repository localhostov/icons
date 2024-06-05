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

public val Icons.Outline.DiceD6: ImageVector
    get() {
        if (_diceD6 != null) {
            return _diceD6!!
        }
        _diceD6 = Builder(name = "DiceD6", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.572f, 4.312f)
                lineToRelative(-6.0f, -3.6f)
                arcToRelative(4.987f, 4.987f, 0.0f, false, false, -5.145f, 0.0f)
                lineToRelative(-6.0f, 3.6f)
                arcTo(5.027f, 5.027f, 0.0f, false, false, 1.0f, 8.6f)
                verticalLineToRelative(6.8f)
                arcToRelative(5.027f, 5.027f, 0.0f, false, false, 2.427f, 4.288f)
                lineToRelative(6.0f, 3.6f)
                arcToRelative(4.985f, 4.985f, 0.0f, false, false, 5.145f, 0.0f)
                lineToRelative(6.0f, -3.6f)
                arcTo(5.027f, 5.027f, 0.0f, false, false, 23.0f, 15.4f)
                lineTo(23.0f, 8.6f)
                arcTo(5.027f, 5.027f, 0.0f, false, false, 20.572f, 4.312f)
                close()
                moveTo(10.457f, 2.428f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, true, 3.086f, 0.0f)
                lineToRelative(6.0f, 3.6f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, true, 0.46f, 0.341f)
                lineToRelative(-8.0f, 4.8f)
                lineToRelative(-8.0f, -4.8f)
                arcToRelative(2.931f, 2.931f, 0.0f, false, true, 0.46f, -0.341f)
                close()
                moveTo(4.457f, 17.973f)
                arcTo(3.015f, 3.015f, 0.0f, false, true, 3.0f, 15.4f)
                lineTo(3.0f, 8.6f)
                arcToRelative(2.881f, 2.881f, 0.0f, false, true, 0.039f, -0.475f)
                lineTo(11.0f, 12.9f)
                verticalLineToRelative(8.928f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, -0.543f, -0.257f)
                close()
                moveTo(21.0f, 15.4f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, true, -1.457f, 2.573f)
                lineToRelative(-6.0f, 3.6f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, -0.543f, 0.257f)
                lineTo(13.0f, 12.9f)
                lineToRelative(7.961f, -4.776f)
                arcTo(2.881f, 2.881f, 0.0f, false, true, 21.0f, 8.6f)
                close()
            }
        }
        .build()
        return _diceD6!!
    }

private var _diceD6: ImageVector? = null
