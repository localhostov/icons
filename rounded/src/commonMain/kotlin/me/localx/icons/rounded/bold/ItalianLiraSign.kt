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

public val Icons.Bold.ItalianLiraSign: ImageVector
    get() {
        if (_italianLiraSign != null) {
            return _italianLiraSign!!
        }
        _italianLiraSign = Builder(name = "ItalianLiraSign", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 22.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                curveToRelative(0.74f, 0.0f, 1.5f, -0.76f, 1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.0f)
                curveTo(5.5f, 3.51f, 9.01f, 0.0f, 13.5f, 0.0f)
                curveToRelative(4.25f, 0.0f, 7.45f, 3.33f, 7.59f, 3.47f)
                curveToRelative(0.57f, 0.6f, 0.55f, 1.55f, -0.06f, 2.12f)
                curveToRelative(-0.6f, 0.57f, -1.55f, 0.55f, -2.12f, -0.05f)
                curveToRelative(-0.02f, -0.02f, -2.47f, -2.53f, -5.41f, -2.53f)
                reflectiveCurveToRelative(-5.0f, 2.2f, -5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.52f, -0.1f, 1.03f, -0.28f, 1.5f)
                horizontalLineToRelative(12.78f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _italianLiraSign!!
    }

private var _italianLiraSign: ImageVector? = null
