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

public val Icons.Bold.FileImport: ImageVector
    get() {
        if (_fileImport != null) {
            return _fileImport!!
        }
        _fileImport = Builder(name = "FileImport", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 5.665f)
                verticalLineToRelative(18.335f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(11.382f)
                lineToRelative(5.618f, 5.665f)
                close()
                moveTo(9.0f, 19.0f)
                lineToRelative(3.707f, -3.793f)
                curveToRelative(0.39f, -0.391f, 0.39f, -1.024f, 0.0f, -1.414f)
                lineToRelative(-3.707f, -3.793f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _fileImport!!
    }

private var _fileImport: ImageVector? = null
