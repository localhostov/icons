package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Ftp: ImageVector
    get() {
        if (_ftp != null) {
            return _ftp!!
        }
        _ftp = Builder(name = "Ftp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 20.0f)
                lineTo(14.816f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 18.184f)
                lineTo(13.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(21.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(12.621f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.565f, -0.175f)
                horizontalLineToRelative(0.0f)
                lineTo(10.17f, 0.528f)
                arcTo(2.992f, 2.992f, 0.0f, false, false, 8.47f, 0.0f)
                lineTo(7.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 3.0f, 4.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.184f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.184f, 20.0f)
                lineTo(1.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                lineTo(9.184f, 22.0f)
                arcToRelative(2.982f, 2.982f, 0.0f, false, false, 5.632f, 0.0f)
                lineTo(23.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(7.0f, 2.0f)
                lineTo(8.47f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.567f, 0.176f)
                lineToRelative(1.884f, 1.3f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, false, 1.7f, 0.529f)
                lineTo(17.0f, 4.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(5.0f, 6.005f)
                lineTo(5.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 2.0f)
                close()
                moveTo(5.0f, 11.0f)
                lineTo(5.0f, 8.0f)
                lineTo(19.0f, 8.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(7.0f, 13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 11.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _ftp!!
    }

private var _ftp: ImageVector? = null
