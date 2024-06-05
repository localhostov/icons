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

public val Icons.Outline.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 13.0f)
                close()
                moveTo(15.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 9.0f)
                close()
                moveTo(19.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 9.0f)
                close()
                moveTo(23.533f, 5.9f)
                curveTo(26.189f, 17.546f, 17.542f, 26.191f, 5.9f, 23.533f)
                curveToRelative(-0.951f, -0.382f, -1.9f, 0.51f, -2.9f, 0.467f)
                arcTo(3.016f, 3.016f, 0.0f, false, true, 0.378f, 19.545f)
                arcToRelative(2.131f, 2.131f, 0.0f, false, false, 0.1f, -1.476f)
                curveToRelative(-0.9f, -4.563f, -0.882f, -9.434f, 3.4f, -14.195f)
                curveTo(8.634f, -0.4f, 13.505f, -0.421f, 18.068f, 0.477f)
                arcToRelative(2.138f, 2.138f, 0.0f, false, false, 1.478f, -0.1f)
                arcTo(3.017f, 3.017f, 0.0f, false, true, 24.0f, 3.0f)
                curveTo(24.043f, 4.0f, 23.152f, 4.941f, 23.533f, 5.9f)
                close()
                moveTo(21.878f, 3.48f)
                arcTo(1.006f, 1.006f, 0.0f, false, false, 21.0f, 2.0f)
                curveToRelative(-1.1f, 0.337f, -2.075f, 0.829f, -3.41f, 0.419f)
                curveTo(9.416f, 0.477f, 1.9f, 5.229f, 2.005f, 14.013f)
                curveToRelative(-0.23f, 2.092f, 1.22f, 4.6f, 0.119f, 6.507f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.354f, 1.358f)
                curveTo(5.4f, 20.8f, 7.865f, 22.239f, 9.987f, 22.0f)
                curveToRelative(2.059f, -0.027f, 5.93f, -0.49f, 8.724f, -3.284f)
                reflectiveCurveTo(21.968f, 12.046f, 22.0f, 9.987f)
                curveTo(22.23f, 7.855f, 20.8f, 5.4f, 21.878f, 3.478f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
