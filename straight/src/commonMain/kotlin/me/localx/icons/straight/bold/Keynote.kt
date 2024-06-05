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

public val Icons.Bold.Keynote: ImageVector
    get() {
        if (_keynote != null) {
            return _keynote!!
        }
        _keynote = Builder(name = "Keynote", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.02f, 18.019f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.174f)
                lineToRelative(-2.315f, -6.019f)
                horizontalLineTo(5.98f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.456f, 0.607f, 1.182f, 1.0f, 2.0f, 1.0f)
                horizontalLineToRelative(4.25f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.25f)
                curveToRelative(-0.818f, 0.0f, -1.544f, 0.393f, -2.0f, 1.0f)
                horizontalLineToRelative(-0.75f)
                curveTo(5.448f, 1.0f, 2.98f, 3.467f, 2.98f, 6.5f)
                verticalLineToRelative(3.772f)
                lineToRelative(-1.826f, 4.747f)
                horizontalLineTo(0.02f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(10.5f)
                verticalLineToRelative(2.981f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2.981f)
                horizontalLineToRelative(10.52f)
                close()
                moveTo(5.53f, 12.0f)
                horizontalLineToRelative(12.939f)
                lineToRelative(1.161f, 3.019f)
                horizontalLineTo(4.369f)
                lineToRelative(1.161f, -3.019f)
                close()
            }
        }
        .build()
        return _keynote!!
    }

private var _keynote: ImageVector? = null
