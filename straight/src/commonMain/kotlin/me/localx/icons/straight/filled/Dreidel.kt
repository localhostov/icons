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

public val Icons.Filled.Dreidel: ImageVector
    get() {
        if (_dreidel != null) {
            return _dreidel!!
        }
        _dreidel = Builder(name = "Dreidel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.414f, 9.0f)
                lineToRelative(4.737f, 4.737f)
                lineToRelative(-9.212f, 9.212f)
                lineToRelative(-0.9f, -0.776f)
                arcTo(5.026f, 5.026f, 0.0f, false, true, 9.0f, 18.5f)
                arcToRelative(4.386f, 4.386f, 0.0f, false, true, 1.128f, -3.214f)
                lineToRelative(2.947f, -2.947f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(8.714f, 13.872f)
                arcTo(4.552f, 4.552f, 0.0f, false, true, 5.442f, 15.0f)
                arcToRelative(4.895f, 4.895f, 0.0f, false, true, -3.615f, -2.035f)
                lineTo(1.013f, 12.1f)
                lineToRelative(9.25f, -9.25f)
                lineTo(15.0f, 7.586f)
                lineTo(22.536f, 0.05f)
                lineTo(23.95f, 1.464f)
                close()
                moveTo(7.0f, 18.5f)
                arcToRelative(7.86f, 7.86f, 0.0f, false, true, 0.175f, -1.685f)
                arcTo(7.98f, 7.98f, 0.0f, false, true, 5.442f, 17.0f)
                arcTo(6.9f, 6.9f, 0.0f, false, true, 0.229f, 14.17f)
                lineTo(0.0f, 13.94f)
                verticalLineTo(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(6.06f)
                lineToRelative(-0.23f, -0.229f)
                arcTo(7.06f, 7.06f, 0.0f, false, true, 7.0f, 18.5f)
                close()
            }
        }
        .build()
        return _dreidel!!
    }

private var _dreidel: ImageVector? = null
