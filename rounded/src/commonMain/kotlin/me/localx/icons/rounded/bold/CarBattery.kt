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
                moveTo(11.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 14.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 12.5f)
                close()
                moveTo(18.5f, 11.0f)
                lineTo(18.0f, 11.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                lineTo(15.0f, 11.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(15.0f, 14.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                lineTo(18.0f, 14.0f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 11.0f)
                close()
                moveTo(24.0f, 9.5f)
                verticalLineToRelative(7.0f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 22.0f)
                lineTo(5.5f, 22.0f)
                curveTo(2.313f, 22.0f, 0.0f, 19.9f, 0.0f, 17.0f)
                lineTo(0.0f, 9.5f)
                arcTo(4.508f, 4.508f, 0.0f, false, true, 3.0f, 5.257f)
                lineTo(3.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.5f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.0f, 4.5f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.5f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 4.5f)
                verticalLineToRelative(0.757f)
                arcTo(4.508f, 4.508f, 0.0f, false, true, 24.0f, 9.5f)
                close()
                moveTo(21.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 6.5f)
                lineTo(18.0f, 5.0f)
                lineTo(16.0f, 5.0f)
                lineTo(16.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 8.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 6.5f)
                lineTo(8.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                lineTo(6.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 9.5f)
                lineTo(3.0f, 17.0f)
                curveToRelative(0.0f, 1.9f, 2.083f, 2.0f, 2.5f, 2.0f)
                horizontalLineToRelative(13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 16.5f)
                close()
            }
        }
        .build()
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
