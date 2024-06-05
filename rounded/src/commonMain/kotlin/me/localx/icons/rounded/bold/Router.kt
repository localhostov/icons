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

public val Icons.Bold.Router: ImageVector
    get() {
        if (_router != null) {
            return _router!!
        }
        _router = Builder(name = "Router", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.5f, 15.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(4.5f, 15.0f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.019f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(19.5f, 21.0f)
                lineTo(4.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(20.182f, 6.939f)
                curveToRelative(0.586f, 0.585f, 0.586f, 1.536f, 0.0f, 2.121f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-1.412f, -1.411f, -3.709f, -1.411f, -5.121f, 0.0f)
                curveToRelative(-0.586f, 0.586f, -1.535f, 0.586f, -2.121f, 0.0f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.536f, 0.0f, -2.121f)
                curveToRelative(2.581f, -2.582f, 6.781f, -2.582f, 9.363f, 0.0f)
                close()
                moveTo(7.406f, 5.291f)
                curveToRelative(-0.567f, -0.604f, -0.536f, -1.554f, 0.068f, -2.12f)
                curveToRelative(4.501f, -4.219f, 11.551f, -4.219f, 16.051f, 0.0f)
                curveToRelative(0.604f, 0.566f, 0.636f, 1.516f, 0.069f, 2.12f)
                curveToRelative(-0.296f, 0.315f, -0.695f, 0.474f, -1.095f, 0.474f)
                curveToRelative(-0.368f, 0.0f, -0.736f, -0.134f, -1.025f, -0.406f)
                curveToRelative(-3.352f, -3.14f, -8.599f, -3.14f, -11.949f, 0.0f)
                curveToRelative(-0.605f, 0.567f, -1.555f, 0.536f, -2.12f, -0.068f)
                close()
            }
        }
        .build()
        return _router!!
    }

private var _router: ImageVector? = null
