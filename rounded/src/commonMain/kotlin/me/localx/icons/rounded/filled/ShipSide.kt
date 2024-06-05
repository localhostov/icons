package me.localx.icons.rounded.filled

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

public val Icons.Filled.ShipSide: ImageVector
    get() {
        if (_shipSide != null) {
            return _shipSide!!
        }
        _shipSide = Builder(name = "ShipSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.976f, 12.0f)
                lineToRelative(-5.352f, 0.0f)
                arcToRelative(3.091f, 3.091f, 0.0f, false, false, -1.716f, 0.52f)
                lineToRelative(-1.959f, 1.306f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.555f, 0.168f)
                lineTo(1.0f, 13.994f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(12.537f, 23.994f)
                arcToRelative(11.97f, 11.97f, 0.0f, false, false, 11.309f, -8.112f)
                arcTo(2.984f, 2.984f, 0.0f, false, false, 20.976f, 12.0f)
                close()
                moveTo(4.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 20.0f)
                close()
                moveTo(8.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 20.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 20.0f)
                close()
                moveTo(1.0f, 12.0f)
                arcToRelative(2.962f, 2.962f, 0.0f, false, false, -1.0f, 0.184f)
                lineTo(0.0f, 9.0f)
                lineTo(10.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(0.0f, 7.0f)
                lineTo(0.0f, 4.861f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(3.392f, 3.861f)
                lineTo(3.071f, 2.643f)
                arcTo(2.106f, 2.106f, 0.0f, false, true, 5.107f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(2.107f, 2.107f, 0.0f, false, true, 7.144f, 1.569f)
                lineToRelative(0.6f, 2.292f)
                lineTo(10.0f, 3.861f)
                arcTo(5.04f, 5.04f, 0.0f, false, true, 13.179f, 5.0f)
                arcToRelative(25.492f, 25.492f, 0.0f, false, true, 4.44f, 5.0f)
                lineToRelative(-1.974f, 0.0f)
                arcToRelative(5.224f, 5.224f, 0.0f, false, false, -2.822f, 0.84f)
                lineTo(11.092f, 12.0f)
                close()
            }
        }
        .build()
        return _shipSide!!
    }

private var _shipSide: ImageVector? = null
