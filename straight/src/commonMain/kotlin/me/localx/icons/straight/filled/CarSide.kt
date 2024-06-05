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

public val Icons.Filled.CarSide: ImageVector
    get() {
        if (_carSide != null) {
            return _carSide!!
        }
        _carSide = Builder(name = "CarSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                lineTo(1.656f, 9.0f)
                lineTo(3.575f, 3.937f)
                arcTo(3.016f, 3.016f, 0.0f, false, true, 6.381f, 2.0f)
                lineTo(9.0f, 2.0f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(8.825f)
                lineTo(15.84f, 3.285f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.379f, 2.0f)
                lineTo(11.0f, 2.0f)
                close()
                moveTo(24.0f, 14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(3.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(24.0f, 18.0f)
                close()
                moveTo(7.942f, 20.0f)
                curveToRelative(0.587f, 3.954f, -5.472f, 3.952f, -4.884f, 0.0f)
                close()
                moveTo(16.058f, 20.0f)
                curveToRelative(-0.587f, 3.954f, 5.472f, 3.952f, 4.884f, 0.0f)
                close()
            }
        }
        .build()
        return _carSide!!
    }

private var _carSide: ImageVector? = null
