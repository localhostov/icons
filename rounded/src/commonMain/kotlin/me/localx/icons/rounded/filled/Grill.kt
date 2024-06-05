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

public val Icons.Filled.Grill: ImageVector
    get() {
        if (_grill != null) {
            return _grill!!
        }
        _grill = Builder(name = "Grill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.921f, 9.69f)
                arcToRelative(11.968f, 11.968f, 0.0f, false, true, -5.755f, 7.649f)
                lineToRelative(1.781f, 5.345f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.9f, 0.632f)
                lineTo(16.345f, 18.2f)
                arcTo(12.322f, 12.322f, 0.0f, false, true, 13.0f, 18.957f)
                lineTo(13.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(11.0f, 18.957f)
                arcTo(12.329f, 12.329f, 0.0f, false, true, 7.654f, 18.2f)
                lineToRelative(-1.7f, 5.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.9f, -0.632f)
                lineToRelative(1.781f, -5.343f)
                curveTo(2.366f, 15.8f, -3.653f, 7.037f, 3.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                arcTo(3.026f, 3.026f, 0.0f, false, true, 23.921f, 9.69f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(13.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                lineTo(11.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
                moveTo(16.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(17.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                lineTo(15.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 4.0f)
                close()
                moveTo(8.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 3.0f)
                lineTo(9.0f, 1.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 7.0f, 1.0f)
                lineTo(7.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _grill!!
    }

private var _grill: ImageVector? = null
