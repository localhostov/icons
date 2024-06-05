package me.localx.icons.rounded.bold

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

public val Icons.Bold.DiceD8: ImageVector
    get() {
        if (_diceD8 != null) {
            return _diceD8!!
        }
        _diceD8 = Builder(name = "DiceD8", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.72f, 8.543f)
                lineTo(15.258f, 1.476f)
                arcTo(4.347f, 4.347f, 0.0f, false, false, 12.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(4.347f, 4.347f, 0.0f, false, false, 8.752f, 1.463f)
                lineTo(2.237f, 8.585f)
                arcToRelative(5.336f, 5.336f, 0.0f, false, false, 0.047f, 6.88f)
                lineToRelative(6.475f, 7.066f)
                arcTo(4.342f, 4.342f, 0.0f, false, false, 12.018f, 24.0f)
                horizontalLineToRelative(0.007f)
                arcToRelative(4.335f, 4.335f, 0.0f, false, false, 3.242f, -1.461f)
                lineToRelative(6.5f, -7.135f)
                arcTo(5.335f, 5.335f, 0.0f, false, false, 21.72f, 8.543f)
                close()
                moveTo(19.461f, 10.517f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 0.315f, 0.491f)
                lineTo(13.5f, 12.962f)
                lineTo(13.5f, 4.0f)
                close()
                moveTo(10.5f, 4.0f)
                verticalLineToRelative(8.966f)
                lineTo(4.211f, 11.0f)
                arcTo(2.145f, 2.145f, 0.0f, false, true, 4.5f, 10.56f)
                close()
                moveTo(5.517f, 14.553f)
                lineTo(10.5f, 16.1f)
                lineTo(10.5f, 19.99f)
                close()
                moveTo(13.5f, 20.029f)
                lineTo(13.5f, 16.1f)
                lineToRelative(4.994f, -1.554f)
                close()
            }
        }
        .build()
        return _diceD8!!
    }

private var _diceD8: ImageVector? = null
