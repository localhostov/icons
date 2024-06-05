package me.localx.icons.rounded.bold

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

public val Icons.Bold.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(name = "Garage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.576f, 5.364f)
                lineTo(14.975f, 0.91f)
                arcToRelative(5.294f, 5.294f, 0.0f, false, false, -5.95f, 0.0f)
                lineToRelative(-6.6f, 4.454f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 0.0f, 9.924f)
                lineTo(0.0f, 18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 18.5f)
                lineTo(24.0f, 9.924f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 21.576f, 5.364f)
                close()
                moveTo(16.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
                moveTo(21.0f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, 2.45f)
                lineTo(19.0f, 12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 15.5f, 9.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 5.0f, 12.5f)
                verticalLineToRelative(8.45f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                lineTo(3.0f, 9.924f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.1f, 7.851f)
                lineTo(10.7f, 3.4f)
                arcToRelative(2.311f, 2.311f, 0.0f, false, true, 2.594f, 0.0f)
                lineToRelative(6.6f, 4.455f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 9.924f)
                close()
            }
        }
        .build()
        return _garage!!
    }

private var _garage: ImageVector? = null
