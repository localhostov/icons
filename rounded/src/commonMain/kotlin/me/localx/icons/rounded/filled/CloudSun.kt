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

public val Icons.Filled.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.892f, 24.0f)
                curveToRelative(-1.96f, 0.0f, -3.837f, -0.008f, -4.491f, -0.026f)
                arcToRelative(3.749f, 3.749f, 0.0f, false, true, -0.834f, -0.121f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.449f, -6.588f)
                arcToRelative(6.366f, 6.366f, 0.0f, false, true, 0.057f, -2.732f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.368f, -0.855f)
                curveToRelative(0.136f, 0.326f, 0.763f, 0.469f, 0.763f, 0.469f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.014f, 5.014f, 0.0f, false, true, 3.559f, 6.0f)
                arcToRelative(4.951f, 4.951f, 0.0f, false, true, -3.7f, 3.7f)
                arcToRelative(5.283f, 5.283f, 0.0f, false, true, -1.064f, 0.131f)
                curveTo(18.229f, 23.99f, 16.013f, 24.0f, 13.892f, 24.0f)
                close()
                moveTo(8.987f, 9.755f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, true, 7.178f, -1.476f)
                arcToRelative(1.928f, 1.928f, 0.0f, false, false, 1.493f, -0.21f)
                lineTo(20.105f, 6.64f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 19.0f, 4.972f)
                lineToRelative(-2.641f, 1.75f)
                curveToRelative(-0.554f, 0.281f, -0.843f, -0.442f, -1.27f, -0.717f)
                lineToRelative(1.843f, -3.146f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.727f, -1.011f)
                lineTo(13.384f, 4.963f)
                arcTo(6.137f, 6.137f, 0.0f, false, false, 12.0f, 4.577f)
                verticalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineTo(4.58f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -1.326f, 0.363f)
                lineTo(6.831f, 1.834f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.11f, 2.854f)
                lineTo(6.944f, 5.947f)
                arcToRelative(6.718f, 6.718f, 0.0f, false, false, -0.951f, 0.934f)
                lineToRelative(-3.1f, -1.814f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.01f, 1.725f)
                lineTo(4.962f, 8.6f)
                arcTo(6.206f, 6.206f, 0.0f, false, false, 4.575f, 10.0f)
                horizontalLineTo(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(4.576f)
                arcToRelative(6.425f, 6.425f, 0.0f, false, false, 0.2f, 0.882f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.3f, 0.54f)
                lineTo(1.768f, 15.034f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.023f, 1.719f)
                lineToRelative(2.59f, -1.513f)
                arcToRelative(1.739f, 1.739f, 0.0f, false, false, 0.83f, -1.094f)
                arcTo(7.981f, 7.981f, 0.0f, false, true, 8.987f, 9.755f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
