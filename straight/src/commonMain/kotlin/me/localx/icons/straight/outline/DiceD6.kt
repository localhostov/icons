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
                moveTo(13.543f, 0.428f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, false, -3.086f, 0.0f)
                lineTo(1.0f, 6.1f)
                lineTo(1.0f, 17.9f)
                lineToRelative(9.457f, 5.674f)
                arcToRelative(2.991f, 2.991f, 0.0f, false, false, 3.087f, 0.0f)
                lineTo(23.0f, 17.9f)
                lineTo(23.0f, 6.1f)
                close()
                moveTo(11.485f, 2.143f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.03f, 0.0f)
                lineToRelative(7.541f, 4.525f)
                lineTo(12.0f, 11.5f)
                lineTo(3.944f, 6.668f)
                close()
                moveTo(3.0f, 16.766f)
                lineTo(3.0f, 8.434f)
                lineToRelative(8.0f, 4.8f)
                verticalLineToRelative(8.332f)
                close()
                moveTo(13.0f, 21.566f)
                lineTo(13.0f, 13.234f)
                lineToRelative(8.0f, -4.8f)
                verticalLineToRelative(8.332f)
                close()
            }
        }
        .build()
        return _diceD6!!
    }

private var _diceD6: ImageVector? = null
