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

public val Icons.Bold.Tie: ImageVector
    get() {
        if (_tie != null) {
            return _tie!!
        }
        _tie = Builder(name = "Tie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.506f, 6.275f)
                lineToRelative(2.067f, -6.275f)
                lineTo(6.427f, 0.0f)
                lineToRelative(2.067f, 6.275f)
                lineToRelative(-3.726f, 11.177f)
                lineToRelative(7.232f, 6.575f)
                lineToRelative(7.232f, -6.575f)
                lineToRelative(-3.726f, -11.177f)
                close()
                moveTo(13.427f, 3.0f)
                lineToRelative(-0.659f, 2.0f)
                horizontalLineToRelative(-1.536f)
                lineToRelative(-0.659f, -2.0f)
                horizontalLineToRelative(2.854f)
                close()
                moveTo(8.232f, 16.547f)
                lineToRelative(2.849f, -8.547f)
                horizontalLineToRelative(1.838f)
                lineToRelative(2.849f, 8.547f)
                lineToRelative(-3.768f, 3.425f)
                lineToRelative(-3.768f, -3.425f)
                close()
            }
        }
        .build()
        return _tie!!
    }

private var _tie: ImageVector? = null
