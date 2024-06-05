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

public val Icons.Bold.Building: ImageVector
    get() {
        if (_building != null) {
            return _building!!
        }
        _building = Builder(name = "Building", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 5.0f)
                lineTo(15.975f, 5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 10.5f, 0.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 0.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 5.5f, 24.0f)
                horizontalLineToRelative(13.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 24.0f, 18.5f)
                verticalLineToRelative(-8.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 18.5f, 5.0f)
                close()
                moveTo(3.0f, 18.5f)
                lineTo(3.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.0f, 5.5f)
                lineTo(13.0f, 21.0f)
                lineTo(5.5f, 21.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.0f, 18.5f)
                close()
                moveTo(21.0f, 18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 21.0f)
                lineTo(16.0f, 21.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 10.5f)
                close()
                moveTo(20.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 18.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 11.5f)
                close()
                moveTo(20.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 18.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 16.5f)
                close()
                moveTo(7.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 5.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 6.5f)
                close()
                moveTo(7.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 5.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 11.5f)
                close()
                moveTo(12.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 6.5f)
                close()
                moveTo(12.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 11.5f)
                close()
                moveTo(7.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 5.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 16.5f)
                close()
                moveTo(12.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 16.5f)
                close()
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
