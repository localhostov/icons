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

public val Icons.Outline.FloorLayer: ImageVector
    get() {
        if (_floorLayer != null) {
            return _floorLayer!!
        }
        _floorLayer = Builder(name = "FloorLayer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 1.034f)
                lineTo(0.0f, 6.789f)
                verticalLineToRelative(5.568f)
                lineToRelative(12.002f, 5.755f)
                lineToRelative(11.998f, -5.794f)
                verticalLineToRelative(-5.529f)
                lineTo(12.0f, 1.034f)
                close()
                moveTo(12.0f, 3.252f)
                lineToRelative(8.687f, 4.166f)
                lineToRelative(-8.687f, 4.166f)
                lineTo(3.313f, 7.418f)
                lineTo(12.0f, 3.252f)
                close()
                moveTo(2.0f, 9.007f)
                lineToRelative(9.0f, 4.315f)
                verticalLineToRelative(2.091f)
                lineTo(2.0f, 11.098f)
                verticalLineToRelative(-2.091f)
                close()
                moveTo(22.0f, 11.063f)
                lineToRelative(-9.0f, 4.345f)
                verticalLineToRelative(-2.086f)
                lineToRelative(9.0f, -4.315f)
                verticalLineToRelative(2.056f)
                close()
                moveTo(12.0f, 20.282f)
                lineToRelative(12.0f, -5.755f)
                verticalLineToRelative(2.218f)
                lineToRelative(-12.0f, 5.754f)
                lineTo(0.0f, 16.746f)
                verticalLineToRelative(-2.218f)
                lineToRelative(12.0f, 5.755f)
                close()
            }
        }
        .build()
        return _floorLayer!!
    }

private var _floorLayer: ImageVector? = null
