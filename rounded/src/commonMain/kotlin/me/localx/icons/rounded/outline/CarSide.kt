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
                moveTo(20.74f, 10.312f)
                lineToRelative(-4.3f, -6.171f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.336f, 2.0f)
                lineTo(8.5f, 2.0f)
                arcTo(5.024f, 5.024f, 0.0f, false, false, 3.825f, 5.228f)
                lineTo(1.753f, 10.692f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 0.0f, 14.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(2.505f, 2.505f, 0.0f, false, false, 2.0f, 2.45f)
                verticalLineToRelative(0.55f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                lineTo(9.0f, 18.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 7.0f, 0.0f)
                verticalLineToRelative(-0.55f)
                arcToRelative(2.505f, 2.505f, 0.0f, false, false, 2.0f, -2.45f)
                lineTo(24.0f, 15.0f)
                arcTo(5.011f, 5.011f, 0.0f, false, false, 20.74f, 10.312f)
                close()
                moveTo(14.8f, 5.284f)
                lineTo(18.084f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(1.336f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.8f, 5.284f)
                close()
                moveTo(5.7f, 5.937f)
                arcTo(3.014f, 3.014f, 0.0f, false, true, 8.5f, 4.0f)
                lineTo(9.0f, 4.0f)
                verticalLineToRelative(6.0f)
                lineTo(4.154f, 10.0f)
                close()
                moveTo(7.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(4.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                close()
                moveTo(18.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 18.5f)
                lineTo(17.0f, 18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 20.0f)
                close()
                moveTo(22.0f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(2.5f, 16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(19.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _carSide!!
    }

private var _carSide: ImageVector? = null
