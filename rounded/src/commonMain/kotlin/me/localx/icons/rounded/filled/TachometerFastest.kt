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

public val Icons.Filled.TachometerFastest: ImageVector
    get() {
        if (_tachometerFastest != null) {
            return _tachometerFastest!!
        }
        _tachometerFastest = Builder(name = "TachometerFastest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.994f, 4.05f)
                curveTo(8.352f, -5.66f, -6.713f, 9.5f, 3.136f, 21.079f)
                arcTo(2.318f, 2.318f, 0.0f, false, false, 7.1f, 20.615f)
                lineToRelative(0.613f, -1.1f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.587f, 19.0f)
                lineTo(15.41f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.874f, 0.515f)
                lineToRelative(0.629f, 1.132f)
                arcToRelative(2.316f, 2.316f, 0.0f, false, false, 3.9f, 0.486f)
                arcTo(12.057f, 12.057f, 0.0f, false, false, 19.994f, 4.05f)
                close()
                moveTo(19.369f, 16.234f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.318f, 0.514f)
                lineToRelative(-4.867f, -2.136f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.8f, -1.832f)
                lineToRelative(4.867f, 2.136f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.369f, 16.234f)
                close()
            }
        }
        .build()
        return _tachometerFastest!!
    }

private var _tachometerFastest: ImageVector? = null
