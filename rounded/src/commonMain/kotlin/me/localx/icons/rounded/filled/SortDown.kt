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

public val Icons.Filled.SortDown: ImageVector
    get() {
        if (_sortDown != null) {
            return _sortDown!!
        }
        _sortDown = Builder(name = "SortDown", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.744f, 18.0f)
                curveToRelative(-0.757f, 0.0f, -1.48f, -0.323f, -1.985f, -0.886f)
                lineTo(3.328f, 10.587f)
                curveToRelative(-0.602f, -0.657f, -0.747f, -1.535f, -0.402f, -2.317f)
                curveToRelative(0.345f, -0.783f, 1.09f, -1.27f, 1.945f, -1.27f)
                horizontalLineToRelative(13.745f)
                curveToRelative(0.854f, 0.0f, 1.6f, 0.486f, 1.944f, 1.269f)
                reflectiveCurveToRelative(0.2f, 1.66f, -0.376f, 2.291f)
                lineToRelative(-6.487f, 6.589f)
                curveToRelative(-0.474f, 0.528f, -1.197f, 0.852f, -1.953f, 0.852f)
                close()
            }
        }
        .build()
        return _sortDown!!
    }

private var _sortDown: ImageVector? = null
