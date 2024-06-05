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

public val Icons.Filled.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.631f, 4.44f)
                arcTo(3.017f, 3.017f, 0.0f, false, false, 21.0f, 0.0f)
                curveToRelative(-1.016f, -0.043f, -1.956f, 0.867f, -2.932f, 0.477f)
                curveTo(13.51f, -0.423f, 8.631f, -0.4f, 3.874f, 3.874f)
                curveTo(-0.407f, 8.639f, -0.417f, 13.5f, 0.477f, 18.069f)
                curveTo(0.869f, 19.051f, -0.043f, 19.977f, 0.0f, 21.0f)
                arcToRelative(3.018f, 3.018f, 0.0f, false, false, 4.44f, 2.632f)
                arcToRelative(2.122f, 2.122f, 0.0f, false, true, 1.458f, -0.1f)
                curveToRelative(4.564f, 0.882f, 9.464f, 0.879f, 14.228f, -3.407f)
                curveToRelative(4.306f, -4.809f, 4.276f, -9.62f, 3.407f, -14.227f)
                arcTo(2.129f, 2.129f, 0.0f, false, true, 23.631f, 4.44f)
                close()
                moveTo(15.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 11.0f)
                close()
                moveTo(17.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 14.0f)
                close()
                moveTo(19.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 11.0f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
