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

public val Icons.Bold.Pineapple: ImageVector
    get() {
        if (_pineapple != null) {
            return _pineapple!!
        }
        _pineapple = Builder(name = "Pineapple", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.55f, 6.416f)
                arcTo(3.784f, 3.784f, 0.0f, false, true, 17.3f, 3.772f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.59f, -2.544f)
                arcToRelative(6.817f, 6.817f, 0.0f, false, false, -2.2f, 2.237f)
                lineTo(13.51f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(10.51f, 3.465f)
                arcTo(6.817f, 6.817f, 0.0f, false, false, 8.3f, 1.228f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.59f, 2.544f)
                arcTo(3.784f, 3.784f, 0.0f, false, true, 8.45f, 6.416f)
                curveTo(3.71f, 7.662f, 3.0f, 11.538f, 3.0f, 15.0f)
                curveToRelative(0.0f, 4.19f, 1.023f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.81f, 9.0f, -9.0f)
                curveTo(21.0f, 11.538f, 20.29f, 7.662f, 15.55f, 6.416f)
                close()
                moveTo(14.241f, 20.827f)
                lineToRelative(-1.534f, -1.534f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(9.759f, 20.827f)
                arcToRelative(3.847f, 3.847f, 0.0f, false, true, -3.607f, -3.564f)
                lineToRelative(1.555f, -1.556f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineTo(6.152f, 12.737f)
                arcTo(3.847f, 3.847f, 0.0f, false, true, 9.759f, 9.173f)
                lineToRelative(1.534f, 1.534f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(1.534f, -1.534f)
                arcToRelative(3.847f, 3.847f, 0.0f, false, true, 3.607f, 3.564f)
                lineToRelative(-1.555f, 1.556f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.414f)
                lineToRelative(1.555f, 1.556f)
                arcTo(3.847f, 3.847f, 0.0f, false, true, 14.241f, 20.827f)
                close()
                moveTo(14.696f, 14.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(12.707f, 17.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(9.3f, 15.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineTo(11.293f, 12.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _pineapple!!
    }

private var _pineapple: ImageVector? = null
