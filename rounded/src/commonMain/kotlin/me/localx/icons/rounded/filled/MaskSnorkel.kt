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

public val Icons.Filled.MaskSnorkel: ImageVector
    get() {
        if (_maskSnorkel != null) {
            return _maskSnorkel!!
        }
        _maskSnorkel = Builder(name = "MaskSnorkel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 24.0f)
                curveToRelative(-4.136f, 0.0f, -7.5f, -3.364f, -7.5f, -7.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.468f, 5.5f, -5.5f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.553f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                close()
                moveTo(14.0f, 0.0f)
                horizontalLineTo(6.0f)
                curveTo(2.691f, 0.0f, 0.0f, 2.691f, 0.0f, 6.0f)
                curveToRelative(0.0f, 3.16f, 2.5f, 6.0f, 5.5f, 6.0f)
                curveToRelative(1.0f, 0.0f, 1.645f, -0.47f, 2.0f, -1.0f)
                curveToRelative(0.587f, -0.875f, 1.5f, -3.0f, 2.5f, -3.0f)
                reflectiveCurveToRelative(1.913f, 2.125f, 2.5f, 3.0f)
                curveToRelative(0.355f, 0.53f, 1.0f, 1.0f, 1.941f, 0.978f)
                curveToRelative(3.059f, 0.0f, 5.559f, -2.818f, 5.559f, -5.978f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _maskSnorkel!!
    }

private var _maskSnorkel: ImageVector? = null
