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

public val Icons.Bold.UserVisor: ImageVector
    get() {
        if (_userVisor != null) {
            return _userVisor!!
        }
        _userVisor = Builder(name = "UserVisor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.799f, 23.97f)
                curveToRelative(-0.101f, 0.021f, -0.201f, 0.03f, -0.301f, 0.03f)
                curveToRelative(-0.698f, 0.0f, -1.323f, -0.49f, -1.468f, -1.201f)
                curveToRelative(-0.556f, -2.736f, -3.148f, -4.799f, -6.03f, -4.799f)
                reflectiveCurveToRelative(-5.475f, 2.062f, -6.03f, 4.799f)
                curveToRelative(-0.165f, 0.812f, -0.963f, 1.333f, -1.769f, 1.171f)
                curveToRelative(-0.812f, -0.165f, -1.336f, -0.956f, -1.171f, -1.769f)
                curveToRelative(0.847f, -4.173f, 4.619f, -7.201f, 8.97f, -7.201f)
                reflectiveCurveToRelative(8.123f, 3.028f, 8.97f, 7.201f)
                curveToRelative(0.165f, 0.812f, -0.359f, 1.604f, -1.171f, 1.769f)
                close()
                moveTo(15.52f, 21.573f)
                curveToRelative(-0.272f, -0.666f, -0.66f, -1.321f, -1.132f, -1.887f)
                curveToRelative(-0.216f, -0.26f, -0.61f, -0.258f, -0.825f, 0.002f)
                curveToRelative(-0.479f, 0.579f, -0.873f, 1.268f, -1.146f, 2.075f)
                curveToRelative(-0.168f, 0.529f, -0.315f, 1.133f, -0.414f, 1.818f)
                curveToRelative(-0.048f, 0.332f, 0.338f, 0.548f, 0.595f, 0.332f)
                curveToRelative(0.532f, -0.446f, 1.251f, -0.97f, 1.726f, -0.97f)
                curveToRelative(0.361f, 0.0f, 0.785f, 0.205f, 1.15f, 0.462f)
                curveToRelative(0.248f, 0.175f, 0.58f, -0.046f, 0.518f, -0.343f)
                curveToRelative(-0.105f, -0.503f, -0.253f, -0.97f, -0.472f, -1.49f)
                close()
                moveTo(4.0f, 7.0f)
                curveToRelative(0.0f, -0.839f, 0.517f, -1.557f, 1.25f, -1.854f)
                curveToRelative(0.815f, -2.963f, 3.533f, -5.146f, 6.75f, -5.146f)
                reflectiveCurveToRelative(5.935f, 2.183f, 6.75f, 5.146f)
                curveToRelative(0.733f, 0.297f, 1.25f, 1.015f, 1.25f, 1.854f)
                reflectiveCurveToRelative(-0.517f, 1.557f, -1.25f, 1.854f)
                curveToRelative(-0.815f, 2.963f, -3.533f, 5.146f, -6.75f, 5.146f)
                reflectiveCurveToRelative(-5.935f, -2.183f, -6.75f, -5.146f)
                curveToRelative(-0.733f, -0.297f, -1.25f, -1.015f, -1.25f, -1.854f)
                close()
                moveTo(15.463f, 9.0f)
                horizontalLineToRelative(-6.927f)
                curveToRelative(0.693f, 1.195f, 1.985f, 2.0f, 3.463f, 2.0f)
                reflectiveCurveToRelative(2.771f, -0.805f, 3.463f, -2.0f)
                close()
                moveTo(8.536f, 5.0f)
                horizontalLineToRelative(6.927f)
                curveToRelative(-0.693f, -1.195f, -1.985f, -2.0f, -3.463f, -2.0f)
                reflectiveCurveToRelative(-2.771f, 0.805f, -3.463f, 2.0f)
                close()
            }
        }
        .build()
        return _userVisor!!
    }

private var _userVisor: ImageVector? = null
