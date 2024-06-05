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

public val Icons.Bold.CarBattery: ImageVector
    get() {
        if (_carBattery != null) {
            return _carBattery!!
        }
        _carBattery = Builder(name = "CarBattery", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 14.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineTo(15.0f, 9.0f)
                verticalLineToRelative(2.0f)
                lineTo(13.0f, 11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 11.0f)
                lineTo(18.0f, 11.0f)
                close()
                moveTo(24.0f, 8.5f)
                lineTo(24.0f, 22.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 8.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 5.0f)
                lineTo(4.0f, 5.0f)
                lineTo(4.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(10.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(20.0f, 5.0f)
                horizontalLineToRelative(0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 24.0f, 8.5f)
                close()
                moveTo(21.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(3.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(3.0f, 19.0f)
                lineTo(21.0f, 19.0f)
                close()
            }
        }
        .build()
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
