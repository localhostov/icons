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

public val Icons.Filled.CallDuration: ImageVector
    get() {
        if (_callDuration != null) {
            return _callDuration!!
        }
        _callDuration = Builder(name = "CallDuration", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 0.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, 2.691f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(21.309f, 0.0f, 18.0f, 0.0f)
                close()
                moveTo(20.207f, 8.207f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(-0.188f, -0.188f, -0.293f, -0.442f, -0.293f, -0.707f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.086f)
                lineToRelative(1.207f, 1.207f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(20.657f, 14.861f)
                curveToRelative(-1.193f, -1.142f, -3.089f, -1.138f, -4.28f, 0.006f)
                lineToRelative(-1.906f, 1.606f)
                curveToRelative(-3.199f, -1.357f, -5.474f, -3.637f, -6.932f, -6.945f)
                lineToRelative(1.601f, -1.898f)
                curveToRelative(1.146f, -1.192f, 1.147f, -3.085f, 0.006f, -4.28f)
                curveToRelative(0.0f, 0.0f, -1.853f, -2.408f, -1.883f, -2.439f)
                curveToRelative(-1.206f, -1.205f, -3.171f, -1.205f, -4.328f, -0.046f)
                lineToRelative(-1.148f, 1.004f)
                curveTo(0.635f, 3.016f, 0.001f, 4.57f, 0.001f, 6.243f)
                curveTo(0.001f, 13.878f, 10.127f, 24.004f, 17.763f, 24.004f)
                curveToRelative(1.673f, 0.0f, 3.227f, -0.634f, 4.421f, -1.833f)
                lineToRelative(0.912f, -1.05f)
                curveToRelative(1.205f, -1.207f, 1.205f, -3.171f, 0.0f, -4.378f)
                curveToRelative(-0.031f, -0.03f, -2.439f, -1.883f, -2.439f, -1.883f)
                close()
            }
        }
        .build()
        return _callDuration!!
    }

private var _callDuration: ImageVector? = null
