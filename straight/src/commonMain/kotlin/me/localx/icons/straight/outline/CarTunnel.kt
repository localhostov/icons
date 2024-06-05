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

public val Icons.Outline.CarTunnel: ImageVector
    get() {
        if (_carTunnel != null) {
            return _carTunnel!!
        }
        _carTunnel = Builder(name = "CarTunnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -5.514f, -4.486f, -10.0f, -10.0f, -10.0f)
                reflectiveCurveTo(2.0f, 6.486f, 2.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-12.0f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(20.041f, 22.0f)
                horizontalLineToRelative(-2.041f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.961f)
                lineToRelative(-0.128f, -3.228f)
                curveToRelative(0.0f, -1.305f, 0.215f, -2.55f, 0.64f, -3.74f)
                lineToRelative(1.443f, -4.042f)
                curveToRelative(0.425f, -1.19f, 1.561f, -1.991f, 2.825f, -1.991f)
                horizontalLineToRelative(6.181f)
                curveToRelative(1.265f, 0.0f, 2.4f, 0.8f, 2.825f, 1.991f)
                lineToRelative(1.443f, 4.042f)
                curveToRelative(0.425f, 1.191f, 0.641f, 2.436f, 0.641f, 3.7f)
                lineToRelative(0.131f, 3.268f)
                close()
                moveTo(7.877f, 11.664f)
                lineToRelative(-0.834f, 2.336f)
                horizontalLineToRelative(9.733f)
                lineToRelative(-0.834f, -2.336f)
                curveToRelative(-0.142f, -0.397f, -0.52f, -0.664f, -0.941f, -0.664f)
                horizontalLineToRelative(-6.181f)
                curveToRelative(-0.421f, 0.0f, -0.8f, 0.267f, -0.941f, 0.664f)
                close()
                moveTo(17.959f, 20.0f)
                lineToRelative(-0.049f, -1.228f)
                curveToRelative(0.0f, -0.967f, -0.152f, -1.887f, -0.435f, -2.772f)
                horizontalLineToRelative(-1.476f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.657f)
                curveToRelative(-0.282f, 0.884f, -0.433f, 1.8f, -0.433f, 2.732f)
                lineToRelative(0.051f, 1.268f)
                horizontalLineToRelative(11.999f)
                close()
            }
        }
        .build()
        return _carTunnel!!
    }

private var _carTunnel: ImageVector? = null
