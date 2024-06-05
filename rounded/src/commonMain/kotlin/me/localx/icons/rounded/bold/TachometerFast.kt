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

public val Icons.Bold.TachometerFast: ImageVector
    get() {
        if (_tachometerFast != null) {
            return _tachometerFast!!
        }
        _tachometerFast = Builder(name = "TachometerFast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.962f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 20.518f, 21.4f)
                arcToRelative(3.512f, 3.512f, 0.0f, false, true, -4.718f, 0.276f)
                lineToRelative(-1.282f, -1.04f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.888f, -2.33f)
                lineToRelative(1.283f, 1.04f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, false, 0.7f, -0.059f)
                arcTo(9.04f, 9.04f, 0.0f, false, false, 18.0f, 6.25f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 5.6f, 19.277f)
                arcToRelative(0.519f, 0.519f, 0.0f, false, false, 0.7f, 0.056f)
                lineToRelative(1.242f, -1.027f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.912f, 2.312f)
                lineTo(8.215f, 21.645f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, true, -4.751f, -0.258f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 12.962f)
                close()
                moveTo(16.561f, 10.562f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineTo(11.875f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, false, 14.0f, 13.125f)
                close()
            }
        }
        .build()
        return _tachometerFast!!
    }

private var _tachometerFast: ImageVector? = null
