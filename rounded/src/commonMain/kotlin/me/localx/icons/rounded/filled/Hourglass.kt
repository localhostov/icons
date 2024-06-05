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

public val Icons.Filled.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 24.0f)
                horizontalLineToRelative(-9.995f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, true, -3.045f, -1.4f)
                arcToRelative(3.945f, 3.945f, 0.0f, false, true, -0.916f, -3.158f)
                arcToRelative(12.517f, 12.517f, 0.0f, false, true, 4.401f, -7.442f)
                arcToRelative(12.517f, 12.517f, 0.0f, false, true, -4.4f, -7.444f)
                arcToRelative(3.945f, 3.945f, 0.0f, false, true, 0.915f, -3.156f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, true, 3.045f, -1.4f)
                horizontalLineToRelative(9.995f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, 3.044f, 1.4f)
                arcToRelative(3.943f, 3.943f, 0.0f, false, true, 0.918f, 3.155f)
                arcToRelative(12.556f, 12.556f, 0.0f, false, true, -4.411f, 7.445f)
                arcToRelative(12.557f, 12.557f, 0.0f, false, true, 4.406f, 7.448f)
                arcToRelative(3.944f, 3.944f, 0.0f, false, true, -0.918f, 3.156f)
                arcToRelative(4.017f, 4.017f, 0.0f, false, true, -3.039f, 1.396f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
