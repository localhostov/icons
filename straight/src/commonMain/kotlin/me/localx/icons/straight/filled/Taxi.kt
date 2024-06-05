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

public val Icons.Filled.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(17.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(21.0f, 21.0f)
                close()
                moveTo(24.0f, 16.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                lineTo(21.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 24.0f, 16.0f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(4.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(5.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(6.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 15.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 15.0f)
                close()
                moveTo(15.108f, 2.0f)
                lineTo(14.9f, 1.368f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 0.0f)
                lineTo(11.108f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.9f, 1.368f)
                lineTo(9.0f, 2.0f)
                close()
                moveTo(20.667f, 9.0f)
                lineTo(19.456f, 5.368f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.558f, 4.0f)
                lineTo(6.442f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.9f, 1.368f)
                lineTo(3.333f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(2.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 9.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
