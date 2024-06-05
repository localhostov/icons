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

public val Icons.Bold.ShipSide: ImageVector
    get() {
        if (_shipSide != null) {
            return _shipSide!!
        }
        _shipSide = Builder(name = "ShipSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.975f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.5f)
                arcTo(11.514f, 11.514f, 0.0f, false, true, 12.478f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 21.0f)
                lineTo(12.478f, 21.0f)
                arcToRelative(8.514f, 8.514f, 0.0f, false, false, 8.367f, -7.0f)
                lineTo(15.312f, 14.0f)
                lineToRelative(-2.863f, 2.0f)
                lineTo(0.0f, 16.0f)
                lineTo(0.0f, 13.0f)
                lineTo(11.506f, 13.0f)
                lineToRelative(2.863f, -2.0f)
                lineTo(16.6f, 11.0f)
                arcToRelative(19.728f, 19.728f, 0.0f, false, false, -3.48f, -4.35f)
                arcTo(2.446f, 2.446f, 0.0f, false, false, 11.435f, 6.0f)
                lineTo(0.0f, 6.0f)
                lineTo(0.0f, 3.0f)
                lineTo(2.89f, 3.0f)
                lineTo(1.976f, 0.0f)
                lineTo(6.133f, 0.0f)
                lineToRelative(0.915f, 3.0f)
                horizontalLineToRelative(4.387f)
                arcToRelative(5.432f, 5.432f, 0.0f, false, true, 3.734f, 1.462f)
                arcTo(21.812f, 21.812f, 0.0f, false, true, 19.975f, 11.0f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(3.0f)
                lineTo(10.0f, 11.0f)
                close()
                moveTo(3.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 1.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 18.5f)
                close()
                moveTo(8.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 6.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.0f, 18.5f)
                close()
                moveTo(13.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 11.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.0f, 18.5f)
                close()
            }
        }
        .build()
        return _shipSide!!
    }

private var _shipSide: ImageVector? = null
