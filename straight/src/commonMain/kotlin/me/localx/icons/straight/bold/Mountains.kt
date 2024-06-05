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

public val Icons.Bold.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.0f, 8.0f)
                close()
                moveTo(24.0f, 24.0f)
                lineTo(10.0f, 24.0f)
                lineTo(10.0f, 21.656f)
                lineTo(14.336f, 12.7f)
                arcToRelative(2.965f, 2.965f, 0.0f, false, true, 5.341f, 0.026f)
                lineTo(24.0f, 21.656f)
                close()
                moveTo(13.638f, 21.0f)
                lineTo(20.35f, 21.0f)
                lineToRelative(-3.385f, -6.99f)
                close()
                moveTo(13.238f, 7.019f)
                arcToRelative(3.488f, 3.488f, 0.0f, false, false, -6.3f, 0.0f)
                lineTo(0.0f, 22.172f)
                lineTo(0.0f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 21.0f)
                lineTo(3.81f, 21.0f)
                lineTo(9.665f, 8.272f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, 0.849f, 0.0f)
                lineToRelative(1.829f, 3.976f)
                lineToRelative(0.163f, -0.354f)
                arcToRelative(4.921f, 4.921f, 0.0f, false, true, 1.971f, -2.188f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
