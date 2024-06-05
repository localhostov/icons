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

public val Icons.Filled.FileCode: ImageVector
    get() {
        if (_fileCode != null) {
            return _fileCode!!
        }
        _fileCode = Builder(name = "FileCode", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.414f, 5.0f)
                horizontalLineToRelative(-4.414f)
                lineTo(17.0f, 0.586f)
                lineToRelative(4.414f, 4.414f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(22.0f, 24.0f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveTo(2.0f, 1.343f, 3.343f, 0.0f, 5.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(7.997f, 16.075f)
                lineToRelative(2.778f, -2.778f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.778f, 2.778f)
                curveToRelative(-0.775f, 0.775f, -0.775f, 2.037f, 0.0f, 2.812f)
                lineToRelative(2.734f, 2.734f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.734f, -2.718f)
                close()
                moveTo(17.394f, 14.752f)
                lineToRelative(-2.778f, -2.778f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.778f, 2.762f)
                lineToRelative(-2.734f, 2.734f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(2.734f, -2.734f)
                curveToRelative(0.774f, -0.775f, 0.774f, -2.036f, 0.0f, -2.812f)
                close()
            }
        }
        .build()
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
