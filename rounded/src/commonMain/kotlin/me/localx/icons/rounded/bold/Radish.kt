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

public val Icons.Bold.Radish: ImageVector
    get() {
        if (_radish != null) {
            return _radish!!
        }
        _radish = Builder(name = "Radish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.259f, 9.765f)
                arcToRelative(13.191f, 13.191f, 0.0f, false, false, 2.355f, -1.689f)
                arcToRelative(4.731f, 4.731f, 0.0f, false, false, -6.69f, -6.69f)
                arcToRelative(13.191f, 13.191f, 0.0f, false, false, -1.689f, 2.355f)
                arcToRelative(2.618f, 2.618f, 0.0f, false, false, -5.223f, -0.347f)
                curveToRelative(-0.165f, 1.88f, 1.141f, 3.563f, 1.43f, 7.185f)
                arcTo(7.713f, 7.713f, 0.0f, false, false, 6.0f, 9.0f)
                horizontalLineTo(6.0f)
                arcToRelative(6.268f, 6.268f, 0.0f, false, false, -4.474f, 1.969f)
                curveTo(0.039f, 12.451f, 0.036f, 14.7f, 0.033f, 16.877f)
                curveToRelative(0.0f, 0.405f, -0.018f, 2.837f, -0.018f, 2.837f)
                arcTo(4.268f, 4.268f, 0.0f, false, false, 4.283f, 24.0f)
                reflectiveCurveToRelative(2.468f, -0.011f, 2.886f, -0.011f)
                curveToRelative(2.157f, 0.0f, 4.407f, 0.0f, 5.886f, -1.477f)
                curveToRelative(2.52f, -2.523f, 2.6f, -5.849f, 0.34f, -8.989f)
                curveToRelative(3.928f, 0.2f, 5.243f, 1.637f, 7.211f, 1.465f)
                arcToRelative(2.618f, 2.618f, 0.0f, false, false, -0.347f, -5.223f)
                close()
                moveTo(18.045f, 3.507f)
                arcToRelative(1.731f, 1.731f, 0.0f, true, true, 2.448f, 2.448f)
                arcTo(31.023f, 31.023f, 0.0f, false, true, 14.62f, 9.38f)
                arcTo(31.023f, 31.023f, 0.0f, false, true, 18.045f, 3.507f)
                close()
                moveTo(10.933f, 20.392f)
                curveToRelative(-0.6f, 0.6f, -2.2f, 0.606f, -3.763f, 0.6f)
                lineTo(4.283f, 21.0f)
                arcToRelative(1.268f, 1.268f, 0.0f, false, true, -1.268f, -1.274f)
                reflectiveCurveToRelative(0.018f, -2.414f, 0.018f, -2.845f)
                curveToRelative(0.0f, -1.567f, 0.0f, -3.187f, 0.61f, -3.792f)
                arcTo(3.256f, 3.256f, 0.0f, false, true, 6.0f, 12.0f)
                horizontalLineTo(6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.941f, 2.07f)
                curveTo(11.3f, 15.438f, 13.245f, 18.076f, 10.933f, 20.392f)
                close()
            }
        }
        .build()
        return _radish!!
    }

private var _radish: ImageVector? = null
