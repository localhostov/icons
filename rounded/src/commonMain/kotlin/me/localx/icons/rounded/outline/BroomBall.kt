package me.localx.icons.rounded.outline

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

public val Icons.Outline.BroomBall: ImageVector
    get() {
        if (_broomBall != null) {
            return _broomBall!!
        }
        _broomBall = Builder(name = "BroomBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.501f, 10.914f)
                lineTo(23.707f, 1.707f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-9.206f, 9.206f)
                lineToRelative(-0.89f, -0.89f)
                curveToRelative(-0.471f, -0.471f, -1.146f, -0.687f, -1.803f, -0.582f)
                curveToRelative(-0.658f, 0.107f, -1.229f, 0.526f, -1.526f, 1.122f)
                lineToRelative(-0.938f, 1.877f)
                curveToRelative(-1.633f, -0.149f, -3.247f, 0.419f, -4.433f, 1.605f)
                curveToRelative(-1.076f, 1.077f, -2.229f, 3.989f, -3.427f, 8.657f)
                curveToRelative(-0.192f, 0.752f, 0.02f, 1.528f, 0.567f, 2.076f)
                curveToRelative(0.414f, 0.415f, 0.96f, 0.637f, 1.526f, 0.637f)
                curveToRelative(0.182f, 0.0f, 0.366f, -0.023f, 0.549f, -0.07f)
                curveToRelative(4.667f, -1.196f, 7.58f, -2.349f, 8.657f, -3.427f)
                curveToRelative(1.176f, -1.176f, 1.749f, -2.782f, 1.601f, -4.431f)
                lineToRelative(1.879f, -0.94f)
                curveToRelative(0.597f, -0.297f, 1.017f, -0.868f, 1.123f, -1.525f)
                curveToRelative(0.107f, -0.658f, -0.11f, -1.332f, -0.582f, -1.803f)
                lineToRelative(-0.89f, -0.89f)
                close()
                moveTo(9.956f, 19.09f)
                curveToRelative(-0.774f, 0.775f, -3.668f, 1.86f, -7.739f, 2.904f)
                curveToRelative(-0.064f, 0.016f, -0.12f, 0.0f, -0.165f, -0.044f)
                curveToRelative(-0.046f, -0.045f, -0.061f, -0.101f, -0.044f, -0.165f)
                curveToRelative(1.045f, -4.073f, 2.13f, -6.966f, 2.903f, -7.739f)
                curveToRelative(0.825f, -0.824f, 1.973f, -1.18f, 3.111f, -0.989f)
                lineToRelative(2.96f, 2.959f)
                curveToRelative(0.137f, 1.101f, -0.243f, 2.291f, -1.026f, 3.074f)
                close()
                moveTo(13.957f, 13.344f)
                lineToRelative(-1.879f, 0.94f)
                lineToRelative(-2.36f, -2.36f)
                lineToRelative(0.939f, -1.879f)
                lineToRelative(0.126f, -0.021f)
                lineToRelative(3.194f, 3.195f)
                lineToRelative(-0.021f, 0.125f)
                close()
                moveTo(20.501f, 17.001f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.501f, 22.001f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _broomBall!!
    }

private var _broomBall: ImageVector? = null
