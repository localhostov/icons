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

public val Icons.Filled.Shovel: ImageVector
    get() {
        if (_shovel != null) {
            return _shovel!!
        }
        _shovel = Builder(name = "Shovel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.207f, 18.207f)
                lineToRelative(4.179f, -4.179f)
                lineToRelative(3.46f, 3.46f)
                lineToRelative(-4.308f, 4.307f)
                curveToRelative(-1.421f, 1.421f, -3.311f, 2.204f, -5.321f, 2.204f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-5.218f)
                curveToRelative(0.0f, -2.01f, 0.783f, -3.899f, 2.204f, -5.321f)
                lineToRelative(4.307f, -4.308f)
                lineToRelative(3.46f, 3.46f)
                lineToRelative(-4.179f, 4.179f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(18.09f, 0.01f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.243f, 2.243f)
                lineToRelative(-8.948f, 8.948f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(8.948f, -8.948f)
                lineToRelative(2.243f, 2.243f)
                lineToRelative(1.414f, -1.414f)
                lineTo(18.09f, 0.01f)
                close()
            }
        }
        .build()
        return _shovel!!
    }

private var _shovel: ImageVector? = null
