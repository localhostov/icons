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

public val Icons.Outline.Lambda: ImageVector
    get() {
        if (_lambda != null) {
            return _lambda!!
        }
        _lambda = Builder(name = "Lambda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.028f)
                curveToRelative(-1.905f, 0.0f, -3.618f, -1.059f, -4.472f, -2.764f)
                lineToRelative(-6.109f, -12.219f)
                lineToRelative(-7.503f, 14.443f)
                curveToRelative(-0.179f, 0.343f, -0.527f, 0.539f, -0.889f, 0.539f)
                curveToRelative(-0.155f, 0.0f, -0.312f, -0.036f, -0.46f, -0.112f)
                curveToRelative(-0.49f, -0.255f, -0.681f, -0.858f, -0.427f, -1.349f)
                lineTo(10.285f, 6.806f)
                lineToRelative(-1.574f, -3.148f)
                curveToRelative(-0.512f, -1.022f, -1.54f, -1.658f, -2.683f, -1.658f)
                horizontalLineToRelative(-1.028f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.028f)
                curveToRelative(1.905f, 0.0f, 3.618f, 1.059f, 4.472f, 2.764f)
                lineToRelative(8.789f, 17.578f)
                curveToRelative(0.512f, 1.022f, 1.54f, 1.658f, 2.683f, 1.658f)
                horizontalLineToRelative(1.028f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _lambda!!
    }

private var _lambda: ImageVector? = null
