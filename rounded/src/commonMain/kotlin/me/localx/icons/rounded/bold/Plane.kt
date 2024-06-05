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

public val Icons.Bold.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                horizontalLineTo(18.374f)
                lineTo(14.315f, 1.836f)
                arcTo(3.47f, 3.47f, 0.0f, false, false, 10.964f, 0.0f)
                arcTo(3.1f, 3.1f, 0.0f, false, false, 8.551f, 1.25f)
                arcToRelative(3.131f, 3.131f, 0.0f, false, false, -0.487f, 2.805f)
                lineTo(9.705f, 9.0f)
                horizontalLineTo(8.123f)
                arcToRelative(2.492f, 2.492f, 0.0f, false, true, -1.769f, -0.732f)
                lineTo(4.937f, 6.851f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, false, -3.4f, -0.525f)
                arcTo(2.813f, 2.813f, 0.0f, false, false, 0.124f, 8.048f)
                arcToRelative(3.031f, 3.031f, 0.0f, false, false, 0.223f, 2.264f)
                reflectiveCurveToRelative(1.635f, 3.865f, 1.665f, 3.917f)
                arcTo(5.513f, 5.513f, 0.0f, false, false, 6.787f, 17.0f)
                horizontalLineTo(9.455f)
                lineTo(8.2f, 19.771f)
                arcTo(3.131f, 3.131f, 0.0f, false, false, 11.131f, 24.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.018f, -1.727f)
                lineTo(17.99f, 17.0f)
                horizontalLineTo(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(10.929f, 3.165f)
                curveTo(10.924f, 3.148f, 10.9f, 3.0f, 11.053f, 3.0f)
                horizontalLineToRelative(0.192f)
                arcToRelative(0.458f, 0.458f, 0.0f, false, true, 0.442f, 0.281f)
                lineTo(14.926f, 9.0f)
                horizontalLineTo(12.865f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineTo(17.227f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.212f, 0.617f)
                reflectiveCurveTo(11.6f, 20.683f, 11.57f, 20.739f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.439f, 0.261f)
                curveToRelative(-0.161f, 0.0f, -0.133f, -0.121f, -0.139f, -0.121f)
                lineToRelative(2.154f, -4.76f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.78f, 14.0f)
                horizontalLineTo(6.787f)
                arcToRelative(2.508f, 2.508f, 0.0f, false, true, -2.13f, -1.191f)
                lineTo(3.2f, 9.354f)
                lineToRelative(1.034f, 1.035f)
                arcTo(5.468f, 5.468f, 0.0f, false, false, 8.123f, 12.0f)
                horizontalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
