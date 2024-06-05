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

public val Icons.Outline.FileExclamation: ImageVector
    get() {
        if (_fileExclamation != null) {
            return _fileExclamation!!
        }
        _fileExclamation = Builder(name = "FileExclamation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 7.586f)
                verticalLineToRelative(16.414f)
                lineTo(2.0f, 24.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.414f)
                lineToRelative(7.586f, 7.586f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-3.586f, -3.586f)
                verticalLineToRelative(3.586f)
                close()
                moveTo(20.0f, 9.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(13.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-13.0f)
                close()
            }
        }
        .build()
        return _fileExclamation!!
    }

private var _fileExclamation: ImageVector? = null