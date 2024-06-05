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
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(17.0f, 15.0f)
                curveToRelative(0.0f, -0.553f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 22.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(10.961f, 23.171f)
                curveToRelative(-0.263f, 0.525f, -0.792f, 0.829f, -1.343f, 0.829f)
                curveToRelative(-0.226f, 0.0f, -0.454f, -0.051f, -0.669f, -0.158f)
                curveTo(6.849f, 22.792f, -0.002f, 18.861f, -0.002f, 12.342f)
                lineToRelative(0.002f, -5.297f)
                curveTo(0.0f, 4.768f, 1.454f, 2.754f, 3.617f, 2.036f)
                lineTo(9.528f, 0.076f)
                curveToRelative(0.307f, -0.102f, 0.638f, -0.102f, 0.944f, 0.0f)
                lineToRelative(5.911f, 1.96f)
                curveToRelative(2.163f, 0.718f, 3.617f, 2.731f, 3.617f, 5.01f)
                verticalLineToRelative(1.454f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.454f)
                curveToRelative(0.0f, -0.983f, -0.627f, -1.853f, -1.561f, -2.162f)
                lineToRelative(-5.439f, -1.804f)
                lineToRelative(-5.439f, 1.804f)
                curveToRelative(-0.934f, 0.31f, -1.561f, 1.179f, -1.561f, 2.162f)
                lineToRelative(-0.002f, 5.297f)
                curveToRelative(0.0f, 4.798f, 5.582f, 7.961f, 7.292f, 8.815f)
                curveToRelative(0.741f, 0.37f, 1.042f, 1.271f, 0.671f, 2.013f)
                close()
            }
        }
        .build()
        return _shieldSecurityRisk!!
    }

private var _shieldSecurityRisk: ImageVector? = null
