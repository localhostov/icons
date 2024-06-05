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

public val Icons.Outline.ArrowTrendUp: ImageVector
    get() {
        if (_arrowTrendUp != null) {
            return _arrowTrendUp!!
        }
        _arrowTrendUp = Builder(name = "ArrowTrendUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.586f)
                lineToRelative(-6.562f, 6.562f)
                curveToRelative(-0.564f, 0.564f, -1.482f, 0.564f, -2.047f, 0.0f)
                lineToRelative(-2.539f, -2.539f)
                curveToRelative(-1.344f, -1.344f, -3.531f, -1.344f, -4.875f, 0.0f)
                lineTo(0.293f, 16.293f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                lineToRelative(4.27f, -4.27f)
                curveToRelative(0.547f, -0.547f, 1.5f, -0.547f, 2.047f, 0.0f)
                lineToRelative(2.539f, 2.539f)
                curveToRelative(1.344f, 1.344f, 3.531f, 1.344f, 4.875f, 0.0f)
                lineToRelative(6.563f, -6.562f)
                verticalLineToRelative(5.586f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _arrowTrendUp!!
    }

private var _arrowTrendUp: ImageVector? = null
