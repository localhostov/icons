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

public val Icons.Filled.WomanHead: ImageVector
    get() {
        if (_womanHead != null) {
            return _womanHead!!
        }
        _womanHead = Builder(name = "WomanHead", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.925f, 18.144f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 19.0f, 24.0f)
                horizontalLineTo(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(20.41f)
                arcTo(8.218f, 8.218f, 0.0f, false, true, 12.0f, 21.0f)
                arcToRelative(8.222f, 8.222f, 0.0f, false, true, -3.0f, -0.6f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(5.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 0.075f, 18.144f)
                lineToRelative(0.3f, -1.74f)
                arcToRelative(2.939f, 2.939f, 0.0f, false, true, 5.337f, -1.138f)
                curveTo(6.976f, 17.124f, 9.409f, 19.0f, 12.0f, 19.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.13f, 0.0f, 6.214f, -2.779f, 7.13f, -5.376f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, true, 0.959f, -0.667f)
                lineToRelative(0.432f, 0.007f)
                arcTo(1.461f, 1.461f, 0.0f, false, false, 22.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.23f, -1.474f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.816f, -0.879f)
                arcTo(7.961f, 7.961f, 0.0f, false, false, 15.941f, 3.04f)
                arcToRelative(12.87f, 12.87f, 0.0f, false, true, -1.127f, 2.541f)
                arcToRelative(15.089f, 15.089f, 0.0f, false, true, -4.956f, 4.467f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.725f, 0.84f)
                arcToRelative(15.807f, 15.807f, 0.0f, false, true, -7.257f, 1.1f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.5f, 10.136f)
                arcTo(6.372f, 6.372f, 0.0f, false, false, 1.819f, 7.767f)
                curveTo(3.124f, 4.674f, 5.1f, 0.0f, 12.0f, 0.0f)
                arcToRelative(9.972f, 9.972f, 0.0f, false, true, 9.85f, 8.274f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 24.0f, 11.5f)
                arcToRelative(3.428f, 3.428f, 0.0f, false, true, -0.854f, 2.257f)
                curveToRelative(0.007f, 0.026f, 0.025f, 0.047f, 0.03f, 0.075f)
                close()
                moveTo(16.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 14.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 11.5f)
                close()
            }
        }
        .build()
        return _womanHead!!
    }

private var _womanHead: ImageVector? = null
