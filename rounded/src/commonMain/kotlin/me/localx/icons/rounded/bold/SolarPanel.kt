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

public val Icons.Bold.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.959f, 11.366f)
                lineToRelative(-0.838f, -6.562f)
                curveToRelative(-0.349f, -2.738f, -2.695f, -4.804f, -5.456f, -4.804f)
                lineTo(6.335f, 0.0f)
                curveTo(3.574f, 0.0f, 1.229f, 2.065f, 0.879f, 4.803f)
                lineTo(0.041f, 11.366f)
                curveToRelative(-0.182f, 1.425f, 0.258f, 2.86f, 1.207f, 3.938f)
                curveToRelative(0.949f, 1.078f, 2.316f, 1.696f, 3.752f, 1.696f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.436f, 0.0f, 2.804f, -0.618f, 3.752f, -1.696f)
                curveToRelative(0.949f, -1.077f, 1.389f, -2.513f, 1.207f, -3.938f)
                close()
                moveTo(20.145f, 5.183f)
                lineToRelative(0.232f, 1.816f)
                horizontalLineToRelative(-3.68f)
                lineToRelative(-0.143f, -4.0f)
                horizontalLineToRelative(1.111f)
                curveToRelative(1.255f, 0.0f, 2.321f, 0.938f, 2.48f, 2.184f)
                close()
                moveTo(10.054f, 13.999f)
                lineToRelative(0.143f, -4.0f)
                horizontalLineToRelative(3.605f)
                lineToRelative(0.143f, 4.0f)
                horizontalLineToRelative(-3.891f)
                close()
                moveTo(10.304f, 6.999f)
                lineToRelative(0.143f, -4.0f)
                horizontalLineToRelative(3.105f)
                lineToRelative(0.143f, 4.0f)
                horizontalLineToRelative(-3.391f)
                close()
                moveTo(6.334f, 2.999f)
                horizontalLineToRelative(1.111f)
                lineToRelative(-0.143f, 4.0f)
                horizontalLineToRelative(-3.68f)
                lineToRelative(0.232f, -1.817f)
                curveToRelative(0.159f, -1.244f, 1.225f, -2.183f, 2.48f, -2.183f)
                close()
                moveTo(3.499f, 13.32f)
                curveToRelative(-0.385f, -0.438f, -0.557f, -0.996f, -0.483f, -1.574f)
                lineToRelative(0.223f, -1.747f)
                horizontalLineToRelative(3.956f)
                lineToRelative(-0.143f, 4.0f)
                horizontalLineToRelative(-2.052f)
                curveToRelative(-0.583f, 0.0f, -1.116f, -0.241f, -1.501f, -0.679f)
                close()
                moveTo(20.5f, 13.32f)
                curveToRelative(-0.385f, 0.438f, -0.918f, 0.679f, -1.501f, 0.679f)
                horizontalLineToRelative(-2.052f)
                lineToRelative(-0.143f, -4.0f)
                horizontalLineToRelative(3.956f)
                lineToRelative(0.223f, 1.747f)
                curveToRelative(0.074f, 0.578f, -0.098f, 1.137f, -0.483f, 1.574f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
