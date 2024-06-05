package me.localx.icons.rounded.bold

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

public val Icons.Bold.BookHeart: ImageVector
    get() {
        if (_bookHeart != null) {
            return _bookHeart!!
        }
        _bookHeart = Builder(name = "BookHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.5f, 7.496f)
                curveToRelative(0.0f, -1.378f, 1.007f, -2.496f, 2.25f, -2.496f)
                reflectiveCurveToRelative(2.25f, 1.117f, 2.25f, 2.496f)
                curveToRelative(0.0f, -1.378f, 1.007f, -2.496f, 2.25f, -2.496f)
                reflectiveCurveToRelative(2.25f, 1.117f, 2.25f, 2.496f)
                curveToRelative(0.0f, 1.841f, -2.233f, 4.083f, -3.553f, 5.165f)
                curveToRelative(-0.552f, 0.453f, -1.341f, 0.453f, -1.893f, 0.0f)
                curveToRelative(-1.32f, -1.082f, -3.553f, -3.324f, -3.553f, -5.165f)
                close()
                moveTo(23.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.032f, -2.467f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-2.378f, 0.0f, -4.31f, -1.859f, -4.469f, -4.197f)
                lineToRelative(-0.031f, -14.303f)
                curveTo(1.0f, 2.467f, 3.467f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(4.0f, 5.5f)
                verticalLineToRelative(9.776f)
                curveToRelative(0.471f, -0.168f, 0.971f, -0.276f, 1.5f, -0.276f)
                horizontalLineToRelative(14.5f)
                lineTo(20.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(6.5f, 3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                close()
                moveTo(20.0f, 18.5f)
                verticalLineToRelative(-0.5f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.121f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _bookHeart!!
    }

private var _bookHeart: ImageVector? = null
