package me.localx.icons.straight.bold

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

public val Icons.Bold.Seller: ImageVector
    get() {
        if (_seller != null) {
            return _seller!!
        }
        _seller = Builder(name = "Seller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(24.0f, 16.0f)
                curveToRelative(0.0f, 1.105f, -0.831f, 2.0f, -1.857f, 2.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-1.026f, 0.0f, -1.857f, -0.895f, -1.857f, -2.0f)
                curveToRelative(0.0f, 1.105f, -0.831f, 2.0f, -1.857f, 2.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-1.026f, 0.0f, -1.857f, -0.895f, -1.857f, -2.0f)
                curveToRelative(0.0f, 1.105f, -0.831f, 2.0f, -1.857f, 2.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-1.026f, 0.0f, -1.857f, -0.895f, -1.857f, -2.0f)
                lineToRelative(1.238f, -4.0f)
                horizontalLineToRelative(10.524f)
                lineToRelative(1.238f, 4.0f)
                close()
                moveTo(20.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.52f, 14.0f)
                lineToRelative(-0.932f, 3.0f)
                horizontalLineToRelative(-3.588f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(4.52f)
                close()
            }
        }
        .build()
        return _seller!!
    }

private var _seller: ImageVector? = null
