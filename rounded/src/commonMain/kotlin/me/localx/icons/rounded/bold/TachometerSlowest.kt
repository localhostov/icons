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

public val Icons.Bold.TachometerSlowest: ImageVector
    get() {
        if (_tachometerSlowest != null) {
            return _tachometerSlowest!!
        }
        _tachometerSlowest = Builder(name = "TachometerSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.536f, 21.429f)
                arcToRelative(3.506f, 3.506f, 0.0f, false, true, -4.752f, 0.257f)
                lineToRelative(-1.24f, -1.026f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.912f, -2.312f)
                lineTo(17.7f, 19.374f)
                arcToRelative(0.521f, 0.521f, 0.0f, false, false, 0.706f, -0.055f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -12.792f, 0.014f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, false, 0.7f, 0.059f)
                lineToRelative(1.283f, -1.04f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.889f, 2.33f)
                lineTo(8.2f, 21.722f)
                arcToRelative(3.511f, 3.511f, 0.0f, false, true, -4.718f, -0.276f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.9f, -20.365f)
                arcToRelative(11.993f, 11.993f, 0.0f, false, true, 7.155f, 20.348f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.7f, 0.944f)
                lineTo(6.569f, 13.063f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.862f, 2.874f)
                lineToRelative(3.733f, -1.12f)
                arcTo(1.994f, 1.994f, 0.0f, true, false, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _tachometerSlowest!!
    }

private var _tachometerSlowest: ImageVector? = null
