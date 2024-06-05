package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) {
            return _cloudUpload!!
        }
        _cloudUpload = Builder(name = "CloudUpload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.419f, 10.0f)
                arcToRelative(8.269f, 8.269f, 0.0f, false, false, -4.442f, -3.063f)
                arcTo(8.185f, 8.185f, 0.0f, false, false, 8.258f, 1.111f)
                arcTo(8.174f, 8.174f, 0.0f, false, false, 2.6f, 12.375f)
                arcTo(5.781f, 5.781f, 0.0f, false, false, 0.188f, 18.694f)
                arcTo(5.85f, 5.85f, 0.0f, false, false, 5.944f, 23.0f)
                horizontalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 21.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 20.0f)
                horizontalLineTo(5.944f)
                arcTo(2.893f, 2.893f, 0.0f, false, true, 3.1f, 17.958f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 2.0f, -3.446f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.83f, -2.346f)
                arcTo(5.2f, 5.2f, 0.0f, false, true, 5.119f, 7.6f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 3.7f, -3.539f)
                arcToRelative(5.589f, 5.589f, 0.0f, false, true, 1.264f, -0.147f)
                arcToRelative(5.14f, 5.14f, 0.0f, false, true, 3.118f, 1.042f)
                arcToRelative(5.216f, 5.216f, 0.0f, false, true, 2.014f, 3.442f)
                arcToRelative(1.508f, 1.508f, 0.0f, false, false, 1.288f, 1.3f)
                arcTo(5.227f, 5.227f, 0.0f, false, true, 20.0f, 11.774f)
                arcToRelative(5.155f, 5.155f, 0.0f, false, true, 0.92f, 3.958f)
                arcToRelative(5.031f, 5.031f, 0.0f, false, true, -2.246f, 3.319f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 20.307f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.515f, 1.515f, 0.0f, false, false, 2.313f, 1.3f)
                arcToRelative(8.016f, 8.016f, 0.0f, false, false, 3.565f, -5.363f)
                arcTo(8.127f, 8.127f, 0.0f, false, false, 22.419f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 22.5f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(1.663f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -1.707f)
                lineTo(14.707f, 12.13f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(10.13f, 15.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.837f, 17.0f)
                horizontalLineTo(12.5f)
                verticalLineToRelative(5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
