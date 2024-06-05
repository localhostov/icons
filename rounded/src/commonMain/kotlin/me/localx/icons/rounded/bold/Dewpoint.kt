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

public val Icons.Bold.Dewpoint: ImageVector
    get() {
        if (_dewpoint != null) {
            return _dewpoint!!
        }
        _dewpoint = Builder(name = "Dewpoint", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 24.0f)
                arcToRelative(9.893f, 9.893f, 0.0f, false, true, -7.077f, -2.961f)
                curveTo(-4.04f, 14.063f, 3.4f, 4.954f, 6.542f, 1.569f)
                arcTo(4.571f, 4.571f, 0.0f, false, true, 10.008f, 0.0f)
                arcToRelative(4.617f, 4.617f, 0.0f, false, true, 3.511f, 1.625f)
                curveTo(16.648f, 5.0f, 24.016f, 14.088f, 17.077f, 21.039f)
                arcTo(9.893f, 9.893f, 0.0f, false, true, 10.0f, 24.0f)
                close()
                moveTo(10.005f, 3.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -1.23f, 0.57f)
                curveTo(5.674f, 7.056f, 0.011f, 13.982f, 5.056f, 18.929f)
                arcToRelative(6.969f, 6.969f, 0.0f, false, false, 9.888f, 0.0f)
                curveToRelative(5.039f, -4.923f, -0.613f, -11.879f, -3.663f, -15.3f)
                arcTo(1.643f, 1.643f, 0.0f, false, false, 10.006f, 3.0f)
                close()
                moveTo(21.5f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.5f, 5.0f)
                close()
            }
        }
        .build()
        return _dewpoint!!
    }

private var _dewpoint: ImageVector? = null
