package me.localx.icons.rounded.filled

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

public val Icons.Filled.Picpeople: ImageVector
    get() {
        if (_picpeople != null) {
            return _picpeople!!
        }
        _picpeople = Builder(name = "Picpeople", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                lineTo(0.0f, 7.0f)
                curveTo(0.0f, 4.24f, 2.24f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                close()
                moveTo(8.0f, 10.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                close()
                moveTo(16.8f, 18.4f)
                curveToRelative(-1.15f, -1.52f, -2.9f, -2.4f, -4.8f, -2.4f)
                reflectiveCurveToRelative(-3.65f, 0.88f, -4.8f, 2.4f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                curveToRelative(0.44f, 0.33f, 1.07f, 0.24f, 1.4f, -0.2f)
                curveToRelative(0.76f, -1.02f, 1.93f, -1.6f, 3.2f, -1.6f)
                reflectiveCurveToRelative(2.44f, 0.58f, 3.2f, 1.6f)
                curveToRelative(0.2f, 0.26f, 0.5f, 0.4f, 0.8f, 0.4f)
                curveToRelative(0.21f, 0.0f, 0.42f, -0.07f, 0.6f, -0.2f)
                curveToRelative(0.44f, -0.33f, 0.53f, -0.96f, 0.2f, -1.4f)
                close()
            }
        }
        .build()
        return _picpeople!!
    }

private var _picpeople: ImageVector? = null
