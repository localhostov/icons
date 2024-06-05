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

public val Icons.Outline.BookCopy: ImageVector
    get() {
        if (_bookCopy != null) {
            return _bookCopy!!
        }
        _bookCopy = Builder(name = "BookCopy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                lineTo(24.0f, 4.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(12.5f, 2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-10.5f)
                curveToRelative(-0.536f, 0.0f, -1.045f, 0.122f, -1.5f, 0.338f)
                verticalLineToRelative(-7.838f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(19.5f, 17.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.379f, -1.122f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(14.663f, 21.3f)
                curveToRelative(0.387f, 0.395f, 0.381f, 1.027f, -0.014f, 1.414f)
                curveToRelative(-0.846f, 0.829f, -1.964f, 1.286f, -3.149f, 1.286f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(7.838f)
                curveToRelative(0.455f, -0.217f, 0.964f, -0.338f, 1.5f, -0.338f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.658f, 0.0f, 1.28f, -0.254f, 1.749f, -0.714f)
                curveToRelative(0.395f, -0.388f, 1.027f, -0.38f, 1.414f, 0.014f)
                close()
            }
        }
        .build()
        return _bookCopy!!
    }

private var _bookCopy: ImageVector? = null
