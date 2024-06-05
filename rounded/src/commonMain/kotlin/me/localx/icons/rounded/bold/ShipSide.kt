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
                moveTo(1.5f, 21.0f)
                lineTo(13.062f, 21.0f)
                curveToRelative(3.634f, 0.0f, 6.546f, -1.716f, 7.789f, -4.59f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, -0.137f, -1.655f)
                arcToRelative(1.642f, 1.642f, 0.0f, false, false, -1.395f, -0.749f)
                horizontalLineToRelative(-4.31f)
                arcToRelative(0.482f, 0.482f, 0.0f, false, false, -0.3f, 0.084f)
                lineToRelative(-1.983f, 1.322f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 10.788f, 16.0f)
                lineTo(1.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(9.288f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.279f, -0.085f)
                lineToRelative(1.982f, -1.322f)
                arcToRelative(3.488f, 3.488f, 0.0f, false, true, 1.94f, -0.587f)
                horizontalLineToRelative(1.782f)
                arcToRelative(12.984f, 12.984f, 0.0f, false, false, -3.394f, -4.432f)
                arcTo(3.392f, 3.392f, 0.0f, false, false, 11.5f, 6.0f)
                lineTo(1.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                lineTo(4.181f, 3.0f)
                lineToRelative(-0.094f, -0.357f)
                arcTo(2.106f, 2.106f, 0.0f, false, true, 8.16f, 1.569f)
                lineTo(8.537f, 3.0f)
                lineTo(11.5f, 3.0f)
                arcToRelative(6.349f, 6.349f, 0.0f, false, true, 3.776f, 1.252f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, 4.788f, 6.82f)
                arcToRelative(4.654f, 4.654f, 0.0f, false, true, 3.157f, 2.034f)
                arcTo(4.734f, 4.734f, 0.0f, false, true, 23.6f, 17.6f)
                curveTo(21.872f, 21.607f, 17.931f, 24.0f, 13.062f, 24.0f)
                lineTo(1.5f, 24.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(9.5f, 11.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineToRelative(-8.0f, -0.006f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(9.0f, 18.506f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 18.506f)
                close()
                moveTo(4.0f, 18.506f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.0f, 18.506f)
                close()
                moveTo(14.0f, 18.506f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -1.5f, 1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 18.506f)
                close()
            }
        }
        .build()
        return _shipSide!!
    }

private var _shipSide: ImageVector? = null
