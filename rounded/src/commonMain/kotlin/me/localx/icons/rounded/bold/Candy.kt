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

public val Icons.Bold.Candy: ImageVector
    get() {
        if (_candy != null) {
            return _candy!!
        }
        _candy = Builder(name = "Candy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.788f, 3.725f)
                arcTo(8.157f, 8.157f, 0.0f, false, false, 20.294f, 0.212f)
                arcToRelative(2.327f, 2.327f, 0.0f, false, false, -3.276f, 2.134f)
                lineTo(17.018f, 3.951f)
                curveTo(13.693f, 2.138f, 9.181f, 2.988f, 6.085f, 6.085f)
                reflectiveCurveTo(2.132f, 13.729f, 3.949f, 17.018f)
                horizontalLineToRelative(-1.6f)
                arcTo(2.327f, 2.327f, 0.0f, false, false, 0.212f, 20.294f)
                arcToRelative(8.157f, 8.157f, 0.0f, false, false, 3.513f, 3.494f)
                arcTo(2.326f, 2.326f, 0.0f, false, false, 7.0f, 21.654f)
                lineTo(7.0f, 20.046f)
                arcToRelative(7.917f, 7.917f, 0.0f, false, false, 3.788f, 0.95f)
                arcToRelative(10.219f, 10.219f, 0.0f, false, false, 7.127f, -3.081f)
                curveToRelative(3.091f, -3.091f, 3.942f, -7.59f, 2.144f, -10.915f)
                horizontalLineToRelative(1.595f)
                arcTo(2.326f, 2.326f, 0.0f, false, false, 23.788f, 3.725f)
                close()
                moveTo(15.794f, 15.794f)
                curveToRelative(-2.249f, 2.25f, -5.465f, 2.867f, -7.648f, 1.471f)
                arcToRelative(6.072f, 6.072f, 0.0f, false, true, -1.411f, -1.411f)
                curveToRelative(-1.4f, -2.182f, -0.778f, -5.4f, 1.471f, -7.648f)
                arcTo(7.189f, 7.189f, 0.0f, false, true, 13.184f, 6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 2.716f, 0.765f)
                arcToRelative(6.012f, 6.012f, 0.0f, false, true, 1.365f, 1.381f)
                curveTo(18.661f, 10.328f, 18.043f, 13.545f, 15.794f, 15.794f)
                close()
                moveTo(14.647f, 12.534f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.181f, 2.113f)
                arcTo(5.446f, 5.446f, 0.0f, false, true, 11.0f, 16.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                lineTo(11.0f, 13.0f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, 1.537f, -0.646f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.647f, 12.534f)
                close()
            }
        }
        .build()
        return _candy!!
    }

private var _candy: ImageVector? = null
