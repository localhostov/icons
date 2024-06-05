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
                moveToRelative(8.0f, 20.149f)
                verticalLineToRelative(3.851f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.685f)
                arcToRelative(6.005f, 6.005f, 0.0f, false, true, 1.932f, -4.552f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -12.064f, -0.18f)
                arcToRelative(6.263f, 6.263f, 0.0f, false, true, 2.132f, 4.566f)
                close()
                moveTo(14.0f, 22.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.851f)
                curveToRelative(0.0f, -0.05f, -0.007f, -0.1f, -0.008f, -0.149f)
                horizontalLineToRelative(4.024f)
                curveToRelative(0.0f, 0.105f, -0.016f, 0.209f, -0.016f, 0.315f)
                close()
                moveTo(5.06f, 8.075f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 11.553f, 6.184f)
                arcToRelative(7.655f, 7.655f, 0.0f, false, false, -2.293f, 3.741f)
                horizontalLineToRelative(-1.32f)
                verticalLineToRelative(-7.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, -2.816f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, 2.816f)
                verticalLineToRelative(7.184f)
                horizontalLineToRelative(-1.322f)
                arcToRelative(8.634f, 8.634f, 0.0f, false, false, -2.448f, -3.881f)
                arcToRelative(6.96f, 6.96f, 0.0f, false, true, -2.17f, -6.044f)
                close()
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null
