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

public val Icons.Outline.H: ImageVector
    get() {
        if (_h != null) {
            return _h!!
        }
        _h = Builder(name = "H", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(1.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.307f, -2.0f, 0.0f)
                verticalLineTo(23.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.307f, 2.0f, 0.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.006f, 1.308f, 1.995f, 1.307f, 2.0f, 0.0f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _h!!
    }

private var _h: ImageVector? = null
