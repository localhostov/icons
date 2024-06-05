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
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.1f, 2.159f)
                lineTo(8.775f, 15.29f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.55f, -1.58f)
                lineTo(7.285f, 12.0f)
                horizontalLineToRelative(-0.17f)
                arcTo(2.115f, 2.115f, 0.0f, false, true, 5.091f, 9.271f)
                curveToRelative(0.038f, -0.123f, 2.132f, -3.557f, 2.132f, -3.557f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 9.777f, 7.286f)
                lineTo(8.723f, 9.0f)
                lineTo(8.9f, 9.0f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 10.749f, 10.108f)
                close()
                moveTo(24.0f, 3.5f)
                lineTo(24.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.0f, 2.828f)
                lineTo(22.0f, 16.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, true, 17.5f, 21.0f)
                lineTo(15.4f, 21.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, true, -4.9f, 3.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 0.0f, 18.5f)
                lineTo(0.0f, 5.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.5f, 0.0f)
                horizontalLineToRelative(5.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 16.0f, 5.5f)
                lineTo(16.0f, 18.0f)
                horizontalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 16.5f)
                lineTo(19.0f, 8.828f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 6.0f)
                lineTo(17.0f, 3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 24.0f, 3.5f)
                close()
                moveTo(13.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.5f, 3.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 5.5f)
                verticalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 21.0f)
                horizontalLineToRelative(5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.0f, 18.5f)
                close()
            }
        }
        .build()
        return _chargingStation!!
    }

private var _chargingStation: ImageVector? = null
