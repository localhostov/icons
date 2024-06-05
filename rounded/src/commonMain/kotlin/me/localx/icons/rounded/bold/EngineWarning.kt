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

public val Icons.Bold.EngineWarning: ImageVector
    get() {
        if (_engineWarning != null) {
            return _engineWarning!!
        }
        _engineWarning = Builder(name = "EngineWarning", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1f, 20.182f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.156f, -2.455f)
                arcToRelative(9.05f, 9.05f, 0.0f, false, false, 0.0f, -11.454f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.313f, -1.91f)
                arcToRelative(12.065f, 12.065f, 0.0f, false, true, 0.0f, 15.274f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.1f, 20.182f)
                close()
                moveTo(4.855f, 19.838f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.2f, -2.111f)
                arcToRelative(9.049f, 9.049f, 0.0f, false, true, 0.0f, -11.454f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.313f, -1.91f)
                arcToRelative(12.065f, 12.065f, 0.0f, false, false, 0.0f, 15.274f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.111f, 0.2f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(-0.3f, 9.251f, -13.707f, 9.249f, -14.0f, 0.0f)
                curveTo(5.294f, 2.749f, 18.707f, 2.751f, 19.0f, 12.0f)
                close()
                moveTo(13.5f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 15.5f)
                close()
                moveTo(13.5f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _engineWarning!!
    }

private var _engineWarning: ImageVector? = null
