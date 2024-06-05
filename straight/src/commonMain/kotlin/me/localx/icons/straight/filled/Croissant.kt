package me.localx.icons.straight.filled

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

public val Icons.Filled.Croissant: ImageVector
    get() {
        if (_croissant != null) {
            return _croissant!!
        }
        _croissant = Builder(name = "Croissant", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.245f, 15.04f)
                lineTo(2.513f, 10.153f)
                arcToRelative(2.776f, 2.776f, 0.0f, false, true, -1.07f, -3.975f)
                arcTo(16.812f, 16.812f, 0.0f, false, true, 6.178f, 1.443f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.776f, 2.776f, 0.0f, false, true, 3.985f, 1.089f)
                lineTo(15.0f, 13.284f)
                close()
                moveTo(16.966f, 0.738f)
                arcTo(3.058f, 3.058f, 0.0f, false, false, 14.527f, 0.03f)
                curveToRelative(-0.916f, 0.134f, -2.1f, 0.347f, -3.247f, 0.63f)
                arcToRelative(4.722f, 4.722f, 0.0f, false, true, 0.672f, 0.977f)
                lineTo(16.9f, 12.393f)
                curveTo(17.039f, 12.339f, 18.0f, 12.0f, 18.0f, 12.0f)
                lineTo(18.0f, 3.0f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 16.966f, 0.738f)
                close()
                moveTo(22.375f, 3.785f)
                arcTo(13.177f, 13.177f, 0.0f, false, false, 20.0f, 2.733f)
                lineTo(20.0f, 9.995f)
                curveToRelative(0.306f, -0.063f, 1.056f, -0.169f, 1.056f, -0.169f)
                arcToRelative(3.259f, 3.259f, 0.0f, false, false, 2.876f, -2.61f)
                arcTo(3.161f, 3.161f, 0.0f, false, false, 22.375f, 3.785f)
                close()
                moveTo(3.0f, 18.0f)
                horizontalLineToRelative(9.0f)
                reflectiveCurveToRelative(0.339f, -0.961f, 0.393f, -1.1f)
                lineTo(1.639f, 11.951f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, -0.977f, -0.671f)
                curveToRelative(-0.283f, 1.146f, -0.5f, 2.33f, -0.63f, 3.246f)
                arcTo(3.057f, 3.057f, 0.0f, false, false, 0.74f, 16.965f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 3.0f, 18.0f)
                close()
                moveTo(7.216f, 23.932f)
                arcToRelative(3.259f, 3.259f, 0.0f, false, false, 2.61f, -2.876f)
                reflectiveCurveTo(9.934f, 20.305f, 10.0f, 20.0f)
                lineTo(2.735f, 20.0f)
                arcToRelative(13.177f, 13.177f, 0.0f, false, false, 1.052f, 2.375f)
                arcTo(3.161f, 3.161f, 0.0f, false, false, 7.218f, 23.931f)
                close()
            }
        }
        .build()
        return _croissant!!
    }

private var _croissant: ImageVector? = null
