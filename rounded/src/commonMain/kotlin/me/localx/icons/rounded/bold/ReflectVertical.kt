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

public val Icons.Bold.ReflectVertical: ImageVector
    get() {
        if (_reflectVertical != null) {
            return _reflectVertical!!
        }
        _reflectVertical = Builder(name = "ReflectVertical", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(1.5f, 13.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(22.5f, 10.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(5.65f, 3.83f)
                curveToRelative(-0.66f, -0.72f, -0.82f, -1.67f, -0.46f, -2.48f)
                curveToRelative(0.36f, -0.82f, 1.17f, -1.34f, 2.06f, -1.34f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.89f, 0.0f, 1.7f, 0.53f, 2.06f, 1.34f)
                curveToRelative(0.36f, 0.82f, 0.2f, 1.77f, -0.4f, 2.42f)
                lineToRelative(-4.53f, 4.43f)
                curveToRelative(-0.43f, 0.48f, -1.13f, 0.8f, -1.88f, 0.8f)
                reflectiveCurveToRelative(-1.45f, -0.32f, -1.94f, -0.87f)
                lineTo(5.65f, 3.83f)
                close()
                moveTo(9.09f, 3.0f)
                lineToRelative(2.91f, 2.84f)
                lineToRelative(2.91f, -2.84f)
                horizontalLineToRelative(-5.82f)
                close()
                moveTo(18.35f, 20.17f)
                curveToRelative(0.66f, 0.72f, 0.82f, 1.67f, 0.46f, 2.48f)
                curveToRelative(-0.36f, 0.82f, -1.17f, 1.34f, -2.06f, 1.34f)
                lineTo(7.25f, 23.99f)
                curveToRelative(-0.89f, 0.0f, -1.7f, -0.53f, -2.06f, -1.34f)
                curveToRelative(-0.36f, -0.82f, -0.2f, -1.77f, 0.4f, -2.42f)
                lineToRelative(4.53f, -4.43f)
                curveToRelative(0.43f, -0.48f, 1.13f, -0.8f, 1.88f, -0.8f)
                reflectiveCurveToRelative(1.45f, 0.32f, 1.94f, 0.87f)
                lineToRelative(4.41f, 4.3f)
                close()
            }
        }
        .build()
        return _reflectVertical!!
    }

private var _reflectVertical: ImageVector? = null
