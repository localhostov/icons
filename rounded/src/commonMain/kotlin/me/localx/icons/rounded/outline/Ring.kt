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

public val Icons.Outline.Ring: ImageVector
    get() {
        if (_ring != null) {
            return _ring!!
        }
        _ring = Builder(name = "Ring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 3.0f)
                curveTo(5.898f, 3.0f, 1.008f, 5.351f, 0.148f, 8.507f)
                curveToRelative(-0.086f, 0.148f, -0.148f, 0.31f, -0.148f, 0.493f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 3.645f, 5.271f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.855f, 12.0f, -6.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.645f, -5.271f, -6.5f, -12.0f, -6.5f)
                close()
                moveTo(12.0f, 5.0f)
                curveToRelative(5.894f, 0.0f, 10.0f, 2.372f, 10.0f, 4.5f)
                curveToRelative(0.0f, 0.362f, -0.127f, 0.73f, -0.353f, 1.092f)
                curveToRelative(-2.227f, -1.626f, -5.76f, -2.592f, -9.647f, -2.592f)
                curveToRelative(-3.867f, 0.0f, -7.438f, 0.971f, -9.655f, 2.579f)
                curveToRelative(-0.22f, -0.358f, -0.345f, -0.722f, -0.345f, -1.079f)
                curveToRelative(0.0f, -2.128f, 4.106f, -4.5f, 10.0f, -4.5f)
                close()
                moveTo(20.18f, 11.994f)
                curveToRelative(-1.747f, 1.146f, -4.636f, 2.006f, -8.18f, 2.006f)
                reflectiveCurveToRelative(-6.426f, -0.858f, -8.174f, -2.002f)
                curveToRelative(1.886f, -1.231f, 4.927f, -1.998f, 8.174f, -1.998f)
                reflectiveCurveToRelative(6.283f, 0.753f, 8.18f, 1.994f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-5.894f, 0.0f, -10.0f, -2.372f, -10.0f, -4.5f)
                verticalLineToRelative(-1.362f)
                curveToRelative(2.132f, 1.738f, 5.779f, 2.862f, 10.0f, 2.862f)
                reflectiveCurveToRelative(7.868f, -1.124f, 10.0f, -2.862f)
                verticalLineToRelative(1.362f)
                curveToRelative(0.0f, 2.128f, -4.106f, 4.5f, -10.0f, 4.5f)
                close()
            }
        }
        .build()
        return _ring!!
    }

private var _ring: ImageVector? = null
