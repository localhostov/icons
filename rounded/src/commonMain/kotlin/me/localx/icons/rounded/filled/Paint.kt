package me.localx.icons.rounded.filled

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
                moveToRelative(2.748f, 24.0f)
                arcToRelative(2.755f, 2.755f, 0.0f, false, true, -2.719f, -3.151f)
                curveToRelative(0.259f, -1.806f, 1.133f, -5.134f, 2.373f, -6.374f)
                arcToRelative(5.037f, 5.037f, 0.0f, false, true, 7.123f, 7.125f)
                curveToRelative(-1.239f, 1.239f, -4.567f, 2.113f, -6.374f, 2.372f)
                arcToRelative(2.741f, 2.741f, 0.0f, false, true, -0.403f, 0.028f)
                close()
                moveTo(23.1f, 0.9f)
                arcToRelative(3.139f, 3.139f, 0.0f, false, false, -4.33f, 0.0f)
                lineToRelative(-10.5f, 10.5f)
                arcToRelative(6.976f, 6.976f, 0.0f, false, true, 4.33f, 4.338f)
                lineToRelative(10.5f, -10.508f)
                arcToRelative(3.068f, 3.068f, 0.0f, false, false, 0.0f, -4.33f)
                close()
            }
        }
        .build()
        return _paint!!
    }

private var _paint: ImageVector? = null
