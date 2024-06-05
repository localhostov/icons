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

public val Icons.Filled.EngineWarning: ImageVector
    get() {
        if (_engineWarning != null) {
            return _engineWarning!!
        }
        _engineWarning = Builder(name = "EngineWarning", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.484f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.77f, -1.637f)
                arcToRelative(10.052f, 10.052f, 0.0f, false, false, 0.0f, -12.726f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.543f, -1.274f)
                arcToRelative(12.068f, 12.068f, 0.0f, false, true, 0.0f, 15.274f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.484f, 20.0f)
                close()
                moveTo(4.151f, 19.771f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.135f, -1.408f)
                arcToRelative(10.052f, 10.052f, 0.0f, false, true, 0.0f, -12.726f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.744f, 4.363f)
                arcToRelative(12.065f, 12.065f, 0.0f, false, false, 0.0f, 15.274f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.407f, 0.134f)
                close()
                moveTo(20.0f, 12.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, true, -8.0f, 8.0f)
                curveTo(1.412f, 19.624f, 1.415f, 4.374f, 12.0f, 4.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, true, 20.0f, 12.0f)
                close()
                moveTo(13.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 16.0f)
                close()
                moveTo(13.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _engineWarning!!
    }

private var _engineWarning: ImageVector? = null
