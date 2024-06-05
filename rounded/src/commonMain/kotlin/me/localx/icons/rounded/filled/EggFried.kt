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

public val Icons.Filled.EggFried: ImageVector
    get() {
        if (_eggFried != null) {
            return _eggFried!!
        }
        _eggFried = Builder(name = "EggFried", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -7.0f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 13.0f, 10.5f)
                close()
                moveTo(24.0f, 11.5f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, true, -2.342f, 4.99f)
                arcToRelative(2.534f, 2.534f, 0.0f, false, false, -0.829f, 1.389f)
                arcTo(8.223f, 8.223f, 0.0f, false, true, 13.0f, 24.0f)
                arcTo(13.015f, 13.015f, 0.0f, false, true, 0.0f, 11.0f)
                arcTo(10.226f, 10.226f, 0.0f, false, true, 9.549f, 0.01f)
                arcToRelative(9.943f, 9.943f, 0.0f, false, true, 8.763f, 4.446f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, 1.212f, 0.866f)
                arcTo(6.486f, 6.486f, 0.0f, false, true, 24.0f, 11.5f)
                close()
                moveTo(13.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 19.0f)
                close()
                moveTo(15.0f, 10.5f)
                curveToRelative(-0.231f, -7.268f, -10.77f, -7.267f, -11.0f, 0.0f)
                curveTo(4.231f, 17.768f, 14.77f, 17.767f, 15.0f, 10.5f)
                close()
                moveTo(16.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 17.0f)
                close()
                moveTo(20.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
