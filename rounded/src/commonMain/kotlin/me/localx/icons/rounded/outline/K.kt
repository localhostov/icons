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

public val Icons.Outline.K: ImageVector
    get() {
        if (_k != null) {
            return _k!!
        }
        _k = Builder(name = "K", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.781f, 22.375f)
                lineToRelative(-7.543f, -9.429f)
                lineTo(21.832f, 1.555f)
                curveToRelative(0.306f, -0.459f, 0.182f, -1.081f, -0.277f, -1.387f)
                curveToRelative(-0.46f, -0.308f, -1.081f, -0.182f, -1.387f, 0.277f)
                lineToRelative(-7.703f, 11.555f)
                horizontalLineTo(4.0f)
                verticalLineTo(1.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.307f, -2.0f, 0.0f)
                verticalLineTo(12.978f)
                curveToRelative(-0.005f, 0.015f, -0.005f, 0.028f, 0.0f, 0.044f)
                verticalLineToRelative(9.978f)
                curveToRelative(0.006f, 1.308f, 1.995f, 1.307f, 2.0f, 0.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.519f)
                lineToRelative(7.7f, 9.625f)
                curveToRelative(0.346f, 0.433f, 0.978f, 0.499f, 1.405f, 0.156f)
                curveToRelative(0.432f, -0.346f, 0.501f, -0.975f, 0.156f, -1.406f)
                close()
            }
        }
        .build()
        return _k!!
    }

private var _k: ImageVector? = null
