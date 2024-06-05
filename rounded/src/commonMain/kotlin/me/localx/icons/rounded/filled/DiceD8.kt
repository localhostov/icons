package me.localx.icons.rounded.filled

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
                moveTo(1.1f, 10.759f)
                arcToRelative(4.943f, 4.943f, 0.0f, false, true, 1.0f, -1.975f)
                lineTo(9.012f, 1.2f)
                arcTo(3.985f, 3.985f, 0.0f, false, true, 11.0f, 0.0f)
                lineTo(11.0f, 13.662f)
                close()
                moveTo(13.0f, 13.659f)
                lineTo(22.888f, 10.759f)
                arcToRelative(5.068f, 5.068f, 0.0f, false, false, -1.016f, -2.0f)
                lineTo(14.994f, 1.206f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 13.0f, 0.0f)
                close()
                moveTo(11.0f, 15.744f)
                lineTo(1.0f, 12.815f)
                arcToRelative(5.079f, 5.079f, 0.0f, false, false, 1.127f, 2.433f)
                lineToRelative(6.9f, 7.538f)
                arcTo(3.994f, 3.994f, 0.0f, false, false, 11.0f, 23.987f)
                close()
                moveTo(13.0f, 15.744f)
                lineTo(13.0f, 24.0f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, false, 2.01f, -1.209f)
                lineToRelative(6.9f, -7.582f)
                arcTo(4.966f, 4.966f, 0.0f, false, false, 23.0f, 12.813f)
                close()
            }
        }
        .build()
        return _diceD8!!
    }

private var _diceD8: ImageVector? = null
