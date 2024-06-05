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

public val Icons.Filled.HeadVr: ImageVector
    get() {
        if (_headVr != null) {
            return _headVr!!
        }
        _headVr = Builder(name = "HeadVr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(9.023f, 9.0f)
                curveToRelative(0.254f, -2.799f, 2.613f, -5.0f, 5.477f, -5.0f)
                horizontalLineToRelative(4.971f)
                curveTo(17.022f, 1.027f, 13.319f, -0.427f, 9.452f, 0.106f)
                curveTo(4.786f, 0.748f, 1.026f, 4.415f, 0.181f, 9.0f)
                lineTo(9.023f, 9.0f)
                close()
                moveTo(14.5f, 15.0f)
                curveToRelative(-2.512f, 0.0f, -4.637f, -1.694f, -5.292f, -4.0f)
                lineTo(0.0f, 11.0f)
                curveToRelative(0.002f, 2.415f, 0.788f, 4.752f, 2.26f, 6.674f)
                curveToRelative(0.477f, 0.624f, 0.74f, 1.461f, 0.74f, 2.355f)
                verticalLineToRelative(0.971f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                horizontalLineToRelative(0.494f)
                curveToRelative(2.499f, 0.0f, 4.629f, -1.868f, 4.957f, -4.345f)
                lineToRelative(0.219f, -1.655f)
                horizontalLineToRelative(-7.169f)
                close()
            }
        }
        .build()
        return _headVr!!
    }

private var _headVr: ImageVector? = null
