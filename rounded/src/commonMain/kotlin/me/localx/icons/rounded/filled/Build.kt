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

public val Icons.Filled.Build: ImageVector
    get() {
        if (_build != null) {
            return _build!!
        }
        _build = Builder(name = "Build", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.739f, 0.0f, -1.385f, 0.403f, -1.731f, 1.0f)
                horizontalLineToRelative(-2.269f)
                verticalLineToRelative(-0.924f)
                curveToRelative(0.0f, -1.254f, -0.61f, -2.394f, -1.632f, -3.049f)
                curveToRelative(-0.951f, -0.61f, -2.129f, -0.693f, -3.238f, -0.178f)
                lineTo(1.414f, 3.605f)
                curveToRelative(-0.872f, 0.471f, -1.414f, 1.389f, -1.414f, 2.395f)
                curveToRelative(0.0f, 1.0f, 0.535f, 1.912f, 1.397f, 2.386f)
                lineToRelative(4.819f, 2.81f)
                curveToRelative(0.439f, 0.202f, 0.906f, 0.301f, 1.373f, 0.301f)
                curveToRelative(0.62f, 0.0f, 1.236f, -0.176f, 1.779f, -0.524f)
                curveToRelative(1.022f, -0.655f, 1.632f, -1.794f, 1.632f, -3.049f)
                verticalLineToRelative(-0.924f)
                horizontalLineToRelative(2.269f)
                curveToRelative(0.346f, 0.597f, 0.992f, 1.0f, 1.731f, 1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(8.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(18.0f, 18.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(6.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 2.209f, 1.791f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(13.0f, 12.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _build!!
    }

private var _build: ImageVector? = null
