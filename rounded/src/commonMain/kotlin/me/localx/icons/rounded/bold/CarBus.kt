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

public val Icons.Bold.CarBus: ImageVector
    get() {
        if (_carBus != null) {
            return _carBus!!
        }
        _carBus = Builder(name = "CarBus", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.781f, 12.906f)
                lineToRelative(-0.3f, -0.711f)
                arcTo(5.179f, 5.179f, 0.0f, false, false, 17.692f, 9.0f)
                lineTo(15.269f, 9.0f)
                arcToRelative(5.18f, 5.18f, 0.0f, false, false, -4.793f, 3.2f)
                lineToRelative(-0.3f, 0.71f)
                arcTo(15.276f, 15.276f, 0.0f, false, false, 9.0f, 18.808f)
                lineTo(9.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, 2.828f)
                lineTo(11.0f, 22.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-0.186f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 23.961f, 19.0f)
                verticalLineToRelative(-0.192f)
                arcTo(15.267f, 15.267f, 0.0f, false, false, 22.781f, 12.906f)
                close()
                moveTo(13.246f, 13.349f)
                arcTo(2.184f, 2.184f, 0.0f, false, true, 15.269f, 12.0f)
                horizontalLineToRelative(2.423f)
                arcToRelative(2.186f, 2.186f, 0.0f, false, true, 2.024f, 1.349f)
                lineToRelative(0.3f, 0.711f)
                arcTo(12.315f, 12.315f, 0.0f, false, true, 20.638f, 16.0f)
                lineTo(12.323f, 16.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 0.627f, -1.941f)
                close()
                moveTo(8.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 13.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 17.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-0.838f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 2.0f, 15.5f)
                lineTo(2.0f, 13.0f)
                lineTo(1.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 11.5f)
                verticalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 9.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 6.026f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 5.732f, 0.815f)
                curveTo(10.235f, -0.694f, 17.993f, -0.557f, 18.953f, 5.3f)
                curveTo(19.58f, 7.711f, 16.23f, 8.481f, 16.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                lineTo(9.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                curveToRelative(0.0f, 0.009f, 0.0f, 4.0f, 0.0f, 4.0f)
                lineTo(6.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 11.5f)
                close()
            }
        }
        .build()
        return _carBus!!
    }

private var _carBus: ImageVector? = null
