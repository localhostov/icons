package me.localx.icons.straight.outline

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

public val Icons.Outline.CheapStack: ImageVector
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
                moveTo(13.0f, 4.5f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 2.298f, -3.27f, 3.5f, -6.5f, 3.5f)
                reflectiveCurveToRelative(-6.5f, -1.202f, -6.5f, -3.5f)
                lineTo(0.0f, 4.5f)
                curveTo(0.0f, 2.202f, 3.27f, 1.0f, 6.5f, 1.0f)
                reflectiveCurveToRelative(6.5f, 1.202f, 6.5f, 3.5f)
                close()
                moveTo(11.0f, 20.5f)
                verticalLineToRelative(-1.409f)
                curveToRelative(-1.226f, 0.601f, -2.867f, 0.909f, -4.5f, 0.909f)
                reflectiveCurveToRelative(-3.274f, -0.308f, -4.5f, -0.909f)
                verticalLineToRelative(1.409f)
                curveToRelative(0.0f, 0.436f, 1.577f, 1.5f, 4.5f, 1.5f)
                reflectiveCurveToRelative(4.5f, -1.064f, 4.5f, -1.5f)
                close()
                moveTo(11.0f, 16.5f)
                verticalLineToRelative(-1.409f)
                curveToRelative(-1.226f, 0.601f, -2.867f, 0.909f, -4.5f, 0.909f)
                reflectiveCurveToRelative(-3.274f, -0.308f, -4.5f, -0.909f)
                verticalLineToRelative(1.409f)
                curveToRelative(0.0f, 0.436f, 1.577f, 1.5f, 4.5f, 1.5f)
                reflectiveCurveToRelative(4.5f, -1.064f, 4.5f, -1.5f)
                close()
                moveTo(11.0f, 12.5f)
                verticalLineToRelative(-1.409f)
                curveToRelative(-1.226f, 0.601f, -2.867f, 0.909f, -4.5f, 0.909f)
                reflectiveCurveToRelative(-3.274f, -0.308f, -4.5f, -0.909f)
                verticalLineToRelative(1.409f)
                curveToRelative(0.0f, 0.436f, 1.577f, 1.5f, 4.5f, 1.5f)
                reflectiveCurveToRelative(4.5f, -1.064f, 4.5f, -1.5f)
                close()
                moveTo(11.0f, 8.5f)
                verticalLineToRelative(-1.409f)
                curveToRelative(-1.226f, 0.601f, -2.867f, 0.909f, -4.5f, 0.909f)
                reflectiveCurveToRelative(-3.274f, -0.308f, -4.5f, -0.909f)
                verticalLineToRelative(1.409f)
                curveToRelative(0.0f, 0.436f, 1.577f, 1.5f, 4.5f, 1.5f)
                reflectiveCurveToRelative(4.5f, -1.064f, 4.5f, -1.5f)
                close()
                moveTo(11.0f, 4.5f)
                curveToRelative(0.0f, -0.436f, -1.577f, -1.5f, -4.5f, -1.5f)
                reflectiveCurveToRelative(-4.5f, 1.064f, -4.5f, 1.5f)
                reflectiveCurveToRelative(1.577f, 1.5f, 4.5f, 1.5f)
                reflectiveCurveToRelative(4.5f, -1.064f, 4.5f, -1.5f)
                close()
            }
        }
        .build()
        return _cheapStack!!
    }

private var _cheapStack: ImageVector? = null
