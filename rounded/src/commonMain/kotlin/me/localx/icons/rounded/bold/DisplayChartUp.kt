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

public val Icons.Bold.DisplayChartUp: ImageVector
    get() {
        if (_displayChartUp != null) {
            return _displayChartUp!!
        }
        _displayChartUp = Builder(name = "DisplayChartUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 1.0f)
                lineTo(5.5f, 1.0f)
                curveTo(2.467f, 1.0f, 0.0f, 3.467f, 0.0f, 6.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                lineTo(24.0f, 6.5f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(21.0f, 12.5f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 15.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                lineTo(3.0f, 6.5f)
                curveToRelative(0.0f, -1.378f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(19.0f, 7.083f)
                verticalLineToRelative(3.512f)
                curveToRelative(0.0f, 0.824f, -0.997f, 1.237f, -1.579f, 0.654f)
                lineToRelative(-0.775f, -0.775f)
                lineToRelative(-1.398f, 1.398f)
                curveToRelative(-0.548f, 0.548f, -1.269f, 0.823f, -1.989f, 0.823f)
                reflectiveCurveToRelative(-1.44f, -0.274f, -1.989f, -0.823f)
                lineToRelative(-1.755f, -1.755f)
                lineToRelative(-1.957f, 1.945f)
                curveToRelative(-0.589f, 0.583f, -1.538f, 0.581f, -2.122f, -0.006f)
                curveToRelative(-0.584f, -0.588f, -0.581f, -1.538f, 0.006f, -2.122f)
                lineToRelative(2.09f, -2.077f)
                curveToRelative(1.097f, -1.089f, 2.879f, -1.087f, 3.972f, 0.006f)
                lineToRelative(1.755f, 1.755f)
                lineToRelative(1.266f, -1.266f)
                lineToRelative(-0.752f, -0.752f)
                curveToRelative(-0.583f, -0.583f, -0.17f, -1.579f, 0.654f, -1.579f)
                horizontalLineToRelative(3.512f)
                curveToRelative(0.586f, 0.0f, 1.061f, 0.475f, 1.061f, 1.061f)
                close()
            }
        }
        .build()
        return _displayChartUp!!
    }

private var _displayChartUp: ImageVector? = null
