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

public val Icons.Outline.OilTemp: ImageVector
    get() {
        if (_oilTemp != null) {
            return _oilTemp!!
        }
        _oilTemp = Builder(name = "OilTemp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 21.316f)
                lineToRelative(1.508f, 1.315f)
                arcToRelative(4.028f, 4.028f, 0.0f, false, true, -6.01f, 0.012f)
                arcToRelative(4.038f, 4.038f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.038f, 4.038f, 0.0f, false, true, -6.0f, 0.0f)
                arcToRelative(4.028f, 4.028f, 0.0f, false, true, -6.01f, -0.012f)
                lineTo(1.5f, 21.316f)
                arcTo(2.01f, 2.01f, 0.0f, false, false, 5.0f, 20.0f)
                lineTo(7.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcTo(2.01f, 2.01f, 0.0f, false, false, 22.5f, 21.316f)
                close()
                moveTo(21.0f, 19.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.01f, -1.369f)
                lineTo(22.5f, 16.316f)
                arcTo(2.01f, 2.01f, 0.0f, false, true, 19.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 21.0f, 19.0f)
                close()
                moveTo(3.0f, 19.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(5.0f, 15.0f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -3.5f, 1.316f)
                lineTo(-0.01f, 17.631f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 3.0f, 19.0f)
                close()
                moveTo(8.0f, 14.0f)
                arcToRelative(4.006f, 4.006f, 0.0f, false, true, 3.0f, -3.874f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(6.0f)
                lineTo(17.0f, 2.0f)
                lineTo(13.0f, 2.0f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(17.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                verticalLineToRelative(4.126f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 8.0f, 14.0f)
                close()
                moveTo(10.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 14.0f)
                close()
            }
        }
        .build()
        return _oilTemp!!
    }

private var _oilTemp: ImageVector? = null
