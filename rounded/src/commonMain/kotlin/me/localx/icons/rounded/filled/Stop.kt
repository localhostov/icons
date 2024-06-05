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

public val Icons.Filled.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.667f, 0.0f)
                horizontalLineToRelative(298.667f)
                curveTo(464.244f, 0.0f, 512.0f, 47.756f, 512.0f, 106.667f)
                verticalLineToRelative(298.667f)
                curveTo(512.0f, 464.244f, 464.244f, 512.0f, 405.333f, 512.0f)
                horizontalLineTo(106.667f)
                curveTo(47.756f, 512.0f, 0.0f, 464.244f, 0.0f, 405.333f)
                verticalLineTo(106.667f)
                curveTo(0.0f, 47.756f, 47.756f, 0.0f, 106.667f, 0.0f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
