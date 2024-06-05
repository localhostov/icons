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

public val Icons.Bold.CarBuilding: ImageVector
    get() {
        if (_carBuilding != null) {
            return _carBuilding!!
        }
        _carBuilding = Builder(name = "CarBuilding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.077f)
                arcToRelative(9.485f, 9.485f, 0.0f, false, false, -0.439f, -2.856f)
                lineToRelative(-1.19f, -3.772f)
                arcTo(3.484f, 3.484f, 0.0f, false, false, 19.033f, 10.0f)
                lineTo(14.967f, 10.0f)
                arcToRelative(3.484f, 3.484f, 0.0f, false, false, -3.338f, 2.448f)
                lineToRelative(-1.19f, 3.774f)
                arcTo(9.474f, 9.474f, 0.0f, false, false, 10.0f, 19.077f)
                lineTo(10.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(16.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(14.967f, 13.0f)
                horizontalLineToRelative(4.066f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.477f, 0.35f)
                lineTo(20.345f, 16.0f)
                horizontalLineToRelative(-6.69f)
                lineToRelative(0.835f, -2.651f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 14.967f, 13.0f)
                close()
                moveTo(14.5f, 3.0f)
                lineTo(3.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                lineTo(3.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 3.5f, 0.0f)
                horizontalLineToRelative(11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 18.0f, 3.5f)
                lineTo(18.0f, 8.0f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.5f, 3.0f)
                close()
                moveTo(5.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                lineTo(8.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(5.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 13.0f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 18.0f)
                close()
                moveTo(5.0f, 20.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 23.0f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(10.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 8.0f)
                close()
            }
        }
        .build()
        return _carBuilding!!
    }

private var _carBuilding: ImageVector? = null
