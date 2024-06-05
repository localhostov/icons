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

public val Icons.Filled.ScrollOld: ImageVector
    get() {
        if (_scrollOld != null) {
            return _scrollOld!!
        }
        _scrollOld = Builder(name = "ScrollOld", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 2.5f)
                verticalLineToRelative(-1.0f)
                curveTo(0.0f, 0.672f, 0.672f, 0.0f, 1.5f, 0.0f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(14.5f, 17.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                lineTo(4.662f, 0.0f)
                curveToRelative(0.217f, 0.455f, 0.338f, 0.964f, 0.338f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(6.357f)
                curveToRelative(0.0f, 1.308f, 0.941f, 2.499f, 2.242f, 2.63f)
                curveToRelative(1.496f, 0.15f, 2.758f, -1.021f, 2.758f, -2.487f)
                curveToRelative(0.0f, -2.485f, 2.015f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(21.998f, 19.0f)
                horizontalLineToRelative(-7.498f)
                curveToRelative(-1.381f, 0.0f, -2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.924f, -0.28f, 1.784f, -0.76f, 2.5f)
                horizontalLineToRelative(9.35f)
                curveToRelative(1.586f, 0.0f, 2.925f, -1.054f, 3.355f, -2.5f)
                curveToRelative(0.017f, -0.057f, 0.033f, -0.176f, 0.047f, -0.332f)
                curveToRelative(0.106f, -1.165f, -0.824f, -2.168f, -1.993f, -2.168f)
                close()
            }
        }
        .build()
        return _scrollOld!!
    }

private var _scrollOld: ImageVector? = null
