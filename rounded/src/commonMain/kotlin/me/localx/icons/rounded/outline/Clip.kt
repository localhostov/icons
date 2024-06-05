package me.localx.icons.rounded.outline

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

public val Icons.Outline.Clip: ImageVector
    get() {
        if (_clip != null) {
            return _clip!!
        }
        _clip = Builder(name = "Clip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.95f, 9.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(10.644f, 20.539f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -7.072f, -7.071f)
                lineTo(14.121f, 2.876f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.243f, 4.242f)
                lineTo(7.815f, 17.71f)
                arcToRelative(1.022f, 1.022f, 0.0f, false, true, -1.414f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(9.392f, -9.435f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, -1.414f)
                lineTo(4.987f, 14.882f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.243f)
                arcToRelative(3.073f, 3.073f, 0.0f, false, false, 4.243f, 0.0f)
                lineTo(19.778f, 8.532f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -7.071f, -7.07f)
                lineTo(2.158f, 12.054f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 9.9f, 9.9f)
                lineTo(22.95f, 11.018f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.95f, 9.6f)
                close()
            }
        }
        .build()
        return _clip!!
    }

private var _clip: ImageVector? = null
