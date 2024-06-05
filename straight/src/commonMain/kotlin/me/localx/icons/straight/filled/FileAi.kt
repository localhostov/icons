package me.localx.icons.straight.filled

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

public val Icons.Filled.FileAi: ImageVector
    get() {
        if (_fileAi != null) {
            return _fileAi!!
        }
        _fileAi = Builder(name = "FileAi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 23.414f)
                lineToRelative(4.414f, -4.414f)
                lineToRelative(-4.414f, 0.0f)
                lineToRelative(0.0f, 4.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.48f, 8.574f)
                lineToRelative(1.097f, 0.0f)
                lineToRelative(-0.546f, -1.447f)
                lineToRelative(-0.551f, 1.447f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(7.0f)
                lineTo(24.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 0.0f)
                close()
                moveTo(8.563f, 11.187f)
                lineTo(8.049f, 9.824f)
                lineTo(6.0f, 9.824f)
                lineToRelative(-0.52f, 1.364f)
                lineTo(4.146f, 11.188f)
                lineTo(6.5f, 5.007f)
                lineTo(7.566f, 5.0f)
                lineTo(9.9f, 11.188f)
                close()
                moveTo(12.406f, 11.131f)
                horizontalLineToRelative(-1.25f)
                lineTo(11.156f, 5.062f)
                horizontalLineToRelative(1.25f)
                close()
            }
        }
        .build()
        return _fileAi!!
    }

private var _fileAi: ImageVector? = null
