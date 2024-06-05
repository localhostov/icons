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

public val Icons.Outline.ShieldSecurityRisk: ImageVector
    get() {
        if (_shieldSecurityRisk != null) {
            return _shieldSecurityRisk!!
        }
        _shieldSecurityRisk = Builder(name = "ShieldSecurityRisk", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.141f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.105f, 21.321f)
                curveToRelative(0.476f, 0.867f, 1.096f, 1.641f, 1.819f, 2.305f)
                curveToRelative(-0.041f, 0.017f, -0.092f, 0.039f, -0.131f, 0.055f)
                lineToRelative(-0.836f, 0.336f)
                lineToRelative(-0.806f, -0.404f)
                curveTo(7.005f, 22.541f, 0.0f, 18.53f, 0.0f, 11.964f)
                verticalLineToRelative(-5.755f)
                curveToRelative(0.0f, -1.727f, 1.102f, -3.253f, 2.741f, -3.797f)
                lineTo(10.0f, 0.005f)
                lineToRelative(7.259f, 2.407f)
                curveToRelative(1.639f, 0.544f, 2.741f, 2.07f, 2.741f, 3.797f)
                verticalLineToRelative(2.314f)
                curveToRelative(-0.638f, -0.226f, -1.305f, -0.388f, -2.0f, -0.464f)
                verticalLineToRelative(-1.85f)
                curveToRelative(0.0f, -0.863f, -0.551f, -1.627f, -1.371f, -1.898f)
                lineToRelative(-6.629f, -2.198f)
                lineToRelative(-6.629f, 2.198f)
                curveToRelative(-0.82f, 0.271f, -1.371f, 1.035f, -1.371f, 1.898f)
                verticalLineToRelative(5.755f)
                curveToRelative(0.0f, 4.709f, 4.647f, 7.965f, 7.105f, 9.357f)
                close()
            }
        }
        .build()
        return _shieldSecurityRisk!!
    }

private var _shieldSecurityRisk: ImageVector? = null
