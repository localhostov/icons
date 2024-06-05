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

public val Icons.Bold.TimeHalfPast: ImageVector
    get() {
        if (_timeHalfPast != null) {
            return _timeHalfPast!!
        }
        _timeHalfPast = Builder(name = "TimeHalfPast", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.825f, 17.433f)
                lineTo(2.437f, 19.248f)
                arcToRelative(11.947f, 11.947f, 0.0f, false, true, -1.543f, -2.7f)
                lineToRelative(2.775f, -1.139f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 4.825f, 17.433f)
                close()
                moveTo(4.825f, 6.561f)
                lineTo(2.439f, 4.747f)
                arcTo(12.025f, 12.025f, 0.0f, false, false, 0.9f, 7.44f)
                lineTo(3.67f, 8.582f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 4.828f, 6.561f)
                close()
                moveTo(3.0f, 12.0f)
                arcToRelative(9.168f, 9.168f, 0.0f, false, true, 0.075f, -1.17f)
                lineTo(0.1f, 10.445f)
                arcTo(12.084f, 12.084f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.256f, 12.256f, 0.0f, false, false, 0.1f, 1.545f)
                lineToRelative(2.976f, -0.38f)
                arcTo(9.055f, 9.055f, 0.0f, false, true, 3.0f, 12.0f)
                close()
                moveTo(4.614f, 21.458f)
                arcToRelative(12.064f, 12.064f, 0.0f, false, false, 2.673f, 1.581f)
                lineToRelative(1.18f, -2.759f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, true, -2.005f, -1.186f)
                close()
                moveTo(4.62f, 2.537f)
                lineTo(6.466f, 4.9f)
                arcTo(8.993f, 8.993f, 0.0f, false, true, 8.472f, 3.717f)
                lineTo(7.294f, 0.958f)
                arcTo(12.049f, 12.049f, 0.0f, false, false, 4.62f, 2.537f)
                close()
                moveTo(12.0f, 0.0f)
                arcToRelative(12.19f, 12.19f, 0.0f, false, false, -1.709f, 0.121f)
                lineToRelative(0.424f, 2.97f)
                arcTo(9.178f, 9.178f, 0.0f, false, true, 12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.0f, 18.0f)
                arcToRelative(9.178f, 9.178f, 0.0f, false, true, -1.285f, -0.091f)
                lineToRelative(-0.424f, 2.97f)
                arcTo(12.19f, 12.19f, 0.0f, false, false, 12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(10.5f, 6.273f)
                lineTo(10.5f, 10.69f)
                arcToRelative(1.966f, 1.966f, 0.0f, false, false, 0.0f, 2.62f)
                verticalLineToRelative(3.463f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 13.31f)
                arcToRelative(1.966f, 1.966f, 0.0f, false, false, 0.0f, -2.62f)
                lineTo(13.5f, 6.273f)
                close()
            }
        }
        .build()
        return _timeHalfPast!!
    }

private var _timeHalfPast: ImageVector? = null
