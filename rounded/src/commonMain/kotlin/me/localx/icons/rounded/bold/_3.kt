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

public val Icons.Bold._3: ImageVector
    get() {
        if (__3 != null) {
            return __3!!
        }
        __3 = Builder(name = "_3", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.388f, 10.088f)
                curveToRelative(1.0f, -1.072f, 1.612f, -2.51f, 1.612f, -4.088f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineTo(7.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, 2.019f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineTo(5.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(4.136f, 0.0f, 7.5f, -3.364f, 7.5f, -7.5f)
                curveToRelative(0.0f, -2.714f, -1.448f, -5.095f, -3.612f, -6.412f)
                close()
            }
        }
        .build()
        return __3!!
    }

private var __3: ImageVector? = null
