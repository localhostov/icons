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

public val Icons.Outline.Steak: ImageVector
    get() {
        if (_steak != null) {
            return _steak!!
        }
        _steak = Builder(name = "Steak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.523f, 17.891f)
                arcToRelative(7.765f, 7.765f, 0.0f, false, false, -1.725f, -1.1f)
                lineToRelative(5.7f, -5.7f)
                arcToRelative(20.7f, 20.7f, 0.0f, false, true, 0.751f, 2.077f)
                close()
                moveTo(10.0f, 4.0f)
                arcTo(5.967f, 5.967f, 0.0f, false, false, 6.3f, 5.287f)
                lineTo(5.287f, 6.3f)
                arcTo(5.967f, 5.967f, 0.0f, false, false, 4.0f, 10.0f)
                curveToRelative(0.0f, 0.135f, 0.012f, 0.263f, 0.02f, 0.394f)
                lineToRelative(6.361f, -6.361f)
                curveTo(10.252f, 4.026f, 10.132f, 4.0f, 10.0f, 4.0f)
                close()
                moveTo(19.845f, 15.741f)
                lineTo(16.12f, 19.466f)
                arcTo(1.531f, 1.531f, 0.0f, false, false, 17.5f, 20.0f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, false, 1.276f, -0.362f)
                lineToRelative(0.862f, -0.862f)
                arcTo(2.47f, 2.47f, 0.0f, false, false, 20.0f, 17.5f)
                arcTo(11.848f, 11.848f, 0.0f, false, false, 19.845f, 15.741f)
                close()
                moveTo(12.939f, 4.647f)
                lineTo(4.692f, 12.894f)
                arcToRelative(6.23f, 6.23f, 0.0f, false, false, 1.2f, 1.629f)
                lineTo(14.7f, 5.717f)
                arcTo(8.026f, 8.026f, 0.0f, false, false, 12.939f, 4.647f)
                close()
                moveTo(16.284f, 7.3f)
                lineTo(7.815f, 15.771f)
                arcTo(3.511f, 3.511f, 0.0f, false, false, 9.0f, 16.0f)
                arcToRelative(10.679f, 10.679f, 0.0f, false, true, 1.332f, 0.082f)
                lineToRelative(7.1f, -7.1f)
                arcTo(14.054f, 14.054f, 0.0f, false, false, 16.284f, 7.3f)
                close()
                moveTo(24.0f, 17.5f)
                curveTo(24.0f, 11.588f, 19.772f, 0.0f, 10.0f, 0.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, false, 0.0f, 10.0f)
                curveToRelative(0.0f, 5.327f, 4.206f, 10.0f, 9.0f, 10.0f)
                arcToRelative(4.341f, 4.341f, 0.0f, false, true, 3.781f, 1.762f)
                arcTo(5.772f, 5.772f, 0.0f, false, false, 17.5f, 24.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, false, 24.0f, 17.5f)
                close()
                moveTo(22.0f, 17.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 17.5f, 22.0f)
                arcToRelative(3.794f, 3.794f, 0.0f, false, true, -3.258f, -1.6f)
                arcTo(6.3f, 6.3f, 0.0f, false, false, 9.0f, 18.0f)
                curveToRelative(-3.3f, 0.0f, -7.0f, -3.421f, -7.0f, -8.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, 8.0f, -8.0f)
                curveTo(18.547f, 2.0f, 22.0f, 12.938f, 22.0f, 17.5f)
                close()
            }
        }
        .build()
        return _steak!!
    }

private var _steak: ImageVector? = null
