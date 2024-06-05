package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

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
                moveTo(14.955f, 0.0f)
                arcTo(8.986f, 8.986f, 0.0f, false, false, 7.672f, 14.207f)
                lineTo(0.439f, 21.44f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(7.232f, -7.234f)
                arcTo(8.985f, 8.985f, 0.0f, false, false, 24.0f, 9.0f)
                arcTo(9.066f, 9.066f, 0.0f, false, false, 14.955f, 0.0f)
                close()
                moveTo(15.0f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.164f, -11.993f)
                curveTo(16.846f, 3.471f, 18.0f, 5.116f, 18.0f, 7.561f)
                arcTo(2.3f, 2.3f, 0.0f, false, true, 15.5f, 10.0f)
                curveToRelative(-0.715f, 0.0f, -1.5f, -0.607f, -1.5f, -1.159f)
                curveToRelative(0.0f, -0.581f, 0.292f, -0.841f, 0.5f, -0.841f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                arcTo(3.639f, 3.639f, 0.0f, false, false, 11.0f, 8.841f)
                arcTo(4.453f, 4.453f, 0.0f, false, false, 15.5f, 13.0f)
                arcToRelative(5.256f, 5.256f, 0.0f, false, false, 5.441f, -4.8f)
                arcTo(5.962f, 5.962f, 0.0f, false, true, 15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _candyAlt!!
    }

private var _candyAlt: ImageVector? = null
