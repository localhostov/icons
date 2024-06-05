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

public val Icons.Filled.SquareA: ImageVector
    get() {
        if (_squareA != null) {
            return _squareA!!
        }
        _squareA = Builder(name = "SquareA", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.019f, -0.077f)
                lineTo(5.019f, -0.077f)
                curveTo(2.262f, -0.077f, 0.019f, 2.166f, 0.019f, 4.923f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.019f, 4.923f)
                curveTo(24.019f, 2.166f, 21.776f, -0.077f, 19.019f, -0.077f)
                close()
                moveTo(18.362f, 18.879f)
                curveToRelative(-0.113f, 0.041f, -0.229f, 0.061f, -0.343f, 0.061f)
                curveToRelative(-0.408f, 0.0f, -0.792f, -0.252f, -0.939f, -0.658f)
                lineToRelative(-1.197f, -3.282f)
                horizontalLineToRelative(-7.726f)
                lineToRelative(-1.197f, 3.282f)
                curveToRelative(-0.189f, 0.519f, -0.763f, 0.785f, -1.282f, 0.597f)
                curveToRelative(-0.519f, -0.189f, -0.786f, -0.763f, -0.597f, -1.282f)
                lineToRelative(3.831f, -10.5f)
                curveToRelative(0.471f, -1.327f, 1.692f, -2.19f, 3.109f, -2.19f)
                reflectiveCurveToRelative(2.639f, 0.863f, 3.112f, 2.198f)
                lineToRelative(3.827f, 10.492f)
                curveToRelative(0.189f, 0.519f, -0.078f, 1.093f, -0.597f, 1.282f)
                close()
                moveTo(13.25f, 7.782f)
                lineToRelative(1.903f, 5.218f)
                horizontalLineToRelative(-6.267f)
                lineToRelative(1.906f, -5.226f)
                curveToRelative(0.286f, -0.805f, 1.012f, -0.867f, 1.227f, -0.867f)
                reflectiveCurveToRelative(0.942f, 0.062f, 1.23f, 0.875f)
                close()
            }
        }
        .build()
        return _squareA!!
    }

private var _squareA: ImageVector? = null
