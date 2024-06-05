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

public val Icons.Outline.HexagonCheck: ImageVector
    get() {
        if (_hexagonCheck != null) {
            return _hexagonCheck!!
        }
        _hexagonCheck = Builder(name = "HexagonCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.214f, 9.098f)
                curveToRelative(0.387f, 0.394f, 0.381f, 1.027f, -0.014f, 1.414f)
                lineToRelative(-4.426f, 4.345f)
                curveToRelative(-0.783f, 0.768f, -1.791f, 1.151f, -2.799f, 1.151f)
                curveToRelative(-0.998f, 0.0f, -1.997f, -0.376f, -2.777f, -1.129f)
                lineToRelative(-1.899f, -1.868f)
                curveToRelative(-0.394f, -0.387f, -0.399f, -1.02f, -0.012f, -1.414f)
                curveToRelative(0.387f, -0.395f, 1.019f, -0.4f, 1.414f, -0.012f)
                lineToRelative(1.893f, 1.861f)
                curveToRelative(0.778f, 0.75f, 2.002f, 0.746f, 2.781f, -0.018f)
                lineToRelative(4.425f, -4.344f)
                curveToRelative(0.393f, -0.388f, 1.024f, -0.381f, 1.414f, 0.013f)
                close()
                moveTo(23.357f, 14.52f)
                lineToRelative(-3.5f, 6.0f)
                curveToRelative(-0.894f, 1.53f, -2.548f, 2.48f, -4.319f, 2.48f)
                horizontalLineToRelative(-7.072f)
                curveToRelative(-1.771f, 0.0f, -3.426f, -0.951f, -4.319f, -2.48f)
                lineTo(0.646f, 14.52f)
                curveToRelative(-0.907f, -1.554f, -0.907f, -3.485f, 0.0f, -5.039f)
                lineToRelative(3.5f, -6.0f)
                curveToRelative(0.893f, -1.53f, 2.547f, -2.48f, 4.319f, -2.48f)
                horizontalLineToRelative(7.072f)
                curveToRelative(1.771f, 0.0f, 3.426f, 0.951f, 4.318f, 2.48f)
                lineToRelative(3.501f, 6.0f)
                curveToRelative(0.906f, 1.554f, 0.906f, 3.485f, 0.0f, 5.039f)
                close()
                moveTo(21.628f, 10.489f)
                lineToRelative(-3.5f, -6.0f)
                curveToRelative(-0.535f, -0.918f, -1.528f, -1.488f, -2.591f, -1.488f)
                horizontalLineToRelative(-7.072f)
                curveToRelative(-1.063f, 0.0f, -2.056f, 0.57f, -2.591f, 1.488f)
                lineToRelative(-3.5f, 6.0f)
                curveToRelative(-0.544f, 0.933f, -0.544f, 2.091f, 0.0f, 3.023f)
                lineToRelative(3.5f, 6.0f)
                curveToRelative(0.536f, 0.918f, 1.528f, 1.488f, 2.591f, 1.488f)
                horizontalLineToRelative(7.072f)
                curveToRelative(1.062f, 0.0f, 2.056f, -0.57f, 2.592f, -1.488f)
                lineToRelative(3.499f, -6.0f)
                curveToRelative(0.544f, -0.933f, 0.544f, -2.091f, 0.0f, -3.023f)
                close()
            }
        }
        .build()
        return _hexagonCheck!!
    }

private var _hexagonCheck: ImageVector? = null
