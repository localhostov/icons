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

public val Icons.Bold.YinYang: ImageVector
    get() {
        if (_yinYang != null) {
            return _yinYang!!
        }
        _yinYang = Builder(name = "YinYang", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 6.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.7f, -5.49f, 12.12f, -12.22f, 12.0f)
                curveToRelative(-6.61f, -0.12f, -11.78f, -5.79f, -11.78f, -12.4f)
                lineTo(0.0f, 11.6f)
                curveTo(0.0f, 5.19f, 5.19f, 0.0f, 11.6f, 0.0f)
                horizontalLineToRelative(0.4f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                close()
                moveTo(5.0f, 17.25f)
                curveToRelative(0.0f, -3.61f, 2.82f, -6.57f, 6.43f, -6.74f)
                curveToRelative(2.0f, -0.09f, 3.57f, -1.74f, 3.57f, -3.76f)
                reflectiveCurveToRelative(-1.53f, -3.59f, -3.46f, -3.74f)
                curveTo(6.79f, 3.25f, 3.0f, 7.19f, 3.0f, 12.0f)
                curveToRelative(0.0f, 2.15f, 0.76f, 4.12f, 2.01f, 5.67f)
                curveToRelative(0.0f, -0.14f, -0.01f, -0.28f, -0.01f, -0.42f)
                close()
                moveTo(21.0f, 12.0f)
                curveToRelative(0.0f, -2.75f, -1.24f, -5.22f, -3.2f, -6.87f)
                curveToRelative(0.13f, 0.52f, 0.2f, 1.06f, 0.2f, 1.62f)
                curveToRelative(0.0f, 3.62f, -2.82f, 6.59f, -6.43f, 6.75f)
                curveToRelative(-2.0f, 0.09f, -3.57f, 1.74f, -3.57f, 3.75f)
                reflectiveCurveToRelative(1.45f, 3.5f, 3.3f, 3.72f)
                curveToRelative(0.23f, 0.02f, 0.46f, 0.03f, 0.7f, 0.03f)
                curveToRelative(4.96f, 0.0f, 9.0f, -4.04f, 9.0f, -9.0f)
                close()
                moveTo(11.5f, 16.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
