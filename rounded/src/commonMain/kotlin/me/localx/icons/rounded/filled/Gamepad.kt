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

public val Icons.Filled.Gamepad: ImageVector
    get() {
        if (_gamepad != null) {
            return _gamepad!!
        }
        _gamepad = Builder(name = "Gamepad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(471.486f, 107.389f)
                curveToRelative(-19.107f, -33.968f, -53.075f, -53.075f, -91.29f, -53.075f)
                horizontalLineTo(127.557f)
                curveToRelative(-38.214f, 0.0f, -72.183f, 19.107f, -91.29f, 53.075f)
                curveToRelative(-23.353f, 42.46f, -36.091f, 89.167f, -36.091f, 137.996f)
                curveToRelative(0.0f, 116.766f, 46.706f, 212.302f, 106.151f, 212.302f)
                curveToRelative(31.845f, 0.0f, 57.322f, -29.722f, 76.429f, -91.29f)
                curveToRelative(2.123f, -8.492f, 10.615f, -14.861f, 21.23f, -14.861f)
                horizontalLineToRelative(104.028f)
                curveToRelative(8.492f, 0.0f, 16.984f, 6.369f, 21.23f, 14.861f)
                curveToRelative(19.107f, 61.568f, 44.583f, 91.29f, 76.429f, 91.29f)
                curveToRelative(59.445f, 0.0f, 106.151f, -95.536f, 106.151f, -212.302f)
                curveTo(507.578f, 196.555f, 494.84f, 149.849f, 471.486f, 107.389f)
                close()
                moveTo(191.248f, 224.155f)
                horizontalLineToRelative(-21.23f)
                verticalLineToRelative(21.23f)
                curveToRelative(0.0f, 12.738f, -8.492f, 21.23f, -21.23f, 21.23f)
                reflectiveCurveToRelative(-21.23f, -8.492f, -21.23f, -21.23f)
                verticalLineToRelative(-21.23f)
                horizontalLineToRelative(-21.23f)
                curveToRelative(-12.738f, 0.0f, -21.23f, -8.492f, -21.23f, -21.23f)
                curveToRelative(0.0f, -12.738f, 8.492f, -21.23f, 21.23f, -21.23f)
                horizontalLineToRelative(21.23f)
                verticalLineToRelative(-21.23f)
                curveToRelative(0.0f, -12.738f, 8.492f, -21.23f, 21.23f, -21.23f)
                reflectiveCurveToRelative(21.23f, 8.492f, 21.23f, 21.23f)
                verticalLineToRelative(21.23f)
                horizontalLineToRelative(21.23f)
                curveToRelative(12.738f, 0.0f, 21.23f, 8.492f, 21.23f, 21.23f)
                curveTo(212.478f, 215.663f, 203.986f, 224.155f, 191.248f, 224.155f)
                close()
                moveTo(331.367f, 266.615f)
                curveToRelative(-16.984f, 0.0f, -31.845f, -14.861f, -31.845f, -31.845f)
                reflectiveCurveToRelative(14.861f, -31.845f, 31.845f, -31.845f)
                curveToRelative(16.984f, 0.0f, 31.845f, 14.861f, 31.845f, 31.845f)
                reflectiveCurveTo(346.228f, 266.615f, 331.367f, 266.615f)
                close()
                moveTo(392.935f, 202.925f)
                curveToRelative(-14.861f, 0.0f, -31.845f, -14.861f, -31.845f, -31.845f)
                reflectiveCurveToRelative(16.984f, -31.845f, 31.845f, -31.845f)
                reflectiveCurveToRelative(31.845f, 14.861f, 31.845f, 31.845f)
                reflectiveCurveTo(409.919f, 202.925f, 392.935f, 202.925f)
                close()
            }
        }
        .build()
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
