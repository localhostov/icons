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

public val Icons.Outline.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.311f, 6.205f)
                lineToRelative(-1.371f, -0.587f)
                curveToRelative(-0.432f, -3.168f, -3.155f, -5.617f, -6.44f, -5.617f)
                curveToRelative(-3.584f, 0.0f, -6.5f, 2.916f, -6.5f, 6.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 5.026f, 3.388f, 9.275f, 8.0f, 10.584f)
                verticalLineToRelative(1.416f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.046f)
                curveToRelative(0.329f, 0.03f, 0.663f, 0.046f, 1.0f, 0.046f)
                reflectiveCurveToRelative(0.671f, -0.016f, 1.0f, -0.046f)
                verticalLineToRelative(1.046f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.416f)
                curveToRelative(4.612f, -1.309f, 8.0f, -5.558f, 8.0f, -10.584f)
                verticalLineToRelative(-2.143f)
                lineToRelative(1.311f, -0.562f)
                curveToRelative(0.418f, -0.179f, 0.689f, -0.59f, 0.689f, -1.045f)
                reflectiveCurveToRelative(-0.271f, -0.866f, -0.689f, -1.045f)
                close()
                moveTo(5.5f, 13.0f)
                curveToRelative(1.328f, 0.0f, 2.548f, -0.474f, 3.5f, -1.261f)
                verticalLineToRelative(0.761f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-0.202f)
                curveToRelative(-1.268f, -1.415f, -2.095f, -3.232f, -2.265f, -5.234f)
                curveToRelative(0.947f, 0.771f, 2.154f, 1.234f, 3.467f, 1.234f)
                close()
                moveTo(20.0f, 11.0f)
                curveToRelative(0.0f, 4.963f, -4.037f, 9.0f, -9.0f, 9.0f)
                curveToRelative(-1.687f, 0.0f, -3.267f, -0.467f, -4.618f, -1.278f)
                curveToRelative(2.669f, -0.809f, 4.618f, -3.292f, 4.618f, -6.222f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(18.0f, 5.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
