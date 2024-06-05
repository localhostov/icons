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

public val Icons.Outline.Bulb: ImageVector
    get() {
        if (_bulb != null) {
            return _bulb!!
        }
        _bulb = Builder(name = "Bulb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.994f, 2.286f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -14.919f, 5.536f)
                arcToRelative(8.938f, 8.938f, 0.0f, false, false, 2.793f, 7.761f)
                arcToRelative(6.263f, 6.263f, 0.0f, false, true, 2.132f, 4.566f)
                verticalLineToRelative(0.161f)
                arcToRelative(3.694f, 3.694f, 0.0f, false, false, 3.69f, 3.69f)
                horizontalLineToRelative(0.62f)
                arcToRelative(3.694f, 3.694f, 0.0f, false, false, 3.69f, -3.69f)
                verticalLineToRelative(-0.549f)
                arcToRelative(5.323f, 5.323f, 0.0f, false, true, 1.932f, -4.0f)
                arcToRelative(8.994f, 8.994f, 0.0f, false, false, 0.062f, -13.477f)
                close()
                moveTo(12.31f, 22.0f)
                horizontalLineToRelative(-0.62f)
                arcToRelative(1.692f, 1.692f, 0.0f, false, true, -1.69f, -1.69f)
                reflectiveCurveToRelative(-0.007f, -0.26f, -0.008f, -0.31f)
                horizontalLineToRelative(4.008f)
                verticalLineToRelative(0.31f)
                arcToRelative(1.692f, 1.692f, 0.0f, false, true, -1.69f, 1.69f)
                close()
                moveTo(16.61f, 14.259f)
                arcToRelative(7.667f, 7.667f, 0.0f, false, false, -2.364f, 3.741f)
                horizontalLineToRelative(-1.246f)
                verticalLineToRelative(-7.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, -2.816f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, 2.816f)
                verticalLineToRelative(7.184f)
                horizontalLineToRelative(-1.322f)
                arcToRelative(8.634f, 8.634f, 0.0f, false, false, -2.448f, -3.881f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 3.951f, -12.073f)
                arcToRelative(7.452f, 7.452f, 0.0f, false, true, 0.828f, -0.046f)
                arcToRelative(6.921f, 6.921f, 0.0f, false, true, 4.652f, 1.778f)
                arcToRelative(6.993f, 6.993f, 0.0f, false, true, -0.048f, 10.481f)
                close()
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null
