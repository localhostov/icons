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

public val Icons.Outline.Sort: ImageVector
    get() {
        if (_sort != null) {
            return _sort!!
        }
        _sort = Builder(name = "Sort", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.243f, 10.021f)
                lineTo(1.757f, 10.021f)
                lineToRelative(8.4f, -9.183f)
                arcToRelative(2.572f, 2.572f, 0.0f, false, true, 3.69f, 0.007f)
                close()
                moveTo(6.3f, 8.021f)
                lineTo(17.7f, 8.021f)
                lineTo(12.365f, 2.188f)
                arcTo(0.481f, 0.481f, 0.0f, false, false, 12.0f, 2.021f)
                arcToRelative(0.476f, 0.476f, 0.0f, false, false, -0.359f, 0.16f)
                close()
                moveTo(12.0f, 24.011f)
                arcToRelative(2.488f, 2.488f, 0.0f, false, true, -1.849f, -0.826f)
                lineTo(1.757f, 14.011f)
                lineTo(22.243f, 14.011f)
                lineToRelative(-8.4f, 9.181f)
                arcTo(2.476f, 2.476f, 0.0f, false, true, 12.0f, 24.011f)
                close()
                moveTo(6.3f, 16.011f)
                lineTo(11.636f, 21.843f)
                arcToRelative(0.491f, 0.491f, 0.0f, false, false, 0.366f, 0.168f)
                arcToRelative(0.481f, 0.481f, 0.0f, false, false, 0.358f, -0.16f)
                lineToRelative(5.344f, -5.84f)
                close()
            }
        }
        .build()
        return _sort!!
    }

private var _sort: ImageVector? = null
