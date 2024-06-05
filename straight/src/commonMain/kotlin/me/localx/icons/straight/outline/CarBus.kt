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

public val Icons.Outline.CarBus: ImageVector
    get() {
        if (_carBus != null) {
            return _carBus!!
        }
        _carBus = Builder(name = "CarBus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 8.79f)
                arcToRelative(4.964f, 4.964f, 0.0f, false, true, 2.0f, -1.43f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 4.184f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, false, -1.692f, -2.7f)
                curveToRelative(-3.283f, -1.9f, -9.338f, -1.893f, -12.617f, 0.0f)
                arcTo(3.007f, 3.007f, 0.0f, false, false, 2.0f, 4.184f)
                lineTo(2.0f, 9.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 17.0f)
                lineTo(4.0f, 17.0f)
                lineTo(4.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                lineToRelative(0.833f, -2.0f)
                lineTo(4.0f, 11.0f)
                close()
                moveTo(4.556f, 3.286f)
                arcToRelative(12.66f, 12.66f, 0.0f, false, true, 10.887f, 0.0f)
                arcToRelative(0.977f, 0.977f, 0.0f, false, true, 0.54f, 0.714f)
                lineTo(4.017f, 4.0f)
                arcTo(0.978f, 0.978f, 0.0f, false, true, 4.556f, 3.286f)
                close()
                moveTo(24.0f, 18.0f)
                arcToRelative(10.951f, 10.951f, 0.0f, false, false, -0.846f, -4.231f)
                lineToRelative(-1.218f, -2.922f)
                arcTo(2.991f, 2.991f, 0.0f, false, false, 19.167f, 9.0f)
                lineTo(12.833f, 9.0f)
                arcToRelative(2.992f, 2.992f, 0.0f, false, false, -2.769f, 1.846f)
                lineTo(8.846f, 13.769f)
                arcTo(10.951f, 10.951f, 0.0f, false, false, 8.0f, 18.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.833f, 11.0f)
                horizontalLineToRelative(6.334f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.923f, 0.616f)
                lineTo(21.084f, 14.0f)
                lineTo(10.916f, 14.0f)
                lineToRelative(0.995f, -2.385f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.833f, 11.0f)
                close()
                moveTo(22.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                lineTo(10.0f, 18.0f)
                arcToRelative(8.977f, 8.977f, 0.0f, false, true, 0.224f, -2.0f)
                lineTo(12.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(14.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(20.0f, 16.0f)
                horizontalLineToRelative(1.776f)
                arcTo(8.977f, 8.977f, 0.0f, false, true, 22.0f, 18.0f)
                close()
            }
        }
        .build()
        return _carBus!!
    }

private var _carBus: ImageVector? = null
