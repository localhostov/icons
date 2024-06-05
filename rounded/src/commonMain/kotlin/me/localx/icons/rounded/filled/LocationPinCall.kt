package me.localx.icons.rounded.filled

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

public val Icons.Filled.LocationPinCall: ImageVector
    get() {
        if (_locationPinCall != null) {
            return _locationPinCall!!
        }
        _locationPinCall = Builder(name = "LocationPinCall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.535f, 1.464f)
                curveToRelative(-0.945f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.535f, 1.464f)
                curveToRelative(-0.944f, 0.944f, -1.465f, 2.2f, -1.465f, 3.536f)
                reflectiveCurveToRelative(0.523f, 2.596f, 1.482f, 3.552f)
                lineToRelative(1.752f, 1.714f)
                curveToRelative(0.486f, 0.477f, 1.126f, 0.714f, 1.766f, 0.714f)
                reflectiveCurveToRelative(1.279f, -0.238f, 1.766f, -0.714f)
                lineToRelative(1.77f, -1.73f)
                curveToRelative(0.944f, -0.944f, 1.465f, -2.2f, 1.465f, -3.536f)
                reflectiveCurveToRelative(-0.521f, -2.592f, -1.465f, -3.536f)
                close()
                moveTo(19.0f, 6.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20.655f, 14.861f)
                curveToRelative(-1.193f, -1.142f, -3.09f, -1.138f, -4.28f, 0.006f)
                lineToRelative(-1.906f, 1.606f)
                curveToRelative(-3.198f, -1.357f, -5.474f, -3.637f, -6.932f, -6.945f)
                lineToRelative(1.6f, -1.897f)
                curveToRelative(0.557f, -0.579f, 0.863f, -1.339f, 0.863f, -2.145f)
                reflectiveCurveToRelative(-0.304f, -1.559f, -0.857f, -2.138f)
                curveToRelative(0.0f, 0.0f, -1.852f, -2.407f, -1.883f, -2.438f)
                curveToRelative(-1.207f, -1.207f, -3.17f, -1.206f, -4.327f, -0.047f)
                lineToRelative(-1.15f, 1.004f)
                curveTo(0.633f, 3.016f, 0.0f, 4.57f, 0.0f, 6.243f)
                curveToRelative(0.0f, 7.636f, 10.126f, 17.762f, 17.762f, 17.762f)
                curveToRelative(1.673f, 0.0f, 3.227f, -0.634f, 4.421f, -1.833f)
                lineToRelative(0.912f, -1.05f)
                curveToRelative(1.205f, -1.207f, 1.205f, -3.171f, 0.0f, -4.378f)
                curveToRelative(-0.031f, -0.03f, -2.439f, -1.883f, -2.439f, -1.883f)
                close()
            }
        }
        .build()
        return _locationPinCall!!
    }

private var _locationPinCall: ImageVector? = null
