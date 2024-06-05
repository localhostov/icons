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

public val Icons.Bold.HandHorns: ImageVector
    get() {
        if (_handHorns != null) {
            return _handHorns!!
        }
        _handHorns = Builder(name = "HandHorns", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 15.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 2.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5.21f)
                curveToRelative(-1.4f, 0.0f, -2.74f, -0.53f, -3.76f, -1.49f)
                lineToRelative(-1.92f, -1.8f)
                lineToRelative(2.77f, -2.9f)
                curveToRelative(0.8f, -0.8f, 0.8f, -2.09f, 0.0f, -2.89f)
                reflectiveCurveToRelative(-2.09f, -0.8f, -2.89f, 0.0f)
                lineToRelative(-2.46f, 2.57f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.65f, 0.66f, -1.0f, 1.53f, -1.0f, 2.46f)
                reflectiveCurveToRelative(0.36f, 1.81f, 1.06f, 2.51f)
                lineToRelative(2.39f, 2.25f)
                curveToRelative(1.58f, 1.48f, 3.65f, 2.3f, 5.82f, 2.3f)
                horizontalLineToRelative(5.21f)
                curveToRelative(3.58f, 0.0f, 6.5f, -2.92f, 6.5f, -6.5f)
                lineTo(22.01f, 3.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(8.0f, 1.58f)
                curveTo(8.0f, 0.83f, 7.49f, 0.14f, 6.75f, 0.02f)
                curveToRelative(-0.94f, -0.15f, -1.75f, 0.57f, -1.75f, 1.48f)
                lineTo(5.0f, 9.56f)
                curveToRelative(1.01f, -0.25f, 2.08f, -0.1f, 3.0f, 0.44f)
                close()
            }
        }
        .build()
        return _handHorns!!
    }

private var _handHorns: ImageVector? = null
