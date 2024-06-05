package me.localx.icons.straight.outline

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

public val Icons.Outline.HouseReturn: ImageVector
    get() {
        if (_houseReturn != null) {
            return _houseReturn!!
        }
        _houseReturn = Builder(name = "HouseReturn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(24.0f, 9.972f)
                verticalLineToRelative(5.028f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.972f)
                lineToRelative(-2.0f, -1.38f)
                verticalLineToRelative(3.759f)
                curveToRelative(0.0f, 0.978f, -0.479f, 1.897f, -1.28f, 2.458f)
                lineToRelative(-4.743f, 3.168f)
                lineToRelative(0.023f, 4.962f)
                lineToRelative(-2.0f, 0.01f)
                lineToRelative(-0.028f, -6.038f)
                lineToRelative(2.028f, -1.354f)
                verticalLineToRelative(-3.839f)
                lineToRelative(-2.813f, 1.834f)
                lineToRelative(-1.092f, -1.676f)
                lineToRelative(3.166f, -2.063f)
                lineToRelative(0.776f, -2.773f)
                curveToRelative(0.367f, -1.178f, 1.623f, -2.078f, 2.867f, -2.078f)
                curveToRelative(1.444f, 0.0f, 2.247f, 0.574f, 2.548f, 0.848f)
                lineToRelative(4.548f, 3.107f)
                close()
                moveTo(18.0f, 13.407f)
                verticalLineToRelative(-5.142f)
                curveToRelative(-0.154f, -0.094f, -0.496f, -0.248f, -1.096f, -0.248f)
                curveToRelative(-0.33f, 0.0f, -0.746f, 0.259f, -0.904f, 0.542f)
                verticalLineToRelative(6.718f)
                lineToRelative(1.591f, -1.062f)
                curveToRelative(0.25f, -0.175f, 0.409f, -0.481f, 0.409f, -0.807f)
                close()
                moveTo(17.661f, 18.825f)
                lineToRelative(2.074f, 5.174f)
                horizontalLineToRelative(2.162f)
                lineToRelative(-2.559f, -6.356f)
                curveToRelative(-0.054f, 0.038f, -1.677f, 1.182f, -1.677f, 1.182f)
                close()
                moveTo(7.0f, 11.999f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(2.0f, 7.46f)
                curveToRelative(0.0f, -0.354f, 0.16f, -0.682f, 0.438f, -0.9f)
                lineToRelative(5.819f, -4.56f)
                curveToRelative(0.059f, -0.011f, 0.256f, -0.128f, 0.484f, 0.05f)
                lineToRelative(4.415f, 3.461f)
                curveToRelative(-0.719f, -0.798f, -1.157f, -1.854f, -1.157f, -3.012f)
                curveToRelative(0.0f, -0.114f, 0.004f, -0.226f, 0.013f, -0.338f)
                lineToRelative(-2.056f, -1.535f)
                curveToRelative(-0.966f, -0.755f, -2.111f, -0.838f, -2.913f, -0.21f)
                lineTo(1.206f, 4.985f)
                curveToRelative(-0.767f, 0.6f, -1.206f, 1.502f, -1.206f, 2.475f)
                verticalLineToRelative(9.54f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(-7.54f)
                close()
            }
        }
        .build()
        return _houseReturn!!
    }

private var _houseReturn: ImageVector? = null
