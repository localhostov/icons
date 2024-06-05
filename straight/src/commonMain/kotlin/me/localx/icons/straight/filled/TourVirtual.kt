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

public val Icons.Filled.TourVirtual: ImageVector
    get() {
        if (_tourVirtual != null) {
            return _tourVirtual!!
        }
        _tourVirtual = Builder(name = "TourVirtual", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.047f, 0.0f, 0.0f, 2.523f, 0.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.001f, 1.689f, 3.813f, 4.634f, 4.972f)
                lineToRelative(1.366f, 0.537f)
                verticalLineToRelative(-14.149f)
                lineToRelative(-0.634f, -0.249f)
                curveToRelative(-2.108f, -0.829f, -3.366f, -1.992f, -3.366f, -3.11f)
                curveToRelative(0.0f, -1.932f, 4.018f, -4.0f, 10.0f, -4.0f)
                reflectiveCurveToRelative(10.0f, 2.068f, 10.0f, 4.0f)
                curveToRelative(0.0f, 1.118f, -1.258f, 2.281f, -3.366f, 3.11f)
                lineToRelative(-0.634f, 0.249f)
                verticalLineToRelative(14.149f)
                lineToRelative(1.366f, -0.537f)
                curveToRelative(2.945f, -1.158f, 4.634f, -2.971f, 4.634f, -4.972f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -3.477f, -5.047f, -6.0f, -12.0f, -6.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _tourVirtual!!
    }

private var _tourVirtual: ImageVector? = null
