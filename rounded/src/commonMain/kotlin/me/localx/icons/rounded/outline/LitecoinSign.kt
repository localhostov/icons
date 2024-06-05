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

public val Icons.Outline.LitecoinSign: ImageVector
    get() {
        if (_litecoinSign != null) {
            return _litecoinSign!!
        }
        _litecoinSign = Builder(name = "LitecoinSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 23.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                verticalLineToRelative(-6.01f)
                lineToRelative(-2.66f, 0.95f)
                curveToRelative(-0.11f, 0.04f, -0.22f, 0.06f, -0.34f, 0.06f)
                curveToRelative(-0.41f, 0.0f, -0.8f, -0.25f, -0.94f, -0.66f)
                curveToRelative(-0.19f, -0.52f, 0.09f, -1.09f, 0.61f, -1.28f)
                lineToRelative(3.34f, -1.19f)
                verticalLineTo(1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(10.15f)
                lineToRelative(8.66f, -3.09f)
                curveToRelative(0.52f, -0.19f, 1.09f, 0.08f, 1.28f, 0.61f)
                curveToRelative(0.19f, 0.52f, -0.09f, 1.09f, -0.61f, 1.28f)
                lineToRelative(-9.34f, 3.33f)
                verticalLineToRelative(6.72f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _litecoinSign!!
    }

private var _litecoinSign: ImageVector? = null
