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

public val Icons.Filled.Fence: ImageVector
    get() {
        if (_fence != null) {
            return _fence!!
        }
        _fence = Builder(name = "Fence", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 10.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(1.0f, 17.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(7.0f, 10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(1.0f, 8.0f)
                lineTo(23.0f, 8.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(23.0f, 2.996f)
                curveToRelative(0.0f, -0.526f, -0.213f, -1.042f, -0.586f, -1.414f)
                lineToRelative(-1.0f, -1.0f)
                curveToRelative(-0.779f, -0.779f, -2.049f, -0.779f, -2.828f, 0.0f)
                lineToRelative(-1.0f, 1.0f)
                curveToRelative(-0.373f, 0.372f, -0.586f, 0.888f, -0.586f, 1.414f)
                verticalLineToRelative(3.004f)
                horizontalLineToRelative(-2.0f)
                lineTo(15.0f, 2.996f)
                curveToRelative(0.0f, -0.526f, -0.213f, -1.042f, -0.586f, -1.414f)
                lineToRelative(-1.0f, -1.0f)
                curveToRelative(-0.779f, -0.779f, -2.049f, -0.779f, -2.828f, 0.0f)
                lineToRelative(-1.0f, 1.0f)
                curveToRelative(-0.373f, 0.372f, -0.586f, 0.888f, -0.586f, 1.414f)
                verticalLineToRelative(3.004f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 2.996f)
                curveToRelative(0.0f, -0.526f, -0.213f, -1.042f, -0.586f, -1.414f)
                lineToRelative(-1.0f, -1.0f)
                curveTo(4.635f, -0.197f, 3.365f, -0.197f, 2.586f, 0.582f)
                lineTo(1.586f, 1.582f)
                curveToRelative(-0.373f, 0.372f, -0.586f, 0.888f, -0.586f, 1.414f)
                verticalLineToRelative(3.004f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(1.0f, 19.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                lineTo(1.0f, 19.0f)
                close()
                moveTo(9.0f, 19.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(17.0f, 19.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.379f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _fence!!
    }

private var _fence: ImageVector? = null
