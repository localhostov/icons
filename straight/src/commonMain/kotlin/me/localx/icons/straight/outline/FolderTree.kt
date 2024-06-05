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

public val Icons.Outline.FolderTree: ImageVector
    get() {
        if (_folderTree != null) {
            return _folderTree!!
        }
        _folderTree = Builder(name = "FolderTree", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(-3.414f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 5.0f)
                lineTo(2.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineTo(0.0f, 17.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(-3.414f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 18.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(2.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(3.414f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(12.0f, 9.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.586f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(3.414f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(12.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _folderTree!!
    }

private var _folderTree: ImageVector? = null
