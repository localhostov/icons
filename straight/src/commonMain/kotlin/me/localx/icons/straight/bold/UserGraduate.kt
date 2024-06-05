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

public val Icons.Bold.UserGraduate: ImageVector
    get() {
        if (_userGraduate != null) {
            return _userGraduate!!
        }
        _userGraduate = Builder(name = "UserGraduate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.979f, 22.499f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.13f)
                lineToRelative(-3.333f, 4.0f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-3.333f, -4.0f)
                horizontalLineToRelative(-0.201f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -3.032f, 2.467f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(1.437f)
                lineToRelative(2.084f, 2.501f)
                horizontalLineToRelative(0.001f)
                lineToRelative(2.084f, -2.501f)
                horizontalLineToRelative(1.393f)
                curveToRelative(3.033f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(21.979f, 4.499f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.022f)
                lineToRelative(-1.0f, 0.5f)
                verticalLineToRelative(2.506f)
                curveToRelative(0.0f, 3.309f, -2.691f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-2.506f)
                lineToRelative(-3.958f, -1.978f)
                lineTo(10.214f, 0.404f)
                curveToRelative(1.068f, -0.534f, 2.452f, -0.536f, 3.525f, -0.002f)
                lineToRelative(8.239f, 4.097f)
                close()
                moveTo(14.979f, 7.977f)
                lineToRelative(-1.235f, 0.618f)
                curveToRelative(-0.536f, 0.268f, -1.15f, 0.402f, -1.764f, 0.402f)
                reflectiveCurveToRelative(-1.229f, -0.135f, -1.765f, -0.402f)
                lineToRelative(-1.235f, -0.618f)
                verticalLineToRelative(1.006f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.006f)
                close()
                moveTo(15.227f, 4.499f)
                lineToRelative(-2.825f, -1.412f)
                curveToRelative(-0.232f, -0.115f, -0.613f, -0.116f, -0.845f, 0.0f)
                lineToRelative(-2.825f, 1.411f)
                lineToRelative(2.825f, 1.412f)
                curveToRelative(0.233f, 0.117f, 0.612f, 0.116f, 0.845f, 0.0f)
                lineToRelative(2.826f, -1.413f)
                close()
            }
        }
        .build()
        return _userGraduate!!
    }

private var _userGraduate: ImageVector? = null
