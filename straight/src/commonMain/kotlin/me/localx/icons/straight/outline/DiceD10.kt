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

public val Icons.Outline.DiceD10: ImageVector
    get() {
        if (_diceD10 != null) {
            return _diceD10!!
        }
        _diceD10 = Builder(name = "DiceD10", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.116f, 0.867f)
                arcTo(3.071f, 3.071f, 0.0f, false, false, 9.9f, 0.867f)
                lineTo(0.03f, 13.063f)
                lineTo(9.9f, 23.133f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.23f, -0.012f)
                lineTo(23.97f, 13.063f)
                close()
                moveTo(12.007f, 13.75f)
                lineTo(9.194f, 11.645f)
                lineToRelative(2.812f, -7.718f)
                lineToRelative(2.8f, 7.719f)
                close()
                moveTo(7.26f, 11.109f)
                lineTo(3.7f, 11.7f)
                lineTo(9.785f, 4.179f)
                close()
                moveTo(16.741f, 11.109f)
                lineTo(14.224f, 4.175f)
                lineTo(20.3f, 11.7f)
                close()
                moveTo(3.514f, 13.761f)
                lineToRelative(4.229f, -0.7f)
                lineTo(11.008f, 15.5f)
                verticalLineToRelative(5.907f)
                close()
                moveTo(13.008f, 21.407f)
                lineTo(13.008f, 15.5f)
                lineToRelative(3.25f, -2.442f)
                lineToRelative(4.23f, 0.705f)
                close()
            }
        }
        .build()
        return _diceD10!!
    }

private var _diceD10: ImageVector? = null
