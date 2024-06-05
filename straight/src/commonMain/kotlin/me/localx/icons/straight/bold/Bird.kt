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

public val Icons.Bold.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.5f)
                lineToRelative(-2.068f, -0.886f)
                curveToRelative(-0.435f, -3.165f, -3.15f, -5.614f, -6.432f, -5.614f)
                curveToRelative(-3.584f, 0.0f, -6.5f, 2.916f, -6.5f, 6.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(4.0f)
                curveTo(0.0f, 16.024f, 3.39f, 20.263f, 8.0f, 21.573f)
                verticalLineToRelative(2.426f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.684f, 0.0f, 1.35f, -0.071f, 2.0f, -0.191f)
                verticalLineToRelative(2.191f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.214f)
                curveToRelative(3.556f, -1.825f, 6.0f, -5.521f, 6.0f, -9.785f)
                verticalLineToRelative(-2.143f)
                lineToRelative(2.0f, -0.857f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(3.097f, 12.25f)
                curveToRelative(0.86f, 0.478f, 1.851f, 0.75f, 2.902f, 0.75f)
                curveToRelative(1.093f, 0.0f, 2.116f, -0.299f, 3.0f, -0.812f)
                verticalLineToRelative(0.311f)
                curveToRelative(0.0f, 2.143f, -1.697f, 3.883f, -3.816f, 3.981f)
                curveToRelative(-1.08f, -1.146f, -1.831f, -2.606f, -2.086f, -4.231f)
                close()
                moveTo(18.999f, 11.0f)
                curveToRelative(0.0f, 4.411f, -3.589f, 8.0f, -8.0f, 8.0f)
                curveToRelative(-0.889f, 0.0f, -1.742f, -0.153f, -2.542f, -0.422f)
                curveToRelative(2.112f, -1.207f, 3.542f, -3.477f, 3.542f, -6.078f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(16.999f, 6.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
