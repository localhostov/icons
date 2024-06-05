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

public val Icons.Bold.Lasso: ImageVector
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
                arcToRelative(7.383f, 7.383f, 0.0f, false, false, 0.094f, 1.121f)
                curveToRelative(-0.018f, 0.017f, -0.039f, 0.028f, -0.057f, 0.046f)
                arcToRelative(3.991f, 3.991f, 0.0f, false, false, -0.49f, 5.038f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, -1.547f, 4.295f)
                arcToRelative(4.373f, 4.373f, 0.0f, false, false, 4.5f, 4.5f)
                arcToRelative(1.49f, 1.49f, 0.0f, false, false, 1.489f, -1.481f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, false, -1.471f, -1.519f)
                arcToRelative(1.378f, 1.378f, 0.0f, false, true, -1.518f, -1.5f)
                arcToRelative(3.392f, 3.392f, 0.0f, false, true, 1.222f, -2.75f)
                arcToRelative(17.347f, 17.347f, 0.0f, false, false, 3.25f, 0.263f)
                curveToRelative(0.168f, 0.0f, 0.325f, -0.01f, 0.492f, -0.013f)
                arcToRelative(13.092f, 13.092f, 0.0f, false, false, 5.036f, 1.0f)
                curveToRelative(6.065f, 0.0f, 11.0f, -4.037f, 11.0f, -9.0f)
                reflectiveCurveToRelative(-4.935f, -9.0f, -11.0f, -9.0f)
                close()
                moveTo(13.0f, 15.0f)
                arcToRelative(10.312f, 10.312f, 0.0f, false, true, -2.735f, -0.377f)
                arcToRelative(18.684f, 18.684f, 0.0f, false, false, -2.59f, -4.455f)
                arcToRelative(3.962f, 3.962f, 0.0f, false, false, -2.675f, -1.152f)
                verticalLineToRelative(-0.016f)
                curveToRelative(0.0f, -3.309f, 3.589f, -6.0f, 8.0f, -6.0f)
                reflectiveCurveToRelative(8.0f, 2.691f, 8.0f, 6.0f)
                reflectiveCurveToRelative(-3.589f, 6.0f, -8.0f, 6.0f)
                close()
            }
        }
        .build()
        return _lasso!!
    }

private var _lasso: ImageVector? = null
