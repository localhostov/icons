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

public val Icons.Filled.Caravan: ImageVector
    get() {
        if (_caravan != null) {
            return _caravan!!
        }
        _caravan = Builder(name = "Caravan", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 8.0f)
                horizontalLineToRelative(3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 8.5f)
                close()
                moveTo(16.5f, 8.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(14.0f, 21.0f)
                horizontalLineToRelative(3.0f)
                lineTo(17.0f, 8.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 16.5f, 8.0f)
                close()
                moveTo(7.5f, 24.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.5f, 24.0f)
                close()
                moveTo(24.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(19.0f, 21.0f)
                lineTo(19.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 6.0f)
                horizontalLineToRelative(-2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 8.5f)
                verticalLineToRelative(8.837f)
                arcToRelative(5.523f, 5.523f, 0.0f, false, false, -9.978f, 2.677f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(0.0f, 5.0f)
                arcTo(5.006f, 5.006f, 0.0f, false, true, 5.0f, 0.0f)
                lineTo(17.0f, 0.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                lineTo(22.0f, 19.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 24.0f, 20.0f)
                close()
                moveTo(10.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.5f, 6.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.0f, 8.5f)
                verticalLineToRelative(2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.5f, 13.0f)
                horizontalLineToRelative(3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.0f, 10.5f)
                close()
            }
        }
        .build()
        return _caravan!!
    }

private var _caravan: ImageVector? = null
