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

public val Icons.Outline.CarGarage: ImageVector
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
                arcTo(7.022f, 7.022f, 0.0f, false, true, 23.0f, 16.594f)
                verticalLineTo(18.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, 3.463f)
                verticalLineTo(22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                horizontalLineTo(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                verticalLineToRelative(-0.537f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 1.0f, 18.0f)
                verticalLineTo(16.594f)
                arcToRelative(7.022f, 7.022f, 0.0f, false, true, 0.922f, -3.474f)
                lineTo(3.98f, 9.52f)
                arcTo(5.013f, 5.013f, 0.0f, false, true, 8.321f, 7.0f)
                horizontalLineToRelative(7.358f)
                arcTo(5.013f, 5.013f, 0.0f, false, true, 20.02f, 9.52f)
                close()
                moveTo(3.723f, 14.0f)
                horizontalLineTo(20.277f)
                lineToRelative(-1.993f, -3.488f)
                arcTo(3.009f, 3.009f, 0.0f, false, false, 15.679f, 9.0f)
                horizontalLineTo(8.321f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, false, -2.6f, 1.512f)
                close()
                moveTo(21.0f, 16.594f)
                arcTo(5.119f, 5.119f, 0.0f, false, false, 20.964f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.036f)
                arcTo(5.119f, 5.119f, 0.0f, false, false, 3.0f, 16.594f)
                verticalLineTo(18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _carGarage!!
    }

private var _carGarage: ImageVector? = null
