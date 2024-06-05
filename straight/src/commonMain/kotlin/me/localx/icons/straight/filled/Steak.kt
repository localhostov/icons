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

public val Icons.Filled.Steak: ImageVector
    get() {
        if (_steak != null) {
            return _steak!!
        }
        _steak = Builder(name = "Steak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 0.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 0.0f, 10.0f)
                curveToRelative(0.0f, 5.327f, 4.206f, 10.0f, 9.0f, 10.0f)
                arcToRelative(4.341f, 4.341f, 0.0f, false, true, 3.781f, 1.762f)
                arcTo(5.772f, 5.772f, 0.0f, false, false, 17.5f, 24.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 24.0f, 17.5f)
                curveTo(24.0f, 11.588f, 19.772f, 0.0f, 10.0f, 0.0f)
                close()
                moveTo(4.0f, 10.0f)
                arcTo(5.967f, 5.967f, 0.0f, false, true, 5.287f, 6.3f)
                lineTo(6.3f, 5.287f)
                arcTo(5.967f, 5.967f, 0.0f, false, true, 10.0f, 4.0f)
                curveToRelative(0.132f, 0.0f, 0.252f, 0.026f, 0.381f, 0.033f)
                lineTo(4.02f, 10.394f)
                curveTo(4.012f, 10.263f, 4.0f, 10.135f, 4.0f, 10.0f)
                close()
                moveTo(4.692f, 12.894f)
                lineTo(12.939f, 4.647f)
                arcTo(8.026f, 8.026f, 0.0f, false, true, 14.7f, 5.717f)
                lineTo(5.891f, 14.523f)
                arcTo(6.23f, 6.23f, 0.0f, false, true, 4.692f, 12.894f)
                close()
                moveTo(10.332f, 16.082f)
                arcTo(10.679f, 10.679f, 0.0f, false, false, 9.0f, 16.0f)
                arcToRelative(3.511f, 3.511f, 0.0f, false, true, -1.185f, -0.229f)
                lineTo(16.284f, 7.3f)
                arcToRelative(14.054f, 14.054f, 0.0f, false, true, 1.149f, 1.679f)
                close()
                moveTo(12.798f, 16.788f)
                lineTo(18.498f, 11.088f)
                arcToRelative(20.7f, 20.7f, 0.0f, false, true, 0.751f, 2.077f)
                lineToRelative(-4.723f, 4.723f)
                arcTo(7.765f, 7.765f, 0.0f, false, false, 12.8f, 16.788f)
                close()
                moveTo(19.638f, 18.776f)
                lineTo(18.776f, 19.638f)
                arcTo(2.47f, 2.47f, 0.0f, false, true, 17.5f, 20.0f)
                arcToRelative(1.531f, 1.531f, 0.0f, false, true, -1.38f, -0.534f)
                lineToRelative(3.725f, -3.725f)
                arcTo(11.848f, 11.848f, 0.0f, false, true, 20.0f, 17.5f)
                arcTo(2.47f, 2.47f, 0.0f, false, true, 19.638f, 18.776f)
                close()
            }
        }
        .build()
        return _steak!!
    }

private var _steak: ImageVector? = null
