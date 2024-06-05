package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.FileWord: ImageVector
    get() {
        if (_fileWord != null) {
            return _fileWord!!
        }
        _fileWord = Builder(name = "FileWord", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.66f)
                lineTo(16.38f, 0.0f)
                horizontalLineTo(5.0f)
                curveTo(3.35f, 0.0f, 2.0f, 1.35f, 2.0f, 3.0f)
                verticalLineTo(24.0f)
                reflectiveCurveToRelative(20.0f, 0.0f, 20.0f, 0.0f)
                verticalLineTo(5.66f)
                close()
                moveTo(5.0f, 3.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(15.3f, 22.0f)
                horizontalLineToRelative(-2.27f)
                lineToRelative(-1.05f, -2.22f)
                lineToRelative(-1.01f, 2.22f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(-1.51f, -8.0f)
                horizontalLineToRelative(2.04f)
                lineToRelative(0.96f, 4.97f)
                lineToRelative(1.83f, -4.18f)
                lineToRelative(1.83f, 4.17f)
                lineToRelative(0.96f, -4.97f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-1.51f, 8.0f)
                close()
            }
        }
        .build()
        return _fileWord!!
    }

private var _fileWord: ImageVector? = null
