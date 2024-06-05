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
                moveToRelative(12.0f, 0.0f)
                curveTo(5.707f, 0.022f, 0.76f, 3.944f, 0.032f, 9.556f)
                curveToRelative(-0.033f, 0.254f, -0.039f, 0.51f, -0.021f, 0.763f)
                curveToRelative(0.0f, 0.681f, 0.689f, 2.063f, 1.158f, 2.532f)
                lineToRelative(6.132f, 6.094f)
                curveToRelative(-0.191f, 0.306f, -0.301f, 0.668f, -0.301f, 1.055f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.393f, -0.114f, -0.76f, -0.31f, -1.069f)
                lineToRelative(6.122f, -6.122f)
                curveToRelative(0.419f, -0.419f, 1.159f, -1.309f, 1.159f, -2.599f)
                curveToRelative(0.012f, -0.231f, 0.004f, -0.463f, -0.026f, -0.694f)
                curveTo(23.221f, 3.926f, 18.285f, 0.019f, 12.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(8.46f, 3.576f)
                curveToRelative(-0.65f, 1.096f, -1.266f, 2.45f, -1.629f, 4.023f)
                curveToRelative(-0.668f, -0.347f, -1.454f, -0.599f, -2.331f, -0.599f)
                curveToRelative(-0.161f, 0.0f, -0.317f, 0.009f, -0.47f, 0.025f)
                curveToRelative(0.964f, -1.577f, 2.515f, -2.784f, 4.43f, -3.449f)
                close()
                moveTo(3.222f, 10.653f)
                curveToRelative(0.288f, -0.315f, 0.725f, -0.654f, 1.279f, -0.654f)
                curveToRelative(1.005f, 0.0f, 2.512f, 1.628f, 2.517f, 1.633f)
                lineToRelative(1.716f, 4.506f)
                reflectiveCurveToRelative(-5.492f, -5.46f, -5.512f, -5.485f)
                close()
                moveTo(12.0f, 3.721f)
                curveToRelative(0.654f, 0.827f, 1.482f, 2.092f, 2.002f, 3.69f)
                curveToRelative(-0.622f, -0.245f, -1.3f, -0.411f, -2.001f, -0.411f)
                reflectiveCurveToRelative(-1.38f, 0.166f, -2.001f, 0.411f)
                curveToRelative(0.52f, -1.598f, 1.348f, -2.863f, 2.001f, -3.69f)
                close()
                moveTo(12.0f, 16.287f)
                lineToRelative(-2.07f, -5.434f)
                curveToRelative(0.608f, -0.426f, 1.396f, -0.853f, 2.07f, -0.853f)
                reflectiveCurveToRelative(1.463f, 0.427f, 2.07f, 0.853f)
                lineToRelative(-2.07f, 5.434f)
                close()
                moveTo(19.964f, 7.024f)
                curveToRelative(-0.151f, -0.016f, -0.306f, -0.025f, -0.464f, -0.025f)
                curveToRelative(-0.877f, 0.0f, -1.663f, 0.252f, -2.331f, 0.599f)
                curveToRelative(-0.362f, -1.573f, -0.979f, -2.926f, -1.629f, -4.023f)
                curveToRelative(1.916f, 0.665f, 3.465f, 1.872f, 4.424f, 3.448f)
                close()
                moveTo(15.282f, 16.096f)
                lineToRelative(1.701f, -4.464f)
                curveToRelative(0.073f, -0.064f, 1.512f, -1.632f, 2.517f, -1.632f)
                curveToRelative(0.535f, 0.0f, 0.962f, 0.317f, 1.25f, 0.623f)
                curveToRelative(-0.019f, 0.022f, -5.468f, 5.474f, -5.468f, 5.474f)
                close()
            }
        }
        .build()
        return _parachuteBox!!
    }

private var _parachuteBox: ImageVector? = null
