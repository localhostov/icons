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

public val Icons.Bold.TruckFront: ImageVector
    get() {
        if (_truckFront != null) {
            return _truckFront!!
        }
        _truckFront = Builder(name = "TruckFront", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 0.0f)
                lineTo(5.5f, 0.0f)
                curveTo(2.468f, 0.0f, 0.0f, 2.468f, 0.0f, 5.5f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.42f, 0.85f, 2.645f, 2.068f, 3.193f)
                curveToRelative(0.144f, 0.793f, 0.522f, 1.523f, 1.101f, 2.11f)
                curveToRelative(0.245f, 0.247f, 0.516f, 0.459f, 0.807f, 0.632f)
                verticalLineToRelative(0.565f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-0.553f)
                curveToRelative(0.992f, -0.582f, 1.714f, -1.575f, 1.932f, -2.743f)
                curveToRelative(1.231f, -0.543f, 2.092f, -1.775f, 2.092f, -3.204f)
                lineTo(24.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(6.052f, 13.0f)
                lineToRelative(0.714f, -1.547f)
                curveToRelative(0.407f, -0.883f, 1.298f, -1.453f, 2.27f, -1.453f)
                horizontalLineToRelative(5.882f)
                curveToRelative(0.972f, 0.0f, 1.862f, 0.57f, 2.271f, 1.453f)
                lineToRelative(0.714f, 1.547f)
                lineTo(6.052f, 13.0f)
                close()
                moveTo(5.5f, 3.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(7.053f)
                lineToRelative(-1.089f, -2.358f)
                curveToRelative(-0.896f, -1.941f, -2.856f, -3.195f, -4.994f, -3.195f)
                horizontalLineToRelative(-5.882f)
                curveToRelative(-2.138f, 0.0f, -4.098f, 1.254f, -4.994f, 3.195f)
                lineToRelative(-1.041f, 2.256f)
                verticalLineToRelative(-6.952f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(6.04f, 19.0f)
                curveToRelative(-0.279f, 0.0f, -0.542f, -0.109f, -0.738f, -0.308f)
                reflectiveCurveToRelative(-0.303f, -0.461f, -0.3f, -0.772f)
                curveToRelative(-0.009f, -0.785f, -0.002f, -1.92f, -0.002f, -1.92f)
                horizontalLineToRelative(1.977f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.023f)
                lineToRelative(-0.023f, 1.962f)
                curveToRelative(0.0f, 0.572f, -0.466f, 1.038f, -1.038f, 1.038f)
                lineTo(6.04f, 19.0f)
                close()
            }
        }
        .build()
        return _truckFront!!
    }

private var _truckFront: ImageVector? = null
