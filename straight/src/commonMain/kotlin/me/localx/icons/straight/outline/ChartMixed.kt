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

public val Icons.Outline.ChartMixed: ImageVector
    get() {
        if (_chartMixed != null) {
            return _chartMixed!!
        }
        _chartMixed = Builder(name = "ChartMixed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 10.41f)
                lineTo(0.29f, 5.71f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.29f, 3.29f)
                lineTo(12.0f, 0.59f)
                lineToRelative(5.0f, 5.0f)
                lineTo(22.29f, 0.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-6.71f, 6.71f)
                lineTo(12.0f, 3.41f)
                lineToRelative(-7.0f, 7.0f)
                close()
                moveTo(8.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(3.0f, 12.0f)
                lineTo(1.0f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 12.0f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 8.0f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 11.0f)
                close()
                moveTo(23.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(21.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 7.0f)
                close()
            }
        }
        .build()
        return _chartMixed!!
    }

private var _chartMixed: ImageVector? = null
