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

public val Icons.Bold.ParachuteBox: ImageVector
    get() {
        if (_parachuteBox != null) {
            return _parachuteBox!!
        }
        _parachuteBox = Builder(name = "ParachuteBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 11.0f)
                curveTo(24.0f, 4.729f, 18.841f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 4.729f, 0.0f, 11.0f)
                verticalLineToRelative(0.621f)
                lineToRelative(7.31f, 7.31f)
                curveToRelative(-0.196f, 0.309f, -0.31f, 0.676f, -0.31f, 1.069f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.393f, -0.114f, -0.76f, -0.31f, -1.069f)
                lineToRelative(7.31f, -7.31f)
                verticalLineToRelative(-0.621f)
                close()
                moveTo(4.5f, 10.0f)
                curveToRelative(1.005f, 0.0f, 2.005f, 1.016f, 2.3f, 1.4f)
                lineToRelative(0.26f, 0.345f)
                lineToRelative(1.658f, 4.351f)
                lineToRelative(-5.471f, -5.471f)
                curveToRelative(0.288f, -0.307f, 0.716f, -0.626f, 1.253f, -0.626f)
                close()
                moveTo(9.93f, 10.853f)
                curveToRelative(0.608f, -0.426f, 1.396f, -0.853f, 2.07f, -0.853f)
                reflectiveCurveToRelative(1.463f, 0.427f, 2.07f, 0.853f)
                lineToRelative(-2.07f, 5.434f)
                lineToRelative(-2.07f, -5.434f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(-0.701f, 0.0f, -1.38f, 0.166f, -2.001f, 0.411f)
                curveToRelative(0.52f, -1.598f, 1.348f, -2.863f, 2.001f, -3.69f)
                curveToRelative(0.654f, 0.827f, 1.482f, 2.092f, 2.002f, 3.69f)
                curveToRelative(-0.622f, -0.245f, -1.3f, -0.411f, -2.001f, -0.411f)
                close()
                moveTo(16.945f, 11.732f)
                lineToRelative(0.25f, -0.326f)
                curveToRelative(0.3f, -0.391f, 1.3f, -1.406f, 2.305f, -1.406f)
                curveToRelative(0.537f, 0.0f, 0.965f, 0.319f, 1.253f, 0.626f)
                lineToRelative(-5.471f, 5.471f)
                lineToRelative(1.663f, -4.365f)
                close()
                moveTo(19.92f, 7.02f)
                curveToRelative(-0.137f, -0.013f, -0.277f, -0.02f, -0.42f, -0.02f)
                curveToRelative(-0.877f, 0.0f, -1.663f, 0.252f, -2.331f, 0.599f)
                curveToRelative(-0.362f, -1.573f, -0.979f, -2.927f, -1.629f, -4.024f)
                curveToRelative(1.907f, 0.664f, 3.432f, 1.87f, 4.381f, 3.445f)
                close()
                moveTo(8.46f, 3.575f)
                curveToRelative(-0.651f, 1.097f, -1.267f, 2.451f, -1.629f, 4.024f)
                curveToRelative(-0.668f, -0.347f, -1.454f, -0.599f, -2.331f, -0.599f)
                curveToRelative(-0.143f, 0.0f, -0.283f, 0.007f, -0.42f, 0.02f)
                curveToRelative(0.948f, -1.575f, 2.474f, -2.781f, 4.381f, -3.445f)
                close()
            }
        }
        .build()
        return _parachuteBox!!
    }

private var _parachuteBox: ImageVector? = null
