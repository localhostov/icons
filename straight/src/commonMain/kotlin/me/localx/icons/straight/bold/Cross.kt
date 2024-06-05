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

public val Icons.Bold.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.061f, 2.061f)
                lineToRelative(-2.122f, -2.122f)
                lineToRelative(-9.939f, 9.94f)
                lineToRelative(-9.939f, -9.94f)
                lineToRelative(-2.122f, 2.122f)
                lineToRelative(9.94f, 9.939f)
                lineToRelative(-9.94f, 9.939f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(9.939f, -9.94f)
                lineToRelative(9.939f, 9.94f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(-9.94f, -9.939f)
                lineToRelative(9.94f, -9.939f)
                close()
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
