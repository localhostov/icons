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

public val Icons.Outline.Terrace: ImageVector
    get() {
        if (_terrace != null) {
            return _terrace!!
        }
        _terrace = Builder(name = "Terrace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.765f, 7.119f)
                lineToRelative(-9.0f, -6.545f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.53f, 0.0f)
                lineToRelative(-9.0f, 6.545f)
                horizontalLineToRelative(0.0f)
                arcTo(3.015f, 3.015f, 0.0f, false, false, 0.0f, 9.546f)
                lineTo(0.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 13.0f)
                lineTo(24.0f, 13.0f)
                lineTo(24.0f, 9.546f)
                arcTo(3.015f, 3.015f, 0.0f, false, false, 22.765f, 7.119f)
                close()
                moveTo(2.0f, 9.546f)
                arcToRelative(1.007f, 1.007f, 0.0f, false, true, 0.411f, -0.81f)
                lineTo(8.7f, 4.165f)
                lineTo(6.5f, 7.472f)
                arcTo(2.986f, 2.986f, 0.0f, false, false, 6.0f, 9.131f)
                lineTo(6.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                close()
                moveTo(8.0f, 11.0f)
                lineTo(8.0f, 9.131f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.167f, -0.553f)
                lineTo(11.0f, 4.313f)
                lineTo(11.0f, 11.0f)
                close()
                moveTo(13.0f, 4.313f)
                lineTo(15.833f, 8.577f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 9.131f)
                lineTo(16.0f, 11.0f)
                lineTo(13.0f, 11.0f)
                close()
                moveTo(22.0f, 11.0f)
                lineTo(18.0f, 11.0f)
                lineTo(18.0f, 9.131f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, -0.5f, -1.66f)
                lineTo(15.3f, 4.166f)
                lineToRelative(6.283f, 4.569f)
                arcTo(1.007f, 1.007f, 0.0f, false, true, 22.0f, 9.546f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                horizontalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _terrace!!
    }

private var _terrace: ImageVector? = null
