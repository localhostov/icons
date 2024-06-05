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

public val Icons.Filled.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) {
            return _cloudUpload!!
        }
        _cloudUpload = Builder(name = "CloudUpload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.385f, 7.373f)
                arcToRelative(1.128f, 1.128f, 0.0f, false, true, -0.751f, -0.748f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.1f, 5.237f)
                arcTo(1.046f, 1.046f, 0.0f, false, true, 2.223f, 13.1f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 0.057f, 18.3f)
                arcTo(5.622f, 5.622f, 0.0f, false, false, 5.683f, 23.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.414f)
                lineToRelative(-1.293f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.586f, -1.586f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.242f, 0.0f)
                lineToRelative(1.586f, 1.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.414f, 1.414f)
                lineTo(16.0f, 15.414f)
                verticalLineToRelative(7.573f)
                arcToRelative(8.181f, 8.181f, 0.0f, false, false, 7.971f, -7.309f)
                arcTo(7.964f, 7.964f, 0.0f, false, false, 18.385f, 7.373f)
                close()
            }
        }
        .build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
