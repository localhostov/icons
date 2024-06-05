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

public val Icons.Outline.FileAi: ImageVector
    get() {
        if (_fileAi != null) {
            return _fileAi!!
        }
        _fileAi = Builder(name = "FileAi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(18.35f)
                curveToRelative(2.206f, -2.207f, 3.443f, -3.444f, 5.65f, -5.65f)
                verticalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(18.0f, 21.521f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(3.521f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 5.007f)
                lineTo(4.146f, 11.188f)
                horizontalLineTo(5.484f)
                lineTo(6.0f, 9.824f)
                horizontalLineTo(8.049f)
                lineToRelative(0.514f, 1.363f)
                horizontalLineTo(9.9f)
                lineTo(7.566f, 5.0f)
                close()
                moveTo(6.48f, 8.574f)
                lineToRelative(0.551f, -1.447f)
                lineToRelative(0.546f, 1.447f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.156f, 5.062f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(6.069f)
                horizontalLineToRelative(-1.25f)
                close()
            }
        }
        .build()
        return _fileAi!!
    }

private var _fileAi: ImageVector? = null
