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

public val Icons.Filled.ArrowUpRightFromSquare: ImageVector
    get() {
        if (_arrowUpRightFromSquare != null) {
            return _arrowUpRightFromSquare!!
        }
        _arrowUpRightFromSquare = Builder(name = "ArrowUpRightFromSquare", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.5f)
                verticalLineToRelative(8.5f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineTo(13.5f)
                curveToRelative(0.404f, 0.0f, 0.769f, 0.244f, 0.924f, 0.617f)
                curveToRelative(0.155f, 0.374f, 0.069f, 0.804f, -0.217f, 1.09f)
                lineToRelative(-7.319f, 7.319f)
                curveToRelative(-1.102f, 1.102f, -1.136f, 2.861f, -0.078f, 4.005f)
                curveToRelative(0.539f, 0.582f, 1.272f, 0.911f, 2.065f, 0.926f)
                curveToRelative(0.777f, 0.023f, 1.538f, -0.285f, 2.099f, -0.846f)
                lineToRelative(7.319f, -7.319f)
                curveToRelative(0.286f, -0.287f, 0.715f, -0.372f, 1.09f, -0.217f)
                curveToRelative(0.374f, 0.155f, 0.617f, 0.52f, 0.617f, 0.924f)
                close()
                moveTo(21.0f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.586f)
                lineTo(8.293f, 14.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineTo(22.0f, 3.414f)
                verticalLineToRelative(6.586f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _arrowUpRightFromSquare!!
    }

private var _arrowUpRightFromSquare: ImageVector? = null
