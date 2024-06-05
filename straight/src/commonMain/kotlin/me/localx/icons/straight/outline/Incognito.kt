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

public val Icons.Outline.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 17.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.235f, 2.174f)
                arcToRelative(4.685f, 4.685f, 0.0f, false, false, -2.53f, 0.0f)
                arcToRelative(3.494f, 3.494f, 0.0f, true, false, 0.193f, 2.033f)
                arcTo(3.52f, 3.52f, 0.0f, false, true, 12.0f, 21.0f)
                arcToRelative(3.514f, 3.514f, 0.0f, false, true, 1.072f, 0.207f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 16.5f, 17.0f)
                close()
                moveTo(7.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 9.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 22.0f)
                close()
                moveTo(16.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 18.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 22.0f)
                close()
                moveTo(19.977f, 8.9f)
                curveTo(19.635f, 0.11f, 15.2f, 0.0f, 15.0f, 0.0f)
                arcToRelative(4.587f, 4.587f, 0.0f, false, false, -3.0f, 1.3f)
                arcTo(4.585f, 4.585f, 0.0f, false, false, 9.0f, 0.0f)
                curveTo(8.8f, 0.0f, 4.365f, 0.11f, 4.023f, 8.9f)
                curveTo(1.363f, 9.619f, 0.0f, 10.657f, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.157f, 7.543f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(12.0f, -0.843f, 12.0f, -4.0f)
                curveTo(24.0f, 10.657f, 22.637f, 9.619f, 19.977f, 8.9f)
                close()
                moveTo(8.989f, 2.0f)
                arcToRelative(2.556f, 2.556f, 0.0f, false, true, 2.116f, 1.447f)
                lineTo(12.0f, 5.236f)
                lineTo(12.9f, 3.447f)
                arcTo(2.565f, 2.565f, 0.0f, false, true, 14.97f, 2.0f)
                curveToRelative(0.029f, 0.0f, 2.847f, 0.272f, 3.021f, 7.308f)
                arcTo(20.978f, 20.978f, 0.0f, false, true, 12.0f, 10.0f)
                arcToRelative(21.053f, 21.053f, 0.0f, false, true, -5.992f, -0.694f)
                curveTo(6.183f, 2.271f, 9.0f, 2.0f, 8.989f, 2.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-6.044f, 0.0f, -9.727f, -1.329f, -10.006f, -1.958f)
                curveToRelative(0.065f, -0.164f, 0.666f, -0.7f, 2.471f, -1.191f)
                lineToRelative(0.088f, 0.044f)
                curveTo(4.643f, 10.939f, 6.823f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(7.356f, -1.061f, 7.447f, -1.105f)
                lineToRelative(0.088f, -0.044f)
                arcToRelative(5.553f, 5.553f, 0.0f, false, true, 2.471f, 1.107f)
                curveTo(21.727f, 12.671f, 18.044f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
