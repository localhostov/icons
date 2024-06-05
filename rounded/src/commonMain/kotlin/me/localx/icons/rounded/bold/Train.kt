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

public val Icons.Bold.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 12.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 17.0f)
                close()
                moveTo(20.879f, 21.909f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.758f, 1.182f)
                lineToRelative(-0.879f, -2.051f)
                arcTo(13.646f, 13.646f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(13.669f, 13.669f, 0.0f, false, true, -5.242f, -0.96f)
                lineToRelative(-0.879f, 2.051f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.758f, -1.182f)
                lineToRelative(1.108f, -2.584f)
                arcTo(5.335f, 5.335f, 0.0f, false, true, 3.0f, 15.918f)
                lineTo(3.0f, 5.984f)
                arcTo(5.277f, 5.277f, 0.0f, false, true, 6.644f, 0.937f)
                arcTo(17.537f, 17.537f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(17.527f, 17.527f, 0.0f, false, true, 5.356f, 0.937f)
                arcTo(5.277f, 5.277f, 0.0f, false, true, 21.0f, 5.984f)
                verticalLineToRelative(9.934f)
                arcToRelative(5.337f, 5.337f, 0.0f, false, true, -1.228f, 3.408f)
                close()
                moveTo(6.0f, 6.25f)
                curveTo(6.0f, 8.2f, 8.118f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(6.0f, -3.8f, 6.0f, -5.75f)
                lineTo(18.0f, 5.984f)
                arcTo(2.287f, 2.287f, 0.0f, false, false, 16.432f, 3.79f)
                curveToRelative(-0.345f, -0.112f, -0.685f, -0.206f, -1.022f, -0.295f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 4.5f)
                lineTo(10.0f, 4.5f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, -1.409f, -1.0f)
                curveToRelative(-0.338f, 0.089f, -0.678f, 0.183f, -1.023f, 0.295f)
                arcTo(2.287f, 2.287f, 0.0f, false, false, 6.0f, 5.984f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(9.959f, 9.959f, 0.0f, false, false, 4.868f, -1.083f)
                arcToRelative(2.268f, 2.268f, 0.0f, false, false, 1.132f, -2.0f)
                lineTo(18.0f, 12.6f)
                arcToRelative(8.692f, 8.692f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineToRelative(3.321f)
                arcToRelative(2.272f, 2.272f, 0.0f, false, false, 1.134f, 2.0f)
                arcTo(9.959f, 9.959f, 0.0f, false, false, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
