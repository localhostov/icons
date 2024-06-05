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

public val Icons.Bold.Kaaba: ImageVector
    get() {
        if (_kaaba != null) {
            return _kaaba!!
        }
        _kaaba = Builder(name = "Kaaba", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.133f)
                lineTo(1.0f, 5.963f)
                verticalLineToRelative(12.073f)
                lineToRelative(11.0f, 5.83f)
                lineToRelative(11.0f, -5.83f)
                lineTo(23.0f, 5.963f)
                lineTo(12.0f, 0.133f)
                close()
                moveTo(18.297f, 6.866f)
                lineToRelative(-6.297f, 3.337f)
                lineToRelative(-6.297f, -3.337f)
                lineToRelative(6.297f, -3.338f)
                lineToRelative(6.297f, 3.338f)
                close()
                moveTo(12.0f, 20.471f)
                lineToRelative(-8.0f, -4.24f)
                verticalLineToRelative(-2.815f)
                lineToRelative(3.0f, 1.601f)
                verticalLineToRelative(-2.264f)
                lineToRelative(-3.0f, -1.603f)
                verticalLineToRelative(-1.791f)
                lineToRelative(8.0f, 4.24f)
                lineToRelative(8.0f, -4.24f)
                verticalLineToRelative(1.819f)
                lineToRelative(-3.0f, 1.576f)
                verticalLineToRelative(2.264f)
                lineToRelative(3.0f, -1.577f)
                verticalLineToRelative(2.791f)
                lineToRelative(-8.0f, 4.24f)
                close()
                moveTo(12.0f, 15.403f)
                lineToRelative(3.0f, -1.59f)
                verticalLineToRelative(2.264f)
                lineToRelative(-3.0f, 1.59f)
                lineToRelative(-3.0f, -1.59f)
                verticalLineToRelative(-2.264f)
                lineToRelative(3.0f, 1.59f)
                close()
            }
        }
        .build()
        return _kaaba!!
    }

private var _kaaba: ImageVector? = null
