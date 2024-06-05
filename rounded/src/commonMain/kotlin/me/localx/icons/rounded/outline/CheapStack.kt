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
                moveToRelative(6.5f, 1.0f)
                curveTo(3.27f, 1.0f, 0.0f, 2.202f, 0.0f, 4.5f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 2.298f, 3.27f, 3.5f, 6.5f, 3.5f)
                reflectiveCurveToRelative(6.5f, -1.202f, 6.5f, -3.5f)
                lineTo(13.0f, 4.5f)
                curveToRelative(0.0f, -2.298f, -3.27f, -3.5f, -6.5f, -3.5f)
                close()
                moveTo(11.0f, 16.5f)
                curveToRelative(0.0f, 0.436f, -1.577f, 1.5f, -4.5f, 1.5f)
                reflectiveCurveToRelative(-4.5f, -1.064f, -4.5f, -1.5f)
                verticalLineToRelative(-1.409f)
                curveToRelative(1.226f, 0.601f, 2.867f, 0.909f, 4.5f, 0.909f)
                reflectiveCurveToRelative(3.274f, -0.308f, 4.5f, -0.909f)
                verticalLineToRelative(1.409f)
                close()
                moveTo(11.0f, 12.5f)
                curveToRelative(0.0f, 0.436f, -1.577f, 1.5f, -4.5f, 1.5f)
                reflectiveCurveToRelative(-4.5f, -1.064f, -4.5f, -1.5f)
                verticalLineToRelative(-1.409f)
                curveToRelative(1.226f, 0.601f, 2.867f, 0.909f, 4.5f, 0.909f)
                reflectiveCurveToRelative(3.274f, -0.308f, 4.5f, -0.909f)
                verticalLineToRelative(1.409f)
                close()
                moveTo(11.0f, 8.5f)
                curveToRelative(0.0f, 0.436f, -1.577f, 1.5f, -4.5f, 1.5f)
                reflectiveCurveToRelative(-4.5f, -1.064f, -4.5f, -1.5f)
                verticalLineToRelative(-1.409f)
                curveToRelative(1.226f, 0.601f, 2.867f, 0.909f, 4.5f, 0.909f)
                reflectiveCurveToRelative(3.274f, -0.308f, 4.5f, -0.909f)
                verticalLineToRelative(1.409f)
                close()
                moveTo(6.5f, 3.0f)
                curveToRelative(2.923f, 0.0f, 4.5f, 1.064f, 4.5f, 1.5f)
                reflectiveCurveToRelative(-1.577f, 1.5f, -4.5f, 1.5f)
                reflectiveCurveToRelative(-4.5f, -1.064f, -4.5f, -1.5f)
                reflectiveCurveToRelative(1.577f, -1.5f, 4.5f, -1.5f)
                close()
                moveTo(6.5f, 22.0f)
                curveToRelative(-2.923f, 0.0f, -4.5f, -1.064f, -4.5f, -1.5f)
                verticalLineToRelative(-1.409f)
                curveToRelative(1.226f, 0.601f, 2.867f, 0.909f, 4.5f, 0.909f)
                reflectiveCurveToRelative(3.274f, -0.308f, 4.5f, -0.909f)
                verticalLineToRelative(1.409f)
                curveToRelative(0.0f, 0.436f, -1.577f, 1.5f, -4.5f, 1.5f)
                close()
                moveTo(23.707f, 20.588f)
                lineToRelative(-2.535f, 2.535f)
                curveToRelative(-0.585f, 0.584f, -1.354f, 0.877f, -2.122f, 0.877f)
                reflectiveCurveToRelative(-1.536f, -0.292f, -2.121f, -0.876f)
                lineToRelative(-2.636f, -2.636f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.293f, 2.293f)
                lineTo(18.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(20.467f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _cheapStack!!
    }

private var _cheapStack: ImageVector? = null
