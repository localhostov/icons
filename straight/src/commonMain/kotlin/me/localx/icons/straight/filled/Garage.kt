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

public val Icons.Filled.Garage: ImageVector
    get() {
        if (_garage != null) {
            return _garage!!
        }
        _garage = Builder(name = "Garage", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.043f)
                lineTo(24.0f, 24.0f)
                lineTo(20.0f, 24.0f)
                lineTo(20.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(7.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                lineTo(4.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 10.043f)
                arcTo(2.985f, 2.985f, 0.0f, false, true, 1.151f, 7.68f)
                lineToRelative(9.0f, -7.042f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, true, 3.7f, 0.0f)
                lineToRelative(9.0f, 7.043f)
                arcTo(2.981f, 2.981f, 0.0f, false, true, 24.0f, 10.043f)
                close()
                moveTo(18.0f, 13.0f)
                lineTo(18.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(17.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 13.0f)
                close()
                moveTo(14.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _garage!!
    }

private var _garage: ImageVector? = null
