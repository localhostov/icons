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

public val Icons.Outline.FolderDownload: ImageVector
    get() {
        if (_folderDownload != null) {
            return _folderDownload!!
        }
        _folderDownload = Builder(name = "FolderDownload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                lineTo(12.236f, 3.0f)
                lineTo(8.236f, 1.0f)
                lineTo(3.0f, 1.0f)
                curveTo(1.346f, 1.0f, 0.0f, 2.346f, 0.0f, 4.0f)
                lineTo(0.0f, 23.0f)
                lineTo(8.142f, 23.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(2.0f, 21.0f)
                lineTo(2.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-4.143f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineToRelative(8.143f)
                lineTo(24.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(2.0f, 7.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                lineTo(7.764f, 3.0f)
                lineToRelative(4.0f, 2.0f)
                horizontalLineToRelative(9.236f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(16.704f, 19.12f)
                lineToRelative(-3.298f, 3.298f)
                curveToRelative(-0.376f, 0.376f, -0.875f, 0.583f, -1.406f, 0.583f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.531f, 0.0f, -1.03f, -0.208f, -1.405f, -0.584f)
                lineToRelative(-3.297f, -3.297f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.291f, 2.29f)
                verticalLineToRelative(-7.996f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.007f)
                lineToRelative(2.29f, -2.301f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _folderDownload!!
    }

private var _folderDownload: ImageVector? = null
