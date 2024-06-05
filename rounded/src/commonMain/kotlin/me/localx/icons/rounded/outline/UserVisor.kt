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

public val Icons.Outline.UserVisor: ImageVector
    get() {
        if (_userVisor != null) {
            return _userVisor!!
        }
        _userVisor = Builder(name = "UserVisor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -3.859f, -3.141f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.141f, -7.0f, 7.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                curveToRelative(0.0f, -4.963f, 4.037f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9.0f, 4.037f, 9.0f, 9.0f)
                close()
                moveTo(5.0f, 6.0f)
                curveToRelative(0.0f, -0.858f, 0.541f, -1.59f, 1.3f, -1.874f)
                curveTo(7.089f, 1.733f, 9.346f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(4.911f, 1.733f, 5.7f, 4.126f)
                curveToRelative(0.759f, 0.284f, 1.3f, 1.016f, 1.3f, 1.874f)
                reflectiveCurveToRelative(-0.541f, 1.59f, -1.3f, 1.874f)
                curveToRelative(-0.789f, 2.394f, -3.046f, 4.126f, -5.7f, 4.126f)
                reflectiveCurveToRelative(-4.911f, -1.733f, -5.7f, -4.126f)
                curveToRelative(-0.759f, -0.284f, -1.3f, -1.016f, -1.3f, -1.874f)
                close()
                moveTo(15.463f, 8.0f)
                horizontalLineToRelative(-6.927f)
                curveToRelative(0.693f, 1.195f, 1.985f, 2.0f, 3.463f, 2.0f)
                reflectiveCurveToRelative(2.771f, -0.805f, 3.463f, -2.0f)
                close()
                moveTo(8.536f, 4.0f)
                horizontalLineToRelative(6.927f)
                curveToRelative(-0.693f, -1.195f, -1.985f, -2.0f, -3.463f, -2.0f)
                reflectiveCurveToRelative(-2.771f, 0.805f, -3.463f, 2.0f)
                close()
                moveTo(16.635f, 21.573f)
                curveToRelative(-0.272f, -0.666f, -0.66f, -1.321f, -1.132f, -1.887f)
                curveToRelative(-0.216f, -0.26f, -0.61f, -0.258f, -0.825f, 0.002f)
                curveToRelative(-0.479f, 0.579f, -0.872f, 1.268f, -1.146f, 2.075f)
                curveToRelative(-0.168f, 0.529f, -0.315f, 1.133f, -0.414f, 1.818f)
                curveToRelative(-0.048f, 0.332f, 0.338f, 0.548f, 0.595f, 0.332f)
                curveToRelative(0.532f, -0.446f, 1.251f, -0.97f, 1.726f, -0.97f)
                curveToRelative(0.361f, 0.0f, 0.785f, 0.205f, 1.15f, 0.462f)
                curveToRelative(0.248f, 0.175f, 0.58f, -0.046f, 0.518f, -0.343f)
                curveToRelative(-0.105f, -0.503f, -0.253f, -0.97f, -0.472f, -1.49f)
                close()
            }
        }
        .build()
        return _userVisor!!
    }

private var _userVisor: ImageVector? = null
