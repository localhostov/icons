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

public val Icons.Bold.ReflectHorizontal: ImageVector
    get() {
        if (_reflectHorizontal != null) {
            return _reflectHorizontal!!
        }
        _reflectHorizontal = Builder(name = "ReflectHorizontal", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 1.5f)
                lineTo(13.5f, 22.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(10.5f, 1.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(0.0f, 0.74f, -0.32f, 1.45f, -0.87f, 1.94f)
                lineToRelative(-4.3f, 4.41f)
                curveToRelative(-0.47f, 0.43f, -1.03f, 0.65f, -1.6f, 0.65f)
                curveToRelative(-0.3f, 0.0f, -0.6f, -0.06f, -0.89f, -0.19f)
                curveToRelative(-0.82f, -0.36f, -1.34f, -1.17f, -1.34f, -2.06f)
                lineTo(0.0f, 7.25f)
                curveToRelative(0.0f, -0.89f, 0.53f, -1.7f, 1.34f, -2.06f)
                curveToRelative(0.81f, -0.36f, 1.77f, -0.2f, 2.43f, 0.4f)
                lineToRelative(4.43f, 4.53f)
                curveToRelative(0.48f, 0.43f, 0.8f, 1.13f, 0.8f, 1.88f)
                close()
                moveTo(5.84f, 12.0f)
                lineToRelative(-2.84f, -2.91f)
                verticalLineToRelative(5.82f)
                lineToRelative(2.84f, -2.91f)
                close()
                moveTo(24.0f, 7.25f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.89f, -0.53f, 1.7f, -1.34f, 2.06f)
                curveToRelative(-0.29f, 0.13f, -0.6f, 0.19f, -0.9f, 0.19f)
                curveToRelative(-0.55f, 0.0f, -1.1f, -0.2f, -1.52f, -0.59f)
                lineToRelative(-4.43f, -4.53f)
                curveToRelative(-0.48f, -0.43f, -0.8f, -1.13f, -0.8f, -1.88f)
                reflectiveCurveToRelative(0.32f, -1.45f, 0.87f, -1.94f)
                lineToRelative(4.3f, -4.41f)
                curveToRelative(0.72f, -0.66f, 1.67f, -0.82f, 2.48f, -0.46f)
                curveToRelative(0.82f, 0.36f, 1.34f, 1.17f, 1.34f, 2.06f)
                close()
            }
        }
        .build()
        return _reflectHorizontal!!
    }

private var _reflectHorizontal: ImageVector? = null
