package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.ScrollOld: ImageVector
    get() {
        if (_scrollOld != null) {
            return _scrollOld!!
        }
        _scrollOld = Builder(name = "ScrollOld", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 17.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(4.357f)
                curveToRelative(0.0f, 1.308f, -0.941f, 2.499f, -2.242f, 2.63f)
                curveToRelative(-1.496f, 0.15f, -2.758f, -1.021f, -2.758f, -2.487f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(5.0f, 1.5f)
                curveToRelative(0.0f, -0.536f, -0.122f, -1.045f, -0.338f, -1.5f)
                horizontalLineToRelative(11.338f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(3.0f, 1.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(0.0f, 0.672f, 0.0f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.0f)
                lineTo(3.0f, 1.5f)
                close()
                moveTo(12.0f, 19.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.924f, -0.28f, 1.784f, -0.76f, 2.5f)
                horizontalLineToRelative(9.26f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-12.0f)
                close()
            }
        }
        .build()
        return _scrollOld!!
    }

private var _scrollOld: ImageVector? = null
