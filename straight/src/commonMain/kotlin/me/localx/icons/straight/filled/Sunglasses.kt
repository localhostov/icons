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

public val Icons.Filled.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) {
            return _sunglasses!!
        }
        _sunglasses = Builder(name = "Sunglasses", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.896f, 13.749f)
                lineToRelative(-1.654f, -11.188f)
                curveToRelative(-0.217f, -1.459f, -1.492f, -2.561f, -2.968f, -2.561f)
                horizontalLineToRelative(-3.274f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.274f)
                curveToRelative(0.492f, 0.0f, 0.917f, 0.367f, 0.989f, 0.854f)
                lineToRelative(1.5f, 10.146f)
                horizontalLineToRelative(-4.764f)
                curveToRelative(-1.474f, 0.0f, -2.75f, 0.81f, -3.444f, 2.0f)
                horizontalLineToRelative(-3.113f)
                curveToRelative(-0.694f, -1.19f, -1.97f, -2.0f, -3.444f, -2.0f)
                horizontalLineTo(2.236f)
                lineTo(3.736f, 2.854f)
                curveToRelative(0.072f, -0.487f, 0.497f, -0.854f, 0.989f, -0.854f)
                horizontalLineToRelative(3.274f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.274f)
                curveTo(3.25f, 0.0f, 1.975f, 1.101f, 1.758f, 2.561f)
                lineTo(0.104f, 13.744f)
                curveToRelative(-0.069f, 0.453f, -0.104f, 0.913f, -0.104f, 1.368f)
                verticalLineToRelative(4.888f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                verticalLineToRelative(-4.888f)
                curveToRelative(0.0f, -0.455f, -0.035f, -0.915f, -0.104f, -1.363f)
                close()
            }
        }
        .build()
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
