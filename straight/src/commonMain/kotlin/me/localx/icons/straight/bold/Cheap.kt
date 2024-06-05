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

public val Icons.Bold.Cheap: ImageVector
    get() {
        if (_cheap != null) {
            return _cheap!!
        }
        _cheap = Builder(name = "Cheap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.55f, 19.071f)
                lineToRelative(-4.293f, 4.207f)
                curveToRelative(-0.48f, 0.48f, -1.116f, 0.722f, -1.753f, 0.722f)
                curveToRelative(-0.641f, 0.0f, -1.283f, -0.244f, -1.771f, -0.732f)
                lineToRelative(-4.25f, -4.25f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(2.396f, 2.396f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(19.33f)
                lineToRelative(2.45f, -2.401f)
                lineToRelative(2.1f, 2.143f)
                close()
                moveTo(5.0f, 10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                close()
                moveTo(14.0f, 0.841f)
                curveToRelative(-1.226f, -0.538f, -2.578f, -0.841f, -4.0f, -0.841f)
                curveTo(4.486f, 0.0f, 0.0f, 4.486f, 0.0f, 10.0f)
                reflectiveCurveToRelative(4.486f, 10.0f, 10.0f, 10.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                curveToRelative(1.487f, 0.0f, 2.865f, 0.47f, 4.0f, 1.264f)
                verticalLineTo(0.841f)
                close()
            }
        }
        .build()
        return _cheap!!
    }

private var _cheap: ImageVector? = null
