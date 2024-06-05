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

public val Icons.Filled.SourceData: ImageVector
    get() {
        if (_sourceData != null) {
            return _sourceData!!
        }
        _sourceData = Builder(name = "SourceData", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-6.329f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-3.343f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.034f)
                lineToRelative(-1.793f, -1.792f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.881f, 2.881f)
                curveToRelative(0.366f, 0.365f, 0.846f, 0.549f, 1.326f, 0.549f)
                reflectiveCurveToRelative(0.96f, -0.184f, 1.326f, -0.549f)
                lineToRelative(2.881f, -2.881f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.793f, 1.792f)
                verticalLineToRelative(-4.034f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 1.0f)
                close()
                moveTo(19.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 0.0f)
                close()
                moveTo(7.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 0.0f)
                close()
                moveTo(9.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.5f, 7.0f)
                lineTo(2.083f, 0.0f)
                lineTo(0.0f, 0.0f)
                lineToRelative(2.417f, 7.0f)
                horizontalLineToRelative(2.083f)
                close()
                moveTo(21.583f, 7.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-2.083f)
                reflectiveCurveToRelative(-2.417f, 7.0f, -2.417f, 7.0f)
                horizontalLineToRelative(2.083f)
                close()
                moveTo(8.5f, 20.0f)
                lineTo(1.0f, 20.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-7.5f)
                lineToRelative(-1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(-1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _sourceData!!
    }

private var _sourceData: ImageVector? = null
