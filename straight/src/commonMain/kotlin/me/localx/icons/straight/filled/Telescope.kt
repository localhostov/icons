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

public val Icons.Filled.Telescope: ImageVector
    get() {
        if (_telescope != null) {
            return _telescope!!
        }
        _telescope = Builder(name = "Telescope", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.09f, 10.876f)
                lineToRelative(1.843f, -0.777f)
                lineTo(19.716f, 0.099f)
                lineToRelative(-1.843f, 0.777f)
                lineToRelative(0.751f, 1.781f)
                lineTo(3.163f, 9.287f)
                lineToRelative(0.969f, 2.298f)
                lineTo(-0.015f, 13.333f)
                lineToRelative(0.777f, 1.844f)
                lineToRelative(4.147f, -1.748f)
                lineToRelative(0.974f, 2.308f)
                lineToRelative(5.344f, -2.292f)
                lineToRelative(-4.635f, 10.555f)
                horizontalLineToRelative(2.185f)
                lineToRelative(4.724f, -10.756f)
                lineToRelative(4.724f, 10.756f)
                horizontalLineToRelative(2.185f)
                lineToRelative(-5.356f, -12.196f)
                lineToRelative(6.292f, -2.698f)
                lineToRelative(0.746f, 1.77f)
                close()
            }
        }
        .build()
        return _telescope!!
    }

private var _telescope: ImageVector? = null
