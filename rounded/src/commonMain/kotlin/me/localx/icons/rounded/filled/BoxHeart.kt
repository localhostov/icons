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

public val Icons.Filled.BoxHeart: ImageVector
    get() {
        if (_boxHeart != null) {
            return _boxHeart!!
        }
        _boxHeart = Builder(name = "BoxHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.039f, 15.273f)
                curveToRelative(0.0f, 0.428f, -0.293f, 1.664f, -2.988f, 3.88f)
                curveToRelative(-2.718f, -2.216f, -3.012f, -3.452f, -3.012f, -3.88f)
                curveToRelative(0.0f, -0.681f, 0.449f, -1.235f, 1.0f, -1.235f)
                reflectiveCurveToRelative(1.0f, 0.554f, 1.0f, 1.235f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.681f, 0.449f, -1.235f, 1.0f, -1.235f)
                reflectiveCurveToRelative(1.0f, 0.554f, 1.0f, 1.235f)
                close()
                moveTo(23.001f, 11.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(-0.003f, 2.76f, -2.24f, 4.997f, -5.0f, 5.0f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-2.76f, -0.003f, -4.997f, -2.24f, -5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(20.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(17.039f, 15.273f)
                curveToRelative(0.0f, -1.784f, -1.346f, -3.235f, -3.0f, -3.235f)
                curveToRelative(-0.768f, 0.0f, -1.469f, 0.312f, -2.0f, 0.826f)
                curveToRelative(-0.531f, -0.513f, -1.232f, -0.826f, -2.0f, -0.826f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.451f, -3.0f, 3.235f)
                curveToRelative(0.0f, 1.598f, 1.226f, 3.374f, 3.748f, 5.43f)
                curveToRelative(0.363f, 0.296f, 0.808f, 0.444f, 1.252f, 0.444f)
                reflectiveCurveToRelative(0.889f, -0.148f, 1.252f, -0.444f)
                curveToRelative(2.522f, -2.056f, 3.748f, -3.832f, 3.748f, -5.43f)
                close()
                moveTo(19.218f, 0.005f)
                curveToRelative(-0.073f, -0.003f, -14.218f, -0.005f, -14.218f, -0.005f)
                curveTo(2.238f, 0.0f, 0.0f, 2.238f, 0.0f, 5.0f)
                curveToRelative(0.0f, 1.656f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.001f)
                curveToRelative(1.579f, 0.019f, 2.898f, -1.201f, 3.0f, -2.777f)
                curveTo(24.121f, 2.461f, 21.98f, 0.125f, 19.218f, 0.005f)
                close()
            }
        }
        .build()
        return _boxHeart!!
    }

private var _boxHeart: ImageVector? = null
