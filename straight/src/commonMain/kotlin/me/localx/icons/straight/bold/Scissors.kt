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
                moveToRelative(18.5f, 13.0f)
                arcToRelative(5.467f, 5.467f, 0.0f, false, false, -2.173f, 0.449f)
                lineToRelative(-2.374f, -2.849f)
                lineToRelative(7.2f, -8.64f)
                lineToRelative(-2.305f, -1.92f)
                lineToRelative(-6.848f, 8.217f)
                lineToRelative(-6.848f, -8.217f)
                lineToRelative(-2.3f, 1.92f)
                lineToRelative(7.2f, 8.64f)
                lineToRelative(-2.379f, 2.849f)
                arcToRelative(5.525f, 5.525f, 0.0f, true, false, 2.327f, 1.896f)
                lineToRelative(2.0f, -2.4f)
                lineToRelative(2.0f, 2.4f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 4.5f, -2.345f)
                close()
                moveTo(5.5f, 21.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                close()
                moveTo(18.5f, 21.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
