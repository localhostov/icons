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

public val Icons.Bold.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                arcToRelative(7.008f, 7.008f, 0.0f, false, false, 7.0f, -7.0f)
                verticalLineTo(7.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.0f, 7.0f)
                verticalLineToRelative(5.0f)
                arcTo(7.008f, 7.008f, 0.0f, false, false, 12.0f, 19.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 13.0f)
                verticalLineToRelative(0.389f)
                arcTo(7.62f, 7.62f, 0.0f, false, true, 13.389f, 21.0f)
                horizontalLineTo(10.611f)
                arcTo(7.621f, 7.621f, 0.0f, false, true, 3.0f, 13.389f)
                verticalLineTo(13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(0.389f)
                arcTo(10.623f, 10.623f, 0.0f, false, false, 10.611f, 24.0f)
                horizontalLineToRelative(2.778f)
                arcTo(10.623f, 10.623f, 0.0f, false, false, 24.0f, 13.389f)
                verticalLineTo(13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 22.5f, 11.5f)
                close()
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
