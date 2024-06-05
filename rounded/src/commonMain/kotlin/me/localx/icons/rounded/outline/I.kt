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

public val Icons.Outline.I: ImageVector
    get() {
        if (_i != null) {
            return _i!!
        }
        _i = Builder(name = "I", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.308f, -0.006f, 1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.308f, 0.006f, -1.307f, 1.995f, 0.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.308f, 0.006f, -1.307f, 1.995f, 0.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.308f, -0.006f, 1.307f, -1.995f, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _i!!
    }

private var _i: ImageVector? = null
