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

public val Icons.Filled.TachometerSlow: ImageVector
    get() {
        if (_tachometerSlow != null) {
            return _tachometerSlow!!
        }
        _tachometerSlow = Builder(name = "TachometerSlow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.047f, 4.076f)
                curveTo(8.4f, -5.635f, -6.66f, 9.523f, 3.189f, 21.105f)
                arcToRelative(2.318f, 2.318f, 0.0f, false, false, 3.964f, -0.465f)
                lineToRelative(0.613f, -1.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.874f, -0.514f)
                horizontalLineToRelative(6.823f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.874f, 0.514f)
                lineToRelative(0.629f, 1.133f)
                arcToRelative(2.316f, 2.316f, 0.0f, false, false, 3.9f, 0.486f)
                arcTo(12.057f, 12.057f, 0.0f, false, false, 20.047f, 4.076f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(2.008f, 2.008f, 0.0f, false, true, -1.932f, -2.518f)
                lineTo(6.293f, 8.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.707f, 7.293f)
                lineToRelative(3.775f, 3.775f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _tachometerSlow!!
    }

private var _tachometerSlow: ImageVector? = null
