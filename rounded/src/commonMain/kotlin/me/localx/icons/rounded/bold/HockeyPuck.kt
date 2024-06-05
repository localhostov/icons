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

public val Icons.Bold.HockeyPuck: ImageVector
    get() {
        if (_hockeyPuck != null) {
            return _hockeyPuck!!
        }
        _hockeyPuck = Builder(name = "HockeyPuck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.271f, 0.0f, 0.0f, 3.733f, 0.0f, 8.5f)
                verticalLineToRelative(6.841f)
                curveTo(0.0f, 20.2f, 5.271f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(12.0f, -3.8f, 12.0f, -8.659f)
                lineTo(24.0f, 8.5f)
                curveTo(24.0f, 3.733f, 18.729f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(4.878f, 0.0f, 9.0f, 2.519f, 9.0f, 5.5f)
                reflectiveCurveTo(16.878f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(3.0f, 11.481f, 3.0f, 8.5f)
                reflectiveCurveTo(7.122f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveToRelative(-4.878f, 0.0f, -9.0f, -2.592f, -9.0f, -5.659f)
                lineTo(3.0f, 14.178f)
                arcTo(14.509f, 14.509f, 0.0f, false, false, 12.0f, 17.0f)
                arcToRelative(14.509f, 14.509f, 0.0f, false, false, 9.0f, -2.822f)
                verticalLineToRelative(1.163f)
                curveTo(21.0f, 18.408f, 16.878f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _hockeyPuck!!
    }

private var _hockeyPuck: ImageVector? = null
