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

public val Icons.Filled.Olives: ImageVector
    get() {
        if (_olives != null) {
            return _olives!!
        }
        _olives = Builder(name = "Olives", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.038f, 7.1f)
                curveTo(18.33f, 3.452f, 20.407f, 3.0f, 22.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                curveToRelative(-0.192f, -1.845f, -3.136f, -0.733f, -4.025f, -0.324f)
                arcTo(21.274f, 21.274f, 0.0f, false, false, 10.75f, 0.0f)
                curveTo(7.972f, -0.045f, -0.356f, 1.249f, 2.624f, 3.386f)
                curveToRelative(2.723f, 1.561f, 10.438f, 2.184f, 14.089f, 0.773f)
                arcToRelative(8.606f, 8.606f, 0.0f, false, false, -0.679f, 2.923f)
                curveTo(7.589f, 8.427f, 8.2f, 23.938f, 17.0f, 24.0f)
                curveTo(25.771f, 23.941f, 26.416f, 8.523f, 18.038f, 7.1f)
                close()
                moveTo(16.0f, 21.0f)
                curveToRelative(-1.738f, 0.0f, -3.0f, -1.683f, -3.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                curveToRelative(0.0f, 1.1f, 0.449f, 2.0f, 1.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 21.0f)
                close()
                moveTo(11.787f, 6.839f)
                curveTo(6.19f, 3.374f, -1.284f, 10.9f, 0.163f, 17.029f)
                arcTo(6.428f, 6.428f, 0.0f, false, false, 9.4f, 21.266f)
                curveTo(6.861f, 16.985f, 7.917f, 9.629f, 11.787f, 6.839f)
                close()
                moveTo(5.76f, 14.069f)
                curveToRelative(-0.717f, 0.839f, -0.959f, 1.813f, -0.54f, 2.171f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.3f, 1.52f)
                curveToRelative(-1.32f, -1.13f, -1.185f, -3.229f, 0.321f, -4.989f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.76f, 14.069f)
                close()
            }
        }
        .build()
        return _olives!!
    }

private var _olives: ImageVector? = null
