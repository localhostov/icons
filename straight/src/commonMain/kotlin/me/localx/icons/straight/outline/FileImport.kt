package me.localx.icons.straight.outline

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

public val Icons.Outline.FileImport: ImageVector
    get() {
        if (_fileImport != null) {
            return _fileImport!!
        }
        _fileImport = Builder(name = "FileImport", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.414f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(13.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 7.586f)
                lineTo(14.414f, 0.0f)
                close()
                moveTo(15.0f, 3.414f)
                lineToRelative(3.586f, 3.586f)
                horizontalLineToRelative(-3.586f)
                verticalLineToRelative(-3.586f)
                close()
                moveTo(9.997f, 16.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.008f)
                lineToRelative(-2.302f, -2.291f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.299f, 3.298f)
                curveToRelative(0.774f, 0.775f, 0.774f, 2.037f, 0.0f, 2.812f)
                lineToRelative(-3.3f, 3.299f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.291f, -2.291f)
                close()
            }
        }
        .build()
        return _fileImport!!
    }

private var _fileImport: ImageVector? = null
