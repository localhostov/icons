package me.localx.icons.straight.filled

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

public val Icons.Filled.FileImage: ImageVector
    get() {
        if (_fileImage != null) {
            return _fileImage!!
        }
        _fileImage = Builder(name = "FileImage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(17.0f, 0.586f)
                lineToRelative(4.414f, 4.414f)
                close()
                moveTo(10.5f, 13.086f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(7.5f, -7.5f)
                verticalLineToRelative(-2.586f)
                horizontalLineToRelative(-7.0f)
                lineTo(15.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                verticalLineToRelative(18.586f)
                lineToRelative(8.5f, -8.5f)
                close()
                moveTo(7.5f, 8.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(14.5f, 19.914f)
                lineToRelative(-4.0f, -4.0f)
                lineTo(2.414f, 24.0f)
                horizontalLineToRelative(19.586f)
                verticalLineToRelative(-11.586f)
                lineToRelative(-7.5f, 7.5f)
                close()
            }
        }
        .build()
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
