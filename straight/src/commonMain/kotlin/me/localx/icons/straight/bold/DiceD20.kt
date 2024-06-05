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

public val Icons.Bold.DiceD20: ImageVector
    get() {
        if (_diceD20 != null) {
            return _diceD20!!
        }
        _diceD20 = Builder(name = "DiceD20", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.757f, 0.486f)
                arcTo(3.377f, 3.377f, 0.0f, false, false, 10.293f, 0.461f)
                lineTo(1.0f, 5.617f)
                lineTo(1.0f, 18.383f)
                lineToRelative(9.248f, 5.131f)
                arcToRelative(3.434f, 3.434f, 0.0f, false, false, 1.767f, 0.49f)
                arcToRelative(3.285f, 3.285f, 0.0f, false, false, 1.7f, -0.465f)
                lineTo(23.0f, 18.383f)
                lineTo(23.0f, 5.617f)
                close()
                moveTo(16.813f, 11.264f)
                lineTo(20.0f, 9.49f)
                verticalLineToRelative(6.732f)
                close()
                moveTo(18.806f, 6.72f)
                lineTo(15.294f, 8.676f)
                lineToRelative(-2.96f, -5.549f)
                close()
                moveTo(11.664f, 3.13f)
                lineTo(8.706f, 8.676f)
                lineTo(5.194f, 6.72f)
                close()
                moveTo(7.187f, 11.264f)
                lineTo(4.0f, 16.222f)
                lineTo(4.0f, 9.49f)
                close()
                moveTo(4.69f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(8.0f, 10.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(-4.0f, 7.0f)
                lineTo(10.5f, 17.0f)
                lineToRelative(0.0f, 3.224f)
                close()
                moveTo(13.5f, 20.225f)
                lineTo(13.5f, 17.0f)
                horizontalLineToRelative(5.811f)
                close()
            }
        }
        .build()
        return _diceD20!!
    }

private var _diceD20: ImageVector? = null
