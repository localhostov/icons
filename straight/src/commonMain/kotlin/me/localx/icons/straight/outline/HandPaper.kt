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

public val Icons.Outline.HandPaper: ImageVector
    get() {
        if (_handPaper != null) {
            return _handPaper!!
        }
        _handPaper = Builder(name = "HandPaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.947f, 3.714f)
                curveToRelative(-0.671f, -0.571f, -1.562f, -0.815f, -2.438f, -0.674f)
                curveToRelative(-0.216f, 0.035f, -0.421f, 0.102f, -0.618f, 0.184f)
                curveToRelative(-0.344f, -1.277f, -1.501f, -2.224f, -2.886f, -2.224f)
                curveToRelative(-0.537f, 0.0f, -1.034f, 0.153f, -1.471f, 0.401f)
                curveTo(15.002f, 0.562f, 14.07f, 0.0f, 13.005f, 0.0f)
                curveTo(11.621f, 0.0f, 10.464f, 0.948f, 10.119f, 2.225f)
                curveToRelative(-0.197f, -0.082f, -0.402f, -0.149f, -0.618f, -0.184f)
                curveToRelative(-0.877f, -0.146f, -1.769f, 0.102f, -2.439f, 0.673f)
                curveToRelative(-0.672f, 0.571f, -1.057f, 1.404f, -1.057f, 2.286f)
                verticalLineToRelative(8.565f)
                lineToRelative(-0.955f, -0.758f)
                curveToRelative(-1.207f, -1.129f, -3.107f, -1.063f, -4.236f, 0.143f)
                curveToRelative(-1.129f, 1.208f, -1.066f, 3.111f, 0.13f, 4.231f)
                lineToRelative(3.193f, 3.079f)
                curveToRelative(2.5f, 2.411f, 5.792f, 3.739f, 9.266f, 3.739f)
                horizontalLineToRelative(1.665f)
                curveToRelative(4.928f, 0.0f, 8.937f, -4.009f, 8.937f, -8.937f)
                lineTo(24.005f, 6.0f)
                curveToRelative(0.0f, -0.881f, -0.385f, -1.715f, -1.058f, -2.286f)
                close()
                moveTo(22.005f, 15.063f)
                curveToRelative(0.0f, 3.825f, -3.112f, 6.937f, -6.937f, 6.937f)
                horizontalLineToRelative(-1.665f)
                curveToRelative(-2.954f, 0.0f, -5.751f, -1.129f, -7.877f, -3.179f)
                lineToRelative(-3.204f, -3.089f)
                curveToRelative(-0.403f, -0.377f, -0.424f, -1.012f, -0.047f, -1.416f)
                curveToRelative(0.375f, -0.403f, 1.007f, -0.424f, 1.47f, 0.004f)
                lineToRelative(4.26f, 3.391f)
                lineTo(8.005f, 5.0f)
                curveToRelative(0.0f, -0.294f, 0.128f, -0.572f, 0.353f, -0.763f)
                curveToRelative(0.227f, -0.193f, 0.518f, -0.273f, 0.823f, -0.223f)
                curveToRelative(0.462f, 0.075f, 0.824f, 0.555f, 0.824f, 1.092f)
                verticalLineToRelative(5.893f)
                horizontalLineToRelative(2.0f)
                lineTo(12.005f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.449f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.893f)
                curveToRelative(0.0f, -0.538f, 0.362f, -1.018f, 0.825f, -1.093f)
                curveToRelative(0.305f, -0.046f, 0.596f, 0.03f, 0.822f, 0.223f)
                curveToRelative(0.225f, 0.191f, 0.353f, 0.469f, 0.353f, 0.763f)
                verticalLineToRelative(9.063f)
                close()
            }
        }
        .build()
        return _handPaper!!
    }

private var _handPaper: ImageVector? = null
