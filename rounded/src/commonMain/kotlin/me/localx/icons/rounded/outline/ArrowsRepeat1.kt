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

public val Icons.Outline.ArrowsRepeat1: ImageVector
    get() {
        if (_arrowsRepeat1 != null) {
            return _arrowsRepeat1!!
        }
        _arrowsRepeat1 = Builder(name = "ArrowsRepeat1", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                verticalLineToRelative(-3.586f)
                lineToRelative(-0.293f, 0.293f)
                curveToRelative(-0.391f, 0.391f, -1.023f, 0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.286f, -0.287f, 0.714f, -0.374f, 1.09f, -0.217f)
                curveToRelative(0.374f, 0.154f, 0.617f, 0.52f, 0.617f, 0.924f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                close()
                moveTo(23.0f, 11.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                lineTo(3.0f, 18.0f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-3.293f, 3.293f)
                curveToRelative(-0.78f, 0.779f, -0.78f, 2.049f, 0.0f, 2.828f)
                lineToRelative(3.293f, 3.293f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-2.293f, -2.293f)
                horizontalLineToRelative(13.0f)
                curveToRelative(4.411f, 0.0f, 8.0f, -3.589f, 8.0f, -8.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(1.0f, 13.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                curveToRelative(0.0f, -3.309f, 2.691f, -6.0f, 6.0f, -6.0f)
                horizontalLineToRelative(13.0f)
                lineToRelative(-2.293f, 2.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(3.293f, -3.293f)
                curveToRelative(0.78f, -0.779f, 0.78f, -2.049f, 0.0f, -2.828f)
                lineTo(20.121f, 0.293f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(2.293f, 2.293f)
                lineTo(8.0f, 4.0f)
                curveTo(3.589f, 4.0f, 0.0f, 7.589f, 0.0f, 12.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _arrowsRepeat1!!
    }

private var _arrowsRepeat1: ImageVector? = null
