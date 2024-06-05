package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 0.0f)
                horizontalLineToRelative(-0.688f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                arcToRelative(1.313f, 1.313f, 0.0f, true, true, -2.625f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.187f, 0.0f)
                lineTo(8.5f, 0.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 3.0f, 5.5f)
                verticalLineToRelative(15.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.5f, 24.0f)
                lineTo(9.187f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                arcToRelative(1.313f, 1.313f, 0.0f, true, true, 2.625f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                lineTo(17.5f, 24.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 21.0f, 20.5f)
                lineTo(21.0f, 5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 15.5f, 0.0f)
                close()
                moveTo(17.5f, 21.0f)
                lineTo(16.05f, 21.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -8.1f, 0.0f)
                lineTo(6.5f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(6.0f, 16.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 14.5f)
                lineTo(8.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 13.0f)
                lineTo(6.0f, 13.0f)
                lineTo(6.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.971f, 3.057f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 8.058f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.0f, 5.5f)
                lineTo(18.0f, 13.0f)
                horizontalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 14.5f)
                horizontalLineToRelative(0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 16.0f)
                lineTo(18.0f, 16.0f)
                verticalLineToRelative(4.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 17.5f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 13.0f)
                lineTo(12.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 14.5f)
                lineTo(14.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 16.0f)
                lineTo(11.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 14.5f)
                lineTo(10.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 13.0f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
