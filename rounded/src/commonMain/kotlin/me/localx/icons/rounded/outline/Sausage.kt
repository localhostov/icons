package me.localx.icons.rounded.outline

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

public val Icons.Outline.Sausage: ImageVector
    get() {
        if (_sausage != null) {
            return _sausage!!
        }
        _sausage = Builder(name = "Sausage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.83f, 3.36f)
                curveTo(21.816f, 2.73f, 22.8f, 0.207f, 21.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                curveToRelative(-1.8f, 0.207f, -0.817f, 2.723f, 0.165f, 3.356f)
                arcTo(4.925f, 4.925f, 0.0f, false, false, 14.0f, 7.905f)
                curveToRelative(-0.056f, 2.2f, -3.616f, 5.929f, -6.081f, 6.111f)
                arcToRelative(5.008f, 5.008f, 0.0f, false, false, -4.566f, 3.148f)
                curveTo(2.723f, 16.182f, 0.206f, 15.2f, 0.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                curveToRelative(0.208f, 1.8f, 2.727f, 0.816f, 3.359f, -0.169f)
                curveToRelative(1.955f, 4.906f, 9.267f, 3.965f, 15.51f, -1.946f)
                curveTo(24.83f, 12.63f, 25.724f, 5.333f, 20.83f, 3.36f)
                close()
                moveTo(17.457f, 17.469f)
                curveTo(13.155f, 21.761f, 8.82f, 22.0f, 8.0f, 22.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.073f, -5.989f)
                curveToRelative(3.386f, -0.181f, 7.908f, -4.877f, 7.928f, -8.055f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.073f)
                curveTo(22.0f, 8.849f, 21.781f, 13.156f, 17.457f, 17.469f)
                close()
            }
        }
        .build()
        return _sausage!!
    }

private var _sausage: ImageVector? = null
