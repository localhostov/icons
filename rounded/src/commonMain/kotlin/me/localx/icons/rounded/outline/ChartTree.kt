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

public val Icons.Outline.ChartTree: ImageVector
    get() {
        if (_chartTree != null) {
            return _chartTree!!
        }
        _chartTree = Builder(name = "ChartTree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.736f, 16.4f)
                arcTo(5.009f, 5.009f, 0.0f, false, false, 17.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                lineTo(13.0f, 11.916f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -2.0f, 0.0f)
                lineTo(11.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                arcToRelative(5.009f, 5.009f, 0.0f, false, false, -4.736f, 3.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 2.447f, -0.334f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.127f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 2.0f, 0.0f)
                lineTo(13.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.289f, 1.063f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 2.447f, 0.334f)
                close()
                moveTo(8.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 6.0f)
                close()
                moveTo(6.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 20.0f)
                close()
                moveTo(14.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 20.0f)
                close()
                moveTo(20.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, -2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                close()
            }
        }
        .build()
        return _chartTree!!
    }

private var _chartTree: ImageVector? = null
