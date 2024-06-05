package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) {
            return _planeArrival!!
        }
        _planeArrival = Builder(name = "PlaneArrival", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 21.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.38f, 20.601f)
                lineTo(2.641f, 12.19f)
                verticalLineTo(3.809f)
                curveToRelative(0.028f, -1.086f, 0.594f, -2.011f, 1.513f, -2.513f)
                curveToRelative(0.919f, -0.501f, 2.003f, -0.477f, 2.896f, 0.067f)
                curveToRelative(0.662f, 0.401f, 1.129f, 1.037f, 1.314f, 1.79f)
                lineToRelative(0.704f, 2.877f)
                lineToRelative(9.516f, 4.673f)
                curveToRelative(1.311f, 0.714f, 2.256f, 1.899f, 2.662f, 3.337f)
                curveToRelative(0.405f, 1.438f, 0.218f, 2.942f, -0.527f, 4.236f)
                lineToRelative(-1.339f, 2.325f)
                close()
                moveTo(5.641f, 10.341f)
                lineToRelative(12.55f, 6.305f)
                curveToRelative(0.278f, -0.557f, 0.338f, -1.188f, 0.168f, -1.792f)
                curveToRelative(-0.182f, -0.644f, -0.603f, -1.177f, -1.185f, -1.502f)
                lineTo(6.488f, 8.105f)
                lineToRelative(-0.848f, -3.46f)
                verticalLineToRelative(5.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.019f, 9.464f)
                lineToRelative(0.068f, -9.464f)
                lineToRelative(4.062f, 1.233f)
                curveToRelative(0.853f, 0.381f, 1.431f, 1.198f, 1.505f, 2.129f)
                lineToRelative(0.737f, 8.063f)
            }
        }
        .build()
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
