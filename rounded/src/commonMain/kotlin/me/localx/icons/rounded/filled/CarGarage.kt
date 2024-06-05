package me.localx.icons.rounded.filled

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

public val Icons.Filled.CarGarage: ImageVector
    get() {
        if (_carGarage != null) {
            return _carGarage!!
        }
        _carGarage = Builder(name = "CarGarage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.891f, 6.454f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.346f, 0.437f)
                lineTo(13.752f, 2.4f)
                arcToRelative(4.02f, 4.02f, 0.0f, false, false, -3.517f, 0.007f)
                lineToRelative(-8.78f, 4.48f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.91f, -1.782f)
                lineTo(9.339f, 0.623f)
                arcTo(6.043f, 6.043f, 0.0f, false, true, 14.648f, 0.616f)
                lineToRelative(8.807f, 4.493f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 23.891f, 6.454f)
                close()
                moveTo(22.078f, 13.12f)
                lineTo(20.02f, 9.52f)
                arcTo(5.013f, 5.013f, 0.0f, false, false, 15.679f, 7.0f)
                horizontalLineTo(8.321f)
                arcTo(5.013f, 5.013f, 0.0f, false, false, 3.98f, 9.52f)
                lineToRelative(-2.058f, 3.6f)
                arcTo(7.109f, 7.109f, 0.0f, false, false, 1.5f, 14.0f)
                horizontalLineToRelative(21.0f)
                arcTo(7.109f, 7.109f, 0.0f, false, false, 22.078f, 13.12f)
                close()
                moveTo(19.0f, 16.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(1.026f)
                quadTo(1.0f, 16.3f, 1.0f, 16.594f)
                verticalLineTo(18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.463f)
                verticalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineTo(17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-0.537f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 23.0f, 18.0f)
                verticalLineTo(16.594f)
                quadToRelative(0.0f, -0.3f, -0.026f, -0.594f)
                close()
            }
        }
        .build()
        return _carGarage!!
    }

private var _carGarage: ImageVector? = null
