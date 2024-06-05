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

public val Icons.Filled.Paint: ImageVector
    get() {
        if (_paint != null) {
            return _paint!!
        }
        _paint = Builder(name = "Paint", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.024f, 23.976f)
                lineToRelative(0.076f, -1.05f)
                curveToRelative(0.076f, -1.1f, 0.545f, -6.688f, 2.307f, -8.451f)
                arcToRelative(5.036f, 5.036f, 0.0f, false, true, 7.118f, 7.125f)
                curveToRelative(-1.762f, 1.762f, -7.349f, 2.23f, -8.452f, 2.306f)
                close()
                moveTo(23.1f, 0.868f)
                arcToRelative(3.137f, 3.137f, 0.0f, false, false, -4.333f, 0.0f)
                lineToRelative(-10.515f, 10.519f)
                arcToRelative(6.967f, 6.967f, 0.0f, false, true, 4.342f, 4.324f)
                lineToRelative(10.506f, -10.511f)
                arcToRelative(3.067f, 3.067f, 0.0f, false, false, 0.0f, -4.332f)
                close()
            }
        }
        .build()
        return _paint!!
    }

private var _paint: ImageVector? = null
