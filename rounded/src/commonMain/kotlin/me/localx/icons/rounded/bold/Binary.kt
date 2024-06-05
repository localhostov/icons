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

public val Icons.Bold.Binary: ImageVector
    get() {
        if (_binary != null) {
            return _binary!!
        }
        _binary = Builder(name = "Binary", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                curveTo(12.0f, 2.02f, 9.98f, 0.0f, 7.5f, 0.0f)
                reflectiveCurveTo(3.0f, 2.02f, 3.0f, 4.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 6.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.5f, 13.0f)
                curveToRelative(-2.48f, 0.0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(17.0f, 19.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.44f, 4.56f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                lineTo(16.44f, 0.44f)
                curveToRelative(0.43f, -0.43f, 1.08f, -0.56f, 1.63f, -0.33f)
                curveToRelative(0.56f, 0.23f, 0.93f, 0.78f, 0.93f, 1.39f)
                lineTo(19.0f, 9.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(16.0f, 4.91f)
                curveToRelative(-0.53f, 0.19f, -1.14f, 0.07f, -1.56f, -0.35f)
                close()
                moveTo(9.0f, 14.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4.59f)
                curveToRelative(-0.53f, 0.19f, -1.14f, 0.07f, -1.56f, -0.35f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                lineToRelative(2.0f, -2.0f)
                curveToRelative(0.43f, -0.43f, 1.08f, -0.56f, 1.63f, -0.33f)
                curveToRelative(0.56f, 0.23f, 0.93f, 0.78f, 0.93f, 1.39f)
                close()
            }
        }
        .build()
        return _binary!!
    }

private var _binary: ImageVector? = null
