package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.BoxTissue: ImageVector
    get() {
        if (_boxTissue != null) {
            return _boxTissue!!
        }
        _boxTissue = Builder(name = "BoxTissue", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 24.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                horizontalLineTo(0.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 1.628f)
                curveToRelative(0.0f, 0.144f, -0.288f, 2.074f, -1.668f, 8.77f)
                curveToRelative(-0.191f, 0.929f, -1.011f, 1.602f, -1.96f, 1.602f)
                horizontalLineToRelative(-1.369f)
                lineToRelative(0.326f, -3.917f)
                curveToRelative(0.046f, -0.551f, -0.362f, -1.034f, -0.913f, -1.079f)
                curveToRelative(-0.564f, -0.062f, -1.034f, 0.362f, -1.079f, 0.913f)
                lineToRelative(-0.337f, 4.083f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.504f, -6.083f)
                curveToRelative(-0.045f, -0.55f, -0.517f, -0.971f, -1.079f, -0.913f)
                curveToRelative(-0.551f, 0.046f, -0.959f, 0.528f, -0.913f, 1.079f)
                lineToRelative(0.493f, 5.917f)
                horizontalLineToRelative(-1.36f)
                curveToRelative(-0.952f, 0.0f, -1.774f, -0.677f, -1.962f, -1.61f)
                curveTo(4.353f, 3.824f, 4.0f, 1.771f, 4.0f, 1.628f)
                curveTo(4.0f, 0.745f, 4.643f, 0.037f, 5.463f, 0.017f)
                curveToRelative(0.666f, 0.0f, 1.375f, 0.426f, 2.146f, 1.337f)
                curveToRelative(0.341f, 0.402f, 0.678f, 0.645f, 0.901f, 0.646f)
                curveToRelative(0.231f, -0.003f, 0.808f, -0.519f, 1.103f, -0.783f)
                curveToRelative(0.577f, -0.519f, 1.359f, -1.226f, 2.42f, -1.217f)
                curveToRelative(0.997f, 0.0f, 1.78f, 0.702f, 2.354f, 1.217f)
                curveToRelative(0.295f, 0.265f, 0.871f, 0.78f, 1.124f, 0.783f)
                curveToRelative(0.202f, -0.002f, 0.539f, -0.244f, 0.881f, -0.647f)
                curveTo(17.177f, 0.425f, 17.854f, -0.003f, 18.537f, 0.017f)
                curveToRelative(0.82f, 0.021f, 1.463f, 0.729f, 1.463f, 1.611f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.793f, 8.336f)
                curveToRelative(-0.191f, 0.95f, -0.37f, 1.822f, -0.502f, 2.466f)
                curveToRelative(-0.382f, 1.854f, -2.03f, 3.198f, -3.919f, 3.198f)
                horizontalLineTo(7.637f)
                curveToRelative(-1.898f, 0.0f, -3.549f, -1.353f, -3.923f, -3.217f)
                curveToRelative(-0.184f, -0.913f, -0.344f, -1.715f, -0.49f, -2.452f)
                curveToRelative(-1.882f, 0.718f, -3.224f, 2.538f, -3.224f, 4.669f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -2.125f, -1.334f, -3.941f, -3.207f, -4.664f)
                close()
            }
        }
        .build()
        return _boxTissue!!
    }

private var _boxTissue: ImageVector? = null
