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

public val Icons.Outline.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 24.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 4.442f, -9.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -4.442f, -9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                arcToRelative(12.221f, 12.221f, 0.0f, false, true, -4.425f, 9.0f)
                arcToRelative(12.221f, 12.221f, 0.0f, false, true, 4.425f, 9.0f)
                close()
                moveTo(5.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -3.774f, -2.5f, -6.552f, -4.592f, -8.217f)
                lineToRelative(-0.984f, -0.783f)
                lineToRelative(0.984f, -0.783f)
                curveToRelative(2.092f, -1.665f, 4.592f, -4.443f, 4.592f, -8.217f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                curveToRelative(0.0f, 3.773f, 2.508f, 6.551f, 4.611f, 8.216f)
                lineToRelative(0.989f, 0.784f)
                lineToRelative(-0.992f, 0.784f)
                curveToRelative(-2.1f, 1.665f, -4.608f, 4.443f, -4.608f, 8.216f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
