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

public val Icons.Filled.Rules: ImageVector
    get() {
        if (_rules != null) {
            return _rules!!
        }
        _rules = Builder(name = "Rules", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.922f, 1.726f)
                curveToRelative(-0.686f, -0.572f, -1.579f, -0.808f, -2.516f, -0.636f)
                lineToRelative(-4.122f, 1.003f)
                curveToRelative(-1.903f, 0.346f, -3.284f, 2.001f, -3.284f, 3.936f)
                verticalLineToRelative(14.802f)
                lineToRelative(-1.0f, 0.182f)
                lineToRelative(-1.0f, -0.182f)
                lineTo(11.0f, 6.029f)
                curveToRelative(0.0f, -1.935f, -1.381f, -3.589f, -3.227f, -3.923f)
                lineTo(3.536f, 1.078f)
                curveToRelative(-0.881f, -0.162f, -1.774f, 0.077f, -2.458f, 0.648f)
                curveToRelative(-0.686f, 0.572f, -1.078f, 1.411f, -1.078f, 2.303f)
                verticalLineToRelative(16.834f)
                lineToRelative(12.0f, 2.182f)
                lineToRelative(12.0f, -2.182f)
                lineTo(24.0f, 4.029f)
                curveToRelative(0.0f, -0.892f, -0.393f, -1.731f, -1.078f, -2.303f)
                close()
                moveTo(5.887f, 13.647f)
                curveToRelative(-0.459f, 0.474f, -1.22f, 0.471f, -1.674f, -0.007f)
                lineToRelative(-2.037f, -2.152f)
                lineToRelative(1.387f, -1.441f)
                lineToRelative(1.496f, 1.581f)
                lineToRelative(2.543f, -2.631f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.113f, 3.221f)
                close()
                moveTo(21.914f, 13.394f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.793f, 1.793f)
                close()
            }
        }
        .build()
        return _rules!!
    }

private var _rules: ImageVector? = null
