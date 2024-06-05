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

public val Icons.Bold.Mushroom: ImageVector
    get() {
        if (_mushroom != null) {
            return _mushroom!!
        }
        _mushroom = Builder(name = "Mushroom", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 4.956f, 0.0f, 11.048f)
                arcToRelative(4.148f, 4.148f, 0.0f, false, false, 1.056f, 3.078f)
                arcTo(3.208f, 3.208f, 0.0f, false, false, 3.435f, 15.0f)
                arcToRelative(11.75f, 11.75f, 0.0f, false, false, 3.434f, -0.85f)
                curveToRelative(0.247f, -0.086f, 0.5f, -0.173f, 0.759f, -0.26f)
                arcTo(35.256f, 35.256f, 0.0f, false, false, 7.0f, 19.0f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, false, 5.0f, 5.0f)
                arcToRelative(4.89f, 4.89f, 0.0f, false, false, 5.0f, -5.0f)
                arcToRelative(35.256f, 35.256f, 0.0f, false, false, -0.628f, -5.11f)
                curveToRelative(0.257f, 0.087f, 0.512f, 0.174f, 0.759f, 0.26f)
                arcToRelative(11.75f, 11.75f, 0.0f, false, false, 3.434f, 0.85f)
                horizontalLineToRelative(0.075f)
                arcToRelative(3.173f, 3.173f, 0.0f, false, false, 2.3f, -0.874f)
                arcTo(4.148f, 4.148f, 0.0f, false, false, 24.0f, 11.048f)
                curveTo(24.0f, 4.956f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.0f, 19.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(37.248f, 37.248f, 0.0f, false, true, 0.855f, -5.92f)
                arcTo(9.1f, 9.1f, 0.0f, false, true, 12.0f, 13.0f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, 1.145f, 0.08f)
                arcTo(37.248f, 37.248f, 0.0f, false, true, 14.0f, 19.0f)
                close()
                moveTo(20.858f, 11.974f)
                arcToRelative(0.664f, 0.664f, 0.0f, false, true, -0.242f, 0.026f)
                arcToRelative(10.558f, 10.558f, 0.0f, false, true, -2.5f, -0.685f)
                arcTo(18.528f, 18.528f, 0.0f, false, false, 12.0f, 10.0f)
                arcToRelative(18.528f, 18.528f, 0.0f, false, false, -6.114f, 1.315f)
                arcToRelative(10.558f, 10.558f, 0.0f, false, true, -2.5f, 0.685f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.224f, -0.016f)
                horizontalLineToRelative(0.0f)
                arcTo(1.768f, 1.768f, 0.0f, false, true, 3.0f, 11.048f)
                curveTo(3.0f, 6.61f, 7.038f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 3.61f, 9.0f, 8.048f)
                arcTo(2.006f, 2.006f, 0.0f, false, true, 20.858f, 11.974f)
                close()
            }
        }
        .build()
        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
