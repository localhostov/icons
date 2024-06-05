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

public val Icons.Bold.HoodCloak: ImageVector
    get() {
        if (_hoodCloak != null) {
            return _hoodCloak!!
        }
        _hoodCloak = Builder(name = "HoodCloak", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                curveToRelative(0.0f, 5.319f, 5.822f, 9.981f, 6.07f, 10.177f)
                lineToRelative(0.93f, 0.735f)
                lineToRelative(0.93f, -0.735f)
                curveToRelative(0.248f, -0.196f, 6.07f, -4.857f, 6.07f, -10.177f)
                curveToRelative(0.0f, -3.86f, -3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(11.998f, 20.006f)
                curveToRelative(-1.617f, -1.538f, -3.998f, -4.371f, -3.998f, -7.006f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 2.623f, -2.384f, 5.463f, -4.002f, 7.006f)
                close()
                moveTo(21.759f, 21.0f)
                horizontalLineToRelative(2.257f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-7.915f)
                lineToRelative(1.694f, -2.372f)
                curveToRelative(2.487f, -3.482f, 3.392f, -6.309f, 3.211f, -10.057f)
                horizontalLineToRelative(-0.016f)
                curveToRelative(-0.064f, -1.363f, -0.426f, -2.66f, -1.073f, -3.856f)
                curveToRelative(-0.605f, -1.116f, -0.345f, -3.053f, 0.079f, -4.739f)
                curveToRelative(-2.501f, -0.026f, -6.687f, -0.051f, -8.452f, 0.035f)
                curveToRelative(-4.548f, 0.223f, -8.295f, 3.949f, -8.53f, 8.482f)
                curveToRelative(-0.197f, 3.786f, 0.702f, 6.627f, 3.207f, 10.134f)
                lineToRelative(1.694f, 2.372f)
                lineTo(0.0f, 23.999f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.257f)
                curveTo(0.492f, 17.877f, -0.17f, 14.926f, 0.018f, 11.338f)
                curveTo(0.331f, 5.287f, 5.33f, 0.312f, 11.397f, 0.015f)
                curveToRelative(2.675f, -0.132f, 10.301f, -0.02f, 10.625f, -0.015f)
                lineToRelative(2.062f, 0.031f)
                lineToRelative(-0.665f, 1.953f)
                curveToRelative(-0.6f, 1.758f, -0.999f, 3.836f, -0.839f, 4.359f)
                curveToRelative(0.824f, 1.512f, 1.304f, 3.21f, 1.401f, 4.994f)
                horizontalLineToRelative(0.016f)
                curveToRelative(0.187f, 3.589f, -0.476f, 6.54f, -2.239f, 9.662f)
                close()
            }
        }
        .build()
        return _hoodCloak!!
    }

private var _hoodCloak: ImageVector? = null
