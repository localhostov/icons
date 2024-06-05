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

public val Icons.Filled.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(name = "Football", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.363f, 4.88f)
                lineToRelative(1.352f, 4.375f)
                lineToRelative(-3.708f, 2.613f)
                arcToRelative(11.915f, 11.915f, 0.0f, false, true, 2.356f, -6.988f)
                close()
                moveTo(6.873f, 19.0f)
                lineTo(2.262f, 18.989f)
                arcToRelative(12.027f, 12.027f, 0.0f, false, false, 6.024f, 4.416f)
                close()
                moveTo(12.0f, 3.252f)
                lineTo(15.676f, 0.581f)
                arcToRelative(11.92f, 11.92f, 0.0f, false, false, -7.352f, 0.0f)
                close()
                moveTo(21.628f, 4.868f)
                lineTo(20.272f, 9.255f)
                lineTo(23.994f, 11.877f)
                arcToRelative(11.923f, 11.923f, 0.0f, false, false, -2.366f, -7.009f)
                close()
                moveTo(17.115f, 19.0f)
                lineTo(15.7f, 23.41f)
                arcToRelative(12.034f, 12.034f, 0.0f, false, false, 6.039f, -4.425f)
                close()
                moveTo(13.441f, 23.909f)
                arcToRelative(12.038f, 12.038f, 0.0f, false, true, -1.441f, 0.091f)
                arcToRelative(12.034f, 12.034f, 0.0f, false, true, -1.454f, -0.1f)
                lineToRelative(-2.213f, -6.9f)
                lineToRelative(-7.233f, -0.018f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, true, -0.89f, -2.808f)
                lineToRelative(5.848f, -4.121f)
                lineToRelative(-2.133f, -6.9f)
                arcToRelative(12.025f, 12.025f, 0.0f, false, true, 2.269f, -1.647f)
                lineToRelative(5.806f, 4.218f)
                lineToRelative(5.806f, -4.218f)
                arcToRelative(12.032f, 12.032f, 0.0f, false, true, 2.262f, 1.637f)
                lineToRelative(-2.135f, 6.91f)
                lineToRelative(5.859f, 4.129f)
                arcToRelative(11.923f, 11.923f, 0.0f, false, true, -0.889f, 2.8f)
                lineToRelative(-7.248f, 0.018f)
                close()
                moveTo(8.349f, 17.0f)
                horizontalLineToRelative(7.3f)
                lineToRelative(2.256f, -6.944f)
                lineToRelative(-5.905f, -4.292f)
                lineToRelative(-5.907f, 4.292f)
                close()
                moveTo(8.449f, 10.819f)
                lineTo(9.8f, 15.0f)
                horizontalLineToRelative(4.4f)
                lineToRelative(1.358f, -4.181f)
                lineToRelative(-3.558f, -2.583f)
                close()
            }
        }
        .build()
        return _football!!
    }

private var _football: ImageVector? = null
