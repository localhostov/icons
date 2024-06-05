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

public val Icons.Outline.Z: ImageVector
    get() {
        if (_z != null) {
            return _z!!
        }
        _z = Builder(name = "Z", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 24.0f)
                horizontalLineTo(5.912f)
                curveToRelative(-1.725f, 0.0f, -3.186f, -1.06f, -3.723f, -2.698f)
                curveToRelative(-0.537f, -1.64f, 0.016f, -3.358f, 1.407f, -4.379f)
                lineTo(19.222f, 5.464f)
                curveToRelative(0.827f, -0.606f, 0.897f, -1.505f, 0.688f, -2.144f)
                curveToRelative(-0.209f, -0.638f, -0.797f, -1.32f, -1.822f, -1.32f)
                horizontalLineTo(3.0f)
                curveTo(1.692f, 1.994f, 1.693f, 0.005f, 3.0f, 0.0f)
                horizontalLineToRelative(15.088f)
                curveToRelative(1.725f, 0.0f, 3.186f, 1.06f, 3.723f, 2.698f)
                curveToRelative(0.537f, 1.64f, -0.016f, 3.358f, -1.407f, 4.379f)
                lineTo(4.778f, 18.536f)
                curveToRelative(-0.827f, 0.606f, -0.897f, 1.505f, -0.688f, 2.144f)
                curveToRelative(0.209f, 0.638f, 0.797f, 1.32f, 1.822f, 1.32f)
                horizontalLineToRelative(15.088f)
                curveToRelative(1.308f, 0.006f, 1.307f, 1.995f, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _z!!
    }

private var _z: ImageVector? = null
