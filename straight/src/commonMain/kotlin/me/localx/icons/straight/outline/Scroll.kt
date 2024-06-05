package me.localx.icons.straight.outline

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

public val Icons.Outline.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 17.0f)
                lineTo(20.0f, 4.0f)
                curveToRelative(0.0f, -2.209f, -1.791f, -4.0f, -4.0f, -4.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.567f, 0.0f, 0.0f, 1.567f, 0.0f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.933f, 0.0f, 3.5f, -1.567f, 3.5f, -3.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(10.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                lineTo(7.0f, 3.5f)
                curveToRelative(0.0f, -0.536f, -0.122f, -1.045f, -0.338f, -1.5f)
                horizontalLineToRelative(9.338f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(22.0f, 20.5f)
                curveToRelative(0.0f, 0.827f, -0.673f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-8.838f)
                curveToRelative(0.216f, -0.455f, 0.338f, -0.963f, 0.338f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
