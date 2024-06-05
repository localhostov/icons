package me.localx.icons.rounded.filled

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

public val Icons.Filled.Bulb: ImageVector
    get() {
        if (_bulb != null) {
            return _bulb!!
        }
        _bulb = Builder(name = "Bulb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.868f, 15.583f)
                arcToRelative(8.938f, 8.938f, 0.0f, false, true, -2.793f, -7.761f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, true, 14.857f, 7.941f)
                arcToRelative(5.741f, 5.741f, 0.0f, false, false, -1.594f, 2.237f)
                horizontalLineToRelative(-3.338f)
                verticalLineToRelative(-7.184f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, -2.816f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, 2.816f)
                verticalLineToRelative(7.184f)
                horizontalLineToRelative(-3.437f)
                arcToRelative(6.839f, 6.839f, 0.0f, false, false, -1.695f, -2.417f)
                close()
                moveTo(8.0f, 20.0f)
                verticalLineToRelative(0.31f)
                arcToRelative(3.694f, 3.694f, 0.0f, false, false, 3.69f, 3.69f)
                horizontalLineToRelative(0.62f)
                arcToRelative(3.694f, 3.694f, 0.0f, false, false, 3.69f, -3.69f)
                verticalLineToRelative(-0.31f)
                close()
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null
