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

public val Icons.Bold.CircleX: ImageVector
    get() {
        if (_circleX != null) {
            return _circleX!!
        }
        _circleX = Builder(name = "CircleX", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.963f, 0.0f, -9.0f, -4.037f, -9.0f, -9.0f)
                reflectiveCurveTo(7.037f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                reflectiveCurveToRelative(-4.037f, 9.0f, -9.0f, 9.0f)
                close()
                moveTo(16.2f, 8.9f)
                lineToRelative(-2.325f, 3.1f)
                lineToRelative(2.325f, 3.1f)
                curveToRelative(0.497f, 0.663f, 0.362f, 1.604f, -0.3f, 2.101f)
                curveToRelative(-0.271f, 0.202f, -0.586f, 0.3f, -0.899f, 0.3f)
                curveToRelative(-0.456f, 0.0f, -0.906f, -0.207f, -1.201f, -0.6f)
                lineToRelative(-1.8f, -2.4f)
                lineToRelative(-1.8f, 2.4f)
                curveToRelative(-0.295f, 0.393f, -0.745f, 0.6f, -1.201f, 0.6f)
                curveToRelative(-0.313f, 0.0f, -0.629f, -0.098f, -0.899f, -0.3f)
                curveToRelative(-0.662f, -0.497f, -0.797f, -1.438f, -0.3f, -2.101f)
                lineToRelative(2.325f, -3.1f)
                lineToRelative(-2.325f, -3.1f)
                curveToRelative(-0.497f, -0.663f, -0.362f, -1.604f, 0.3f, -2.101f)
                curveToRelative(0.665f, -0.496f, 1.604f, -0.362f, 2.101f, 0.3f)
                lineToRelative(1.8f, 2.4f)
                lineToRelative(1.8f, -2.4f)
                curveToRelative(0.498f, -0.662f, 1.438f, -0.796f, 2.101f, -0.3f)
                curveToRelative(0.662f, 0.497f, 0.797f, 1.438f, 0.3f, 2.101f)
                close()
            }
        }
        .build()
        return _circleX!!
    }

private var _circleX: ImageVector? = null
