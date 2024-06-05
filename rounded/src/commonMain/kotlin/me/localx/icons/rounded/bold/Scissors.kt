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

public val Icons.Bold.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 14.0f)
                arcToRelative(4.963f, 4.963f, 0.0f, false, false, -1.895f, 0.378f)
                lineToRelative(-3.158f, -3.815f)
                lineToRelative(6.708f, -8.106f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.31f, -1.914f)
                lineToRelative(-6.345f, 7.667f)
                lineToRelative(-6.344f, -7.667f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.312f, 1.914f)
                lineToRelative(6.709f, 8.105f)
                lineToRelative(-3.153f, 3.816f)
                arcToRelative(5.039f, 5.039f, 0.0f, true, false, 2.3f, 1.922f)
                lineToRelative(2.8f, -3.385f)
                lineToRelative(2.8f, 3.385f)
                arcToRelative(4.992f, 4.992f, 0.0f, true, false, 4.2f, -2.3f)
                close()
                moveTo(5.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                close()
                moveTo(19.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
