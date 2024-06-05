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

public val Icons.Outline.LimitHand: ImageVector
    get() {
        if (_limitHand != null) {
            return _limitHand!!
        }
        _limitHand = Builder(name = "LimitHand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(-6.0f, -10.286f)
                lineToRelative(-6.0f, 10.286f)
                close()
                moveTo(19.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(14.03f)
                lineToRelative(-2.0f, -3.429f)
                lineTo(22.0f, 6.0f)
                curveToRelative(0.0f, -0.294f, -0.129f, -0.572f, -0.353f, -0.763f)
                curveToRelative(-0.229f, -0.192f, -0.521f, -0.272f, -0.822f, -0.223f)
                curveToRelative(-0.463f, 0.075f, -0.825f, 0.555f, -0.825f, 1.093f)
                verticalLineToRelative(4.893f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(14.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.893f)
                curveToRelative(0.0f, -0.538f, -0.362f, -1.018f, -0.825f, -1.093f)
                curveToRelative(-0.303f, -0.051f, -0.595f, 0.029f, -0.822f, 0.223f)
                curveToRelative(-0.224f, 0.19f, -0.353f, 0.469f, -0.353f, 0.763f)
                verticalLineToRelative(12.712f)
                lineToRelative(-4.261f, -3.392f)
                curveToRelative(-0.254f, -0.234f, -0.5f, -0.315f, -0.774f, -0.319f)
                curveToRelative(-0.266f, 0.009f, -0.513f, 0.121f, -0.694f, 0.315f)
                curveToRelative(-0.378f, 0.403f, -0.356f, 1.038f, 0.046f, 1.416f)
                lineToRelative(6.501f, 6.268f)
                horizontalLineToRelative(2.034f)
                lineToRelative(-1.167f, 2.0f)
                horizontalLineToRelative(-1.673f)
                lineTo(0.938f, 17.182f)
                curveToRelative(-1.196f, -1.121f, -1.259f, -3.023f, -0.129f, -4.231f)
                curveToRelative(1.128f, -1.205f, 3.027f, -1.271f, 4.235f, -0.143f)
                lineToRelative(0.955f, 0.759f)
                lineTo(5.999f, 5.0f)
                curveToRelative(0.0f, -0.882f, 0.386f, -1.715f, 1.058f, -2.286f)
                curveToRelative(0.672f, -0.572f, 1.56f, -0.815f, 2.439f, -0.674f)
                curveToRelative(0.216f, 0.035f, 0.42f, 0.102f, 0.617f, 0.184f)
                curveToRelative(0.344f, -1.277f, 1.501f, -2.224f, 2.885f, -2.224f)
                curveToRelative(1.065f, 0.0f, 1.997f, 0.562f, 2.529f, 1.401f)
                curveToRelative(0.437f, -0.248f, 0.934f, -0.401f, 1.471f, -0.401f)
                curveToRelative(1.384f, 0.0f, 2.541f, 0.947f, 2.886f, 2.224f)
                curveToRelative(0.197f, -0.082f, 0.401f, -0.149f, 0.617f, -0.184f)
                curveToRelative(0.88f, -0.142f, 1.768f, 0.102f, 2.439f, 0.674f)
                curveToRelative(0.672f, 0.571f, 1.058f, 1.404f, 1.058f, 2.286f)
                close()
            }
        }
        .build()
        return _limitHand!!
    }

private var _limitHand: ImageVector? = null
