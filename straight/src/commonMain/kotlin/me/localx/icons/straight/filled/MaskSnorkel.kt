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
                moveToRelative(24.0f, 0.0f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                reflectiveCurveToRelative(-7.5f, -3.364f, -7.5f, -7.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 3.032f, 2.468f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(22.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(14.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                curveTo(2.691f, 0.0f, 0.0f, 2.691f, 0.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(1.17f)
                curveToRelative(0.619f, -1.573f, 1.624f, -3.5f, 2.83f, -3.5f)
                reflectiveCurveToRelative(2.211f, 1.927f, 2.83f, 3.5f)
                horizontalLineToRelative(1.17f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(17.309f, 0.0f, 14.0f, 0.0f)
                close()
            }
        }
        .build()
        return _maskSnorkel!!
    }

private var _maskSnorkel: ImageVector? = null
