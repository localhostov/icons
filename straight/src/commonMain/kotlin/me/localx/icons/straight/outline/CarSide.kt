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

public val Icons.Outline.CarSide: ImageVector
    get() {
        if (_carSide != null) {
            return _carSide!!
        }
        _carSide = Builder(name = "CarSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                horizontalLineToRelative(-0.478f)
                lineTo(15.84f, 3.285f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.379f, 2.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(3.016f, 3.016f, 0.0f, false, false, 3.575f, 3.937f)
                lineToRelative(-2.6f, 6.848f)
                arcTo(2.994f, 2.994f, 0.0f, false, false, 0.0f, 13.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(9.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(22.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(14.2f, 4.428f)
                lineTo(18.084f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.379f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.2f, 4.428f)
                close()
                moveTo(5.447f, 4.645f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.381f, 4.0f)
                lineTo(9.0f, 4.0f)
                verticalLineToRelative(6.0f)
                lineTo(3.416f, 10.0f)
                close()
                moveTo(7.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(4.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                close()
                moveTo(20.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(22.0f, 16.0f)
                lineTo(2.0f, 16.0f)
                lineTo(2.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(21.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _carSide!!
    }

private var _carSide: ImageVector? = null
