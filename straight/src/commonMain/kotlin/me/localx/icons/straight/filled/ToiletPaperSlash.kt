package me.localx.icons.straight.filled

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

public val Icons.Filled.ToiletPaperSlash: ImageVector
    get() {
        if (_toiletPaperSlash != null) {
            return _toiletPaperSlash!!
        }
        _toiletPaperSlash = Builder(name = "ToiletPaperSlash", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.061f, 6.303f)
                lineToRelative(13.932f, 13.932f)
                curveToRelative(-0.122f, 2.097f, -1.866f, 3.765f, -3.993f, 3.765f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(2.0f, 7.5f)
                curveToRelative(0.0f, -0.405f, 0.021f, -0.805f, 0.061f, -1.197f)
                close()
                moveTo(16.0f, 8.5f)
                curveToRelative(0.0f, -3.238f, 0.595f, -6.491f, 1.868f, -8.5f)
                lineTo(7.0f, 0.0f)
                curveToRelative(-1.372f, 0.0f, -2.591f, 0.801f, -3.484f, 2.102f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-7.957f, -7.957f)
                verticalLineToRelative(-6.086f)
                close()
                moveTo(18.0f, 8.5f)
                curveToRelative(0.0f, -4.694f, 1.343f, -8.5f, 3.0f, -8.5f)
                reflectiveCurveToRelative(3.0f, 3.806f, 3.0f, 8.5f)
                reflectiveCurveToRelative(-1.343f, 8.5f, -3.0f, 8.5f)
                reflectiveCurveToRelative(-3.0f, -3.806f, -3.0f, -8.5f)
                close()
                moveTo(20.0f, 8.5f)
                curveToRelative(0.0f, 1.657f, 0.448f, 3.0f, 1.0f, 3.0f)
                reflectiveCurveToRelative(1.0f, -1.343f, 1.0f, -3.0f)
                reflectiveCurveToRelative(-0.448f, -3.0f, -1.0f, -3.0f)
                reflectiveCurveToRelative(-1.0f, 1.343f, -1.0f, 3.0f)
                close()
            }
        }
        .build()
        return _toiletPaperSlash!!
    }

private var _toiletPaperSlash: ImageVector? = null
