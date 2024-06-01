package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.9999f, 12.0f)
                    curveTo(22.0077f, 14.3266f, 21.2068f, 16.5835f, 19.7342f, 18.3848f)
                    curveTo(18.2616f, 20.186f, 16.2088f, 21.4195f, 13.9271f, 21.8742f)
                    curveTo(11.6454f, 22.329f, 9.2766f, 21.9767f, 7.226f, 20.8776f)
                    curveTo(5.1754f, 19.7786f, 3.5704f, 18.0011f, 2.6857f, 15.8493f)
                    curveTo(1.801f, 13.6975f, 1.6916f, 11.3051f, 2.3761f, 9.0815f)
                    curveTo(3.0606f, 6.8579f, 4.4966f, 4.9413f, 6.4383f, 3.6596f)
                    curveTo(8.38f, 2.3779f, 10.7068f, 1.8108f, 13.0205f, 2.0553f)
                    curveTo(15.3342f, 2.2998f, 17.491f, 3.3408f, 19.1219f, 5.0f)
                    horizontalLineTo(14.9999f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(20.1429f)
                    curveTo(20.6353f, 6.9995f, 21.1073f, 6.8036f, 21.4554f, 6.4555f)
                    curveTo(21.8036f, 6.1074f, 21.9994f, 5.6354f, 21.9999f, 5.143f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(19.9999f)
                    verticalLineTo(3.078f)
                    curveTo(17.9532f, 1.2494f, 15.3409f, 0.1788f, 12.5997f, 0.0448f)
                    curveTo(9.8584f, -0.0891f, 7.1542f, 0.7219f, 4.939f, 2.3423f)
                    curveTo(2.7239f, 3.9627f, 1.132f, 6.2942f, 0.4293f, 8.9473f)
                    curveTo(-0.2733f, 11.6004f, -0.0441f, 14.4142f, 1.0787f, 16.9186f)
                    curveTo(2.2015f, 19.423f, 4.1498f, 21.4661f, 6.598f, 22.7066f)
                    curveTo(9.0463f, 23.947f, 11.846f, 24.3096f, 14.5295f, 23.7338f)
                    curveTo(17.213f, 23.158f, 19.6175f, 21.6786f, 21.3412f, 19.5429f)
                    curveTo(23.065f, 17.4072f, 24.0035f, 14.7445f, 23.9999f, 12.0f)
                    horizontalLineTo(21.9999f)
                    close()
                }
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
