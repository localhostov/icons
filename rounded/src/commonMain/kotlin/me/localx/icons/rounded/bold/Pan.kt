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

public val Icons.Bold.Pan: ImageVector
    get() {
        if (_pan != null) {
            return _pan!!
        }
        _pan = Builder(name = "Pan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 0.0f)
                arcTo(9.98f, 9.98f, 0.0f, false, false, 5.516f, 15.268f)
                lineTo(0.666f, 20.117f)
                arcToRelative(2.275f, 2.275f, 0.0f, false, false, 0.0f, 3.217f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.275f, 2.275f, 0.0f, false, false, 3.217f, 0.0f)
                lineToRelative(4.849f, -4.85f)
                arcTo(9.994f, 9.994f, 0.0f, true, false, 14.0f, 0.0f)
                close()
                moveTo(14.0f, 17.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 7.0f, -7.0f)
                arcTo(7.009f, 7.009f, 0.0f, false, true, 14.0f, 17.0f)
                close()
                moveTo(19.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -5.0f, -5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pan!!
    }

private var _pan: ImageVector? = null
