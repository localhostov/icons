package me.localx.icons.straight.outline

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

public val Icons.Outline.Melon: ImageVector
    get() {
        if (_melon != null) {
            return _melon!!
        }
        _melon = Builder(name = "Melon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.018f, 0.793f)
                lineTo(19.311f, 0.086f)
                lineTo(0.086f, 19.312f)
                lineToRelative(0.707f, 0.707f)
                arcToRelative(13.613f, 13.613f, 0.0f, false, false, 19.225f, 0.0f)
                arcToRelative(13.594f, 13.594f, 0.0f, false, false, 0.0f, -19.226f)
                close()
                moveTo(15.0f, 10.21f)
                arcToRelative(4.793f, 4.793f, 0.0f, false, true, -7.153f, 4.169f)
                lineToRelative(6.532f, -6.532f)
                arcTo(4.764f, 4.764f, 0.0f, false, true, 15.0f, 10.21f)
                close()
                moveTo(18.6f, 18.6f)
                arcToRelative(11.61f, 11.61f, 0.0f, false, true, -15.66f, 0.677f)
                lineTo(6.4f, 15.83f)
                arcTo(6.793f, 6.793f, 0.0f, false, false, 15.83f, 6.4f)
                lineToRelative(3.451f, -3.452f)
                arcTo(11.6f, 11.6f, 0.0f, false, true, 18.6f, 18.6f)
                close()
            }
        }
        .build()
        return _melon!!
    }

private var _melon: ImageVector? = null
