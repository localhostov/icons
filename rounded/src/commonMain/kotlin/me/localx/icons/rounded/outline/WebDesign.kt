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

public val Icons.Outline.WebDesign: ImageVector
    get() {
        if (_webDesign != null) {
            return _webDesign!!
        }
        _webDesign = Builder(name = "WebDesign", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 5.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(0.0f, 6.0f)
                curveTo(0.0f, 3.243f, 2.243f, 1.0f, 5.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(2.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                close()
                moveTo(14.0f, 10.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-4.5f)
                lineTo(2.0f, 16.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(22.0f, 18.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _webDesign!!
    }

private var _webDesign: ImageVector? = null
