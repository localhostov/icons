package me.localx.icons.straight.outline

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

public val Icons.Outline.CarBuilding: ImageVector
    get() {
        if (_carBuilding != null) {
            return _carBuilding!!
        }
        _carBuilding = Builder(name = "CarBuilding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.732f)
                arcToRelative(10.957f, 10.957f, 0.0f, false, false, -0.642f, -3.7f)
                lineToRelative(-1.443f, -4.041f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.091f, 10.0f)
                lineTo(13.909f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.824f, 1.991f)
                lineTo(9.642f, 16.032f)
                arcTo(10.957f, 10.957f, 0.0f, false, false, 9.0f, 19.732f)
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
                moveTo(13.909f, 12.0f)
                horizontalLineToRelative(5.182f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.941f, 0.664f)
                lineTo(20.867f, 15.0f)
                lineTo(12.133f, 15.0f)
                lineToRelative(0.835f, -2.336f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.909f, 12.0f)
                close()
                moveTo(22.0f, 20.0f)
                lineTo(11.0f, 20.0f)
                verticalLineToRelative(-0.268f)
                arcTo(8.972f, 8.972f, 0.0f, false, true, 11.425f, 17.0f)
                lineTo(13.0f, 17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(15.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(20.0f, 17.0f)
                horizontalLineToRelative(1.575f)
                arcTo(8.972f, 8.972f, 0.0f, false, true, 22.0f, 19.732f)
                close()
                moveTo(13.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 3.0f)
                lineTo(2.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(13.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                lineTo(16.0f, 8.0f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 2.0f)
                close()
                moveTo(4.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                lineTo(7.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(4.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 17.0f)
                close()
                moveTo(4.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 22.0f)
                close()
                moveTo(9.0f, 7.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                lineTo(12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _carBuilding!!
    }

private var _carBuilding: ImageVector? = null
