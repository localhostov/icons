package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

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
                arcToRelative(8.268f, 8.268f, 0.0f, false, false, -4.443f, -3.063f)
                arcTo(8.243f, 8.243f, 0.0f, false, false, 15.015f, 2.56f)
                arcTo(8.177f, 8.177f, 0.0f, false, false, 2.6f, 12.375f)
                arcTo(5.783f, 5.783f, 0.0f, false, false, 0.188f, 18.694f)
                arcTo(5.852f, 5.852f, 0.0f, false, false, 5.944f, 23.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.944f)
                arcTo(2.892f, 2.892f, 0.0f, false, true, 3.1f, 17.958f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 2.0f, -3.446f)
                lineToRelative(2.155f, -0.557f)
                lineTo(5.93f, 12.166f)
                arcToRelative(5.171f, 5.171f, 0.0f, false, true, 3.381f, -8.2f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, true, 0.776f, -0.056f)
                arcToRelative(5.14f, 5.14f, 0.0f, false, true, 3.118f, 1.042f)
                arcTo(5.215f, 5.215f, 0.0f, false, true, 15.22f, 8.4f)
                lineToRelative(0.151f, 1.135f)
                lineToRelative(1.136f, 0.153f)
                arcTo(5.229f, 5.229f, 0.0f, false, true, 20.0f, 11.774f)
                arcToRelative(5.067f, 5.067f, 0.0f, false, true, -2.0f, 7.659f)
                verticalLineToRelative(3.224f)
                arcTo(8.121f, 8.121f, 0.0f, false, false, 22.419f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.0f)
                lineToRelative(-3.293f, -3.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.0f)
                lineTo(10.0f, 16.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
