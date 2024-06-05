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

public val Icons.Outline.FolderUpload: ImageVector
    get() {
        if (_folderUpload != null) {
            return _folderUpload!!
        }
        _folderUpload = Builder(name = "FolderUpload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(12.236f)
                lineTo(8.236f, 1.0f)
                horizontalLineTo(3.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineTo(7.764f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(9.236f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(13.0f, 15.003f)
                verticalLineToRelative(7.997f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(14.992f)
                lineToRelative(-2.291f, 2.301f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.298f, -3.298f)
                curveToRelative(0.375f, -0.376f, 0.875f, -0.583f, 1.406f, -0.583f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.531f, 0.0f, 1.031f, 0.207f, 1.406f, 0.584f)
                lineToRelative(3.298f, 3.297f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-2.291f, -2.29f)
                close()
            }
        }
        .build()
        return _folderUpload!!
    }

private var _folderUpload: ImageVector? = null
