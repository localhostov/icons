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

public val Icons.Filled.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 4.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.09f)
                curveToRelative(2.833f, 0.478f, 5.0f, 2.942f, 5.0f, 5.91f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 2.481f, -2.019f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.31f, 0.0f, -4.197f, -1.756f, -4.449f, -4.0f)
                horizontalLineToRelative(6.949f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.967f, 2.167f, -5.431f, 5.0f, -5.91f)
                verticalLineToRelative(-2.025f)
                curveToRelative(-1.232f, 0.137f, -2.427f, 0.517f, -3.499f, 1.138f)
                curveToRelative(-0.158f, 0.091f, -0.33f, 0.134f, -0.5f, 0.134f)
                curveToRelative(-0.345f, 0.0f, -0.681f, -0.179f, -0.867f, -0.499f)
                curveToRelative(-0.276f, -0.478f, -0.113f, -1.09f, 0.365f, -1.367f)
                curveToRelative(1.376f, -0.796f, 2.917f, -1.262f, 4.501f, -1.407f)
                verticalLineToRelative(-1.066f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(23.189f, 0.463f)
                curveToRelative(-0.515f, -0.403f, -1.172f, -0.542f, -1.848f, -0.373f)
                lineToRelative(-4.408f, 1.293f)
                curveToRelative(-1.156f, 0.355f, -1.934f, 1.406f, -1.934f, 2.616f)
                reflectiveCurveToRelative(0.78f, 2.265f, 1.946f, 2.62f)
                lineToRelative(4.434f, 1.317f)
                curveToRelative(0.171f, 0.043f, 0.345f, 0.064f, 0.516f, 0.064f)
                curveToRelative(0.464f, 0.0f, 0.917f, -0.154f, 1.293f, -0.448f)
                curveToRelative(0.515f, -0.402f, 0.811f, -1.008f, 0.811f, -1.662f)
                verticalLineToRelative(-3.766f)
                curveToRelative(0.0f, -0.654f, -0.295f, -1.259f, -0.811f, -1.662f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
