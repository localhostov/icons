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

public val Icons.Filled.Heading: ImageVector
    get() {
        if (_heading != null) {
            return _heading!!
        }
        _heading = Builder(name = "Heading", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-6.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 8.5f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, -8.5f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-6.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 20.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -9.5f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 9.5f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, -20.0f)
                lineToRelative(2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _heading!!
    }

private var _heading: ImageVector? = null
