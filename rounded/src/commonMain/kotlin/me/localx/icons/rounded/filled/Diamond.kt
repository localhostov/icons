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

public val Icons.Filled.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.845f, 2.016f)
                lineToRelative(-8.783f, 11.82f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.722f, 0.029f)
                lineToRelative(-8.826f, -12.065f)
                arcToRelative(5.045f, 5.045f, 0.0f, false, true, -0.779f, -1.8f)
                horizontalLineToRelative(6.268f)
                lineToRelative(4.753f, 12.359f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.868f, 0.0f)
                lineToRelative(4.753f, -12.359f)
                close()
                moveTo(17.7f, 7.0f)
                horizontalLineToRelative(6.257f)
                arcToRelative(4.974f, 4.974f, 0.0f, false, false, -0.857f, -1.871f)
                lineToRelative(-2.558f, -3.454f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, false, -3.255f, -1.675f)
                horizontalLineToRelative(-2.2f)
                close()
                moveTo(11.108f, 0.0f)
                lineTo(8.449f, 7.0f)
                horizontalLineToRelative(7.112f)
                lineToRelative(-2.606f, -7.0f)
                close()
                moveTo(6.31f, 7.0f)
                lineTo(8.968f, 0.0f)
                horizontalLineToRelative(-2.322f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, -3.235f, 1.649f)
                lineToRelative(-2.473f, 3.242f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, false, -0.938f, 2.109f)
                close()
                moveTo(15.544f, 9.0f)
                horizontalLineToRelative(-7.088f)
                lineToRelative(3.544f, 9.214f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
