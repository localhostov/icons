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

public val Icons.Bold.LitecoinSign: ImageVector
    get() {
        if (_litecoinSign != null) {
            return _litecoinSign!!
        }
        _litecoinSign = Builder(name = "LitecoinSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(9.5f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-4.87f)
                lineToRelative(-1.95f, 0.77f)
                curveToRelative(-0.18f, 0.07f, -0.37f, 0.1f, -0.55f, 0.1f)
                curveToRelative(-0.6f, 0.0f, -1.16f, -0.36f, -1.4f, -0.95f)
                curveToRelative(-0.3f, -0.77f, 0.08f, -1.64f, 0.85f, -1.95f)
                lineToRelative(3.05f, -1.2f)
                verticalLineTo(1.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.73f)
                lineToRelative(7.95f, -3.12f)
                curveToRelative(0.77f, -0.3f, 1.64f, 0.08f, 1.94f, 0.85f)
                curveToRelative(0.3f, 0.77f, -0.08f, 1.64f, -0.85f, 1.95f)
                lineToRelative(-9.05f, 3.55f)
                verticalLineToRelative(6.05f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _litecoinSign!!
    }

private var _litecoinSign: ImageVector? = null
