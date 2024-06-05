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

public val Icons.Bold.PencilSlash: ImageVector
    get() {
        if (_pencilSlash != null) {
            return _pencilSlash!!
        }
        _pencilSlash = Builder(name = "PencilSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.991f, 15.491f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-6.388f, 6.388f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.725f)
                lineToRelative(6.491f, -6.49f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-4.103f, 4.102f)
                lineToRelative(1.482f, 1.482f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(23.998f, 21.877f)
                lineToRelative(-2.121f, 2.121f)
                lineTo(0.002f, 2.123f)
                lineTo(2.123f, 0.002f)
                lineToRelative(8.075f, 8.075f)
                lineToRelative(6.892f, -6.892f)
                curveToRelative(0.764f, -0.765f, 1.78f, -1.186f, 2.862f, -1.186f)
                reflectiveCurveToRelative(2.098f, 0.421f, 2.862f, 1.186f)
                curveToRelative(1.578f, 1.578f, 1.578f, 4.146f, 0.0f, 5.725f)
                lineToRelative(-6.892f, 6.892f)
                lineToRelative(8.075f, 8.075f)
                close()
                moveTo(12.319f, 10.198f)
                lineToRelative(1.482f, 1.482f)
                lineToRelative(3.347f, -3.347f)
                lineToRelative(-1.482f, -1.482f)
                lineToRelative(-3.347f, 3.347f)
                close()
            }
        }
        .build()
        return _pencilSlash!!
    }

private var _pencilSlash: ImageVector? = null
