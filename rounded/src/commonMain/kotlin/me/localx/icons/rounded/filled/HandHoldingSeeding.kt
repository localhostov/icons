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

public val Icons.Filled.HandHoldingSeeding: ImageVector
    get() {
        if (_handHoldingSeeding != null) {
            return _handHoldingSeeding!!
        }
        _handHoldingSeeding = Builder(name = "HandHoldingSeeding", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.003f, 1.248f)
                curveTo(3.953f, 0.546f, 4.546f, -0.047f, 5.248f, 0.003f)
                curveToRelative(4.489f, 0.316f, 6.511f, 2.401f, 6.752f, 6.997f)
                curveTo(12.241f, 2.404f, 14.263f, 0.319f, 18.752f, 0.003f)
                curveToRelative(0.701f, -0.049f, 1.294f, 0.543f, 1.245f, 1.245f)
                curveToRelative(-0.316f, 4.489f, -2.407f, 6.486f, -7.002f, 6.727f)
                curveToRelative(0.0f, 0.009f, 0.005f, 0.017f, 0.005f, 0.026f)
                verticalLineToRelative(2.0f)
                curveToRelative(-0.005f, 1.308f, -1.995f, 1.307f, -2.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.009f, 0.005f, -0.017f, 0.005f, -0.026f)
                curveToRelative(-4.596f, -0.241f, -6.686f, -2.238f, -7.002f, -6.727f)
                close()
                moveTo(23.444f, 13.258f)
                curveToRelative(-0.521f, -0.723f, -1.323f, -1.178f, -2.203f, -1.248f)
                curveToRelative(-0.875f, -0.076f, -1.74f, 0.246f, -2.331f, 0.839f)
                lineToRelative(-1.947f, 1.786f)
                curveToRelative(0.284f, 2.315f, -1.649f, 4.38f, -3.963f, 4.365f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.308f, -0.005f, -1.307f, -1.995f, 0.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.629f, -0.048f, 2.627f, -3.953f, 0.0f, -4.0f)
                horizontalLineToRelative(-3.912f)
                curveToRelative(-2.938f, 0.0f, -5.7f, 1.145f, -7.797f, 3.24f)
                lineToRelative(-1.017f, 1.071f)
                curveToRelative(-0.176f, 0.186f, -0.274f, 0.433f, -0.274f, 0.688f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineTo(11.32f)
                curveToRelative(2.746f, 0.0f, 5.377f, -1.019f, 7.408f, -2.868f)
                lineToRelative(4.318f, -3.935f)
                curveToRelative(1.07f, -1.073f, 1.241f, -2.766f, 0.397f, -3.939f)
                close()
            }
        }
        .build()
        return _handHoldingSeeding!!
    }

private var _handHoldingSeeding: ImageVector? = null
