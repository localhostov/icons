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

public val Icons.Bold.ShieldSecurityRisk: ImageVector
    get() {
        if (_shieldSecurityRisk != null) {
            return _shieldSecurityRisk!!
        }
        _shieldSecurityRisk = Builder(name = "ShieldSecurityRisk", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.41f, 20.515f)
                curveToRelative(0.322f, 0.971f, 0.821f, 1.86f, 1.465f, 2.626f)
                curveToRelative(-0.357f, 0.168f, -0.672f, 0.305f, -0.918f, 0.404f)
                lineToRelative(-1.021f, 0.412f)
                lineToRelative(-0.985f, -0.494f)
                curveTo(6.851f, 22.413f, 0.0f, 18.479f, 0.0f, 11.964f)
                verticalLineToRelative(-6.162f)
                curveToRelative(0.0f, -1.46f, 0.933f, -2.751f, 2.321f, -3.212f)
                lineTo(10.0f, 0.045f)
                lineToRelative(7.679f, 2.545f)
                curveToRelative(1.389f, 0.461f, 2.321f, 1.752f, 2.321f, 3.212f)
                verticalLineToRelative(4.46f)
                curveToRelative(-0.64f, -0.165f, -1.308f, -0.262f, -2.0f, -0.262f)
                curveToRelative(-0.339f, 0.0f, -0.672f, 0.028f, -1.0f, 0.069f)
                verticalLineToRelative(-4.267f)
                curveToRelative(0.0f, -0.168f, -0.104f, -0.311f, -0.266f, -0.364f)
                lineToRelative(-6.734f, -2.232f)
                lineToRelative(-6.734f, 2.232f)
                curveToRelative(-0.159f, 0.053f, -0.266f, 0.199f, -0.266f, 0.364f)
                verticalLineToRelative(6.162f)
                curveToRelative(0.0f, 4.603f, 5.142f, 7.703f, 7.068f, 8.702f)
                curveToRelative(0.104f, -0.044f, 0.22f, -0.096f, 0.341f, -0.151f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, 3.314f, -2.686f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.686f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.686f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.686f, 6.0f, 6.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(19.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _shieldSecurityRisk!!
    }

private var _shieldSecurityRisk: ImageVector? = null
