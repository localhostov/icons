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

public val Icons.Outline.SortAlphaUp: ImageVector
    get() {
        if (_sortAlphaUp != null) {
            return _sortAlphaUp!!
        }
        _sortAlphaUp = Builder(name = "SortAlphaUp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 22.0f)
                horizontalLineToRelative(-3.84f)
                reflectiveCurveToRelative(4.521f, -5.065f, 4.552f, -5.114f)
                curveToRelative(0.364f, -0.581f, 0.383f, -1.313f, 0.051f, -1.913f)
                curveToRelative(-0.333f, -0.6f, -0.965f, -0.973f, -1.65f, -0.973f)
                horizontalLineToRelative(-4.112f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.84f)
                reflectiveCurveToRelative(-4.521f, 5.065f, -4.552f, 5.114f)
                curveToRelative(-0.364f, 0.581f, -0.383f, 1.313f, -0.051f, 1.913f)
                curveToRelative(0.333f, 0.6f, 0.965f, 0.973f, 1.65f, 0.973f)
                horizontalLineToRelative(4.112f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(22.0f, 3.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                lineTo(15.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20.0f, 5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(11.707f, 6.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineTo(7.414f, 0.586f)
                curveTo(7.024f, 0.196f, 6.512f, 0.0f, 6.0f, 0.0f)
                reflectiveCurveToRelative(-1.024f, 0.195f, -1.414f, 0.585f)
                lineTo(0.293f, 4.879f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                reflectiveCurveToRelative(1.023f, 0.391f, 1.414f, 0.0f)
                lineToRelative(3.293f, -3.293f)
                lineTo(5.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(7.0f, 3.0f)
                lineToRelative(3.293f, 3.293f)
                curveToRelative(0.391f, 0.391f, 1.023f, 0.391f, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _sortAlphaUp!!
    }

private var _sortAlphaUp: ImageVector? = null
