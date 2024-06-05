package me.localx.icons.rounded.filled

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

public val Icons.Filled.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 3.0f)
                close()
                moveTo(23.0f, 21.0f)
                lineTo(21.721f, 21.0f)
                lineTo(20.4f, 17.051f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.559f, 15.0f)
                lineTo(14.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(12.0f, 11.0f)
                lineTo(12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(3.559f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.949f, 0.684f)
                lineToRelative(1.544f, 4.632f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 23.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(13.786f, 18.988f)
                arcTo(5.973f, 5.973f, 0.0f, false, true, 8.0f, 13.0f)
                lineTo(8.0f, 9.071f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.142f, -0.99f)
                arcTo(8.005f, 8.005f, 0.0f, false, false, 7.87f, 24.0f)
                lineTo(8.0f, 24.0f)
                arcToRelative(7.993f, 7.993f, 0.0f, false, false, 6.573f, -3.442f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.786f, -1.57f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
