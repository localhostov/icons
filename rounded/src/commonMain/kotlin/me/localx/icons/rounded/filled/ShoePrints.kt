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

public val Icons.Filled.ShoePrints: ImageVector
    get() {
        if (_shoePrints != null) {
            return _shoePrints!!
        }
        _shoePrints = Builder(name = "ShoePrints", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 19.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(15.873f, 17.0f)
                horizontalLineToRelative(7.172f)
                curveToRelative(0.078f, -0.86f, 0.247f, -1.546f, 0.424f, -2.257f)
                curveToRelative(0.261f, -1.042f, 0.53f, -2.12f, 0.53f, -3.743f)
                curveToRelative(0.0f, -7.383f, -4.331f, -9.0f, -6.0f, -9.0f)
                curveToRelative(-2.408f, 0.0f, -5.0f, 2.19f, -5.0f, 7.0f)
                curveToRelative(0.0f, 1.736f, 0.816f, 3.369f, 1.605f, 4.947f)
                curveToRelative(0.531f, 1.063f, 1.04f, 2.082f, 1.268f, 3.053f)
                close()
                moveTo(0.955f, 15.0f)
                horizontalLineToRelative(7.172f)
                curveToRelative(0.228f, -0.971f, 0.737f, -1.99f, 1.268f, -3.053f)
                curveToRelative(0.789f, -1.579f, 1.605f, -3.211f, 1.605f, -4.947f)
                curveTo(11.0f, 2.19f, 8.408f, 0.0f, 6.0f, 0.0f)
                curveTo(4.331f, 0.0f, 0.0f, 1.617f, 0.0f, 9.0f)
                curveToRelative(0.0f, 1.623f, 0.27f, 2.701f, 0.53f, 3.743f)
                curveToRelative(0.178f, 0.712f, 0.347f, 1.397f, 0.424f, 2.257f)
                close()
                moveTo(1.0f, 17.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                lineTo(1.0f, 17.0f)
                close()
            }
        }
        .build()
        return _shoePrints!!
    }

private var _shoePrints: ImageVector? = null
