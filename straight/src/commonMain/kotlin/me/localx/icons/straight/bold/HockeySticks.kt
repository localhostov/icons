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

public val Icons.Bold.HockeySticks: ImageVector
    get() {
        if (_hockeySticks != null) {
            return _hockeySticks!!
        }
        _hockeySticks = Builder(name = "HockeySticks", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.141f, 12.786f)
                lineTo(24.023f, 0.0f)
                lineTo(22.0f, 0.0f)
                arcToRelative(3.394f, 3.394f, 0.0f, false, false, -3.263f, 2.419f)
                lineTo(16.505f, 9.772f)
                arcTo(3.123f, 3.123f, 0.0f, false, true, 13.5f, 12.0f)
                lineTo(10.177f, 12.0f)
                curveToRelative(-0.665f, -0.17f, -2.215f, -0.69f, -2.587f, -1.913f)
                lineTo(5.262f, 2.419f)
                arcTo(3.389f, 3.389f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(-0.029f, 0.0f)
                lineTo(3.782f, 12.425f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 24.0f)
                lineTo(9.254f, 24.0f)
                arcToRelative(10.218f, 10.218f, 0.0f, false, false, 2.688f, -0.358f)
                arcTo(10.052f, 10.052f, 0.0f, false, false, 14.606f, 24.0f)
                horizontalLineToRelative(3.6f)
                arcToRelative(5.769f, 5.769f, 0.0f, false, false, 1.937f, -11.214f)
                close()
                moveTo(6.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                horizontalLineToRelative(7.5f)
                arcToRelative(6.154f, 6.154f, 0.0f, false, false, 3.083f, -0.82f)
                lineToRelative(-0.544f, 1.789f)
                arcTo(7.052f, 7.052f, 0.0f, false, true, 9.254f, 21.0f)
                close()
                moveTo(20.274f, 20.083f)
                arcTo(2.8f, 2.8f, 0.0f, false, true, 18.2f, 21.0f)
                lineTo(16.451f, 21.0f)
                arcToRelative(10.114f, 10.114f, 0.0f, false, false, 2.459f, -4.16f)
                lineToRelative(0.355f, -1.169f)
                arcToRelative(2.815f, 2.815f, 0.0f, false, true, 1.721f, 2.255f)
                arcTo(2.768f, 2.768f, 0.0f, false, true, 20.274f, 20.083f)
                close()
            }
        }
        .build()
        return _hockeySticks!!
    }

private var _hockeySticks: ImageVector? = null
