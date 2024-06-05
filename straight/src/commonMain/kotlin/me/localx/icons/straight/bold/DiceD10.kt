package me.localx.icons.straight.bold

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

public val Icons.Bold.DiceD10: ImageVector
    get() {
        if (_diceD10 != null) {
            return _diceD10!!
        }
        _diceD10 = Builder(name = "DiceD10", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4f, 0.985f)
                arcToRelative(3.49f, 3.49f, 0.0f, false, false, -4.794f, 0.0f)
                lineTo(0.009f, 13.1f)
                lineToRelative(9.6f, 9.915f)
                arcToRelative(3.409f, 3.409f, 0.0f, false, false, 4.818f, -0.024f)
                lineTo(23.99f, 13.1f)
                close()
                moveTo(18.243f, 10.669f)
                lineTo(14.472f, 9.261f)
                lineToRelative(-1.79f, -5.635f)
                close()
                moveTo(11.323f, 3.633f)
                lineTo(9.533f, 9.26f)
                lineTo(5.759f, 10.667f)
                close()
                moveTo(5.149f, 14.1f)
                lineToRelative(3.639f, -1.357f)
                lineToRelative(1.712f, 1.42f)
                verticalLineToRelative(5.463f)
                close()
                moveTo(13.5f, 19.635f)
                lineTo(13.5f, 14.166f)
                lineToRelative(1.713f, -1.427f)
                lineToRelative(3.64f, 1.358f)
                close()
            }
        }
        .build()
        return _diceD10!!
    }

private var _diceD10: ImageVector? = null
