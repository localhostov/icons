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

public val Icons.Bold.CarSide: ImageVector
    get() {
        if (_carSide != null) {
            return _carSide!!
        }
        _carSide = Builder(name = "CarSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.171f, 10.322f)
                lineTo(17.012f, 4.354f)
                arcTo(5.506f, 5.506f, 0.0f, false, false, 12.5f, 2.0f)
                horizontalLineTo(9.164f)
                arcTo(5.531f, 5.531f, 0.0f, false, false, 4.021f, 5.55f)
                lineTo(2.063f, 10.719f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 0.0f, 14.5f)
                verticalLineToRelative(2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 2.5f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(0.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 24.0f, 16.5f)
                verticalLineToRelative(-2.0f)
                arcTo(4.506f, 4.506f, 0.0f, false, false, 21.171f, 10.322f)
                close()
                moveTo(14.551f, 6.07f)
                lineTo(17.29f, 10.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(0.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.551f, 6.07f)
                close()
                moveTo(9.0f, 5.006f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.543f)
                lineTo(6.826f, 6.614f)
                arcTo(2.514f, 2.514f, 0.0f, false, true, 9.0f, 5.006f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 13.0f)
                horizontalLineToRelative(15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.0f, 14.5f)
                close()
            }
        }
        .build()
        return _carSide!!
    }

private var _carSide: ImageVector? = null
