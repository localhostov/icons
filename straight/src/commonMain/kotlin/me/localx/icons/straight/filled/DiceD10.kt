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

public val Icons.Filled.DiceD10: ImageVector
    get() {
        if (_diceD10 != null) {
            return _diceD10!!
        }
        _diceD10 = Builder(name = "DiceD10", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.807f, 11.645f)
                lineToRelative(-2.8f, 2.105f)
                lineTo(9.194f, 11.645f)
                lineToRelative(2.889f, -7.8f)
                close()
                moveTo(16.742f, 11.114f)
                lineTo(24.0f, 12.308f)
                lineTo(14.238f, 0.845f)
                lineTo(14.163f, 0.762f)
                arcTo(2.877f, 2.877f, 0.0f, false, false, 12.825f, 0.03f)
                close()
                moveTo(11.008f, 15.5f)
                lineTo(7.75f, 13.062f)
                lineTo(0.625f, 14.42f)
                lineToRelative(9.243f, 8.9f)
                arcToRelative(2.96f, 2.96f, 0.0f, false, false, 1.14f, 0.695f)
                close()
                moveTo(16.255f, 13.059f)
                lineTo(13.008f, 15.5f)
                lineTo(13.008f, 24.0f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, false, 1.09f, -0.688f)
                lineToRelative(9.393f, -9.063f)
                close()
                moveTo(7.255f, 11.118f)
                lineTo(11.353f, 0.011f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 9.945f, 0.762f)
                lineTo(0.0f, 12.5f)
                close()
            }
        }
        .build()
        return _diceD10!!
    }

private var _diceD10: ImageVector? = null
