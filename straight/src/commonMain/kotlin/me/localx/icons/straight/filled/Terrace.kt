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

public val Icons.Filled.Terrace: ImageVector
    get() {
        if (_terrace != null) {
            return _terrace!!
        }
        _terrace = Builder(name = "Terrace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 21.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 15.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 21.0f)
                close()
                moveTo(22.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.0f, 15.0f)
                lineTo(22.0f, 15.0f)
                close()
                moveTo(24.0f, 9.546f)
                lineTo(24.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                lineTo(13.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 13.0f)
                lineTo(0.0f, 13.0f)
                lineTo(0.0f, 9.546f)
                arcTo(3.015f, 3.015f, 0.0f, false, true, 1.233f, 7.12f)
                horizontalLineToRelative(0.0f)
                lineToRelative(9.0f, -6.545f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.53f, 0.0f)
                lineToRelative(9.0f, 6.545f)
                arcTo(3.015f, 3.015f, 0.0f, false, true, 24.0f, 9.546f)
                close()
                moveTo(20.0f, 9.708f)
                arcToRelative(2.987f, 2.987f, 0.0f, false, false, -0.5f, -1.66f)
                lineTo(12.0f, 0.125f)
                lineTo(4.5f, 8.048f)
                arcTo(2.987f, 2.987f, 0.0f, false, false, 4.0f, 9.708f)
                lineTo(4.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 9.708f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.13f, -0.493f)
                lineTo(11.0f, 4.083f)
                lineTo(11.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 4.083f)
                lineToRelative(4.87f, 5.132f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.13f, 0.493f)
                lineTo(18.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _terrace!!
    }

private var _terrace: ImageVector? = null
