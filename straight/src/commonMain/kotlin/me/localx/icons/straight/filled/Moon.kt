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

public val Icons.Filled.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(1.847f, 3.044f, 12.031f, -2.985f, 19.791f, 1.509f)
                lineToRelative(1.553f, 0.862f)
                lineToRelative(-1.543f, 0.88f)
                curveToRelative(-6.7f, 3.688f, -6.21f, 13.87f, 0.8f, 16.906f)
                lineToRelative(1.621f, 0.731f)
                lineToRelative(-1.467f, 1.006f)
                arcTo(11.921f, 11.921f, 0.0f, false, true, 14.0f, 24.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
