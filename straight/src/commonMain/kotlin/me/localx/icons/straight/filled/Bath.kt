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

public val Icons.Filled.Bath: ImageVector
    get() {
        if (_bath != null) {
            return _bath!!
        }
        _bath = Builder(name = "Bath", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.495f, 15.873f)
                lineToRelative(0.483f, -3.873f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-7.667f)
                curveToRelative(0.0f, -1.286f, 1.047f, -2.333f, 2.333f, -2.333f)
                curveToRelative(0.73f, 0.0f, 1.429f, 0.349f, 1.867f, 0.933f)
                lineToRelative(0.259f, 0.345f)
                lineToRelative(-0.574f, 3.29f)
                lineToRelative(1.071f, 1.67f)
                lineToRelative(5.777f, -4.333f)
                lineToRelative(-1.071f, -1.67f)
                lineToRelative(-3.607f, -0.161f)
                lineToRelative(-0.256f, -0.342f)
                curveToRelative(-0.814f, -1.085f, -2.11f, -1.732f, -3.467f, -1.732f)
                curveTo(1.943f, 0.0f, 0.0f, 1.943f, 0.0f, 4.333f)
                verticalLineToRelative(7.667f)
                lineToRelative(0.519f, 3.873f)
                curveToRelative(0.256f, 2.048f, 1.264f, 3.841f, 2.726f, 5.117f)
                lineToRelative(-0.744f, 3.01f)
                horizontalLineToRelative(2.061f)
                lineToRelative(0.452f, -1.832f)
                curveToRelative(1.085f, 0.533f, 2.301f, 0.832f, 3.578f, 0.832f)
                horizontalLineToRelative(6.831f)
                curveToRelative(1.273f, 0.0f, 2.485f, -0.296f, 3.567f, -0.826f)
                lineToRelative(0.451f, 1.826f)
                horizontalLineToRelative(2.061f)
                lineToRelative(-0.742f, -3.001f)
                curveToRelative(1.467f, -1.276f, 2.48f, -3.073f, 2.737f, -5.126f)
                close()
            }
        }
        .build()
        return _bath!!
    }

private var _bath: ImageVector? = null
