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

public val Icons.Filled.TreeDeciduous: ImageVector
    get() {
        if (_treeDeciduous != null) {
            return _treeDeciduous!!
        }
        _treeDeciduous = Builder(name = "TreeDeciduous", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(18.483f, 5.157f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.315f, -0.067f, -0.591f, -0.371f, -0.703f, -0.772f)
                curveToRelative(-0.72f, -2.582f, -3.097f, -4.385f, -5.78f, -4.385f)
                reflectiveCurveTo(6.94f, 1.803f, 6.22f, 4.385f)
                curveToRelative(-0.112f, 0.401f, -0.388f, 0.705f, -0.703f, 0.772f)
                curveTo(2.221f, 5.869f, -0.098f, 8.837f, 0.003f, 12.215f)
                curveToRelative(0.112f, 3.741f, 3.364f, 6.785f, 7.248f, 6.785f)
                horizontalLineToRelative(3.749f)
                verticalLineToRelative(-3.586f)
                lineToRelative(-3.707f, -3.707f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.293f, 2.293f)
                verticalLineToRelative(-3.586f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(3.586f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-3.707f, 3.707f)
                verticalLineToRelative(3.586f)
                horizontalLineToRelative(2.784f)
                curveToRelative(4.641f, 0.0f, 8.095f, -2.854f, 8.213f, -6.785f)
                curveToRelative(0.102f, -3.378f, -2.217f, -6.346f, -5.514f, -7.058f)
                close()
            }
        }
        .build()
        return _treeDeciduous!!
    }

private var _treeDeciduous: ImageVector? = null
