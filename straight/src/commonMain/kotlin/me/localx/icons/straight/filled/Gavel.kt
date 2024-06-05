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

public val Icons.Filled.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.291f, 15.976f)
                lineToRelative(-2.426f, -2.426f)
                lineTo(1.437f, 23.978f)
                lineTo(0.022f, 22.563f)
                lineTo(10.45f, 12.136f)
                lineToRelative(-2.413f, -2.413f)
                lineTo(13.907f, 3.852f)
                lineToRelative(6.254f, 6.254f)
                curveToRelative(-1.541f, 1.541f, -3.989f, 3.99f, -5.87f, 5.87f)
                close()
                moveTo(22.57f, 10.526f)
                lineToRelative(-7.89f, 7.889f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(7.89f, -7.889f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(13.487f, 1.444f)
                lineTo(12.073f, 0.03f)
                lineTo(4.184f, 7.919f)
                lineToRelative(1.414f, 1.414f)
                lineTo(13.487f, 1.444f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
