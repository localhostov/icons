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

public val Icons.Bold.BookUser: ImageVector
    get() {
        if (_bookUser != null) {
            return _bookUser!!
        }
        _bookUser = Builder(name = "BookUser", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 7.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(12.126f, 12.768f)
                curveToRelative(0.114f, 0.146f, 0.288f, 0.232f, 0.474f, 0.232f)
                horizontalLineToRelative(4.8f)
                curveToRelative(0.186f, 0.0f, 0.36f, -0.086f, 0.474f, -0.232f)
                curveToRelative(0.114f, -0.147f, 0.154f, -0.338f, 0.107f, -0.517f)
                curveToRelative(-0.336f, -1.304f, -1.59f, -2.25f, -2.981f, -2.25f)
                reflectiveCurveToRelative(-2.645f, 0.946f, -2.981f, 2.25f)
                curveToRelative(-0.046f, 0.18f, -0.006f, 0.371f, 0.107f, 0.517f)
                close()
                moveTo(23.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 3.033f, -2.468f, 5.5f, -5.5f, 5.5f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                lineTo(1.0f, 5.5f)
                curveTo(1.0f, 2.467f, 3.468f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(17.5f, 3.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(10.0f)
                lineTo(20.0f, 5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.0f, 5.5f)
                verticalLineToRelative(9.757f)
                curveToRelative(0.469f, -0.166f, 0.974f, -0.257f, 1.5f, -0.257f)
                horizontalLineToRelative(1.5f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                close()
                moveTo(20.0f, 18.5f)
                verticalLineToRelative(-0.5f)
                lineTo(5.5f, 18.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.673f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _bookUser!!
    }

private var _bookUser: ImageVector? = null
