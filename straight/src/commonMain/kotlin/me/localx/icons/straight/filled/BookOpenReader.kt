package me.localx.icons.straight.filled

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

public val Icons.Filled.BookOpenReader: ImageVector
    get() {
        if (_bookOpenReader != null) {
            return _bookOpenReader!!
        }
        _bookOpenReader = Builder(name = "BookOpenReader", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, -2.019f, -4.5f, -4.5f)
                reflectiveCurveTo(9.519f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.019f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(22.922f, 9.681f)
                curveToRelative(-0.686f, -0.572f, -1.579f, -0.808f, -2.516f, -0.636f)
                lineToRelative(-4.122f, 1.003f)
                curveToRelative(-1.903f, 0.346f, -3.284f, 2.001f, -3.284f, 3.936f)
                verticalLineToRelative(7.802f)
                lineToRelative(-1.0f, 0.182f)
                lineToRelative(-1.0f, -0.182f)
                verticalLineToRelative(-7.802f)
                curveToRelative(0.0f, -1.935f, -1.381f, -3.589f, -3.227f, -3.923f)
                lineToRelative(-4.237f, -1.028f)
                curveToRelative(-0.881f, -0.162f, -1.774f, 0.077f, -2.458f, 0.648f)
                curveToRelative(-0.686f, 0.572f, -1.078f, 1.411f, -1.078f, 2.303f)
                verticalLineToRelative(9.834f)
                lineToRelative(12.0f, 2.182f)
                lineToRelative(12.0f, -2.182f)
                lineTo(24.0f, 11.984f)
                curveToRelative(0.0f, -0.892f, -0.393f, -1.731f, -1.078f, -2.303f)
                close()
            }
        }
        .build()
        return _bookOpenReader!!
    }

private var _bookOpenReader: ImageVector? = null
