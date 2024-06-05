package me.localx.icons.straight.bold

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

public val Icons.Bold.ChargingStation: ImageVector
    get() {
        if (_chargingStation != null) {
            return _chargingStation!!
        }
        _chargingStation = Builder(name = "ChargingStation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.749f, 10.108f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.037f, 2.057f)
                lineTo(8.956f, 15.683f)
                lineToRelative(-2.685f, -1.34f)
                lineTo(7.441f, 12.0f)
                horizontalLineTo(7.115f)
                arcTo(2.115f, 2.115f, 0.0f, false, true, 5.091f, 9.271f)
                lineTo(7.354f, 5.018f)
                lineTo(9.993f, 6.443f)
                lineTo(8.613f, 9.0f)
                horizontalLineTo(8.9f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 10.749f, 10.108f)
                close()
                moveTo(24.0f, 2.0f)
                verticalLineTo(6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, 2.45f)
                verticalLineTo(17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.5f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(9.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 16.0f, 3.5f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineTo(8.95f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 6.5f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(13.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
