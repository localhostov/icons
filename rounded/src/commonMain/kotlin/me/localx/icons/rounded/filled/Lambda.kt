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

public val Icons.Filled.Lambda: ImageVector
    get() {
        if (_lambda != null) {
            return _lambda!!
        }
        _lambda = Builder(name = "Lambda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 22.0f)
                horizontalLineToRelative(-1.028f)
                curveToRelative(-1.143f, 0.0f, -2.171f, -0.636f, -2.683f, -1.658f)
                lineTo(10.5f, 2.764f)
                curveToRelative(-0.854f, -1.705f, -2.566f, -2.764f, -4.472f, -2.764f)
                horizontalLineToRelative(-1.028f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.028f)
                curveToRelative(1.143f, 0.0f, 2.171f, 0.636f, 2.683f, 1.658f)
                lineToRelative(1.574f, 3.148f)
                lineTo(2.112f, 22.539f)
                curveToRelative(-0.254f, 0.49f, -0.063f, 1.094f, 0.427f, 1.349f)
                curveToRelative(0.147f, 0.076f, 0.305f, 0.112f, 0.46f, 0.112f)
                curveToRelative(0.361f, 0.0f, 0.71f, -0.196f, 0.889f, -0.539f)
                lineToRelative(7.503f, -14.443f)
                lineToRelative(6.109f, 12.219f)
                curveToRelative(0.854f, 1.705f, 2.566f, 2.764f, 4.472f, 2.764f)
                horizontalLineToRelative(1.028f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _lambda!!
    }

private var _lambda: ImageVector? = null
