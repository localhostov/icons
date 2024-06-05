package me.localx.icons.straight.bold

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

public val Icons.Bold.Jam: ImageVector
    get() {
        if (_jam != null) {
            return _jam!!
        }
        _jam = Builder(name = "Jam", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.929f, 8.35f)
                curveToRelative(-0.023f, -0.208f, -0.559f, -4.6f, -3.97f, -5.981f)
                verticalLineTo(0.0f)
                horizontalLineTo(4.041f)
                verticalLineTo(2.369f)
                curveTo(0.63f, 3.748f, 0.094f, 8.142f, 0.071f, 8.35f)
                lineTo(0.0f, 8.991f)
                lineToRelative(0.415f, 0.493f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, false, 1.636f, 1.254f)
                verticalLineTo(20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.533f, 24.0f)
                horizontalLineTo(18.467f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.482f, -3.5f)
                verticalLineTo(10.738f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, false, 1.636f, -1.254f)
                lineTo(24.0f, 8.991f)
                close()
                moveTo(5.69f, 5.0f)
                horizontalLineTo(18.31f)
                curveToRelative(1.573f, 0.264f, 2.247f, 1.969f, 2.507f, 2.965f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.27f, 0.035f)
                arcToRelative(1.286f, 1.286f, 0.0f, false, true, -0.81f, -0.287f)
                arcToRelative(3.279f, 3.279f, 0.0f, false, false, -4.078f, 0.0f)
                arcToRelative(1.283f, 1.283f, 0.0f, false, true, -1.62f, 0.0f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, -4.077f, 0.0f)
                arcToRelative(1.284f, 1.284f, 0.0f, false, true, -1.621f, 0.0f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, -4.077f, 0.0f)
                arcTo(1.286f, 1.286f, 0.0f, false, true, 3.453f, 8.0f)
                arcToRelative(0.743f, 0.743f, 0.0f, false, true, -0.269f, -0.035f)
                curveTo(3.444f, 6.967f, 4.118f, 5.264f, 5.69f, 5.0f)
                close()
                moveTo(18.467f, 21.0f)
                horizontalLineTo(5.533f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineTo(10.68f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 1.09f, -0.623f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.354f, 0.0f)
                arcToRelative(4.376f, 4.376f, 0.0f, false, false, 5.343f, 0.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.355f, 0.0f)
                arcToRelative(4.374f, 4.374f, 0.0f, false, false, 5.342f, 0.0f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, 0.355f, 0.0f)
                arcToRelative(4.318f, 4.318f, 0.0f, false, false, 1.089f, 0.622f)
                verticalLineTo(20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 18.467f, 21.0f)
                close()
            }
        }
        .build()
        return _jam!!
    }

private var _jam: ImageVector? = null
