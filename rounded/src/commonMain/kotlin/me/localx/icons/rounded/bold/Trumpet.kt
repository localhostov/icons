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

public val Icons.Bold.Trumpet: ImageVector
    get() {
        if (_trumpet != null) {
            return _trumpet!!
        }
        _trumpet = Builder(name = "Trumpet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.261f, 2.025f)
                curveToRelative(-1.025f, -0.253f, -2.081f, 0.228f, -2.567f, 1.164f)
                curveToRelative(-1.986f, 3.824f, -4.782f, 5.514f, -6.693f, 6.254f)
                verticalLineToRelative(-0.943f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1.5f, 10.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.102f)
                curveToRelative(-0.385f, 0.751f, -0.602f, 1.6f, -0.602f, 2.5f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                curveToRelative(0.0f, -0.079f, -0.002f, -0.157f, -0.005f, -0.234f)
                curveToRelative(1.28f, 1.0f, 2.593f, 2.435f, 3.671f, 4.493f)
                curveToRelative(0.404f, 0.771f, 1.194f, 1.233f, 2.034f, 1.233f)
                curveToRelative(0.183f, 0.0f, 0.369f, -0.021f, 0.553f, -0.067f)
                curveToRelative(1.044f, -0.257f, 1.747f, -1.152f, 1.747f, -2.229f)
                lineTo(24.0f, 4.239f)
                curveToRelative(0.0f, -1.054f, -0.715f, -1.964f, -1.739f, -2.214f)
                close()
                moveTo(10.5f, 18.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.122f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(21.0f, 16.211f)
                curveToRelative(-1.673f, -2.338f, -3.606f, -3.799f, -5.317f, -4.711f)
                curveToRelative(1.71f, -0.912f, 3.644f, -2.373f, 5.317f, -4.71f)
                verticalLineToRelative(9.421f)
                close()
            }
        }
        .build()
        return _trumpet!!
    }

private var _trumpet: ImageVector? = null
