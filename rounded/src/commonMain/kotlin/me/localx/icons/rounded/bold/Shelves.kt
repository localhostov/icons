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

public val Icons.Bold.Shelves: ImageVector
    get() {
        if (_shelves != null) {
            return _shelves!!
        }
        _shelves = Builder(name = "Shelves", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(0.0f, 0.672f, 0.0f, 1.5f)
                verticalLineToRelative(21.0f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(24.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17.0f, 3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(3.0f, 15.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                lineTo(3.0f, 19.0f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.275f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(17.0f, 19.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.743f, 0.0f, -1.433f, 0.233f, -2.0f, 0.63f)
                curveToRelative(-0.567f, -0.397f, -1.257f, -0.63f, -2.0f, -0.63f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.17f, 0.0f, -0.337f, 0.012f, -0.5f, 0.036f)
                verticalLineToRelative(-2.036f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _shelves!!
    }

private var _shelves: ImageVector? = null
