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

public val Icons.Filled.Tachometer: ImageVector
    get() {
        if (_tachometer != null) {
            return _tachometer!!
        }
        _tachometer = Builder(name = "Tachometer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9f, 11.437f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 4.0f, 4.052f)
                arcToRelative(12.055f, 12.055f, 0.0f, false, false, -0.246f, 17.66f)
                arcTo(4.847f, 4.847f, 0.0f, false, false, 7.114f, 23.0f)
                lineTo(16.88f, 23.0f)
                arcToRelative(4.988f, 4.988f, 0.0f, false, false, 3.508f, -1.429f)
                arcTo(11.942f, 11.942f, 0.0f, false, false, 23.9f, 11.437f)
                close()
                moveTo(17.706f, 8.707f)
                lineTo(13.925f, 12.488f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -1.414f, -1.414f)
                lineToRelative(3.781f, -3.781f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.707f, 8.707f)
                close()
            }
        }
        .build()
        return _tachometer!!
    }

private var _tachometer: ImageVector? = null
