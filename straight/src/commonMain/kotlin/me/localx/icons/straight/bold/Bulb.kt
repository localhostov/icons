package me.localx.icons.straight.bold

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

public val Icons.Bold.Bulb: ImageVector
    get() {
        if (_bulb != null) {
            return _bulb!!
        }
        _bulb = Builder(name = "Bulb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.994f, 2.287f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -14.92f, 5.538f)
                arcToRelative(9.807f, 9.807f, 0.0f, false, false, 3.107f, 8.1f)
                arcToRelative(5.32f, 5.32f, 0.0f, false, true, 1.819f, 3.875f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.048f)
                arcToRelative(6.166f, 6.166f, 0.0f, false, true, 1.933f, -4.188f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.061f, -13.477f)
                close()
                moveTo(15.955f, 13.508f)
                arcToRelative(8.637f, 8.637f, 0.0f, false, false, -1.909f, 2.492f)
                horizontalLineToRelative(-0.546f)
                verticalLineToRelative(-4.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.5f, -3.7f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.5f, 3.7f)
                verticalLineToRelative(4.3f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(9.048f, 9.048f, 0.0f, false, false, -1.773f, -2.269f)
                arcToRelative(6.941f, 6.941f, 0.0f, false, true, -2.176f, -5.526f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, true, 5.243f, -5.165f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.661f, 10.468f)
                close()
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null
