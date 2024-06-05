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

public val Icons.Bold.CandyAlt: ImageVector
    get() {
        if (_candyAlt != null) {
            return _candyAlt!!
        }
        _candyAlt = Builder(name = "CandyAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 0.0f)
                arcTo(8.986f, 8.986f, 0.0f, false, false, 7.672f, 14.207f)
                lineTo(0.064f, 21.814f)
                lineToRelative(2.122f, 2.122f)
                lineToRelative(7.607f, -7.608f)
                arcTo(9.0f, 9.0f, 0.0f, true, false, 15.0f, 0.0f)
                close()
                moveTo(15.0f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.514f, -11.974f)
                curveToRelative(2.2f, 0.205f, 3.514f, 1.9f, 3.514f, 4.536f)
                arcTo(2.387f, 2.387f, 0.0f, false, true, 15.384f, 10.0f)
                arcTo(1.375f, 1.375f, 0.0f, false, true, 14.0f, 8.842f)
                curveToRelative(0.0f, -0.581f, 0.292f, -0.842f, 0.5f, -0.842f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 5.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(3.639f, 3.639f, 0.0f, false, false, 11.0f, 8.842f)
                arcTo(4.333f, 4.333f, 0.0f, false, false, 15.384f, 13.0f)
                arcTo(5.328f, 5.328f, 0.0f, false, false, 20.94f, 8.2f)
                arcTo(6.069f, 6.069f, 0.0f, false, true, 21.0f, 9.0f)
                arcTo(6.006f, 6.006f, 0.0f, false, true, 15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _candyAlt!!
    }

private var _candyAlt: ImageVector? = null
