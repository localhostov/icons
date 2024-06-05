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
                moveToRelative(17.937f, 2.27f)
                arcToRelative(8.839f, 8.839f, 0.0f, false, false, -6.983f, -2.21f)
                arcToRelative(9.173f, 9.173f, 0.0f, false, false, -5.1f, 15.75f)
                curveToRelative(0.955f, 0.901f, 1.146f, 2.19f, 1.146f, 3.969f)
                verticalLineToRelative(0.153f)
                arcToRelative(4.049f, 4.049f, 0.0f, false, false, 4.021f, 4.068f)
                horizontalLineToRelative(1.958f)
                arcToRelative(4.049f, 4.049f, 0.0f, false, false, 4.021f, -4.068f)
                verticalLineToRelative(-0.523f)
                curveToRelative(0.0f, -1.67f, 0.15f, -2.709f, 0.942f, -3.415f)
                arcToRelative(9.223f, 9.223f, 0.0f, false, false, 0.0f, -13.724f)
                close()
                moveTo(14.0f, 19.932f)
                arcToRelative(1.046f, 1.046f, 0.0f, false, true, -1.021f, 1.068f)
                horizontalLineToRelative(-1.958f)
                arcToRelative(1.046f, 1.046f, 0.0f, false, true, -1.021f, -1.068f)
                verticalLineToRelative(-0.153f)
                curveToRelative(0.0f, -0.259f, 0.0f, -0.519f, -0.014f, -0.779f)
                horizontalLineToRelative(4.02f)
                curveToRelative(0.0f, 0.137f, -0.006f, 0.274f, -0.006f, 0.409f)
                close()
                moveTo(15.945f, 13.755f)
                arcToRelative(5.292f, 5.292f, 0.0f, false, false, -1.488f, 2.245f)
                horizontalLineToRelative(-0.957f)
                verticalLineToRelative(-4.917f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, 1.5f, -2.583f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcToRelative(2.993f, 2.993f, 0.0f, false, false, 1.5f, 2.583f)
                verticalLineToRelative(4.917f)
                horizontalLineToRelative(-1.038f)
                arcToRelative(6.061f, 6.061f, 0.0f, false, false, -1.54f, -2.368f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, true, -1.871f, -5.313f)
                arcToRelative(6.087f, 6.087f, 0.0f, false, true, 5.249f, -5.278f)
                arcToRelative(5.989f, 5.989f, 0.0f, false, true, 0.7f, -0.041f)
                arcToRelative(5.861f, 5.861f, 0.0f, false, true, 3.94f, 1.509f)
                arcToRelative(6.222f, 6.222f, 0.0f, false, true, 0.005f, 9.246f)
                close()
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null
