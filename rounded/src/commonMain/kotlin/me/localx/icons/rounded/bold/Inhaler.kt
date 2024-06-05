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

public val Icons.Bold.Inhaler: ImageVector
    get() {
        if (_inhaler != null) {
            return _inhaler!!
        }
        _inhaler = Builder(name = "Inhaler", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 12.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(1.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.5f, 21.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 13.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(5.5f, 18.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.971f, 8.794f)
                curveToRelative(-0.001f, 0.006f, -0.003f, 0.012f, -0.004f, 0.019f)
                lineToRelative(-1.835f, 8.809f)
                curveToRelative(-0.529f, 2.537f, -2.793f, 4.378f, -5.384f, 4.378f)
                horizontalLineToRelative(-3.748f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(0.062f)
                lineToRelative(2.119f, -10.228f)
                curveToRelative(0.349f, -1.612f, 1.788f, -2.772f, 3.423f, -2.772f)
                horizontalLineToRelative(2.895f)
                curveToRelative(1.055f, 0.0f, 2.042f, 0.468f, 2.71f, 1.285f)
                reflectiveCurveToRelative(0.93f, 1.878f, 0.719f, 2.912f)
                lineToRelative(-0.958f, 4.597f)
                close()
                moveTo(17.116f, 3.394f)
                lineToRelative(-0.747f, 3.606f)
                horizontalLineToRelative(3.912f)
                lineToRelative(0.71f, -3.408f)
                curveToRelative(0.04f, -0.195f, -0.048f, -0.34f, -0.104f, -0.409f)
                curveToRelative(-0.056f, -0.069f, -0.181f, -0.184f, -0.387f, -0.184f)
                horizontalLineToRelative(-2.895f)
                curveToRelative(-0.234f, 0.0f, -0.439f, 0.166f, -0.489f, 0.394f)
                close()
                moveTo(19.656f, 10.0f)
                horizontalLineToRelative(-3.909f)
                lineToRelative(-0.995f, 4.804f)
                curveToRelative(-0.144f, 0.696f, -0.758f, 1.196f, -1.469f, 1.196f)
                horizontalLineToRelative(-1.283f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.748f)
                curveToRelative(1.178f, 0.0f, 2.207f, -0.837f, 2.448f, -1.99f)
                lineToRelative(1.46f, -7.01f)
                close()
            }
        }
        .build()
        return _inhaler!!
    }

private var _inhaler: ImageVector? = null
