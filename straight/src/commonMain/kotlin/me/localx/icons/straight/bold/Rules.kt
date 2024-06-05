package me.localx.icons.straight.bold

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

public val Icons.Bold.Rules: ImageVector
    get() {
        if (_rules != null) {
            return _rules!!
        }
        _rules = Builder(name = "Rules", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.775f, 1.735f)
                curveToRelative(-0.778f, -0.649f, -1.798f, -0.916f, -2.795f, -0.737f)
                lineToRelative(-5.897f, 1.072f)
                curveToRelative(-0.795f, 0.145f, -1.507f, 0.499f, -2.083f, 1.0f)
                curveToRelative(-0.576f, -0.501f, -1.288f, -0.855f, -2.083f, -1.0f)
                lineTo(4.019f, 0.998f)
                curveToRelative(-0.998f, -0.178f, -2.016f, 0.088f, -2.794f, 0.737f)
                curveToRelative(-0.778f, 0.649f, -1.225f, 1.604f, -1.225f, 2.617f)
                verticalLineToRelative(16.524f)
                lineToRelative(12.0f, 2.182f)
                lineToRelative(12.0f, -2.182f)
                lineTo(24.0f, 4.352f)
                curveToRelative(0.0f, -1.014f, -0.446f, -1.968f, -1.225f, -2.617f)
                close()
                moveTo(10.5f, 19.736f)
                lineToRelative(-7.5f, -1.364f)
                lineTo(3.0f, 4.352f)
                curveToRelative(0.0f, -0.158f, 0.08f, -0.258f, 0.147f, -0.314f)
                curveToRelative(0.055f, -0.046f, 0.169f, -0.116f, 0.335f, -0.089f)
                lineToRelative(5.898f, 1.072f)
                curveToRelative(0.648f, 0.118f, 1.12f, 0.683f, 1.12f, 1.342f)
                verticalLineToRelative(13.373f)
                close()
                moveTo(21.0f, 18.372f)
                lineToRelative(-7.5f, 1.364f)
                lineTo(13.5f, 6.363f)
                curveToRelative(0.0f, -0.659f, 0.471f, -1.224f, 1.12f, -1.342f)
                lineToRelative(5.897f, -1.072f)
                curveToRelative(0.16f, -0.028f, 0.28f, 0.042f, 0.336f, 0.088f)
                curveToRelative(0.066f, 0.056f, 0.146f, 0.156f, 0.146f, 0.314f)
                verticalLineToRelative(14.02f)
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
