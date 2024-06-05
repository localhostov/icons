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

public val Icons.Outline.SnowmanHead: ImageVector
    get() {
        if (_snowmanHead != null) {
            return _snowmanHead!!
        }
        _snowmanHead = Builder(name = "SnowmanHead", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 9.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.947f)
                curveToRelative(-0.613f, 1.237f, -0.947f, 2.607f, -0.947f, 4.0f)
                curveToRelative(0.0f, 4.963f, 4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -1.393f, -0.334f, -2.763f, -0.947f, -4.0f)
                horizontalLineToRelative(0.947f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(7.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.141f, -7.0f, -7.0f)
                curveToRelative(0.0f, -1.457f, 0.456f, -2.823f, 1.283f, -4.0f)
                horizontalLineToRelative(11.433f)
                curveToRelative(0.827f, 1.177f, 1.283f, 2.543f, 1.283f, 4.0f)
                curveToRelative(0.0f, 3.859f, -3.14f, 7.0f, -7.0f, 7.0f)
                close()
                moveTo(10.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(17.0f, 14.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(13.5f, 17.495f)
                curveToRelative(0.0f, 0.398f, -0.349f, 1.687f, -0.71f, 2.914f)
                curveToRelative(-0.232f, 0.787f, -1.349f, 0.787f, -1.581f, 0.0f)
                curveToRelative(-0.361f, -1.228f, -0.71f, -2.516f, -0.71f, -2.914f)
                curveToRelative(0.0f, -0.826f, 0.672f, -1.495f, 1.5f, -1.495f)
                reflectiveCurveToRelative(1.5f, 0.669f, 1.5f, 1.495f)
                close()
            }
        }
        .build()
        return _snowmanHead!!
    }

private var _snowmanHead: ImageVector? = null
