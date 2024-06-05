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

public val Icons.Filled.HighlighterLine: ImageVector
    get() {
        if (_highlighterLine != null) {
            return _highlighterLine!!
        }
        _highlighterLine = Builder(name = "HighlighterLine", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 24.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(23.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(2.48f, 11.89f)
                curveToRelative(-0.31f, 0.73f, -0.48f, 1.53f, -0.48f, 2.34f)
                verticalLineToRelative(4.35f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.71f, -1.71f)
                horizontalLineTo(7.76f)
                curveToRelative(0.81f, 0.0f, 1.61f, -0.17f, 2.34f, -0.48f)
                lineTo(2.48f, 11.89f)
                close()
                moveTo(20.91f, 7.83f)
                lineToRelative(-8.67f, 10.15f)
                curveToRelative(-0.13f, 0.15f, -0.27f, 0.29f, -0.42f, 0.42f)
                lineTo(3.59f, 10.17f)
                curveToRelative(0.13f, -0.14f, 0.27f, -0.28f, 0.42f, -0.41f)
                lineTo(14.17f, 1.1f)
                curveToRelative(1.78f, -1.54f, 4.47f, -1.45f, 6.14f, 0.21f)
                lineToRelative(0.39f, 0.39f)
                curveToRelative(1.66f, 1.66f, 1.76f, 4.36f, 0.22f, 6.13f)
                close()
            }
        }
        .build()
        return _highlighterLine!!
    }

private var _highlighterLine: ImageVector? = null
