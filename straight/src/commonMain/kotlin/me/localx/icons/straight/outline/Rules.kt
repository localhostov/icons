package me.localx.icons.straight.outline

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

public val Icons.Outline.Rules: ImageVector
    get() {
        if (_rules != null) {
            return _rules!!
        }
        _rules = Builder(name = "Rules", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.922f, 1.67f)
                curveToRelative(-0.684f, -0.571f, -1.577f, -0.807f, -2.458f, -0.648f)
                lineToRelative(-6.18f, 1.124f)
                curveToRelative(-0.913f, 0.166f, -1.707f, 0.634f, -2.284f, 1.289f)
                curveToRelative(-0.578f, -0.655f, -1.371f, -1.123f, -2.285f, -1.289f)
                lineTo(3.537f, 1.021f)
                curveToRelative(-0.877f, -0.161f, -1.774f, 0.076f, -2.459f, 0.648f)
                curveToRelative(-0.685f, 0.572f, -1.078f, 1.411f, -1.078f, 2.303f)
                verticalLineToRelative(16.834f)
                lineToRelative(12.0f, 2.182f)
                lineToRelative(12.0f, -2.182f)
                lineTo(24.0f, 3.973f)
                curveToRelative(0.0f, -0.892f, -0.393f, -1.732f, -1.078f, -2.303f)
                close()
                moveTo(11.0f, 20.774f)
                lineToRelative(-9.0f, -1.636f)
                lineTo(2.0f, 3.973f)
                curveToRelative(0.0f, -0.407f, 0.225f, -0.656f, 0.359f, -0.768f)
                curveToRelative(0.134f, -0.112f, 0.415f, -0.29f, 0.82f, -0.216f)
                lineToRelative(6.179f, 1.124f)
                curveToRelative(0.952f, 0.173f, 1.642f, 1.0f, 1.642f, 1.968f)
                verticalLineToRelative(14.694f)
                close()
                moveTo(22.0f, 19.138f)
                lineToRelative(-9.0f, 1.636f)
                lineTo(13.0f, 6.081f)
                curveToRelative(0.0f, -0.967f, 0.69f, -1.795f, 1.642f, -1.968f)
                lineToRelative(6.18f, -1.124f)
                curveToRelative(0.407f, -0.071f, 0.686f, 0.104f, 0.819f, 0.216f)
                curveToRelative(0.135f, 0.112f, 0.359f, 0.361f, 0.359f, 0.768f)
                verticalLineToRelative(15.165f)
                close()
                moveTo(8.724f, 8.996f)
                lineToRelative(1.398f, 1.43f)
                lineToRelative(-3.113f, 3.221f)
                curveToRelative(-0.459f, 0.474f, -1.22f, 0.471f, -1.675f, -0.007f)
                lineToRelative(-2.037f, -2.152f)
                lineToRelative(1.387f, -1.441f)
                lineToRelative(1.496f, 1.581f)
                lineToRelative(2.543f, -2.631f)
                close()
                moveTo(20.808f, 9.808f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.793f, 1.793f)
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
                close()
            }
        }
        .build()
        return _rules!!
    }

private var _rules: ImageVector? = null
