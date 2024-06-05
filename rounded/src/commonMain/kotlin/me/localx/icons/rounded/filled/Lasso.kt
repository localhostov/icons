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

public val Icons.Filled.Lasso: ImageVector
    get() {
        if (_lasso != null) {
            return _lasso!!
        }
        _lasso = Builder(name = "Lasso", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 0.0f)
                curveToRelative(-6.065f, 0.0f, -11.0f, 4.037f, -11.0f, 9.0f)
                arcToRelative(7.544f, 7.544f, 0.0f, false, false, 0.685f, 3.107f)
                arcToRelative(2.939f, 2.939f, 0.0f, false, false, -0.435f, 3.072f)
                arcToRelative(6.976f, 6.976f, 0.0f, false, false, -2.25f, 4.821f)
                arcToRelative(3.888f, 3.888f, 0.0f, false, false, 4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.008f, -2.0f)
                arcToRelative(1.885f, 1.885f, 0.0f, false, true, -2.008f, -2.0f)
                arcToRelative(5.04f, 5.04f, 0.0f, false, true, 1.683f, -3.426f)
                arcToRelative(10.823f, 10.823f, 0.0f, false, false, 3.43f, 0.435f)
                curveToRelative(0.3f, 0.0f, 0.577f, -0.007f, 0.843f, -0.016f)
                arcToRelative(13.048f, 13.048f, 0.0f, false, false, 5.044f, 1.007f)
                curveToRelative(6.065f, 0.0f, 11.0f, -4.037f, 11.0f, -9.0f)
                reflectiveCurveToRelative(-4.935f, -9.0f, -11.0f, -9.0f)
                close()
                moveTo(13.0f, 16.0f)
                arcToRelative(11.119f, 11.119f, 0.0f, false, true, -3.907f, -0.712f)
                arcToRelative(14.454f, 14.454f, 0.0f, false, false, -1.993f, -3.412f)
                arcToRelative(3.042f, 3.042f, 0.0f, false, false, -2.691f, -0.795f)
                arcToRelative(5.535f, 5.535f, 0.0f, false, true, -0.409f, -2.081f)
                curveToRelative(0.0f, -3.859f, 4.037f, -7.0f, 9.0f, -7.0f)
                reflectiveCurveToRelative(9.0f, 3.141f, 9.0f, 7.0f)
                reflectiveCurveToRelative(-4.037f, 7.0f, -9.0f, 7.0f)
                close()
            }
        }
        .build()
        return _lasso!!
    }

private var _lasso: ImageVector? = null
