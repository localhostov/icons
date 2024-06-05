package me.localx.icons.rounded.outline

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

public val Icons.Outline.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                arcToRelative(8.009f, 8.009f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 8.0f)
                verticalLineToRelative(4.0f)
                arcTo(8.009f, 8.009f, 0.0f, false, false, 12.0f, 20.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(6.006f, 6.006f, 0.0f, false, true, 5.91f, 5.0f)
                horizontalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(2.91f)
                arcTo(5.993f, 5.993f, 0.0f, false, true, 6.09f, 13.0f)
                horizontalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 7.0f)
                horizontalLineTo(6.09f)
                arcTo(6.006f, 6.006f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, -9.0f, 9.0f)
                horizontalLineTo(11.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, true, -9.0f, -9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(11.013f, 11.013f, 0.0f, false, false, 11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                arcTo(11.013f, 11.013f, 0.0f, false, false, 24.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 12.0f)
                close()
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
