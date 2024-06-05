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

public val Icons.Bold.ExpandArrowsAlt: ImageVector
    get() {
        if (_expandArrowsAlt != null) {
            return _expandArrowsAlt!!
        }
        _expandArrowsAlt = Builder(name = "ExpandArrowsAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.329f, 16.586f)
                lineTo(20.518f, 18.4f)
                lineToRelative(-6.4f, -6.4f)
                lineToRelative(6.4f, -6.4f)
                lineToRelative(1.811f, 1.811f)
                arcTo(0.979f, 0.979f, 0.0f, false, false, 24.0f, 6.728f)
                lineToRelative(0.037f, -5.635f)
                arcTo(1.086f, 1.086f, 0.0f, false, false, 22.944f, 0.0f)
                lineTo(17.308f, 0.037f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, false, -0.685f, 1.67f)
                lineTo(18.4f, 3.482f)
                lineTo(12.0f, 9.879f)
                lineToRelative(-6.4f, -6.4f)
                lineTo(7.414f, 1.671f)
                arcTo(0.979f, 0.979f, 0.0f, false, false, 6.728f, 0.0f)
                lineTo(1.093f, -0.037f)
                arcTo(1.086f, 1.086f, 0.0f, false, false, 0.0f, 1.056f)
                lineTo(0.037f, 6.692f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, false, 1.67f, 0.685f)
                lineTo(3.482f, 5.6f)
                lineToRelative(6.4f, 6.4f)
                lineToRelative(-6.4f, 6.4f)
                lineTo(1.707f, 16.623f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, false, -1.67f, 0.685f)
                lineTo(0.0f, 22.944f)
                arcToRelative(1.086f, 1.086f, 0.0f, false, false, 1.093f, 1.093f)
                lineTo(6.728f, 24.0f)
                arcToRelative(0.979f, 0.979f, 0.0f, false, false, 0.686f, -1.671f)
                lineTo(5.6f, 20.518f)
                lineToRelative(6.4f, -6.4f)
                lineToRelative(6.4f, 6.4f)
                lineToRelative(-1.774f, 1.775f)
                arcToRelative(0.978f, 0.978f, 0.0f, false, false, 0.685f, 1.67f)
                lineTo(22.944f, 24.0f)
                arcToRelative(1.086f, 1.086f, 0.0f, false, false, 1.093f, -1.093f)
                lineTo(24.0f, 17.272f)
                arcTo(0.979f, 0.979f, 0.0f, false, false, 22.329f, 16.586f)
                close()
            }
        }
        .build()
        return _expandArrowsAlt!!
    }

private var _expandArrowsAlt: ImageVector? = null
