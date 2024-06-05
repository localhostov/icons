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

public val Icons.Outline.BookOpenReader: ImageVector
    get() {
        if (_bookOpenReader != null) {
            return _bookOpenReader!!
        }
        _bookOpenReader = Builder(name = "BookOpenReader", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.922f, 9.689f)
                curveToRelative(-0.684f, -0.571f, -1.577f, -0.807f, -2.458f, -0.648f)
                lineToRelative(-6.18f, 1.124f)
                curveToRelative(-0.913f, 0.166f, -1.707f, 0.634f, -2.284f, 1.289f)
                curveToRelative(-0.578f, -0.655f, -1.371f, -1.123f, -2.285f, -1.289f)
                lineToRelative(-6.179f, -1.124f)
                curveToRelative(-0.879f, -0.16f, -1.774f, 0.077f, -2.459f, 0.648f)
                reflectiveCurveToRelative(-1.078f, 1.411f, -1.078f, 2.303f)
                verticalLineToRelative(9.834f)
                lineToRelative(12.0f, 2.182f)
                lineToRelative(12.0f, -2.182f)
                lineTo(23.999f, 11.992f)
                curveToRelative(0.0f, -0.892f, -0.393f, -1.731f, -1.078f, -2.303f)
                close()
                moveTo(11.0f, 21.793f)
                lineToRelative(-9.0f, -1.636f)
                lineTo(2.0f, 11.992f)
                curveToRelative(0.0f, -0.407f, 0.225f, -0.656f, 0.359f, -0.768f)
                curveToRelative(0.134f, -0.112f, 0.417f, -0.289f, 0.82f, -0.216f)
                lineToRelative(6.179f, 1.124f)
                curveToRelative(0.952f, 0.173f, 1.642f, 1.0f, 1.642f, 1.968f)
                verticalLineToRelative(7.694f)
                close()
                moveTo(22.0f, 20.157f)
                lineToRelative(-9.0f, 1.636f)
                verticalLineToRelative(-7.694f)
                curveToRelative(0.0f, -0.967f, 0.69f, -1.795f, 1.642f, -1.968f)
                lineToRelative(6.18f, -1.124f)
                curveToRelative(0.407f, -0.07f, 0.686f, 0.104f, 0.819f, 0.216f)
                reflectiveCurveToRelative(0.359f, 0.36f, 0.359f, 0.768f)
                verticalLineToRelative(8.165f)
                close()
                moveTo(12.0f, 9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveTo(14.481f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(7.5f, 2.019f, 7.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.121f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _bookOpenReader!!
    }

private var _bookOpenReader: ImageVector? = null
