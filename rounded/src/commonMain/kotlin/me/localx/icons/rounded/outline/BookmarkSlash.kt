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

public val Icons.Outline.BookmarkSlash: ImageVector
    get() {
        if (_bookmarkSlash != null) {
            return _bookmarkSlash!!
        }
        _bookmarkSlash = Builder(name = "BookmarkSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.707f, 22.293f)
                lineToRelative(-2.707f, -2.707f)
                lineTo(21.0f, 6.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                lineTo(8.0f, 1.0f)
                curveToRelative(-1.485f, 0.0f, -2.876f, 0.66f, -3.816f, 1.77f)
                lineTo(1.707f, 0.293f)
                curveTo(1.316f, -0.098f, 0.683f, -0.098f, 0.292f, 0.293f)
                reflectiveCurveTo(-0.098f, 1.316f, 0.292f, 1.707f)
                lineToRelative(22.0f, 22.0f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(11.586f)
                lineTo(5.606f, 4.192f)
                curveToRelative(0.563f, -0.744f, 1.447f, -1.192f, 2.394f, -1.192f)
                close()
                moveTo(12.239f, 17.173f)
                lineToRelative(-4.512f, 4.954f)
                curveToRelative(-0.537f, 0.57f, -1.258f, 0.871f, -1.995f, 0.872f)
                curveToRelative(-0.339f, 0.0f, -0.681f, -0.064f, -1.011f, -0.195f)
                curveToRelative(-1.046f, -0.416f, -1.722f, -1.411f, -1.722f, -2.537f)
                verticalLineToRelative(-11.267f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(11.267f)
                curveToRelative(0.0f, 0.447f, 0.322f, 0.623f, 0.46f, 0.679f)
                curveToRelative(0.138f, 0.055f, 0.494f, 0.147f, 0.801f, -0.178f)
                lineToRelative(4.5f, -4.94f)
                curveToRelative(0.372f, -0.408f, 1.003f, -0.439f, 1.413f, -0.066f)
                curveToRelative(0.408f, 0.372f, 0.438f, 1.004f, 0.066f, 1.412f)
                close()
            }
        }
        .build()
        return _bookmarkSlash!!
    }

private var _bookmarkSlash: ImageVector? = null
