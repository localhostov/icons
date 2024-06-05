package me.localx.icons.straight.outline

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

public val Icons.Outline.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) {
            return _cloudUpload!!
        }
        _cloudUpload = Builder(name = "CloudUpload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.792f, 7.212f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 2.0f, 9.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.9f, 3.671f)
                arcTo(5.49f, 5.49f, 0.0f, false, false, 5.5f, 23.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.5f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, true, -0.872f, -6.874f)
                lineToRelative(1.437f, -0.371f)
                lineToRelative(-0.883f, -1.193f)
                arcTo(5.942f, 5.942f, 0.0f, false, true, 4.0f, 9.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.94f, -0.8f)
                lineToRelative(0.1f, 0.758f)
                lineToRelative(0.757f, 0.1f)
                arcTo(5.99f, 5.99f, 0.0f, false, true, 18.0f, 20.65f)
                verticalLineToRelative(2.087f)
                arcToRelative(7.989f, 7.989f, 0.0f, false, false, -0.208f, -15.525f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.293f, 17.707f)
                lineToRelative(1.414f, -1.414f)
                lineTo(16.414f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.828f, 0.0f)
                lineToRelative(-3.293f, 3.293f)
                lineToRelative(1.414f, 1.414f)
                lineTo(14.0f, 15.414f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.414f)
                close()
            }
        }
        .build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
