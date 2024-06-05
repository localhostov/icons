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

public val Icons.Filled.HorseSaddle: ImageVector
    get() {
        if (_horseSaddle != null) {
            return _horseSaddle!!
        }
        _horseSaddle = Builder(name = "HorseSaddle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 15.816f)
                verticalLineToRelative(3.184f)
                horizontalLineToRelative(-0.383f)
                lineToRelative(-0.401f, 3.245f)
                curveToRelative(-0.124f, 1.002f, -0.975f, 1.755f, -1.985f, 1.755f)
                horizontalLineToRelative(-0.084f)
                curveToRelative(-1.214f, 0.0f, -2.147f, -1.072f, -1.981f, -2.274f)
                lineToRelative(0.366f, -2.646f)
                curveToRelative(-0.112f, -0.36f, -0.251f, -0.755f, -0.396f, -1.172f)
                curveToRelative(-0.489f, -1.4f, -1.087f, -3.127f, -1.133f, -4.72f)
                curveToRelative(-1.323f, 1.083f, -2.003f, 3.02f, -2.003f, 5.812f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -5.683f, 2.546f, -7.73f, 4.682f, -8.448f)
                curveToRelative(0.734f, -0.907f, 2.059f, -1.552f, 3.312f, -1.552f)
                horizontalLineToRelative(0.006f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.302f, 0.839f, 2.402f, 2.0f, 2.816f)
                close()
                moveTo(23.138f, 6.906f)
                curveToRelative(-2.098f, -0.842f, -3.661f, -2.537f, -4.138f, -4.444f)
                lineTo(19.0f, 0.693f)
                curveToRelative(0.0f, -0.461f, -0.447f, -0.805f, -0.888f, -0.669f)
                curveToRelative(-1.014f, 0.312f, -1.796f, 1.267f, -2.033f, 2.315f)
                curveToRelative(-3.163f, 1.041f, -4.079f, 4.291f, -4.079f, 6.162f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.302f, -0.839f, 2.402f, -2.0f, 2.816f)
                verticalLineToRelative(3.184f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.893f)
                curveToRelative(0.0f, 0.996f, 0.681f, 1.92f, 1.664f, 2.08f)
                curveToRelative(1.253f, 0.204f, 2.336f, -0.758f, 2.336f, -1.973f)
                verticalLineToRelative(-3.395f)
                lineToRelative(0.385f, -1.811f)
                curveToRelative(0.417f, -1.46f, 0.615f, -2.416f, 0.615f, -3.896f)
                verticalLineToRelative(-1.994f)
                curveToRelative(0.0f, -0.514f, 0.389f, -0.944f, 0.901f, -0.995f)
                lineToRelative(2.816f, -0.282f)
                curveToRelative(0.729f, -0.073f, 1.283f, -0.686f, 1.283f, -1.418f)
                curveToRelative(0.0f, -0.568f, -0.335f, -1.093f, -0.862f, -1.305f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _horseSaddle!!
    }

private var _horseSaddle: ImageVector? = null
