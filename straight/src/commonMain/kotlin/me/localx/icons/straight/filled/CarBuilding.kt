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

public val Icons.Filled.CarBuilding: ImageVector
    get() {
        if (_carBuilding != null) {
            return _carBuilding!!
        }
        _carBuilding = Builder(name = "CarBuilding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.347f, 16.0f)
                lineTo(9.653f, 16.0f)
                lineToRelative(1.432f, -4.009f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.909f, 10.0f)
                horizontalLineToRelative(5.182f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.824f, 1.991f)
                close()
                moveTo(24.0f, 19.732f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 23.858f, 18.0f)
                lineTo(21.0f, 18.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(19.0f, 18.0f)
                lineTo(14.0f, 18.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(12.0f, 18.0f)
                lineTo(9.142f, 18.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, false, 9.0f, 19.732f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 22.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 3.0f)
                lineTo(16.0f, 8.0f)
                lineTo(10.0f, 8.0f)
                lineTo(10.0f, 9.9f)
                arcToRelative(4.953f, 4.953f, 0.0f, false, false, -0.8f, 1.423f)
                lineTo(7.77f, 15.328f)
                arcToRelative(24.237f, 24.237f, 0.0f, false, false, -0.6f, 2.355f)
                curveToRelative(-0.017f, 0.106f, -0.024f, 0.211f, -0.039f, 0.317f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(13.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 3.0f)
                close()
                moveTo(7.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 16.0f)
                close()
                moveTo(7.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 11.0f)
                close()
                moveTo(7.0f, 3.0f)
                lineTo(4.0f, 3.0f)
                lineTo(4.0f, 6.0f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(12.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                lineTo(9.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _carBuilding!!
    }

private var _carBuilding: ImageVector? = null
