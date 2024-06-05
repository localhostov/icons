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

public val Icons.Filled.CheapStack: ImageVector
    get() {
        if (_cheapStack != null) {
            return _cheapStack!!
        }
        _cheapStack = Builder(name = "CheapStack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.008f, 19.906f)
                lineToRelative(-3.603f, 3.517f)
                curveToRelative(-0.384f, 0.384f, -0.893f, 0.577f, -1.402f, 0.577f)
                curveToRelative(-0.513f, 0.0f, -1.026f, -0.195f, -1.417f, -0.586f)
                lineToRelative(-3.567f, -3.567f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.567f, 2.567f)
                lineTo(18.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(21.024f)
                lineToRelative(2.611f, -2.549f)
                lineToRelative(1.396f, 1.432f)
                close()
                moveTo(6.5f, 2.0f)
                curveTo(2.91f, 2.0f, 0.0f, 3.343f, 0.0f, 5.0f)
                reflectiveCurveToRelative(2.91f, 3.0f, 6.5f, 3.0f)
                reflectiveCurveToRelative(6.5f, -1.343f, 6.5f, -3.0f)
                reflectiveCurveToRelative(-2.91f, -3.0f, -6.5f, -3.0f)
                close()
                moveTo(6.5f, 14.0f)
                curveToRelative(-3.792f, 0.0f, -6.5f, -1.529f, -6.5f, -3.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.995f, 2.794f, 3.5f, 6.5f, 3.5f)
                reflectiveCurveToRelative(6.5f, -1.505f, 6.5f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.971f, -2.708f, 3.5f, -6.5f, 3.5f)
                close()
                moveTo(6.5f, 10.0f)
                curveToRelative(-3.792f, 0.0f, -6.5f, -1.529f, -6.5f, -3.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.995f, 2.794f, 3.5f, 6.5f, 3.5f)
                reflectiveCurveToRelative(6.5f, -1.505f, 6.5f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.971f, -2.708f, 3.5f, -6.5f, 3.5f)
                close()
                moveTo(6.5f, 22.0f)
                curveToRelative(-3.792f, 0.0f, -6.5f, -1.529f, -6.5f, -3.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.995f, 2.794f, 3.5f, 6.5f, 3.5f)
                reflectiveCurveToRelative(6.5f, -1.505f, 6.5f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.971f, -2.708f, 3.5f, -6.5f, 3.5f)
                close()
                moveTo(6.5f, 18.0f)
                curveToRelative(-3.792f, 0.0f, -6.5f, -1.529f, -6.5f, -3.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.995f, 2.794f, 3.5f, 6.5f, 3.5f)
                reflectiveCurveToRelative(6.5f, -1.505f, 6.5f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.971f, -2.708f, 3.5f, -6.5f, 3.5f)
                close()
            }
        }
        .build()
        return _cheapStack!!
    }

private var _cheapStack: ImageVector? = null
